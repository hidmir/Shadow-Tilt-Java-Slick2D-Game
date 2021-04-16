package Game.Objects;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import Game.Enemies.Enemy1;
import Game.Enemies.Enemy2;
import Game.Enemies.Enemy3;
import Game.Enemies.Enemy4;
import Game.Enemies.Enemy5;

public class MovableObject 
{
	private Graphics g;
	private Image image;
	private int initialX;
	private int initialY;
	private int x;
	private int y;
	private Shape topCollisionDetector = null;
	private Shape bottomCollisionDetector = null;
	private Shape leftCollisionDetector = null;
	private Shape rightCollisionDetector = null;
	public Shape centralCollisionDetector = null;
	public MovableObject(Graphics g, Image image, int x, int y)
	{
		this.g = g;
		this.image = image;
		initialX = x;
		initialY = y;
		this.x = x;
		this.y = y;
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
	public void move(Shape[] walls, MovableObject[] movableObjects, Shape levelEnd, Enemy1[] enemies1, Enemy2[] enemies2, Enemy3[] enemies3, Enemy4[] enemies4, Enemy5[] enemies5, Player player, UnlockableWall[] wallsToUnlock1, UnlockableWall[] wallsToUnlock2, UnlockableWall[] wallsToUnlock3, UnlockableWall[] wallsToUnlock4, UnlockableWall[] wallsToUnlock5)
	{
		if(collisionInTheCenter(player.getCentralCollisionDetector()) && !collisonAtTheTop(walls, movableObjects, levelEnd, enemies1, enemies2, enemies3, enemies4, enemies5, wallsToUnlock1, wallsToUnlock2, wallsToUnlock3, wallsToUnlock4, wallsToUnlock5) && player.getY()<player.getPreviousY())
			y -= 25;
		else if(collisionInTheCenter(player.getCentralCollisionDetector()) && !collisonAtTheBottom(walls, movableObjects, levelEnd, enemies1, enemies2, enemies3, enemies4, enemies5, wallsToUnlock1, wallsToUnlock2, wallsToUnlock3, wallsToUnlock4, wallsToUnlock5) && player.getY()>player.getPreviousY())
			y += 25;
		else if(collisionInTheCenter(player.getCentralCollisionDetector()) && !collisonOnLeft(walls, movableObjects, levelEnd, enemies1, enemies2, enemies3, enemies4, enemies5, wallsToUnlock1, wallsToUnlock2, wallsToUnlock3, wallsToUnlock4, wallsToUnlock5) && player.getX()<player.getPreviousX())
			x -= 25;
		else if(collisionInTheCenter(player.getCentralCollisionDetector()) && !collisonOnRight(walls, movableObjects, levelEnd, enemies1, enemies2, enemies3, enemies4, enemies5, wallsToUnlock1, wallsToUnlock2, wallsToUnlock3, wallsToUnlock4, wallsToUnlock5) && player.getX()>player.getPreviousX())
			x += 25;
		else if(collisionInTheCenter(player.getCentralCollisionDetector()))
			player.moveBack();
	}
	private boolean collisonAtTheTop(Shape[] walls, MovableObject[] movableObjects, Shape levelEnd, Enemy1[] enemies1, Enemy2[] enemies2, Enemy3[] enemies3, Enemy4[] enemies4, Enemy5[] enemies5, UnlockableWall[] wallsToUnlock1, UnlockableWall[] wallsToUnlock2, UnlockableWall[] wallsToUnlock3, UnlockableWall[] wallsToUnlock4, UnlockableWall[] wallsToUnlock5)
	{
		boolean collision = false;
		for(Shape wall: walls)
		{
			if(!collision)
				if(topCollisionDetector.intersects(wall))
					collision = true;
		}
		for(MovableObject movableObject: movableObjects)
		{
			if(!collision)
				if(topCollisionDetector.intersects(movableObject.centralCollisionDetector))
					collision = true;
		}
		for(Enemy1 enemy: enemies1)
		{
			if(!collision)
				if(topCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy2 enemy: enemies2)
		{
			if(!collision)
				if(topCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy3 enemy: enemies3)
		{
			if(!collision)
				if(topCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy4 enemy: enemies4)
		{
			if(!collision)
				if(topCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy5 enemy: enemies5)
		{
			if(!collision)
				if(topCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock1)
		{
			if(!collision)
				if(topCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock2)
		{
			if(!collision)
				if(topCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock3)
		{
			if(!collision)
				if(topCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock4)
		{
			if(!collision)
				if(topCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock5)
		{
			if(!collision)
				if(topCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		if(!collision)
			if(topCollisionDetector.intersects(levelEnd))
				collision = true;
		return collision;
	}
	private boolean collisonAtTheBottom(Shape[] walls, MovableObject[] movableObjects, Shape levelEnd, Enemy1[] enemies1, Enemy2[] enemies2, Enemy3[] enemies3, Enemy4[] enemies4, Enemy5[] enemies5, UnlockableWall[] wallsToUnlock1, UnlockableWall[] wallsToUnlock2, UnlockableWall[] wallsToUnlock3, UnlockableWall[] wallsToUnlock4, UnlockableWall[] wallsToUnlock5)
	{
		boolean collision = false;
		for(Shape wall: walls)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(wall))
					collision = true;
		}
		for(MovableObject movableObject: movableObjects)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(movableObject.centralCollisionDetector))
					collision = true;
		}
		for(Enemy1 enemy: enemies1)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy2 enemy: enemies2)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy3 enemy: enemies3)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy4 enemy: enemies4)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy5 enemy: enemies5)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock1)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock2)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock3)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock4)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock5)
		{
			if(!collision)
				if(bottomCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		if(!collision)
			if(bottomCollisionDetector.intersects(levelEnd))
				collision = true;
		return collision;
	}
	private boolean collisonOnLeft(Shape[] walls, MovableObject[] movableObjects, Shape levelEnd, Enemy1[] enemies1, Enemy2[] enemies2, Enemy3[] enemies3, Enemy4[] enemies4, Enemy5[] enemies5, UnlockableWall[] wallsToUnlock1, UnlockableWall[] wallsToUnlock2, UnlockableWall[] wallsToUnlock3, UnlockableWall[] wallsToUnlock4, UnlockableWall[] wallsToUnlock5)
	{
		boolean collision = false;
		for(Shape wall: walls)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(wall))
					collision = true;
		}
		for(MovableObject movableObject: movableObjects)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(movableObject.centralCollisionDetector))
					collision = true;
		}
		for(Enemy1 enemy: enemies1)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy2 enemy: enemies2)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy3 enemy: enemies3)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy4 enemy: enemies4)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy5 enemy: enemies5)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock1)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock2)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock3)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock4)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock5)
		{
			if(!collision)
				if(leftCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		if(!collision)
			if(leftCollisionDetector.intersects(levelEnd))
				collision = true;
		return collision;
	}
	private boolean collisonOnRight(Shape[] walls, MovableObject[] movableObjects, Shape levelEnd, Enemy1[] enemies1, Enemy2[] enemies2, Enemy3[] enemies3, Enemy4[] enemies4, Enemy5[] enemies5, UnlockableWall[] wallsToUnlock1, UnlockableWall[] wallsToUnlock2, UnlockableWall[] wallsToUnlock3, UnlockableWall[] wallsToUnlock4, UnlockableWall[] wallsToUnlock5)
	{
		boolean collision = false;
		for(Shape wall: walls)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(wall))
					collision = true;
		}
		for(MovableObject movableObject: movableObjects)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(movableObject.centralCollisionDetector))
					collision = true;
		}
		for(Enemy1 enemy: enemies1)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy2 enemy: enemies2)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy3 enemy: enemies3)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy4 enemy: enemies4)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(Enemy5 enemy: enemies5)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(enemy.centralCollisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock1)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock2)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock3)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock4)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		for(UnlockableWall wallToUnlock: wallsToUnlock5)
		{
			if(!collision)
				if(rightCollisionDetector.intersects(wallToUnlock.collisionDetector))
					collision = true;
		}
		if(!collision)
			if(rightCollisionDetector.intersects(levelEnd))
				collision = true;
		return collision;
	}
	private boolean collisionInTheCenter(Shape player)
	{
		boolean collision = false;
		if(!collision)
			if(centralCollisionDetector.intersects(player))
				collision = true;
		return collision;
	}
	public void resetPosition()
	{
		x = initialX;
		y = initialY;
	}
}
