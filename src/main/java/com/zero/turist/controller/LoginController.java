package com.zero.turist.controller;

import com.zero.turist.data.User;
import com.zero.turist.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RestController
public class LoginController {


    UserService userService;

    @GetMapping(value = {"/","/login"})
    public ModelAndView login(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @GetMapping(value = "/registration")
    public ModelAndView registration() {
        ModelAndView mv = new ModelAndView();
        User user = new User();
        mv.addObject("user", user);
        mv.setViewName("registration");
        return mv;
    }

    @PostMapping(value = "/registration")
    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult){
        ModelAndView mv=new ModelAndView();
        User userExist=userService.findByEmail(user.getEmail());

        if (userExist!=null){
            bindingResult
                    .rejectValue("email","error.user","There is already a user registered with the email provided");

        }
        if (bindingResult.hasErrors()){
            mv.setViewName("registration");
        }
        else{
            userService.saveUser(user);
            mv.addObject("user",user);
            mv.addObject("successMessage","User has been  registered successfully");
            mv.setViewName("registration");
        }
        return mv;
    }

    @GetMapping(value = "/admin/home")
    public ModelAndView home(){
        ModelAndView mv=new ModelAndView();
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        User user=userService.findByEmail(authentication.getName());
        mv.addObject("userName", "Welcome " + user.getFirstName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        mv.addObject("adminMessage","Content Available Only for Users with Admin Role");
        mv.setViewName("admin/home");
        return mv;
    }

}
