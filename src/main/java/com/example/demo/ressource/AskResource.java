package com.example.demo.ressource;

import com.example.demo.bo.Ask;
import com.example.demo.service.AskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/asks")
public class AskResource {

    private final AskService askService;

    public AskResource(AskService askService) {
        this.askService = askService;
    }

    @RequestMapping
    public List<Ask> get() {
        return askService.getAll();
    }

//    @PostMapping
//    public void post(@RequestParam String value) {
//        Ask answer = new Ask();
//        askService.post(answer);
//    }
}
