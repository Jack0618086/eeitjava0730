package tw.jack.apis;

import java.io.Serializable;

public class Bike extends Object implements Serializable{
	
	protected double speed; // 要加 public 才可以在Java12選取
	
	public Bike() {
		System.out.println("Bike()");
	}
	
	// 兩個方法 upspeed | downspeed
	public void upSpeed() {
		speed = speed < 1? 1:speed * 1.4;
	}
	
	public void downSpeed() {
		speed = speed < 1? 0:speed * 0.7;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	@Override
	public String toString() {
		return "I am a String";
	}
}