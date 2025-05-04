package com.nekocodes.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.boot.web.servlet.server.Jsp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView add(@RequestParam("num1") int n1, @RequestParam("num2") int n2, ModelAndView mv)
    {

//        int n1 = Integer.parseInt(req.getParameter("num1"));
//        int n2 = Integer.parseInt(req.getParameter("num2"));
        int result = n1+n2;

//        MV.addAttribute("result",result);
//        System.out.println(result);
//        return "result";

          mv.addObject("result", result);
          mv.setViewName("result");

          return mv;
    }
    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien)
    {
        System.out.println(alien);
        return "result";
    }
    @ModelAttribute("course")
    public String courseName()
    {
        return "java";
    }

}
