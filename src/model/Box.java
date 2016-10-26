package model;

import java.awt.Point;

public class Box {
	private Point position;
	private int count = 0;
	private int capacity = 10;
	private boolean isfull = false;
	private BoxType boxtype;
	
	
	public Box(Point position,int capacity){
		this.position = position;
		this.capacity = capacity;
	}
	
	//Getters and Setters
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isfull() {
		return isfull;
	}
	public void setIsfull(boolean isfull) {
		this.isfull = isfull;
	}
	public BoxType getBoxtype() {
		return boxtype;
	}
	public void setBoxtype(BoxType boxtype) {
		this.boxtype = boxtype;
	}
	
	
	
	
	
	
	
	

}
