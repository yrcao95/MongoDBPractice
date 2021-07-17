package com.paloaltonetworks.mongodbpractice.dao;

public interface CreateCollectionService {
    Object createCollection(String collectionName);
    Object createCollectionFixedSize(String collectionName, int size, int max);
}
