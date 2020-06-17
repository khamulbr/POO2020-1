package ex11.view;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
	
	@Override
	public void mouseMoved(MouseEvent event) {
		Point p = event.getPoint();
	    int x   = event.getX();
	    int y   = event.getY();
	    System.out.println("Mouse is at " + p);
	    System.out.println("x is " + x);
	    System.out.println("y is " + y);
	}

}
