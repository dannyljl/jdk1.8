package java.entity;

import javax.persistence.Entity;
import java.util.List;


@Entity
public abstract class User {
    private String name;
    private String location;
    private String web;
    private String bio;
    private String image;

    private List<User> followers;
    private List<User> following;



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

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User(String name, String location, String web, String bio, String image) {
        this.name = name;
        this.location = location;
        this.web = web;
        this.bio = bio;
        this.image = image;
    }



}
