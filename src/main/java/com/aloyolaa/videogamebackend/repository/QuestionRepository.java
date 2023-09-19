package com.aloyolaa.videogamebackend.repository;

import com.aloyolaa.videogamebackend.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query("select q from Question q where q.patternType.id =?1 order by rand() limit 5")
    List<Question> getRandomQuestionsByPatternType(Long id);
}