package com.dypiemr.courier.db.typehandler;

import org.apache.ibatis.type.EnumOrdinalTypeHandler;
import org.apache.ibatis.type.MappedTypes;

import com.dypiemr.courier.db.model.OrderStatus;

@MappedTypes(OrderStatus.class)
public class OrderStatusTypeHandler extends EnumOrdinalTypeHandler<OrderStatus> {
    public OrderStatusTypeHandler(Class<OrderStatus> type) {
        super(type);
    }
}
