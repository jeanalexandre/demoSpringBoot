package com.example.demo.dao;

import com.example.demo.bo.Quizz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizzRepository extends JpaRepository<Quizz, Long> {
}
