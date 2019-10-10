package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    private String value1;
    private String value;

    @PostMapping("/show")
    public ModelAndView getName(HttpServletRequest req){
        User us=new User();
        us.setName("Ramesh");
        String str=req.getParameter("name");
        ModelAndView modelAndView=new ModelAndView("display");

        modelAndView.addObject("value",str);
        modelAndView.addObject("value1",us.getName());
        return  modelAndView;

    }
}
