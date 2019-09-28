package com.jagadeesh.sapient.assignment.starwars.services;

import com.jagadeesh.sapient.assignment.starwars.model.FilmModel;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StarWarServiceImpl implements StarsWarsService {


    private RestTemplate restTemplate;
    private static final String API_URL="https://swapi.co/api/films";
    static private List<FilmModel> filmModels;

    static {
        filmModels = new ArrayList<>();
        filmModels.add(new FilmModel("Attack of the Clones", 2, "George Lucas",
                "Rick McCallum", "2002"));
        filmModels.add(new FilmModel("The Phantom Menace", 1, "George Lucas",
                "Rick McCallum", "1999"));
        filmModels.add(new FilmModel("Revenge of the Sith", 3, "George Lucas",
                "Rick McCallum", "2005"));

    }

    @Override
    public List<FilmModel> getFilmDetails() {
        return filmModels;
    }

    @Override
    public List<FilmModel> getFilmDetailsByName(String filmName) {
        return filmModels.stream().filter(film -> filmName.equals(film.getTitle())).collect(Collectors.toList());
    }

    @Override
    public String getFilmDetailsFromApi() {
        restTemplate = new RestTemplate();
        String jsonData = restTemplate.getForObject(API_URL, String.class);
        return jsonData;
    }


}
