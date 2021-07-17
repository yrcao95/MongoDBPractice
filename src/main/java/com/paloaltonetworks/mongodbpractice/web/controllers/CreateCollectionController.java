package com.paloaltonetworks.mongodbpractice.web.controllers;

import com.paloaltonetworks.mongodbpractice.dao.CreateCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateCollectionController {

    @Autowired
    CreateCollectionService createCollectionService;

    @PostMapping(value = "/createCollection", params = {"collectionName"})
    public Object createCollection(@RequestParam("collectionName") String collectionName) {
        return createCollectionService.createCollection(collectionName);
    }
}
