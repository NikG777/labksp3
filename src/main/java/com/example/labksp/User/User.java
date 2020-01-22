package com.example.labksp.User;

import com.example.labksp.Hobby.Hobby;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "usr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Email
    private String username;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<UserAchievement> userAchievements;

    @NotNull
    private String password;

    private String displayName;

    private String position;

    private String profilePicture;

    private String userLevel;

    //private int challengeCount;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_challenge", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "hobby_id"))
    private List<Hobby> userChallenges;
    private boolean active;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.LAZY)
    @CollectionTable(name = "user_role",joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> ROLES;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<Role> getROLES() {
        return ROLES;
    }

    public void setROLES(Set<Role> ROLES) {
        this.ROLES = ROLES;
    }

    public List<UserAchievement> getUserAchievements() {
        return userAchievements;
    }
    public void setUserAchievements(List<UserAchievement> userAchievements) {
        this.userAchievements = userAchievements;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }



    public List<Hobby> getUserChallenges() {
        return userChallenges;
    }

    public void setUserChallenges(List<Hobby> userChallenges) {
        this.userChallenges = userChallenges;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "position='" + position + '\'' +
                '}';
    }
}
