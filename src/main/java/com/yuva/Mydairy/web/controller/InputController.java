package com.yuva.Mydairy.web.controller;

import com.yuva.Mydairy.biz.logs.LogData;
import com.yuva.Mydairy.data.PersonRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/datainput")
public class InputController {
    private PersonRepo personRepo;

    public InputController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }
    @ModelAttribute("data")
    public Iterable<LogData> getdata() {
        return personRepo.findAll();

    }
    @ModelAttribute
    public LogData getlogdata(){

        return new LogData();
    }

    @GetMapping
    public String saveInput(){



        return "datainput";
    }
    @PostMapping
    public String savedairy(LogData logData){
        personRepo.save(logData);
        return "data";

    }
}
