package com.car_repair_shop.repairservice.service;

import com.car_repair_shop.repairservice.domain.Repair;

import java.util.List;

public interface RepairService {
    Repair save(Repair repair);

    List<Repair> selectAll();

    Repair selectOne(int id);

    void update(int id, Repair repair);

    void delete(int id);
}
