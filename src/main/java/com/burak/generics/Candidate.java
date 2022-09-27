package com.burak.generics;

public abstract class Candidate {
	private int math;
	private int physics;
	private int chemistery;
	private int geometry;
	
	public Candidate(int math, int physics, int chemistery, int geometry) {
		super();
		this.math = math;
		this.physics = physics;
		this.chemistery = chemistery;
		this.geometry = geometry;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
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
	
	abstract int calculate_score();
	
}
