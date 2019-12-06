package com.example.labksp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Start {
    @Autowired
    private PlaceService repo;

    @RequestMapping({"/",""})
    public String greeting() {
        return "index";
    }

    //    @RequestMapping (value = "/tables",method = RequestMethod.GET)
//    public String getValues(Model model)
//    {
//        Places place = new Places();
//        model.addAttribute("name","123");
//        return "tables";
//    }
//    @RequestMapping (value = "/tables",method = RequestMethod.POST)
//    public String insertTable(@ModelAttribute("place") Places place, Model model)
//    {
//
//        return "tables.html";
//    }
    @GetMapping (value = "/tables")
    public String getValues(Model model, @RequestParam(defaultValue = "0") int page, HttpServletRequest request)
    {
        model.addAttribute("listPlaces",repo.viewPage(page));
        model.addAttribute("currentPage",page);
        System.out.println(repo.get(12));
        return "tables";

    }
    @RequestMapping (value = "/second_page")
    public String show()
    {

        return "second_page";
    }
    @GetMapping (value = "/index")
    public String showIndex()
    {
        return "index";
    }

    @PostMapping("/save")
    public String save(Place place, HttpServletRequest request) {
        repo.save(place);
        return "redirect:" + request.getHeader("referer");
    }
    @GetMapping("/delete")
    public String delete(@RequestParam long id, Model model, HttpServletRequest request) {
        repo.delete((long)id);
        return "redirect:" + request.getHeader("referer");
    }
    @GetMapping("/findId")
    @ResponseBody
    public Place findOne(Integer id)
    {
        return repo.get(id);
    }
    @RequestMapping("/counting")
    public String counting(@RequestParam String value,Model model)
    {
        Line line = new Line();

        model.addAttribute("result",line.getvalue(value));

        return "second_page";
    }
}