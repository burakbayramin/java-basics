package com.burak.generics.miniproject;

public abstract class Candidate {
	private int mathematic;
	private int physics;
	private int chemistery;
	private int geometry;
	private String name;
	
	public Candidate(int math, int physics, int chemistery, int geometry, String name) {
		super();
		this.mathematic = mathematic;
		this.physics = physics;
		this.chemistery = chemistery;
		this.geometry = geometry;
		this.name = name;
	}

	public int getMathematic() {
		return mathematic;
	}

	public void setMathematic(int math) {
		this.mathematic = math;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistery() {
		return chemistery;
	}

	public void setChemistery(int chemistery) {
		this.chemistery = chemistery;
	}

	public int getGeometry() {
		return geometry;
	}

	public void setGeometry(int geometry) {
		this.geometry = geometry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract int calculate_score();
}
