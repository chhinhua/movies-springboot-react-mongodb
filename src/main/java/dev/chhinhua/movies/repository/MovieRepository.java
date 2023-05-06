package dev.chhinhua.movies.repository;

import dev.chhinhua.movies.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.rmi.server.ObjID;
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjID> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}