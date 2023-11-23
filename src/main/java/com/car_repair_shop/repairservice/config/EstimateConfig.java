package com.car_repair_shop.repairservice.config;

import com.car_repair_shop.repairservice.repository.RepairRepository;
import com.car_repair_shop.repairservice.repository.mybatis.MybatisRepairRepository;
import com.car_repair_shop.repairservice.repository.mybatis.RepairMapper;
import com.car_repair_shop.repairservice.service.EstimateService;
import com.car_repair_shop.repairservice.service.EstimateServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class EstimateConfig {

    private final RepairMapper repairMapper;

    @Bean
    public EstimateService estimateService() {
        return new EstimateServiceImpl(repairRepository1());
    }

    @Bean
    public RepairRepository repairRepository1() {
        return new MybatisRepairRepository(repairMapper);
    }

}
