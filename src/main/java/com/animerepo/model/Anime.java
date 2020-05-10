package com.animerepo.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "Anime")
public class Anime {

	@Id
	public String id;

	@Indexed(unique=true)
	public String name;
	
	public String source;
	
	public String description;
	
	public String airStartDate;
	
	public String airEndDate;
	
	public String pictureName;
	
	public Binary image;
	
	public List<Season> seasons = new ArrayList<Season>();

	public Anime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Anime(String id, String name, String source, String description, String airStartDate, String airEndDate,
			String pictureName, Binary image, List<Season> seasons) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.description = description;
		this.airStartDate = airStartDate;
		this.airEndDate = airEndDate;
		this.pictureName = pictureName;
		this.image = image;
		this.seasons = seasons;
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

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	public Binary getImage() {
		return image;
	}

	public void setImage(Binary image) {
		this.image = image;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
	
	
}