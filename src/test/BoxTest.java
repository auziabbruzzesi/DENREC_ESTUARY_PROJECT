package test;
import model.*;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class BoxTest {
	Box b = new Box(null, 0);
	Player p = new Player();
	Oyster o1 = new Oyster();
	Oyster o2 = new Oyster();  
	Oyster o3 = new Oyster();
	Concrete c1 = new Concrete();
	Concrete c2 = new Concrete();
	Concrete c3 = new Concrete();
	//NOTE: pick-upable objects should have a constructor that takes a Point object as a param


	@Test
	public void boxTest(){
		assertTrue(b.getCount() == 0);
		assertTrue(b.isfull() == false);	

		p.pickUp (new Point(0,0)) ;//THIS IS A CHANGE -- pickup to take in a Point object
		p.putDown(new Point(5,5));// there isn't a box here
		
		assertTrue(b.getCount() == 0);
		assertTrue(b.isfull() == false);

		p.pickUp(o2.getPosition());
		p.putDown(b.getPosition());
		//adding an oyster to an empty box makes an oysterBox
		assertTrue(b.getBoxtype() == BoxType.OYSTER);

		//incriment the count if an acceptable object is putdown
		//within the bounds of the box
		assertTrue(b.getCount() == 1);

		p.pickUp(c1.getPosition());

		//shouldn't be able to put a piece of concrete in an oyster-bin!
		assertTrue(p.putDown(b.getPosition()) == false);

		for(int i = 0; i < b.getCapacity(); i++){
			b.add(new Oyster());
		}
		assertTrue(b.isFull == true);
		assertTrue(b.getCount == b.getCapacity);




	}

}


