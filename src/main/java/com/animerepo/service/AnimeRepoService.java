package com.animerepo.service;

import java.util.List;
import java.util.Optional;

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
	
	public Anime getAnime(String animeName) {
		Anime anime = new Anime();
		Optional<Anime> optionalEntity = animeRepoRepository.findById(animeName);
		if(optionalEntity.isPresent()) {
			anime = optionalEntity.get();
		}
		else {
			System.out.println("here");
			anime = null;
		}
		return anime;
	}
	
	public List<Anime> searchAnime(String name){
		System.out.println(name);
		return animeRepoRepository.findByName(name);
	}
}
