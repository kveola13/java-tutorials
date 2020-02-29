package com.kveola.intermediate.Gson;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadFromUrl {
    public static void main(String[] args) throws IOException {
        String urlAddress = "https://swapi.co/api/people/1/?format=json";
        URL url = new URL(urlAddress);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        System.out.println("Url: " + urlAddress);
        int response = connection.getResponseCode();
        System.out.println("Response " + response);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line);
        }
        bufferedReader.close();
        System.out.println(stringBuilder.toString());

        JSONObject jsonObject = new JSONObject(stringBuilder.toString());
        System.out.println(jsonObject.getString("name"));
        System.out.println(jsonObject.getJSONArray("films").get(0));
    }
}
