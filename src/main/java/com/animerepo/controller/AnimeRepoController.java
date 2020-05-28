package com.animerepo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.animerepo.model.Anime;
import com.animerepo.model.Season;
import com.animerepo.service.AnimeRepoService;

@Controller
@CrossOrigin
public class AnimeRepoController {

	@Autowired
	AnimeRepoService animeRepoService;
	
//	@PostMapping("/anime/add")
//	public ResponseEntity<Anime> addAnime(@RequestParam("name") String name,@RequestParam("source") String source,@RequestParam("description") String description,@RequestParam("airStartDate") String airStartDate,@RequestParam("airEndDate") String airEndDate, @RequestParam("image") MultipartFile file) throws IOException {
//		Anime anime = new Anime();
//		anime.setName(name);
//		anime.setSource(source);
//		anime.setDescription(description);
//		anime.setAirStartDate(airStartDate);
//		anime.setAirEndDate(airEndDate);
//		anime.setPictureName(file.getOriginalFilename());
//		anime.setImage(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
//		List<Season> seasons = new ArrayList<Season>();
//		anime.setSeasons(seasons);
//		animeRepoService.addAnime(anime);
//		ResponseEntity<Anime> response = new ResponseEntity<Anime>(anime, HttpStatus.OK);
//		return response;
//	}
	
	@PostMapping("/anime/add")
	public ResponseEntity<Anime> addAnime(@RequestBody Anime anime){
		animeRepoService.addAnime(anime);
		ResponseEntity<Anime> response = new ResponseEntity<Anime>(anime,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/anime/all")
	public ResponseEntity<List<Anime>> getAllAnime(){
		List<Anime> animeList = new ArrayList<Anime>();
		animeList = animeRepoService.getAllAnime();
		ResponseEntity<List<Anime>> response = new ResponseEntity<List<Anime>>(animeList,HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/anime/get")
	public ResponseEntity<Anime> getAnime(@RequestBody String animeName){
		Anime anime = new Anime();
		anime = animeRepoService.getAnime(animeName);
		ResponseEntity<Anime> response = new ResponseEntity<>(anime,HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/anime/search")
	public ResponseEntity<List<Anime>> searchAnime(@RequestBody String name){
		List<Anime> animeList = new ArrayList<Anime>();
		name = ".*"+ name + ".*";
		animeList = animeRepoService.searchAnime(name);
		System.out.println(animeList.toString());
		ResponseEntity<List<Anime>> response = new ResponseEntity<List<Anime>>(animeList,HttpStatus.OK);
		return response;
	}
}