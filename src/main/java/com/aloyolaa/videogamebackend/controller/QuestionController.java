package com.aloyolaa.videogamebackend.controller;

import com.aloyolaa.videogamebackend.dto.QuestionDto;
import com.aloyolaa.videogamebackend.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/pattern-type/{id}")
    public ResponseEntity<List<QuestionDto>> getRandomQuestionsByPatternType(@PathVariable Long id) {
        return new ResponseEntity<>(questionService.getRandomQuestionsByPatternType(id), HttpStatus.OK);
    }
}
