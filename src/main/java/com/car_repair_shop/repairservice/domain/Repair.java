package com.car_repair_shop.repairservice.domain;

import lombok.Data;

@Data
public class Repair {

    private Long id;

    private String repairName;
    private Integer price;

    public Repair() {
    }

    public Repair(String repairName, Integer price) {
        this.repairName = repairName;
        this.price = price;
    }
}

