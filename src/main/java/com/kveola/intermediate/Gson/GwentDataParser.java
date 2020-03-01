package com.kveola.intermediate.Gson;

import com.kveola.intermediate.EasyJackson.JsonDataParser;

import java.util.List;

public class GwentDataParser {
    private List<Object> GwentCards;
    private JsonDataParser jsonDataParser;

    public List<Object> getGwentCards() {
        return GwentCards;
    }

    public void setGwentCards(List<Object> gwentCards) {
        GwentCards = gwentCards;
    }

    public JsonDataParser getJsonDataParser() {
        return jsonDataParser;
    }

    public void setJsonDataParser(JsonDataParser jsonDataParser) {
        this.jsonDataParser = jsonDataParser;
    }

    @Override
    public String toString() {
        return "GwentDataParser{" +
                "GwentCards=" + GwentCards +
                ", jsonDataParser=" + jsonDataParser +
                '}';
    }
}
