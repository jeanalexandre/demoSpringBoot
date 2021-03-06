package com.example.demo.bo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "quizz")
public class Quizz {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany
    private List<Ask> asks;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ask> getAsks() {
        return asks;
    }

    public void setAsks(List<Ask> asks) {
        this.asks = asks;
    }
}
