package com.ie.controllers;

import com.ie.configs.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MessageController {

    @Autowired
    private ApplicationConfiguration configuration;

    @RequestMapping("/message")
    public Map<String, String> welcome() {

        Map<String, String> map = new HashMap<>();
        map.put("message", configuration.getMessage());
        return map;

    }
}
