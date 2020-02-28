package com.kveola.intermediate.EasyJackson;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadJson {


    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            Gson gson = new Gson();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String parsedText = "";
            while (null != (parsedText = bufferedReader.readLine())) {
                System.out.println(parsedText);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
