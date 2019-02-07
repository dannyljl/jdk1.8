package java.entity;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
public class Kweet {
    private String content;
    private Date date;
    private List<User> hearts;
    private List<User> reports;
    private List<User> mentions;
    private List<String> tags;
    private User creator;

    public Kweet(String content, Date date, User creator) {
        this.content = content;
        this.date = date;
        this.creator = creator;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<User> getHearts() {
        return hearts;
    }

    public void setHearts(List<User> hearts) {
        this.hearts = hearts;
    }

    public List<User> getReports() {
        return reports;
    }

    public void setReports(List<User> reports) {
        this.reports = reports;
    }

    public List<User> getMentions() {
        return mentions;
    }

    public void setMentions(List<User> mentions) {
        this.mentions = mentions;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
