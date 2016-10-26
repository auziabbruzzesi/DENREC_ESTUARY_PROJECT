package controller;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Timer;

import model.*;
import view.*;

public class Controller {
	
	static Model m = new Model();
	static View v = new View();
	public static void main(String[] args){
		
		v.setPlayerPosition(m.getP().getPosition());
		v.addPersonListener(m.getP());
		System.out.println(m.getP().getPosition().getX() +" " + m.getP().getPosition().getY());
		v.jpanel.paintComponent(v.getGraphics());
		Timer timer = new Timer(10, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Called");
				v.setPlayerPosition(m.getP().getPosition());
				v.repaint();
			}
		});
		
		timer.start();
		

			
		
		
		//v.add(v.jpanel);
		//v.repaint();
		
		
		
		
		
	
		
		
		
		
		
		
	}

}