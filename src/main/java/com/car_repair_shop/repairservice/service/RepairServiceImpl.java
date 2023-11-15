package com.car_repair_shop.repairservice.service;

import com.car_repair_shop.repairservice.domain.Repair;
import com.car_repair_shop.repairservice.repository.RepairRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RepairServiceImpl implements RepairService{

    private final RepairRepository repairRepository;

    @Override
    public Repair save(Repair repair) {
        return repairRepository.save(repair);
    }

    @Override
    public List<Repair> selectAll() {
        return repairRepository.selectAll();
    }

    @Override
    public Repair selectOne(int id) {
        return repairRepository.selectOne(id);
    }

    @Override
    public void update(int id, Repair repair) {
        repairRepository.update(id, repair);
    }

    @Override
    public void delete(int id) {
        repairRepository.delete(id);
    }
}
