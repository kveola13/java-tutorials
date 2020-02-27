package com.kveola.intermediate;

import java.util.List;

public class JsonDataParser {
    private String name;
    private int Strength;
    private int Provisions;
    private String description;
    private List<Object> tags;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getProvisions() {
        return Provisions;
    }

    public void setProvisions(int provisions) {
        Provisions = provisions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

}
