package model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;

public class Model {
	Player p = new Player();
	
	


	private Collection<Box> boxes = new ArrayList<Box>();
	private Collection<Oyster> oysters = new ArrayList<Oyster>();
	private Collection<Concrete> concretes = new ArrayList<Concrete>();
	private Collection<Wave> waves = new ArrayList<Wave>();
	
	
	
	
	public Player getP() {
		return p;
	}
	public void setP(Player p) {
		this.p = p;
	}
	public Collection<Box> getBoxes() {
		return boxes;
	}
	public void setBoxes(Collection<Box> boxes) {
		this.boxes = boxes;
	}
	public Collection<Oyster> getOysters() {
		return oysters;
	}
	public void setOysters(Collection<Oyster> oysters) {
		this.oysters = oysters;
	}
	public Collection<Concrete> getConcretes() {
		return concretes;
	}
	public void setConcretes(Collection<Concrete> concretes) {
		this.concretes = concretes;
	}
	public Collection<Wave> getWaves() {
		return waves;
	}
	public void setWaves(Collection<Wave> waves) {
		this.waves = waves;
	}

	/**
	 * 
	 * @param p -- a parameter for constructing the wave
	 * @return a point for testing purposes
	 */
	public Point addWave(Point p){
		//TODO : construct a wave at point p and add it to the collection of waves
		return p;
		
	}
	/**
	 * 
	 * @param p
	 * @return //
	 */
	public Point addOyster(Point p){
		//TODO: construct an oyster and add it to the collection of waves
		return p;
	}
	
	//same idea as the other 2
	public Point addConcrete(Point p){
		//TODO: construct a piece of concrete and add it to the collection of concrete
		
		return p;
		
	}
	
	public Point addBox(Point p){
		//TODO:
		return p;
	}
	
	

}
