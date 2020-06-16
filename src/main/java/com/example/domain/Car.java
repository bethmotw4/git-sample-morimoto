package com.example.domain;

public class Car {
	private int speed;
	private String color;
	private Integer number;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + ", number=" + number + "]";
	}
	
	
}
