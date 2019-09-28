package com.jagadeesh.sapient.assignment.starwars.controller;

import com.jagadeesh.sapient.assignment.starwars.model.FilmDetails;
import com.jagadeesh.sapient.assignment.starwars.model.FilmModel;
import com.jagadeesh.sapient.assignment.starwars.services.StarsWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private StarsWarsService warsService;

    @GetMapping(path = "/films", produces = "application/json")
    public FilmDetails getAllEpisods()
    {
        List<FilmModel> films = warsService.getFilmDetails();
        FilmDetails filmDetails = getFilmDetails(films);
        return filmDetails;
    }

    @GetMapping(path = "/{filmName}", produces = "application/json")
    public FilmDetails getFilmByName(@PathVariable("filmName") String filmName){
        return getFilmDetails(warsService.getFilmDetailsByName(filmName));
    }

    @GetMapping(path = "/films", produces = "application/json")
    public FilmDetails getAllEpisods()
    {
        List<FilmModel> films = warsService.getFilmDetails();
        FilmDetails filmDetails = getFilmDetails(films);
        return filmDetails;
    }

    private FilmDetails getFilmDetails(List<FilmModel> films) {
        FilmDetails filmDetails = new FilmDetails();
        filmDetails.setNumberOfMovies(films.size());
        filmDetails.setList(films);
        return filmDetails;
    }

}
