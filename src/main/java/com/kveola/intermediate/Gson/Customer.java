package com.kveola.intermediate.Gson;

import java.util.Date;

public class Customer {
    private int id;
    private String name;
    private Date date;

    public Customer(int id, String name, Date date){
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
