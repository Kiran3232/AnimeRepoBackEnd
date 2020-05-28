package com.animerepo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.animerepo.model.Anime;

public interface AnimeRepoRepository extends MongoRepository<Anime, String> {

	@Query("{ 'name' : { $regex: ?0, $options:'i' } }")
	public List<Anime> findByName(String name);
}
