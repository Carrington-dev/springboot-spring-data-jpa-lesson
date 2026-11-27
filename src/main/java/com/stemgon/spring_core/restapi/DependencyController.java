package com.stemgon.spring_core.restapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class DependencyController {

    @GetMapping("/daily")
    public String getDailyWorkout(){
        return  "Exercising while practicing baseball";
    }
}
