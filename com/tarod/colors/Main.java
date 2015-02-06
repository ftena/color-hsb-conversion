
package com.tarod.colors;

import java.lang.Object;
import java.awt.Color;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			Float h = Float.parseFloat(args[0]);
			Float s = Float.parseFloat(args[1]);
			Float b = Float.parseFloat(args[2]);
			
			System.out.println("Input - hue: " + h + "; saturation: " + s + "; brightness: " + b);

			Color c = Color.getHSBColor( h, s, b );	

			System.out.println("Red: " + c.getRed() + " Green: " + c.getGreen() + " Blue: " + c.getBlue());

			DrawingColor d = new DrawingColor(c, "Color using HSB");

			int result = Color.HSBtoRGB(h,s,b);

			DrawingColor d2 = new DrawingColor(new Color(result), "Color using RGB");

			float[] red = Color.RGBtoHSB(255, 0, 0, null);
			float[] green = Color.RGBtoHSB(0, 255, 0, null);
			float[] blue = Color.RGBtoHSB(0, 0, 255, null);
			float[] yellow = Color.RGBtoHSB(255, 255, 0, null);

			System.out.println("RGBtoHSB (red): " + red[0] + " " + red[1] + " " + red[2]);
			System.out.println("RGBtoHSB (green): " + green[0] + " " + green[1] + " " + green[2]);
			System.out.println("RGBtoHSB (blue): " + blue[0] + " " + blue[1] + " " + blue[2]);
			System.out.println("RGBtoHSB (yellow): " + yellow[0] + " " + yellow[1] + " " + yellow[2]);

		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: java Main <H> <S> <B>");
			System.out.println("<H> hue, <S> saturation, <B> brightness");
			System.exit(1);
		}
	}
}
