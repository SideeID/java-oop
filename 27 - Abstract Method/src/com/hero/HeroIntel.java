package com.hero;

// inheritance dari abstract Hero
public class HeroIntel extends Hero{
	
	public HeroIntel(String name){
		super(name);
	}

	public void levelUp(){
		this.setLevel(2);
	}
}
