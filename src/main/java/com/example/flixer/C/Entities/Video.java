package com.example.flixer.C.Entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Videos")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Video {
    @Id

    private Long id;
    private String title;
    private String url;
    private String description;
    private LocalDate publish_time;
    private String poster_url;

    @Transient
    private Integer publish_year;

    public Video() {
    }

    public Video(Long id, String title, String url, String description, LocalDate publish_time, String poster_url) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.description = description;
        this.publish_time = publish_time;
        this.poster_url = poster_url;
    }

    public Video(String title, String url, String description, LocalDate publish_time, String poster_url) {
        this.title = title;
        this.url = url;
        this.description = description;
        this.publish_time = publish_time;
        this.poster_url = poster_url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(LocalDate publish_time) {
        this.publish_time = publish_time;
    }

    public String getPoster_url() {
        return poster_url;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    public Integer getPublish_year() {
        if (this.publish_time != null){
            return this.publish_time.getYear();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", publish_time=" + publish_time +
                ", poster_url='" + poster_url + '\'' +
                ", publish_year=" + publish_year +
                '}';
    }
}
