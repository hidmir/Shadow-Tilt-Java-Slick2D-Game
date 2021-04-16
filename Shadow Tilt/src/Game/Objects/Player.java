package Game.Objects;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Player 
{
	private Graphics g;
	private Image image;
	private boolean sPressed = false;
	private boolean wPressed = false;
	private boolean aPressed = false;
	private boolean dPressed = false;
	private boolean rPressed = false;
	private boolean escapePressed = false;
	private int initialX;
	private int initialY;
	private int x;
	private int y;
	private int previousX;
	private int previousY;
	private Shape topCollisionDetector;
	private Shape bottomCollisionDetector;
	private Shape leftCollisionDetector;
	private Shape rightCollisionDetector;
	private Shape centralCollisionDetector;
	public Player(Graphics g, Image image, int x, int y)
	{
		this.g = g;
		this.image = image;
		initialX = x;
		initialY = y;
		this.x = x;
		this.y = y;
	}
	public void draw(Shape[] wallsFrame)
	{
		g.setColor(Color.transparent);
		g.draw(topCollisionDetector = new Rectangle(x+1, y-25,24,24));
		g.draw(bottomCollisionDetector = new Rectangle(x+1, y+25,24,24));
		g.draw(leftCollisionDetector = new Rectangle(x+1-25, y,24,24));
		g.draw(rightCollisionDetector = new Rectangle(x+1+25, y,24,24));
		g.draw(centralCollisionDetector = new Rectangle(x+1, y,24,24));
		image.draw(x + 1, y + 1, 0.125f);
		g.setColor(Color.gray);
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	protected int getPreviousX()
	{
		return previousX;
	}
	protected int getPreviousY()
	{
		return previousY;
	}
	public Shape getCentralCollisionDetector()
	{
		return centralCollisionDetector;
	}
	private boolean collisonAtTheTop(Shape[] walls, Shape[] wallsToUnlock1, Shape[] wallsToUnlock2, Shape[] wallsToUnlock3, Shape[] wallsToUnlock4, Shape[] wallsToUnlock5)
	{
		boolean collision = false;
		for(Shape object: walls)
		{
			if(!collision)
				if(topCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock1)
		{
			if(!collision)
				if(topCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock2)
		{
			if(!collision)
				if(topCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock3)
		{
			if(!collision)
				if(topCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock4)
		{
			if(!collision)
				if(topCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock5)
		{
			if(!collision)
				if(topCollisionDetector.intersects(object))
					collision = true;
		}
		return collision;
	}
	private boolean collisonAtTheBottom(Shape[] walls, Shape[] wallsToUnlock1, Shape[] wallsToUnlock2, Shape[] wallsToUnlock3, Shape[] wallsToUnlock4, Shape[] wallsToUnlock5)
	{
		boolean collision = false;
		for(Shape object: walls)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock1)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock2)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock3)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(object))
					collision = true;
		}for(Shape object: wallsToUnlock4)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(object))
					collision = true;
		}for(Shape object: wallsToUnlock5)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(object))
					collision = true;
		}
		return collision;
	}
	private boolean collisonOnLeft(Shape[] walls, Shape[] wallsToUnlock1, Shape[] wallsToUnlock2, Shape[] wallsToUnlock3, Shape[] wallsToUnlock4, Shape[] wallsToUnlock5)
	{
		boolean collision = false;
		for(Shape object: walls)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock1)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock2)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock3)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock4)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock5)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(object))
					collision = true;
		}
		return collision;
	}
	private boolean collisonOnRight(Shape[] walls, Shape[] wallsToUnlock1, Shape[] wallsToUnlock2, Shape[] wallsToUnlock3, Shape[] wallsToUnlock4, Shape[] wallsToUnlock5)
	{
		boolean collision = false;
		for(Shape object: walls)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock1)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock2)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock3)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock4)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(object))
					collision = true;
		}
		for(Shape object: wallsToUnlock5)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(object))
					collision = true;
		}
		return collision;
	}
	public boolean completeLevel(Shape levelEnd)
	{
		boolean collision = false;
		if(centralCollisionDetector.intersects(levelEnd))
		{
			collision = true;
			resetCoordinates();
		}
		return collision;
	}
	public boolean death(Shape[] enemies)
	{
		boolean collision = false;
		for(Shape enemy: enemies)
		{
			if(!collision)
			{
				if(centralCollisionDetector.intersects(enemy))
					collision = true;
			}
		}	
		return collision;
	}
	public void resetCoordinates()
	{
		x = initialX;
		y = initialY;
	}
	public void move(Input input, Shape[] walls, Shape[] wallsToUnlock1, Shape[] wallsToUnlock2, Shape[] wallsToUnlock3, Shape[] wallsToUnlock4, Shape[] wallsToUnlock5)
	{
		if(input.isKeyPressed(Input.KEY_S))
			sPressed = true;
		else
			sPressed = false;
		if(input.isKeyPressed(Input.KEY_W))
			wPressed = true;
		else
			wPressed = false;
		if(input.isKeyPressed(Input.KEY_A))
			aPressed = true;
		else
			aPressed = false;
		if(input.isKeyPressed(Input.KEY_D))
			dPressed = true;
		else
			dPressed = false;
		if(sPressed && !collisonAtTheBottom(walls, wallsToUnlock1, wallsToUnlock2, wallsToUnlock3, wallsToUnlock4, wallsToUnlock5))
			moveDown();
		if(wPressed && !collisonAtTheTop(walls, wallsToUnlock1, wallsToUnlock2, wallsToUnlock3, wallsToUnlock4, wallsToUnlock5))
			moveUp();
		if(aPressed && !collisonOnLeft(walls, wallsToUnlock1, wallsToUnlock2, wallsToUnlock3, wallsToUnlock4, wallsToUnlock5))
			moveLeft();
		if(dPressed && !collisonOnRight(walls, wallsToUnlock1, wallsToUnlock2, wallsToUnlock3, wallsToUnlock4, wallsToUnlock5))
			moveRight();
	}
	public boolean quitGame(Input input)
	{
		if(input.isKeyPressed(Input.KEY_ESCAPE))
			escapePressed = true;
		else
			escapePressed = false;
		return escapePressed;
	}
	public boolean resetGame(Input input)
	{
		if(input.isKeyPressed(Input.KEY_R))
			rPressed = true;
		else
			rPressed = false;
		return rPressed;
	}
	private void moveDown()
	{
		saveCurrentCoordinates();
		y += 25;
	}
	private void moveUp()
	{
		saveCurrentCoordinates();
		y -= 25;
	}
	private void moveLeft()
	{
		saveCurrentCoordinates();
		x -= 25;
	}
	private void moveRight()
	{
		saveCurrentCoordinates();
		x += 25;
	}
	private void saveCurrentCoordinates()
	{
		previousX = x;
		previousY = y;
	}
	protected void moveBack()
	{
		x = previousX;
		y = previousY;
	}
	public void changeImage(Image image) throws SlickException
	{
		this.image = image;
	}
}
