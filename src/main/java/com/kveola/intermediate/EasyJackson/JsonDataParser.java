package com.kveola.intermediate.EasyJackson;

public class JsonDataParser {
    private int id;
    private String name;
    private int Strength;
    private int Provisions;
    private String description;
    private Tags tags;

    public JsonDataParser(int id, String name, int strength, int provisions, String description, Tags tags) {
        this.id = id;
        this.name = name;
        Strength = strength;
        Provisions = provisions;
        this.description = description;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        return "name='" + name + '\'' +
                ", Strength=" + Strength +
                ", Provisions=" + Provisions +
                ", description='" + description + '\'' +
                ", tags={" + tags;
    }
}
