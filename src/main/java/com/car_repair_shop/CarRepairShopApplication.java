package com.car_repair_shop;

import com.car_repair_shop.repairservice.config.MybatisConfig;
import com.car_repair_shop.repairservice.config.RepairConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({MybatisConfig.class, RepairConfig.class})
@SpringBootApplication(scanBasePackages = "com.car_repair_shop.repairservice.web")
public class CarRepairShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRepairShopApplication.class, args);
	}

}
