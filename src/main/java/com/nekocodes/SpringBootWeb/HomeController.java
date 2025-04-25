package com.nekocodes.SpringBootWeb;

import org.springframework.boot.web.servlet.server.Jsp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HomeController {

   @GetMapping("/index")
    public String home(){
        System.out.println("Home called");
        return "index";
    }

}
