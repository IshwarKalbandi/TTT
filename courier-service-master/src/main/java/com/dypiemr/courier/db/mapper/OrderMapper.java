package com.dypiemr.courier.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dypiemr.courier.db.model.Order;
import com.dypiemr.courier.db.model.OrderStatus;

import java.time.Instant;
import java.util.List;

@Mapper
@Repository
public interface OrderMapper {

    List<Order> findAll();

    Order findById(@Param("orderId") long orderId);

    List<Order> findAllByCourierId(@Param("courierId") long courierId);

    List<Order> findAllByCustomerId(@Param("customerId") long customerId);

    List<Order> findAllByCourierIdAndStatus(@Param("courierId") long courierId,
                                            @Param("orderStatuses") OrderStatus[] orderStatuses);

    void updateState(@Param("orderId") Long orderId, @Param("status") OrderStatus status);

    void updateDeliveryTime(@Param("orderId") Long orderId,
                            @Param("newDeliveryTime") Instant newDeliveryTime,
                            @Param("newOrderStatus") OrderStatus newOrderStatus);
}
