package com.example.demo.ressource;

import com.example.demo.bo.Quizz;
import com.example.demo.service.QuizzService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quizz")
public class QuizzResource {

    private final QuizzService quizzService;

    public QuizzResource(QuizzService quizzService) {
        this.quizzService = quizzService;
    }

    @RequestMapping
    public List<Quizz> getAllQuizz() {
        return this.quizzService.getAll();
    }
}
