package com.burak.generics;

public class Physical extends Candidate{

	public Physical(int math, int physics, int chemistery, int geometry) {
		super(math, physics, chemistery, geometry);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculate_score() {
		// TODO Auto-generated method stub
		return getMath() * 4 + getGeometry() * 4 + getPhysics() * 10 + getChemistery() * 8;
	}

}
