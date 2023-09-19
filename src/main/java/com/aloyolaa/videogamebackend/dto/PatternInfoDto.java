package com.aloyolaa.videogamebackend.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.aloyolaa.videogamebackend.entity.PatternInfo}
 */
public record PatternInfoDto(Long id, String image, String explication, String type) implements Serializable {
}