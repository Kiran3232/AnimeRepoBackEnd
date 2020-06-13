package com.animerepo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Anime")
public class Anime {

	@Id
	public String id;

	@Indexed(unique = true)
	public String name;

	public String source;

	public String description;

	public String airStartDate;

	public String airEndDate;

	public String imagePath;

	public List<String> images;

	public List<Season> seasons;

	public String youtubeTrailerUrl;
	
	private List<String> whereToWatch;

	public Anime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Anime(String id, String name, String source, String description, String airStartDate, String airEndDate,
			String imagePath, List<String> images, List<Season> seasons, String youtubeTrailerUrl, List<String> whereToWatch) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.description = description;
		this.airStartDate = airStartDate;
		this.airEndDate = airEndDate;
		this.imagePath = imagePath;
		this.images = images;
		this.seasons = seasons;
		this.youtubeTrailerUrl = youtubeTrailerUrl;
		this.whereToWatch = whereToWatch;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAirStartDate() {
		return airStartDate;
	}

	public void setAirStartDate(String airStartDate) {
		this.airStartDate = airStartDate;
	}

	public String getAirEndDate() {
		return airEndDate;
	}

	public void setAirEndDate(String airEndDate) {
		this.airEndDate = airEndDate;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	public String getYoutubeTrailerUrl() {
		return youtubeTrailerUrl;
	}

	public void setYoutubeTrailerUrl(String youtubeTrailerUrl) {
		this.youtubeTrailerUrl = youtubeTrailerUrl;
	}

	public List<String> getWhereToWatch() {
		return whereToWatch;
	}

	public void setWhereToWatch(List<String> whereToWatch) {
		this.whereToWatch = whereToWatch;
	}

}