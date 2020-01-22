package com.example.labksp.Hobby;

import com.example.labksp.User.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "new_hobby")
public class Hobby {
    @Id
    @Column(unique = true, nullable = false, columnDefinition = "serial",name = "hobby_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NotNull

    private long id;
    @Column(name = "name")
    private  String name;
    @Column (name = "category")
    private String category;
    @Column (name = "difficulty")
    private int difficulty;
    @Column(name = "description")
    private  String description;
    @ManyToMany(mappedBy = "userChallenges")
    private List<User> users;
    @Column(name = "images")
    private String images;

    @Column (name = "guide")
    private String guide;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Hobby() {
    }

    @Column (name = "guideVideo")
    private String guideVideo;

    @Column (name = "exercise")
    private String exercise;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = (long) id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getGuideVideo() {
        return guideVideo;
    }

    public void setGuideVideo(String guidevideo) {
        this.guideVideo = guidevideo;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", difficulty=" + difficulty +
                ", description='" + description + '\'' +
                ", users=" + users.toString() +
                ", images='" + images + '\'' +
                ", guide='" + guide + '\'' +
                ", guideVideo='" + guideVideo + '\'' +
                ", exercise='" + exercise + '\'' +
                '}';
    }
}
