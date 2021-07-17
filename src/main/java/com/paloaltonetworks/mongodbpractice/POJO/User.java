package com.paloaltonetworks.mongodbpractice.POJO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Data
public class User {
    @MongoId
    private String id;
    private String name;
    private String sex;
    private Integer salary;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String remake;
    private Status status;

    public User(String name, String sex, Integer salary, Integer age, Date birthday, String remake, Status status) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.age = age;
        this.birthday = birthday;
        this.remake = remake;
        this.status = status;
    }
}
