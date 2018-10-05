package com.example.demo.ressource;

import com.example.demo.bo.Choice;
import com.example.demo.service.ChoiceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/choices")
public class ChoiceResource {

    private final ChoiceService choiceService;

    public ChoiceResource(ChoiceService choiceService){
        this.choiceService = choiceService;
    }

    @RequestMapping
    public List<Choice> getAllChoice(){
        return this.choiceService.getAll();
    }
}
