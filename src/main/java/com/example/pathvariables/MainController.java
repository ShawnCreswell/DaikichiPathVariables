package com.example.pathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/travel/{city}")
    public String travel(@PathVariable("city")String city){
        return "Congratulations, Shawn. You will travel to " + city;
    }

}
