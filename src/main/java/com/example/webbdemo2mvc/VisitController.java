package com.example.webbdemo2mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisitController {
    @Autowired
    VisitCounter vc;
    @GetMapping("/visit")
    public String visit(Model m){
        vc.tick();
        int visits = vc.getTicks();
        m.addAttribute("ticks", visits);
        return "visitpage";
    }
}
