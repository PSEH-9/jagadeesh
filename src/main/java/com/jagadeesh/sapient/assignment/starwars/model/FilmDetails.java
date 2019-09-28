package com.jagadeesh.sapient.assignment.starwars.model;

import java.util.List;

public class FilmDetails {

    private Integer numberOfMovies;
    private List<FilmModel> list;

    public Integer getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(Integer numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public List<FilmModel> getList() {
        return list;
    }

    public void setList(List<FilmModel> list) {
        this.list = list;
    }
}
