package com.example.labksp.Controllers;

import com.example.labksp.Hobby.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @Autowired
    private HobbyRepository placerepo;

    @GetMapping("/index")
    public void replace_img(Model model)
    {
//        Place place = placerepo.findById(86);
//        model.addAttribute("somelink",place.getImages());
    }
}
