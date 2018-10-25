package com.example.demo.ressource;

import com.example.demo.bo.Subscription;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/subscription")
public class SubscriptionRessouce {

    @RequestMapping(method = POST)
    public ResponseEntity<Void> create(@Valid @RequestBody Subscription subscription) {
        return null;
    }
}
