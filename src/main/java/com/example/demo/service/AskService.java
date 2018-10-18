package com.example.demo.service;

import com.example.demo.bo.Ask;
import com.example.demo.dao.AskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        return this.askRepository.findAll();
    }

    /**
     *
     * @param id
     * @return ask match with id in param
     */
    public Optional<Ask> getById(long id) {
        return this.askRepository.findById(id);
    }

    /**
     * create new ask
     * @param ask
     */
    public void post(Ask ask) {
        askRepository.save(ask);
    }
}
