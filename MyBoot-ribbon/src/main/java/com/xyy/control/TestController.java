package com.xyy.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TestController
 * com.xyy.controller
 *
 * @author Xander
 * @Description
 * @Date 2019-06-26 15:20
 * The word 'impossible' is not in my dictionary.
 */
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public String add(Integer a, Integer b) {
        String result = restTemplate.getForObject("http://CONSUMER/add?a=" + a + "&b=" + b, String.class);
        return result;
    }
}
