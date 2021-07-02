package com.test.leewayhertz.assignment.demo.repos;

import com.test.leewayhertz.assignment.demo.entities.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movies, Long> {
}
