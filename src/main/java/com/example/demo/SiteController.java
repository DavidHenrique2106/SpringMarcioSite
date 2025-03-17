package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

    @RequestMapping({ "/", "/{path:[^\\.]*}" })
    public String index() {
        return "redirect:/index.html";
    }
}
    

