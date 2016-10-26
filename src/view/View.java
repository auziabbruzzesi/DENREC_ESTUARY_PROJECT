package view;

import javax.swing.JFrame;
import javax.swing.event.EventListenerList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.*;
import model.*;
import controller.*;

public class View extends JFrame {
	
	Point playerPosition;
	EventListenerList ell = new EventListenerList();
	public drawPanel jpanel = new drawPanel();
	
	
	public void setPlayerPosition(Point p){
		this.playerPosition = p;
	}
	public void addPersonListener(Player p){
		jpanel.addMouseListener(p);
		
		
	}
	
	public View(){
		
		setVisible(true);
		setSize(500,500);
		add(jpanel);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
public class drawPanel extends JPanel{
	@Override
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(playerPosition.x,playerPosition.y, 10, 10);
		//g.fillOval(50, 50, 50, 50);
		
		
	}
	public Dimension getPreferredSize() {
		return new Dimension(300, 300);
	}
}

}
