package com.codegym.model;

import java.util.Date;

public class BlogForm {
    private Long blogId;
    private String title;
    private String content;
    private String author;
    private Date date;
    private Long categoryId;

    public BlogForm(){};

    public BlogForm(Long blogId, String title, String content, String author, Date date, Long categoryId) {
        this.blogId = blogId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
        this.categoryId = categoryId;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
