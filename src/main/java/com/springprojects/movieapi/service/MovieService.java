package com.springprojects.movieapi.service;

import com.springprojects.movieapi.model.Movie;
import com.springprojects.movieapi.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public Optional<Movie> getMovie(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> getMovieByImdbId(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }

    public void deleteMovie(ObjectId id) {
        movieRepository.deleteById(id);
    }
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
