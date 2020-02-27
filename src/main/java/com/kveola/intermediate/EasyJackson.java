package com.kveola.intermediate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasyJackson {

    public static void main(String[] args) throws IOException {
        String jsonDataPath = "src/main/java/com/kveola/intermediate/data.json";
        String input = new String(Files.readAllBytes(Paths.get(jsonDataPath)), StandardCharsets.UTF_8);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonDataParser parser = objectMapper.readValue(input, JsonDataParser.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
