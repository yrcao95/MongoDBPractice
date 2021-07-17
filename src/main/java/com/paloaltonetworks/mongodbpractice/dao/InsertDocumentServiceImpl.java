package com.paloaltonetworks.mongodbpractice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class InsertDocumentServiceImpl implements InsertDocumentService{
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Object insert(Object document, String collection) {
        Object newDocument = mongoTemplate.insert(document, collection);
        return newDocument.toString();
    }
}
