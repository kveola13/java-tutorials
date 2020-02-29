package com.kveola.intermediate.EasyJackson;

public class JsonDataParser {
    private String name;
    private int Strength;
    private int Provisions;
    private String description;
    private Tags tags;

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

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "JsonDataParser{" +
                "name='" + name + '\'' +
                ", Strength=" + Strength +
                ", Provisions=" + Provisions +
                ", description='" + description + '\'' +
                ", tags={" + tags +
                '}';
    }
}
