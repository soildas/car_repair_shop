package com.car_repair_shop.repairservice.config;

import com.car_repair_shop.repairservice.repository.ItemRepository;
import com.car_repair_shop.repairservice.repository.mybatis.ItemMapper;
import com.car_repair_shop.repairservice.repository.mybatis.MybatisItemRepository;
import com.car_repair_shop.repairservice.service.ItemService;
import com.car_repair_shop.repairservice.service.ItemServiceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MybatisConfig {

    private final ItemMapper itemMapper;

    @Bean
    public ItemService itemService() {
        return new ItemServiceV1(itemRepository());
    }
    @Bean
    public ItemRepository itemRepository() {
        return new MybatisItemRepository(itemMapper);
    }
}
