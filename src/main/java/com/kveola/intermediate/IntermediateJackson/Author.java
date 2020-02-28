package com.kveola.intermediate.IntermediateJackson;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.ArrayList;
import java.util.List;

public class Author {
    List<Item> itemList = new ArrayList<>();

    public Author (String firstName, String lastName){
        super();
    }

    @JsonGetter
    public List<Item> getItemList(){
        return itemList;
    }

    public void setItemList(List<Item> itemList){
        this.itemList = itemList;
    }
}
