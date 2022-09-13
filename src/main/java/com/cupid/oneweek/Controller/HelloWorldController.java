package com.cupid.oneweek.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cupid
 * @date 2022/9/13 9:02
 */
@RestController
@RequestMapping()
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
