package com.paloaltonetworks.mongodbpractice.web.controllers;


import com.paloaltonetworks.mongodbpractice.POJO.Status;
import com.paloaltonetworks.mongodbpractice.POJO.User;
import com.paloaltonetworks.mongodbpractice.dao.InsertDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
public class UploadUserController {

    @Autowired
    InsertDocumentService insertDocumentService;

    private static final String COLLECTION_NAME = "Users";

    @PostMapping("/upload")
    public Object uploadUser(@RequestParam("name") String name,
                             @RequestParam("sex") String sex,
                             @RequestParam("salary") Integer salary,
                             @RequestParam("age") Integer age,
                             @RequestParam("birthday") String birthday,
                             @RequestParam("remake") String remake,
                             @RequestParam("height") Integer height,
                             @RequestParam("weight") Integer weight) throws ParseException {
        Status status = new Status(weight, height);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = formatter.parse(birthday);
        User user = new User(name, sex, salary, age, date, remake, status);
        return insertDocumentService.insert(user, COLLECTION_NAME);
    }
}
