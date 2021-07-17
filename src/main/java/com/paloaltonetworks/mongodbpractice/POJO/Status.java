package com.paloaltonetworks.mongodbpractice.POJO;

import lombok.Data;

@Data
public class Status {
    private Integer weight;
    private Integer height;

    public Status(Integer weight, Integer height) {
        this.weight = weight;
        this.height = height;
    }
}
