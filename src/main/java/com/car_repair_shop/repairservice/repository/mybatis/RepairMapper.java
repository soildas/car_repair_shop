package com.car_repair_shop.repairservice.repository.mybatis;

import com.car_repair_shop.repairservice.domain.Repair;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RepairMapper {
    
    void save(Repair repair);

    List<Repair> selectAll();

    Repair selectOne(@Param("id") int id);

    void update(@Param("id") int id, Repair repair);

    void delete(@Param("id") int id);
}
