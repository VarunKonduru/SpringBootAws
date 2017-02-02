package com.springboot.aws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by VarunKonduru on 2/1/17.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String helloWorld(){
        return "index";
    }
}
