package com.aloyolaa.videogamebackend.service;

import com.aloyolaa.videogamebackend.dto.PatternInfoDto;

public interface PatternInfoService {
    PatternInfoDto getInfoByPatternAndType(Long id, String type);
}
