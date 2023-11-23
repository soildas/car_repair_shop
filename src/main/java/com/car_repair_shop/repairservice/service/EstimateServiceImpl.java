package com.car_repair_shop.repairservice.service;

import com.car_repair_shop.repairservice.domain.Repair;
import com.car_repair_shop.repairservice.repository.RepairRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstimateServiceImpl implements  EstimateService{

    private final RepairRepository repairRepository;
    @Override
    public List<Repair> selectAll() {
        return repairRepository.selectAll();
    }

    @Override
    public Repair selectOne(int id) {
        return repairRepository.selectOne(id);

    }

    @Override
    public int price(int id) {
        Repair repair = selectOne(id);
        int price = repair.getPrice();
        return price;
    }
}
