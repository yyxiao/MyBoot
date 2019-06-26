package com.xyy.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * TestController
 * com.xyy.control
 *
 * @author Xander
 * @Description
 * @Date 2019-06-26 15:03
 * The word 'impossible' is not in my dictionary.
 */
@RestController
public class TestController {

    @GetMapping("/add")
    public String add(Integer a, Integer b, HttpServletRequest request) {
        return " From Port: " + request.getServerPort() + ", Result: " + (a + b);
    }
}
