package com.yuva.Mydairy.web.controller;

import com.yuva.Mydairy.biz.logs.LogData;
import com.yuva.Mydairy.data.PersonRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("/dairylog")
public class DairyController {
    private final PersonRepo personRepo;

    public DairyController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }


    @GetMapping
    public String showDairy(Model model){
        List<LogData> logDataList = StreamSupport.stream(personRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());
        // Add data to the model
        model.addAttribute("logDataList", logDataList);
        return "dairylog";
    }

}
