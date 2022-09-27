package com.burak.generics;

public class Numerical extends Candidate{

	public Numerical(int math, int physics, int chemistery, int geometry) {
		super(math, physics, chemistery, geometry);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculate_score() {
		// TODO Auto-generated method stub
		return getMath() * 10 + getGeometry() * 8 + getPhysics() * 4 + getChemistery() * 4;
	}
	
	

}
