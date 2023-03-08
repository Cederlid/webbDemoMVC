package com.example.webbdemo2mvc;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope //onödigt, default
public class AddService {
    public int add(int a, int b){
        return a+b;
    }
}
