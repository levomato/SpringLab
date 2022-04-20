package com.levo.SpringLab.model;


import javax.persistence.*;
import java.util.Date;

@Entity(name="task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String title;
    String content;
    Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
