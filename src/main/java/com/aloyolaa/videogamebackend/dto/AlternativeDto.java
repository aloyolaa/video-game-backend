package com.aloyolaa.videogamebackend.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.aloyolaa.videogamebackend.entity.Alternative}
 */
public record AlternativeDto(Long id, String answer, Boolean isCorrect) implements Serializable {
}