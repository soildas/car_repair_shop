package com.car_repair_shop;

import com.car_repair_shop.itemservice.config.MybatisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(MybatisConfig.class)
@SpringBootApplication(scanBasePackages = "com.car_repair_shop.itemservice.web")
public class CarRepairShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRepairShopApplication.class, args);
	}

}
