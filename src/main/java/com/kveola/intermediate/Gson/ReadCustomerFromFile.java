package com.kveola.intermediate.Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.kveola.intermediate.EasyJackson.JsonDataParser;
import com.kveola.intermediate.EasyJackson.Tags;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCustomerFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/data.json");
        FileReader fileReader = new FileReader(file);

        Gson gson = new Gson();
        JsonDataParser jsonDataParser = gson.fromJson(fileReader, JsonDataParser.class);

        System.out.println(jsonDataParser);

        List<Tags> tags = new ArrayList<>();
        tags.add(new Tags(jsonDataParser.getTags().isDoomed(), jsonDataParser.getTags().isUnique(), jsonDataParser.getTags().getDeploy()));
        tags.add(new Tags(true, false, "test deploy"));

        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.setPrettyPrinting();

        gson = gsonBuilder.create();
        System.out.println(gson.toJson(tags));

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Geralt");
        jsonObject.addProperty("strength", 4);
        jsonObject.addProperty("provisions", 13);
        JsonArray array = new JsonArray();
        array.add(jsonObject);

        System.out.println(gson.toJson(jsonObject));
    }
}
