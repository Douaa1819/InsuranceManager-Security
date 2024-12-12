package org.assuremanager.controller;

import org.assuremanager.dto.request.UserLoginRequest;
import org.assuremanager.dto.request.UserRegisterRequest;
import org.assuremanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/register")
    public ModelAndView showRegistrationForm() {
        ModelAndView modelAndView = new ModelAndView("auth/register");
        modelAndView.addObject("userRegisterRequest", new UserRegisterRequest("", "", "", "", ""));
        return modelAndView;
    }


    @PostMapping("/register")
    public String register(@ModelAttribute UserRegisterRequest userRegisterRequest, Model model) {
        if (userService.isEmailExists(userRegisterRequest.email())) {
            model.addAttribute("error", "Email already in use.");
            return "register";
        }

        userService.register(userRegisterRequest);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public ModelAndView showLoginForm() {
        ModelAndView modelAndView = new ModelAndView("/auth/login");
        modelAndView.addObject("userLoginRequest", new UserLoginRequest("", ""));
        return modelAndView;
    }


    @PostMapping("/login")
    public String login() {

        return "redirect:/services";
    }


    @PostMapping("/logout")
    public String logout() {
        SecurityContextHolder.clearContext();
        return "redirect:/login";
    }

    @GetMapping("/test")
    public String test() {
        return "Test successful!";
    }
}
