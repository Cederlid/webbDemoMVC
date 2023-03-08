package com.example.webbdemo2mvc;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class VisitCounter {
    int ticks;
    public void tick() {
        ticks++;
    }

    public int getTicks() {
        return ticks;
    }
}
