package com.dypiemr.courier.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dypiemr.courier.db.model.Courier;

@Mapper
@Repository
public interface CourierMapper {

    Courier findById(@Param("id") long id);

}
