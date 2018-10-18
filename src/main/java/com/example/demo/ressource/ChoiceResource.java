package com.example.demo.ressource;

import com.example.demo.bo.Choice;
import com.example.demo.service.ChoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/choices")
public class ChoiceResource {

    private final ChoiceService choiceService;

    public ChoiceResource(ChoiceService choiceService){
        this.choiceService = choiceService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Choice> getAllChoice(){
        return this.choiceService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Choice> getById(@PathVariable("id") long id) {
        return choiceService.getById(id)
                .map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @RequestMapping(method = RequestMethod.POST)
    public void post(@PathVariable("value") String value) {
        Choice choice = new Choice();
        choice.setValue(value);
        choice.setRank(0);
        this.choiceService.post(choice);
    }

    @RequestMapping(value = "/{id}/vote", method = RequestMethod.PATCH)
    public void vote(@PathVariable("id") long id) {
        final Choice choice = this.choiceService.getById(id).orElse(null);
        if (choice != null) {
            choice.setRank((choice != null ? choice.getRank() + 1 : 0));
        }
    }
}
