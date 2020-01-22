package com.example.labksp.Controllers;

import com.example.labksp.Hobby.Hobby;
import com.example.labksp.Hobby.HobbyRepository;
import com.example.labksp.Hobby.HobbyService;
import com.example.labksp.User.User;
import com.example.labksp.User.UserAchievement;
import com.example.labksp.User.UserAchievementRepo;
import com.example.labksp.User.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class JsonController {
    @Autowired
    private HobbyService placeservice;
    @Autowired
    private HobbyRepository hobbyrepo;
    @Autowired
    private UserAchievementRepo userAchievementRepo;
    @Autowired
    private UserRepo repo;

    @GetMapping("/json222")
    public String returnJson() {
        List<Hobby> lspl = new ArrayList<Hobby>();
        System.out.println(placeservice.listAll());
        lspl = placeservice.listAll();
        System.out.println(lspl.get(0).getImages());
        Hobby hobby = lspl.get(0);

        return
                "{\n" +"  \"id\": \""+ hobby.getId()+"\",\n"+
                "  \"name\":" + "\""+ hobby.getName()+ "\""+",\n" +
                "  \"description\":" + "\""+ hobby.getDescription() +"\"" +",\n" +
                "  \"category\": " +"\""+ hobby.getCategory() +"\""+ ",\n" +
                "  \"images\": [\n" +
                 convertTojsonLine(getMass(hobby.getImages()," ")) +
                "  ],\n" +
                "  \"difficulty\": "+"\""+ hobby.getDifficulty()+"\n" +"\","+
                "  \"guide\": " + "\""+ hobby.getGuide()+"\n" +"\","+
                "  \"guideVideo\": [\n" +
                convertTojsonLine(getMass(hobby.getGuideVideo()," "))+
                "  ],\n" +
                "  \"exercise\": [\n" +
                convertTojsonLine(getMass(hobby.getExercise(),"::"))
                +
                "  ]\n" +
                "}";
    }

    public List<String> getMass(String str, String splitter) {
        //  Pattern pattern = Pattern.compile("\\s");
        String[] links = str.split(splitter);
        System.out.println(Arrays.toString(links));
        List<String> lst = new ArrayList<String>(Arrays.asList(links));
        System.out.println(links.toString());
//        Matcher matcher = pattern.matcher(str);
//        int start = 0;
//        while (matcher.find(start)) {
//            String value = str.substring(matcher.start(), matcher.end());
//            lst.add(value);
//            start = matcher.end();
//        }
        return lst;
    }
    public String convertTojsonLine(List<String> str)
    {
        String line = "";
        for(int i = 0; i < str.size(); i++  ) {

            if (i == str.size() - 1) {
                System.out.println(str.size()-1);
                line = line + "\"" + str.get(i) + "\"";
            }
            else{
            line =line + "\"" + str.get(i) + "\"" + ",";
            }
        }
        return line;
    }

    @RequestMapping("/rest/user")
    public String showUserMsg(HttpServletRequest request)
    {
        Principal principal = request.getUserPrincipal();
        User user = repo.findByUsername(principal.getName());
       // userAchivmentsRepo.save(new UserAchivments(2,user));
        repo.findByUsername("nikita@nikita.ru");
        List<User> lspl = new ArrayList<User>();
        lspl.add(user);
        List<Hobby> lspl2 = new ArrayList<Hobby>();
        lspl2 = placeservice.listAll();
        System.out.println(userAchievementRepo.findAll() +"545");
        System.out.println( repo.findByUsername("nikita@nikita.ru").getUserChallenges().toString());
        Hobby hb = lspl2.get(0);
        lspl.get(0).setPosition("67890");
        hb.setUsers(lspl);
        placeservice.save(hb);
        System.out.println(hobbyrepo.findAll().toString());
        return "User has logged in!!!";
    }
}
