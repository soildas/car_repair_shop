package com.car_repair_shop.itemservice.config;

import com.car_repair_shop.itemservice.repository.ItemRepository;
import com.car_repair_shop.itemservice.repository.mybatis.ItemMapper;
import com.car_repair_shop.itemservice.repository.mybatis.MybatisItemRepository;
import com.car_repair_shop.itemservice.service.ItemService;
import com.car_repair_shop.itemservice.service.ItemServiceV1;
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
