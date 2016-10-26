package com.bborkovic;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;



public class glavniProgram {

	public static void main(String[] args) {

		StdDraw.setCanvasSize(900,900);
      StdDraw.setXscale(-1.0, +1.0);
      StdDraw.setYscale(-1.0, +1.0);
      
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.filledCircle(0, 0, 0.6);
      
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.filledCircle(0, 0, 0.59);
      
      
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.setPenRadius(0.01);
      StdDraw.line(0, 0, 0.5, 0.5);
//      StdDraw.setPen

      

//      StdDraw.filledCircle(rx, ry, radius);
      
      StdDraw.show();
		
	}

}
