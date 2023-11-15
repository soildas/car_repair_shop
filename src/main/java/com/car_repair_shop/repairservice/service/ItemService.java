package com.car_repair_shop.repairservice.service;


import com.car_repair_shop.repairservice.domain.Item;
import com.car_repair_shop.repairservice.repository.ItemSearchCond;
import com.car_repair_shop.repairservice.repository.ItemUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findItems(ItemSearchCond itemSearch);
}
