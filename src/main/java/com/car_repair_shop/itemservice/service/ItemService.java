package com.car_repair_shop.itemservice.service;


import com.car_repair_shop.itemservice.domain.Item;
import com.car_repair_shop.itemservice.repository.ItemSearchCond;
import com.car_repair_shop.itemservice.repository.ItemUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findItems(ItemSearchCond itemSearch);
}
