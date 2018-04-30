package com.develslash;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PersonMapper personMapper = PersonMapper.MAPPER;
        LanguageMapper languageMapper = LanguageMapper.MAPPER;

        Person someOne = new Person();
        someOne.setId(1L);
        someOne.setName("Some one");

        Language vietnamese = new Language();
        vietnamese.setId(1L);
        vietnamese.setName("Vietnamese");

        Language english = new Language();
        english.setId(2L);
        english.setName("English");

        List<Language> languages = new ArrayList<>();
        languages.add(vietnamese);
        languages.add(english);

        List<Person> people = new ArrayList<>();
        people.add(someOne);

        someOne.setLanguages(languages);
        vietnamese.setPeople(people);

        PersonDTO personDTO = personMapper.toDTO(someOne, new CycleAvoidingMappingContext());
        System.out.println(personDTO);
    }

}
