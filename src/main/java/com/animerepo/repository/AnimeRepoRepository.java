package com.animerepo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.animerepo.model.Anime;

public interface AnimeRepoRepository extends MongoRepository<Anime, String> {

}
