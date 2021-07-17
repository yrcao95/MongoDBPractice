package com.paloaltonetworks.mongodbpractice.dao;

import com.paloaltonetworks.mongodbpractice.POJO.User;

import java.util.Date;
import java.util.List;

public interface QueryService {
    List<User> findAll();

    List<User> findByName(String name);

    List<User> findByNameAndBirthDay(String name, String birthday);

    List<User> findByNameAndSex(String name, String sex);
}
