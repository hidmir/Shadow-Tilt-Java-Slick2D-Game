package Game.Enemies;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Enemy1 
{
	private Graphics g;
	private Image image;
	private int initialX;
	private int initialY;
	private int x;
	private int y;
	private int time = 0;
	private final int NUMBER_OF_MILLISECONDS_TO_MOVE = 70;
	private boolean initialDirection;
	public boolean rightDirection;
	public Shape leftCollisionDetector = null;
	public Shape rightCollisionDetector = null;
	public Shape centralCollisionDetector = null;
	public Enemy1(Graphics g, Image image, int x, int y, boolean rightDirection)
	{
		this.g = g;
		this.image = image;
		initialX = x;
		initialY = y;
		this.x = x;
		this.y = y;
		initialDirection = rightDirection;
		this.rightDirection = rightDirection;
	}
	public void draw()
	{
		image.draw(x + 1, y + 1, 0.125f);
		g.setColor(Color.transparent);
		g.draw(leftCollisionDetector = new Rectangle(x+1-25,y,24,24));
		g.draw(rightCollisionDetector = new Rectangle(x+1+25,y,24,24));
		g.draw(centralCollisionDetector = new Rectangle(x+1,y,24,24));
	}
	public void move(int delta) 
	{
		if(rightDirection && !wait(delta))
			x += 25;
		if(!rightDirection && !wait(delta))
			x -= 25;
	}
	public void resetPosition()
	{
		x = initialX;
		y = initialY;
		rightDirection = initialDirection;
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
