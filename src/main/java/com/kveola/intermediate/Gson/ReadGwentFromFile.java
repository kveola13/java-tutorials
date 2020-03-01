package com.kveola.intermediate.Gson;

import com.google.gson.Gson;
import com.kveola.intermediate.EasyJackson.JsonDataParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadGwentFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/data.json");
        FileReader fileReader = new FileReader(file);

        Gson gson = new Gson();
        JsonDataParser[] gwentParser = gson.fromJson(fileReader, JsonDataParser[].class);

        for (JsonDataParser jsonElement: gwentParser) {
            System.out.println(jsonElement);
        }
    }
}
