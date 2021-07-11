package com.paloaltonetworks.mongodbpractice.POJO;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "countries")
@Data
public class Country {

    @org.springframework.data.annotation.Id
    String Id;

    @Field("Country Name")
    String name;

    @Field("Language")
    String language;


    String ISO;
}
