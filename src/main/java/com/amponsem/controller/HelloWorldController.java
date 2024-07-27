package com.amponsem.controller;

import com.amponsem.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldController {

    //return a statement
    @GetMapping("/test1")
    @ResponseBody
    public String helloWorld() {
        return "Welcome to 2024 Olympics Games";
    }

    @GetMapping("/test2")
    //the response body is for pure text
    public String showPage(Model model) {
        model.addAttribute("message", "Welcome to 2024 Olympics Games");
        return "helloPage";
    }

    @GetMapping("/people")
    //the response body is for pure text
    public String showFriends(Model model) {
        List<Person> friends = new ArrayList<Person>();
        friends.add(new Person(1,"Rejoice Amponsem",10,40.5f));
        friends.add(new Person(2,"Cyrus Amponsem",8,38.5f));
        friends.add(new Person(3,"Jenef Amponsem",6,36.5f));
        friends.add(new Person(4,"Majesty Amponsem",4,34.5f));
        friends.add(new Person(5,"Christa Amponsem",2,32.5f));

        System.out.println(friends);
        model.addAttribute("message", friends);
        return "printFriends.html";
    }
}
