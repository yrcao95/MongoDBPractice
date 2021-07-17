package com.paloaltonetworks.mongodbpractice.dao;

import com.paloaltonetworks.mongodbpractice.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class QueryServiceImpl implements QueryService {

  private static final String COLLECTION_NAME = "Users";
  @Autowired MongoTemplate mongoTemplate;

  @Override
  public List<User> findAll() {
    return mongoTemplate.findAll(User.class, COLLECTION_NAME);
  }

  @Override
  public List<User> findByName(String name) {
    Criteria criteria = Criteria.where("name").is(name);
    Query query = new Query(criteria);
    return mongoTemplate.find(query, User.class, COLLECTION_NAME);
  }

  @Override
  public List<User> findByNameAndBirthDay(String name, String birthday) {
    Criteria criteriaName = Criteria.where("name").is(name);
    Criteria criteriaBirthday = Criteria.where("birthday").is(birthday);
    Criteria criteria = new Criteria().andOperator(criteriaName, criteriaBirthday);
    Query query = new Query(criteria);
    return mongoTemplate.find(query, User.class, COLLECTION_NAME);
  }

  @Override
  public List<User> findByNameAndSex(String name, String sex) {
    Criteria criteriaName = Criteria.where("name").is(name);
    Criteria criteriaSex = Criteria.where("birthday").is(sex);
    Criteria criteria = new Criteria().andOperator(criteriaName, criteriaSex);
    Query query = new Query(criteria);
    return mongoTemplate.find(query, User.class, COLLECTION_NAME);
  }
}
