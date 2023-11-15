package com.car_repair_shop.repairservice.repository.mybatis;

import com.car_repair_shop.repairservice.domain.Repair;
import com.car_repair_shop.repairservice.repository.RepairRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MybatisRepairRepository implements RepairRepository {

    private final RepairMapper repairMapper;
    @Override
    public Repair save(Repair repair) {
        repairMapper.save(repair);
        return repair;
    }

    @Override
    public List<Repair> selectAll() {
        return repairMapper.selectAll();
    }

    @Override
    public Repair selectOne(int id) {
        return repairMapper.selectOne(id);
    }

    @Override
    public void update(int id, Repair repair) {
        repairMapper.update(id, repair);
    }

    @Override
    public void delete(int id) {
        repairMapper.delete(id);
    }
}
