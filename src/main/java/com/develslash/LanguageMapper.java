package com.develslash;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LanguageMapper {
    LanguageMapper MAPPER = Mappers.getMapper(LanguageMapper.class);

    Language toLangue(LanguageDTO languageDTO);

    LanguageDTO toDTO(Language language);

}
