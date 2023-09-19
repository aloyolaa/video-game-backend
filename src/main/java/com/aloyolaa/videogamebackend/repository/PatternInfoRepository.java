package com.aloyolaa.videogamebackend.repository;

import com.aloyolaa.videogamebackend.entity.PatternInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PatternInfoRepository extends JpaRepository<PatternInfo, Long> {
    @Query("select p from PatternInfo p where p.pattern.id = ?1 and p.type = ?2")
    Optional<PatternInfo> getInfoByPatternAndType(Long id, String type);
}