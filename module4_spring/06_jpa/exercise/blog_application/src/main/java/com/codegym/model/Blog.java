package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "Blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long blogId;
    private String title;
    private String content;
    private String author;
    private String date;

    public Blog() {
    }

    public Blog(String title, String content, String author, String date) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogDd) {
        this.blogId = blogDd;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
