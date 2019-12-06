package com.example.labksp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeconStart {
    @GetMapping("/json")
    public String returnJson() {

        return "{\n" +
                "  \"name\": \"Бильярд\",\n" +
                "  \"description\": \"Старая игра\",\n" +
                "  \"category_id\": \"1\",\n" +
                "  \"images\": [\n" +
                "    \"https://mirpozitiva.ru/uploads/posts/2016-08/medium/1472042903_31.jpg\"\n" +
                "  ],\n" +
                "  \"diffuculty\": \"2\",\n" +
                "  \"guide\": \"https://www.youtube.com/watch?v=UUxJ32mkVkE\",\n" +
                "  \"guidevideo\": [\n" +
                "    \"https://www.youtube.com/watch?v=UUxJ32mkVkE\"\n" +
                "  ],\n" +
                "  \"exercise\": [\n" +
                "    \"Раз два три.\"\n" +
                "  ]\n" +
                "}";
    }
}
