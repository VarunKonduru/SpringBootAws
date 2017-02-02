package com.springboot.aws.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by VarunKonduru on 2/2/17.
 */
@Controller
public class indexController {
    @RequestMapping("/")
    public String indexControllerMethod(){
        return "index";
    }
}
