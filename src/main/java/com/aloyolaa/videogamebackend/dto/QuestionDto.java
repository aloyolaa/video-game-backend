package com.aloyolaa.videogamebackend.dto;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.aloyolaa.videogamebackend.entity.Question}
 */
public record QuestionDto(Long id, String text, String image,
                          Set<AlternativeDto> alternatives) implements Serializable {
}