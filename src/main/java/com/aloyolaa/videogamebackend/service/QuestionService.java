package com.aloyolaa.videogamebackend.service;

import com.aloyolaa.videogamebackend.dto.QuestionDto;

import java.util.List;

public interface QuestionService {
    List<QuestionDto> getRandomQuestionsByPatternType(Long id);
}
