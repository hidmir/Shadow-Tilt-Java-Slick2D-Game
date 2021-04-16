package Game.Enemies;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Enemy2 
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
	public boolean upDirection;
	public Shape topCollisionDetector = null;
	public Shape bottomCollisionDetector = null;
	public Shape centralCollisionDetector = null;
	public Enemy2(Graphics g, Image image, int x, int y, boolean TopDirection)
	{
		this.g = g;
		this.image = image;
		initialX = x;
		initialY = y;
		this.x = x;
		this.y = y;
		initialDirection = TopDirection;
		this.upDirection = TopDirection;
	}
	public void draw()
	{
		image.draw(x + 1, y + 1, 0.125f);
		g.setColor(Color.transparent);
		g.draw(topCollisionDetector = new Rectangle(x+1,y-25,24,24));
		g.draw(bottomCollisionDetector = new Rectangle(x+1,y+25,24,24));
		g.draw(centralCollisionDetector = new Rectangle(x+1,y,24,24));
	}
	public void move(int delta) 
	{
		if(upDirection && !wait(delta))
			y -= 25;
		if(!upDirection && !wait(delta))
			y += 25;
	}
	public void resetPosition()
	{
		x = initialX;
		y = initialY;
		upDirection = initialDirection;
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
