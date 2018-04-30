package com.develslash;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper MAPPER = Mappers.getMapper(PersonMapper.class);

    Person toPerson(PersonDTO personDTO, @Context CycleAvoidingMappingContext context);

    PersonDTO toDTO(Person person, @Context CycleAvoidingMappingContext context);

}
