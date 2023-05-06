package dev.chhinhua.movies.service;

import dev.chhinhua.movies.model.Review;

public interface ReviewService {

    public Review createReview(String reviewBody, String imdbId);
}
