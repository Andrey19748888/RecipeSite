package com.example.recipesite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("launch")
    public String applicationLaunch() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String project() {

        return "Студент \n" +
                "Описание";
    }


}
