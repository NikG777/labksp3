package com.example.labksp.Controllers;

import com.example.labksp.Hobby.Hobby;
import com.example.labksp.Hobby.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class
TableController {
    @Autowired
    private HobbyService repo;

    @RequestMapping({"/",""})
    public String greeting() {
        return "index";
    }

    @GetMapping (value = "/tables")
    public String getValues(Model model, @RequestParam(defaultValue = "0") int page, HttpServletRequest request)
    {
        model.addAttribute("listPlaces",repo.viewPage(page));
        model.addAttribute("currentPage",page);
        System.out.println(repo.get(1));
        return "tables";

    }


    @PostMapping("/save")
    public String save(Hobby hobby, HttpServletRequest request) {
        System.out.println(hobby.getId());
        repo.save(hobby);
        return "redirect:" + request.getHeader("referer");
    }
    @GetMapping("/delete")
    public String delete(@RequestParam long id, Model model, HttpServletRequest request) {
        repo.delete((long)id);
        return "redirect:" + request.getHeader("referer");
    }
    @GetMapping("/findId")
    @ResponseBody
    public Hobby findOne(Integer id)
    {
        return repo.get(id);
    }
}