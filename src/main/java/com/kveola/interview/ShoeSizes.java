package com.kveola.interview;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ShoeSizes {
    public static void main(String[] args) {
        System.out.println("Hello there!");
        File file = new File("src/main/resources/shoeData.json");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        if (fileReader != null) {
            ShoeSizeParser jsonDataParser = gson.fromJson(fileReader, ShoeSizeParser.class);
            String parsed = gson.toJson(jsonDataParser);
            System.out.println(parsed);
        }
    }
}

class ShoeSizeParser {
    private int id;
    private String shoeMaker;
    private int size;

    public ShoeSizeParser(int id, String shoeMaker, int size) {
        this.id = id;
        this.shoeMaker = shoeMaker;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShoeMaker() {
        return shoeMaker;
    }

    public void setShoeMaker(String shoeMaker) {
        this.shoeMaker = shoeMaker;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ShoeSizeParser{" +
                "id=" + id +
                ", shoeMaker='" + shoeMaker + '\'' +
                ", size=" + size +
                '}';
    }
}
