package com.paloaltonetworks.mongodbpractice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.CollectionOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class CreateCollectionServiceImpl implements CreateCollectionService{
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public String createCollection(String collectionName) {
        mongoTemplate.createCollection(collectionName);
        return mongoTemplate.collectionExists(collectionName) ? "Successfully created the collection" : "Creation failed!";
    }

    @Override
    public Object createCollectionFixedSize(String collectionName, int size, int max) {
        CollectionOptions collectionOptions = CollectionOptions.empty().capped().size(size).maxDocuments(max);
        mongoTemplate.createCollection(collectionName, collectionOptions);
        return mongoTemplate.collectionExists(collectionName) ? "Successfully created the collection" : "Creation failed!";
    }
}
