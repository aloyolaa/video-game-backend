package com.aloyolaa.videogamebackend.controller;

import com.aloyolaa.videogamebackend.dto.PatternInfoDto;
import com.aloyolaa.videogamebackend.service.PatternInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pattern-info")
public class PatternInfoController {
    private final PatternInfoService patternInfoService;

    @GetMapping("/{id}/{type}")
    public ResponseEntity<PatternInfoDto> getInfoByPatternAndType(@PathVariable Long id, @PathVariable String type) {
        return new ResponseEntity<>(patternInfoService.getInfoByPatternAndType(id, type), HttpStatus.OK);
    }
}
