import java.awt.Color;

import java.awt.Graphics;

import java.awt.Graphics2D;

import java.awt.geom.Ellipse2D;

import java.awt.geom.Ellipse2D.Double;







public class BouncingCircle extends BouncingFigure {


	private int framingHeight;

	private int framingWidth;


	public BouncingCircle(int xLeft, int yTop, int width, int height, double trajectory, int speed){

		setXLeft(xLeft);

		setYTop(yTop);

		setTrajectory(trajectory);

		setSpeed(speed);

		this.framingHeight = height;

		this.framingWidth = width;

	}


	public void draw(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		Ellipse2D.Double circle = new Ellipse2D.Double(getXLeft(),getYTop(), this.framingHeight, this.framingWidth);

		g2.setColor(Color.BLUE);

		g2.fill(circle);

		g2.draw(circle);


	}

	public boolean rightBorderCollision(int screenLimit){

		if(getXLeft()+this.framingWidth > screenLimit)

			return true;

		return false;

	}


	public boolean leftBorderCollision(){

		if(getXLeft() < 0)

			return true;

		return false;

	}



	public boolean upperBorderCollision(){

		if(getYTop() < 0)

			return true;

		return false;

	}



	public boolean lowerBorderCollision(int screenLimit){

		if(getYTop()+this.framingHeight > screenLimit)

			return true;

		return false;

	}





}