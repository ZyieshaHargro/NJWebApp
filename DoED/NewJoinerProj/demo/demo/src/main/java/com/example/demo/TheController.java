package com.example.demo;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class TheController {

//    @GetMapping("welcome")
    @RequestMapping("welcome")
    public String welcome() {
        return "welcome";
    }

//    @GetMapping("kora")
    @RequestMapping("kora")
    public String kora() {
        return "kora";
    }

    @RequestMapping("instruments")
    public String instruments() {
        // this needs to match the request mapping
        return "instruments";
    }

    @RequestMapping("about")
    public String about() {
        // this needs to match the request mapping
        return "about";
    }
}
