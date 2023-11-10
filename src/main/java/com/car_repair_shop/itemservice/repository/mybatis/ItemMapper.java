package com.car_repair_shop.itemservice.repository.mybatis;

import com.car_repair_shop.itemservice.domain.Item;
import com.car_repair_shop.itemservice.repository.ItemSearchCond;
import com.car_repair_shop.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {
    void save(Item item);
    void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto updateParam);
    Optional<Item> findById(Long id);
    List<Item> findAll(ItemSearchCond itemSearch);

}
