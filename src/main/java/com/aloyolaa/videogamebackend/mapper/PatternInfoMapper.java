package com.aloyolaa.videogamebackend.mapper;

import com.aloyolaa.videogamebackend.dto.PatternInfoDto;
import com.aloyolaa.videogamebackend.entity.PatternInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PatternInfoMapper {
    PatternInfo toEntity(PatternInfoDto patternInfoDto);

    PatternInfoDto toDto(PatternInfo patternInfo);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PatternInfo partialUpdate(PatternInfoDto patternInfoDto, @MappingTarget PatternInfo patternInfo);
}