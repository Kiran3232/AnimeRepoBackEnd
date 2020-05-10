package com.animerepo.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Season {
	
	public Integer number;
	
	public List<Episode> episodes;
}
