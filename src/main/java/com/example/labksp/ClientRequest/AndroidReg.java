package com.example.labksp.ClientRequest;

import com.example.labksp.User.Role;
import com.example.labksp.User.User;
import com.example.labksp.User.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.Map;

@RestController
public class AndroidReg {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/androidreg",
            method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseEntity<String> addUser(@Valid @RequestBody User user)
    {
        User userFromDb = userRepo.findByUsername(user.getUsername());
        if(userFromDb != null){
            return new ResponseEntity<String>("{\"result\":\"1\"}",HttpStatus.BAD_REQUEST);
        }
        user.setActive(true);
        user.setROLES(Collections.singleton(Role.USER));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        System.out.println(user);
        return new ResponseEntity<String>("{\"result\":\"0\"}",HttpStatus.OK);
    }
}

//    @RequestMapping(value = "/getAchievements",
//            method = RequestMethod.POST,
//            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
//    @ResponseBody
//    public ResponseEntity<String> getAchievments(@RequestBody String id)
//    {
//        String response =   "{\n" +
//                "  \"id\": \"3\",\n" +
//                "  \"login\": \"Оксана\",\n" +
//                "  \"password\":\"bandit\",\n" +
//                "  \"displayName\":\"Оксана\",\n" +
//                "  \"position\":\"Новичок\",\n" +
//                "  \"userLevel\":\"Новичок\",\n" +
//                "  \"challengeCount\":\"9\",\n" +
//                "  \"profilePicture\":\"https://sun9-25.userapi.com/c857320/v857320157/858eb/CI_zGWsYmSM.jpg\",\n" +
//                "  \"lastChallenge\":{\"id\": \"1\",\n" +
//                "                  \"name\": \"Рисование акварелью\",\n" +
//                "                  \"image\": \n" +
//                "                    \"https://images.unsplash.com/photo-1476763752342-d5cf7e5eb6cc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1100&q=60\"\n" +
//                "                 ,\n" +
//                "                  \"difficulty\": \"2\"},\n" +
//                "  \"lastAchievement\":{\"id\": \"1\",\n" +
//                "                  \"name\": \"Пабло Пикассо\",\n" +
//                "                  \"image\": \n"  +
//                "                    \"https://sun9-33.userapi.com/c858220/v858220980/11f267/fC4bfgF_V-4.jpg\"\n"  +
//                "                  ,\n" +
//                "                  \"description\": \"Выполнен Челлендж из категории Творчество.\"\n}" +
//                "}"
//                ;
//        return new ResponseEntity<String>(response,HttpStatus.OK);
//    }
