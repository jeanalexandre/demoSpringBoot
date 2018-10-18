package com.example.demo.ressource;

import com.example.demo.bo.Ask;
import com.example.demo.service.AskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asks")
public class AskResource {

    private final AskService askService;

    public AskResource(AskService askService) {
        this.askService = askService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Ask> get() {
        return askService.getAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Ask> getById(@PathVariable("id") long id) {
        return askService.getById(id)
                .map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @RequestMapping(method = RequestMethod.POST)
    public void post(@RequestParam String entitled) {
        Ask answer = new Ask();
        answer.setEntitled(entitled);
        askService.post(answer);
    }
}
