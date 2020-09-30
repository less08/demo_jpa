package ua.testing.demo_jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/api")
    public String mainPage(){
        return "index.html";
    }

    @RequestMapping("/all_user")
    public String allUsersPage(){
        return "users/index.html";
    }

   @RequestMapping("/registration")
   public String registrationPage (){
        return  "registration.html";
   }

   @RequestMapping("/admin")
    public String adminPage (){
       return "admin.html";
   }

   @RequestMapping ("/user")
   public String userPage (){
        return "user.html";
   }

   @RequestMapping("/speaker")
   public String speakerPage(){
       return "speaker.html";
   }
   @RequestMapping("/conferences")
   public String conferencesPage(){
       return "conferences.html";
   }


}
