package com.example.labksp;

public class JsonCreate {
    private Place jsonPlase = new Place();
    JsonCreate()
    {
    }

    public String getJsonPlace()
    {
        return "{\n" +
                "  \"name\": "+jsonPlase.getName()+",\n" +
                "  \"description\": "+jsonPlase.getLocation()+",\n" +
                "  \"category_id\": "+jsonPlase.getCategory_id()+",\n" +
                "  \"images\": [\n" +
                "    "+jsonPlase.getImages()+"\n" +
                "  ],\n" +
                "  \"diffuculty\": "+jsonPlase.getDifficulty()+",\n" +
                "  \"guide\": "+jsonPlase.getGuide()+",\n" +
                "  \"guidevideo\": [\n" +
                "    "+jsonPlase.getGuidevideo()+"\n" +
                "  ],\n" +
                "  \"exercise\": [\n" +
                "    "+jsonPlase.getExercise()+"\n" +
                "  ]\n" +
                "}";
    }
}
