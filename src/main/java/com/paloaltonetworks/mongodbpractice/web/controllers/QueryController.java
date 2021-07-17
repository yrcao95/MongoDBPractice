package com.paloaltonetworks.mongodbpractice.web.controllers;

import com.paloaltonetworks.mongodbpractice.dao.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/query")
public class QueryController {
    @Autowired
    QueryService queryService;

    @GetMapping("/all")
    public Object findAll() {
        return queryService.findAll();
    }

    @GetMapping("/{name}")
    public Object findByName(@PathVariable("name") String name) {
        return queryService.findByName(name);
    }
}
