package com.example.relationshipdemo.repository;

import com.example.relationshipdemo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
