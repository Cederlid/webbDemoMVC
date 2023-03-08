package com.example.webbdemo2mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class TimeController {

    @GetMapping("/time")
    public String getTime(Model m){
        m.addAttribute("timestring", LocalDateTime.now());
        return "timepage";
    }

}
