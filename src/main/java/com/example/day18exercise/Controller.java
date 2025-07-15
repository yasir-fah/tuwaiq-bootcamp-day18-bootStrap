package com.example.day18exercise;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController

public class Controller {

    @GetMapping("/name")
    public String name(){
        return "\nMy name is yasir  \n";
    }

    @GetMapping("/age")
    public String age(){
        return "21";
    }

    @GetMapping("/check/status")
    public String status(){
        return "\nEverything Ok";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> names(){

        ArrayList<String> names = new ArrayList<>();
        names.add("yasir");
        names.add("fahad");
        names.add("abdullah");
        names.add("mohammed");

        return names;
    }



}
