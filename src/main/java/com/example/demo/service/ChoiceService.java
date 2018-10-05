package com.example.demo.service;

import com.example.demo.bo.Choice;
import com.example.demo.dao.ChoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceService {

    private ChoiceRepository choiceRepository;

    public ChoiceService(ChoiceRepository choiceRepository) {
        this.choiceRepository = choiceRepository;
    }

    public List<Choice> getAll() {
        return this.choiceRepository.findAll();
    }
}
