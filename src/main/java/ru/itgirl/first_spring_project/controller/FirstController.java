package ru.itgirl.first_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.first_spring_project.entity.DayOfWeek;

@RestController
public class FirstController {

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "name") String name) {
        return String.format("Сегодня %s!", DayOfWeek.valueOf(name).getName());
    }
}