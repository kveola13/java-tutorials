package com.kveola.intermediate;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EasyJackson {
    //Tedious way of doing it
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(System.getProperty("user.dir"));
        System.out.println(path);
        String jsonDataPath = "src/main/java/com/kveola/intermediate/data.json";
        String input = new String(Files.readAllBytes(Paths.get(jsonDataPath)), StandardCharsets.UTF_8);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonDataParser jsonDataParsed = objectMapper.readValue(input, JsonDataParser.class);
        System.out.println(jsonDataParsed.toString());
    }

}
