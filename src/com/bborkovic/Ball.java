package com.bborkovic;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

public class Ball {

	// instance variables
	private double rx, ry; // position
	private double vx, vy; // velocity
	private final double radius; // radius

	private double gravityx = 0;// -0.001;
	private double gravityy = 0;
	private double bounce_coef = 0.8;

	// constructor
	public Ball() {
		// initialy set to middle
		rx = 0.9;
		ry = 0.0;
		// pick random speed
		vx = StdRandom.uniform(0.02, 0.04);
		vy = StdRandom.uniform(-0.01,0.01 );
		// vx = 0.01/2;
		// vy = 0.03;
		// pick random radius
		// radius = StdRandom.uniform(0.025, 0.075);
		radius = 0.03;
	}

	// bounce of vertical wall by reflecting x-velocity
	private void bounceOffVerticalWall() {
		vx = -vx * bounce_coef;
	}

	// bounce of horizontal wall by reflecting y-velocity
	private void bounceOffHorizontalWall() {
		vy = -vy * bounce_coef;
	}

	// move the ball one step
	public void move() {
		if (Math.abs(rx + vx) + radius > 1.0)
			bounceOffVerticalWall();
		if (Math.abs(ry + vy) + radius > 1.0)
			bounceOffHorizontalWall();
		vy = vy + gravityy;
		vx = vx + gravityx;
		// vy = vy - gravity * dt;
		rx = rx + vx;
		ry = ry + vy;

		if ((ry - radius) < -1)
			ry = -1 + radius;
		if ((rx - radius) < -1)
			rx = -1 + radius;
	}

	// draw the ball
	public void draw() {
		StdDraw.filledCircle(rx, ry, radius);
		// StdDraw.circle(rx, ry, radius);
		// StdDraw.
	}

	// test client
	// public static void main(String[] args) {
	//
	// // create and initialize two balls
	// Ball b1 = new Ball();
	// Ball b2 = new Ball();
	//
	// // animate them
	// StdDraw.setXscale(-1.0, +1.0);
	// StdDraw.setYscale(-1.0, +1.0);
	// StdDraw.enableDoubleBuffering();
	//
	// while (true) {
	// StdDraw.clear(StdDraw.GRAY);
	// StdDraw.setPenColor(StdDraw.BLACK);
	// b1.move();
	// b2.move();
	// b1.draw();
	// b2.draw();
	// StdDraw.show();
	// StdDraw.pause(20);
	// }
	// }
}
