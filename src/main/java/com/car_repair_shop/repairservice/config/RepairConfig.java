package com.car_repair_shop.repairservice.config;

import com.car_repair_shop.repairservice.repository.RepairRepository;
import com.car_repair_shop.repairservice.repository.mybatis.MybatisRepairRepository;
import com.car_repair_shop.repairservice.repository.mybatis.RepairMapper;
import com.car_repair_shop.repairservice.service.RepairService;
import com.car_repair_shop.repairservice.service.RepairServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RepairConfig {

    private final RepairMapper repairMapper;

    @Bean
    public RepairService repairService(){
        return new RepairServiceImpl(repairRepository());
    }

    @Bean
    public RepairRepository repairRepository() {
        return new MybatisRepairRepository(repairMapper);
    }
}
