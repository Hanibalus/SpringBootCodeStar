package com.example.codestar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeStarController {

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello AwsCodeStar commit!";
    }
}
