package com.yuva.Mydairy.web.controller;


import com.yuva.Mydairy.biz.logs.LogData;
import com.yuva.Mydairy.data.PersonRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/data")
public class NoteController {
    private PersonRepo personRepo;

    public NoteController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @ModelAttribute("data")
    public Iterable<LogData> getdata() {
        return personRepo.findAll();

    }
        @GetMapping
        public String showdata (Model model){


            model.addAttribute("currentTime", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            return "data";
        }
        @PostMapping
        public String savedairy(){
        return "data";
        }
    }
