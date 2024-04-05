package com.yuva.Mydairy.web.controller;

import com.yuva.Mydairy.biz.logs.LogData;
import com.yuva.Mydairy.biz.logs.User;
import com.yuva.Mydairy.data.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignupController {
    private UserRepo userRepo;

    public SignupController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @ModelAttribute("users")
    public Iterable<User> getuserdata() {
        return userRepo.findAll();

  }
  @ModelAttribute
public User getuserdet(){
        return new User();
}

    @GetMapping
    public String savesigndetails(Model model){
    return "signup";
   }
   @PostMapping
    public String saveuser(User user){
        userRepo.save(user);
        return "login";
   }
}
