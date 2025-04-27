package com.fsb.greeting.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fsb.greeting.web.models.User;


@Controller
public class GreetingController {
    // Get /greeting?name=Azer&age=20
    @RequestMapping({"/","/greeting"})
    //@ResponseBody
    public String hello( @RequestParam(value="name"/*, defaultValue = "World"*/) String myName,
                         @RequestParam(defaultValue = "20") int age,
                         Model model) {
        String [] names= new String[]{"Demo1","Demo2","Demo3","Demo4"};
        User user= new User("Admin","administrator");
        model.addAttribute("name", myName);
        model.addAttribute("age", age);
        model.addAttribute("names", names);  
        model.addAttribute("user", user);
        //return "<h1>"+ user.getName()+"</h1> greeting-view";
        return "greeting-view";
    }
    
   /* @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public  String missingServletRequestParameterExceptionHandler(Model model,MissingServletRequestParameterException e ){
        model.addAttribute("errorMessage", e.getMessage());
        return "errors";
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public  String methodArgumentTypeMismatchExceptionHandler(Model model,MethodArgumentTypeMismatchException e ){
        model.addAttribute("errorMessage", e.getMessage());
        return "errors";
    }*/
    
    
}