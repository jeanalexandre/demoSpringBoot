package com.example.demo.service;

import com.example.demo.bo.Quizz;
import com.example.demo.dao.QuizzRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizzService {

    private QuizzRepository quizzRepository;

    public QuizzService(QuizzRepository quizzRepository) {
        this.quizzRepository = quizzRepository;
    }

    public List<Quizz> getAll() {
        return this.quizzRepository.findAll();
    }
}
