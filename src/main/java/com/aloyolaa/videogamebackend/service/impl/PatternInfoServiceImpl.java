package com.aloyolaa.videogamebackend.service.impl;

import com.aloyolaa.videogamebackend.dto.PatternInfoDto;
import com.aloyolaa.videogamebackend.exception.DataAccessExceptionImpl;
import com.aloyolaa.videogamebackend.mapper.PatternInfoMapper;
import com.aloyolaa.videogamebackend.repository.PatternInfoRepository;
import com.aloyolaa.videogamebackend.service.PatternInfoService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PatternInfoServiceImpl implements PatternInfoService {
    private final PatternInfoRepository patternInfoRepository;
    private final PatternInfoMapper patternInfoMapper;

    @Override
    public PatternInfoDto getInfoByPatternAndType(Long id, String type) {
        try {
            return patternInfoRepository.getInfoByPatternAndType(id, type.toUpperCase())
                    .map(patternInfoMapper::toDto)
                    .orElseThrow(() -> new EntityNotFoundException("Datos no encontrados."));
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl(e);
        }
    }
}
