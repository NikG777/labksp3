package com.example.labksp;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class error implements ErrorController {

//    @RequestMapping("/error")
//    public String handleError() {
//        //do something like logging
//        return "redirect: index.html";
//    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}