package java.entity;


import javax.persistence.Entity;

@Entity
public class Moderator extends User {
    public Moderator(String name, String location, String web, String bio, String image) {
        super(name, location, web, bio, image);
    }
}
