package com.dypiemr.courier.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dypiemr.courier.db.model.Task;

import java.util.List;

@Mapper
@Repository
public interface CallCenterTaskMapper {

    long addOrderRescheduleTask(@Param("orderId") long orderId);

    List<Task> findAllUndone();

    Task findTaskById(@Param("taskId") long taskId);

    void closeTask(@Param("taskId") long taskId);
}
