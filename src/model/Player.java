package model;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Player implements MouseListener {
	private Point position = new Point(25,25);
	private int currImageIndex;
	private BoxType holding;
	private float velocity;
	private float health;
	
	//Direction somewhere here
	
	
	public Point getPosition(){
		return this.position;
	}
	
	public void move(){
		//TODO
	}
	
	public boolean pickUp(Point point){
		//TODO
		return true;
		
	}
	public boolean putDown(Point point){
		//TODO
		
		return true;
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
	
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("here");
		System.out.println(e.getPoint());
		position = e.getPoint();
		
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
