package com.example.labksp.User;

import javax.persistence.*;

@Entity
@Table(name = "usr_ach")
public class UserAchievement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String text;
    private String icon;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private User user;


    public UserAchievement() {
    }

    public UserAchievement(String title, String text, String icon, User user) {
        this.title = title;
        this.text = text;
        this.icon = icon;
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserAchivments{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", user=" + user +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
