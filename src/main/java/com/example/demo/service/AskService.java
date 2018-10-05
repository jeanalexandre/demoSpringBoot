package com.example.demo.service;

import com.example.demo.bo.Ask;
import com.example.demo.dao.AskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AskService {

    private AskRepository askRepository;

    public AskService(AskRepository askRepository) {
        this.askRepository = askRepository;
    }

    /**
     * @return all answers
     */
    public List<Ask> getAll() {
//        List<Ask> asks = new ArrayList<>();
//        askRepository.findAll().forEach(a -> asks.add(a));
//        return asks;

        return this.askRepository.findAll();
    }

    public void post(Ask ask) {
        askRepository.save(ask);
    }
}
