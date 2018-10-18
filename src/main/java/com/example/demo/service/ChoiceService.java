package com.example.demo.service;

import com.example.demo.bo.Choice;
import com.example.demo.dao.ChoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChoiceService {

    private ChoiceRepository choiceRepository;

    public ChoiceService(ChoiceRepository choiceRepository) {
        this.choiceRepository = choiceRepository;
    }

    public List<Choice> getAll() {
        return this.choiceRepository.findAll();
    }

    public Optional<Choice> getById(long id) {
        return this.choiceRepository.findById(id);
    }

    public void post(Choice choice) {
        this.choiceRepository.save(choice);
    }

    public void vote(Choice choice) {
        this.choiceRepository.save(choice);
    }
}
