
package com.tarod.colors;

import javax.swing.*;
import java.awt.*;

public class DrawingColor{

	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;

	/**
	 * @param c Color to be painted.
	 * @param s Window's title.
	 */
	public DrawingColor(Color c, String s){
		JFrame frame = new JFrame(s);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MyComponent(c));
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true); 
	}

	public class MyComponent extends JComponent{

		Color c_;

		public MyComponent(Color c)
		{
			super();
			c_ = c;			
		}

		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(c_);
			g.fillRect(0, 0, DrawingColor.WIDTH, DrawingColor.HEIGHT); 
		}

	}
}
