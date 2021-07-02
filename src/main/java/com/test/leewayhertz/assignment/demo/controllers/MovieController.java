package com.test.leewayhertz.assignment.demo.controllers;

import com.test.leewayhertz.assignment.demo.entities.Movies;
import com.test.leewayhertz.assignment.demo.repos.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping("/movie")
    public String setRecord(@RequestBody Movies movies)
    {
        movieRepository.save(movies);
        return "Saved movie id "+movies.getId();
    }

    @GetMapping("/movie/{id}")
    public Optional<Movies> getRecord(@PathVariable long id)
    {
        return movieRepository.findById(id);
    }
}
