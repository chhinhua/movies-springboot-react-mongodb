package dev.chhinhua.movies.service;

import dev.chhinhua.movies.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    public List<Movie> getAllMovies();
    public Optional<Movie> getSingleMovie(String imdbId);
}
