package com.car_repair_shop.repairservice.domain;

import lombok.Data;

@Data
public class Repair {

    private int id;
    private String repairName;
    private int price;

    public Repair(String repairName, int price) {
        this.repairName = repairName;
        this.price = price;
    }
}
