package com.car_repair_shop.repairservice.service;

import com.car_repair_shop.repairservice.domain.Repair;

import java.util.List;

public interface EstimateService {
    List<Repair> selectAll();

    Repair selectOne(int id);

    int price(int id);
}
