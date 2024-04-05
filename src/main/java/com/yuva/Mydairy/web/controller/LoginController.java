package com.yuva.Mydairy.web.controller;

import com.yuva.Mydairy.biz.logs.User;
import com.yuva.Mydairy.data.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserRepo userRepo;


    @GetMapping
    public String loginForm() {
        return "login";
    }

    @PostMapping
    public String login(@RequestParam String email, @RequestParam String password, RedirectAttributes redirectAttributes) {
        // Find user by email
        User user = userRepo.findByEmail(email);

        // Check if user exists and password matches
        if (user != null && user.getPassword().equals(password)) {
            // User found and password matches, redirect to mainpage.html
            return "redirect:/mainpage.html";
        } else {
            // User not found or password doesn't match, redirect back to login with an error message
            return "redirect:/login?error=Invalid email or password";
        }
    }
}

