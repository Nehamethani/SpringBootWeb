package com.nekocodes.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.boot.web.servlet.server.Jsp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HomeController {

    private String num1;

    @GetMapping("/index")
    public String home(){
        System.out.println("Home called");
        return "index";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, HttpSession session)
    {

//        int n1 = Integer.parseInt(req.getParameter("num1"));
//        int n2 = Integer.parseInt(req.getParameter("num2"));
        int result = n1+n2;

        session.setAttribute("result", result);
        System.out.println(result);
        return "result";
    }

}
