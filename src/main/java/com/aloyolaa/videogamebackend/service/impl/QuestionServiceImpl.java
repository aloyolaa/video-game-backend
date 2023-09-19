package com.aloyolaa.videogamebackend.service.impl;

import com.aloyolaa.videogamebackend.dto.QuestionDto;
import com.aloyolaa.videogamebackend.exception.DataAccessExceptionImpl;
import com.aloyolaa.videogamebackend.mapper.QuestionMapper;
import com.aloyolaa.videogamebackend.repository.QuestionRepository;
import com.aloyolaa.videogamebackend.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    @Override
    public List<QuestionDto> getRandomQuestionsByPatternType(Long id) {
        try {
            return questionRepository.getRandomQuestionsByPatternType(id)
                    .stream()
                    .map(questionMapper::toDto)
                    .toList();
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl(e);
        }
    }
}
