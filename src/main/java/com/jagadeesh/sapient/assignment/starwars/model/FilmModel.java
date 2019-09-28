package com.jagadeesh.sapient.assignment.starwars.model;

import java.io.Serializable;

public class FilmModel implements Serializable {

    private String title;
    private Integer episodeId;
    private String director;
    private String producer;
    private String releaseDate;

    public FilmModel(String title, Integer episodeId, String director, String producer, String releaseDate) {
        this.title = title;
        this.episodeId = episodeId;
        this.director = director;
        this.producer = producer;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisodeId() {
        return episodeId;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
