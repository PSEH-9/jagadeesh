package com.jagadeesh.sapient.assignment.starwars.services;

import com.jagadeesh.sapient.assignment.starwars.model.FilmModel;

import java.util.List;

public interface StarsWarsService {
    List<FilmModel> getFilmDetails();
    List<FilmModel> getFilmDetailsByName(String filmName);
    String getFilmDetailsFromApi();
}
