package com.animerepo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.animerepo.model.Anime;
import com.animerepo.repository.AnimeRepoRepository;

@Service
public class AnimeRepoService {
	
	@Autowired
	private AnimeRepoRepository animeRepoRepository;
	
	public String addAnime(Anime anime) {
		animeRepoRepository.save(anime);
		return anime.getName();
	}
	
	public List<Anime> getAllAnime(){
		return animeRepoRepository.findAll();
	}
}
