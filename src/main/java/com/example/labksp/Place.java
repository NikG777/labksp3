package com.example.labksp;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "hobby")
public class Place {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private  String name;
    @Column(name = "description")
    private  String location;
    @Column (name = "category_id")
    private int category_id;

    @Column(length=10485760,name = "images")
    private String[] images;
    @Column (name = "difficulty")
    private int difficulty;
    @Column (name = "guide")
    private String guide;
    @Column (name = "guidevideo")
    private String[] guidevideo;
    @Column (name = "exercise")
    private String[] exercise;
    @Column (name = "exerciseimages")
    private String[] exerciseimages;

    @Override
    public String toString() {
        return "Places{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", category_id=" + category_id +
                ", images="  +
                ", difficulty=" + difficulty +
                ", guide='" + guide + '\'' +
                ", guidevideo=" +
                ", exercise=" +
                ", exerciseimages="  +
                '}';
    }

    public long getId() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

      public String[] getImages() {
         return images;
     }

     public void setImages(String[] images) {
         this.images = images;
     }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

     public String[] getGuidevideo() {
       return guidevideo;
     }

     public void setGuidevideo(String[] guidevideo) {
       this.guidevideo = guidevideo;
     }

    public String[] getExercise() {
         return exercise;
     }

     public void setExercise(String[] exercise) {
         this.exercise = exercise;
     }

     public String[] getExerciseimages() {
        return exerciseimages;
     }

     public void setExerciseimages(String[] exerciseimages) {
        this.exerciseimages = exerciseimages;
     }
}
