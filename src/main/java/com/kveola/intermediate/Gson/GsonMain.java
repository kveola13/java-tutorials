package com.kveola.intermediate.Gson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

public class GsonMain {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Geralt", new Date());


        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("dd-MM-yy");
        gsonBuilder.setFieldNamingStrategy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        Gson gson = gsonBuilder.create();

        String jsonCustomer = gson.toJson(customer);

        System.out.println(jsonCustomer);

        Customer secondCustomer = gson.fromJson(jsonCustomer, Customer.class);

        System.out.println(secondCustomer);
    }
}
