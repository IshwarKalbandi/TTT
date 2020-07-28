package com.dypiemr.courier.service;

import com.dypiemr.courier.db.mapper.CallCenterTaskMapper;
import com.dypiemr.courier.db.mapper.OrderMapper;
import com.dypiemr.courier.db.model.Order;
import com.dypiemr.courier.db.model.OrderStatus;
import com.dypiemr.courier.db.model.Task;
import com.dypiemr.courier.exception.OrderNotFoundException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Slf4j
@Service
public class CallCenterService {

    private final CallCenterTaskMapper taskMapper;

    private final OrderMapper orderMapper;

    @Autowired
    public CallCenterService(CallCenterTaskMapper taskMapper, OrderMapper orderMapper) {
        this.taskMapper = taskMapper;
        this.orderMapper = orderMapper;
    }

    
    public List<Task> findAllUndone() {
        log.info("Find all undone tasks");
        return taskMapper.findAllUndone();
    }

    
    public Task findTaskById(long taskId) {
        log.info("Find a task by id: {}", taskId);
        return taskMapper.findTaskById(taskId);
    }

    
    @Transactional
    public long addTaskToRescheduleOrderDelivery(Long orderId) {
        log.info("Add task to reschedule order: {}", orderId);

        Order order = orderMapper.findById(orderId);
        if (order == null) {
            throw new OrderNotFoundException(orderId);
        }
        long orderId1 = order.getId();
        long taskId = taskMapper.addOrderRescheduleTask(orderId1);
        orderMapper.updateState(order.getId(), OrderStatus.SCHEDULING);

        log.info("Created task id: {}", taskId);
        return taskId;
    }

    
    @Transactional
    public void rescheduleOrderByTask(Task task, Instant newDeliveryTime) {
        log.info("Reschedule order by task: {}", task.getId());

        Order order = orderMapper.findById(task.getOrderId());
        if (order == null) {
            throw new OrderNotFoundException(task.getOrderId());
        }
        orderMapper.updateDeliveryTime(order.getId(), newDeliveryTime, OrderStatus.NEW);
        taskMapper.closeTask(task.getId());
    }

}
