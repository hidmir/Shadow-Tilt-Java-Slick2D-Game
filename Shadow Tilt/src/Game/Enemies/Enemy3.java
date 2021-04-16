package Game.Enemies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Enemy3 
{
	private Graphics g;
	private Image image;
	private int initialX;
	private int initialY;
	private int x;
	private int y;
	private int time = 0;
	private final int NUMBER_OF_MILLISECONDS_TO_MOVE = 300;
	public Shape topCollisionDetector = null;
	public Shape bottomCollisionDetector = null;
	public Shape leftCollisionDetector = null;
	public Shape rightCollisionDetector = null;
	public Shape centralCollisionDetector = null;
	Random rand = null;
	public Enemy3(Graphics g, Image image, int x, int y)
	{
		this.g = g;
		this.image = image;
		initialX = x;
		initialY = y;
		this.x = x;
		this.y = y;
		rand = new Random();
	}
	public void draw()
	{
		image.draw(x + 1, y + 1, 0.125f);
		g.setColor(Color.transparent);
		g.draw(topCollisionDetector = new Rectangle(x+1,y-25,24,24));
		g.draw(bottomCollisionDetector = new Rectangle(x+1,y+25,24,24));
		g.draw(leftCollisionDetector = new Rectangle(x+1-25,y,24,24));
		g.draw(rightCollisionDetector = new Rectangle(x+1+25,y,24,24));
		g.draw(centralCollisionDetector = new Rectangle(x+1,y,24,24));
	}
	public void move(int delta, boolean up, boolean down, boolean right, boolean left)
	{
		List <String> directions = new ArrayList<String>();
		if(up)
			directions.add("up");
		if(down)
			directions.add("down");
		if(right)
			directions.add("right");
		if(left)
			directions.add("left");
		System.out.println(directions.size());
		if(directions.size() > 0 && !wait(delta))
		{
			int directionNumber = rand.nextInt(directions.size());
			String direction = directions.get(directionNumber);
			if(direction == "up")
				moveUp();
			else if(direction == "down")
				moveDown();
			else if(direction == "right")
				moveRight();
			else if(direction == "left")
				moveLeft();
		}
	}
	private void moveUp()
	{
		y -= 25;
	}
	private void moveDown()
	{
		y += 25;
	}
	private void moveLeft()
	{
		x -= 25;
	}
	private void moveRight()
	{
		x += 25;
	}
	public void resetPosition()
	{
		x = initialX;
		y = initialY;
	}
	private boolean wait(int delta)
	{
		time += delta;
		if(time<NUMBER_OF_MILLISECONDS_TO_MOVE)
			return true;
		else
		{
			time = 0;
			return false;
		}
	}
}
