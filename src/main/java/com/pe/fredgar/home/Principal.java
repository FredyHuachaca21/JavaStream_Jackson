package com.pe.fredgar.home;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pe.fredgar.model.Person;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        //final String RUTA_DATA = "/Users/fredy/IdeaProjects/JAVA8/ManejoDeJavaStreams/src/main/resources/data/person_mock.json";
        final String RUTA_DATA = "src/main/resources/data/person_mock.json";
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(RUTA_DATA);
        List<Person> personList = objectMapper.readValue(file, new TypeReference<List<Person>>() {});



        personList.stream()
                .filter(pais -> pais.getPais().equalsIgnoreCase("Peru"))
                .map(x -> {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    LocalDate fechaNacimiento = LocalDate.parse(x.getFecha_nac(), formatter);
                    Period edad = Period.between(fechaNacimiento, LocalDate.now());
                   // StringBuilder stringBuilder = new StringBuilder();
                    return new StringBuilder()
                            .append(x.getNombre())
                            .append(" ")
                            .append(x.getApellido())
                            .append(" ")
                            .append(x.getPais())
                            .append(" ")
                            .append(x.getFecha_nac())
                            .append(" ")
                            .append(edad.getYears())
                            .toString();
                }).limit(3)
                .forEach(System.out::println);

    }
}
