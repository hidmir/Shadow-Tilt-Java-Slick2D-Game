package Game.Enemies;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Enemy4 
{
	private Graphics g;
	private Image image;
	private int initialX;
	private int initialY;
	private int x;
	private int y;
	private int playerCoordinatesOnX;
	private int playerCoordinatesOnY;
	private int time = 0;
	private final int NUMBER_OF_MILLISECONDS_TO_MOVE = 500;
	private boolean moveToPlayerCoordinates = false;
	public Shape topCollisionDetector = null;
	public Shape bottomCollisionDetector = null;
	public Shape leftCollisionDetector = null;
	public Shape rightCollisionDetector = null;
	public Shape centralCollisionDetector = null;
	private Shape topRight1CollisionDetector = null;
	private Shape topRight2CollisionDetector = null;
	private Shape topRight3CollisionDetector = null;
	private Shape topLeft1CollisionDetector = null;
	private Shape topLeft2CollisionDetector = null;
	private Shape topLeft3CollisionDetector = null;
	private Shape top1RightCollisionDetector = null;
	private Shape top2RightCollisionDetector = null;
	private Shape top3RightCollisionDetector = null;
	private Shape rightBottom1CollisionDetector = null;
	private Shape rightBottom2CollisionDetector = null;
	private Shape rightBottom3CollisionDetector = null;
	private Shape leftTop1CollisionDetector = null;
	private Shape leftTop2CollisionDetector = null;
	private Shape leftTop3CollisionDetector = null;
	private Shape leftBottom1CollisionDetector = null;
	private Shape leftBottom2CollisionDetector = null;
	private Shape leftBottom3CollisionDetector = null;
	private Shape bottomRight1CollisionDetector = null;
	private Shape bottomRight2CollisionDetector = null;
	private Shape bottomRight3CollisionDetector = null;
	private Shape bottomLeft1CollisionDetector = null;
	private Shape bottomLeft2CollisionDetector = null;
	private Shape bottomLeft3CollisionDetector = null;
	private Shape wallCollisionDetector = null;
	public Shape additionalCollisionDetector = null;
	public Enemy4(Graphics g, Image image, int coordinatesOnX, int coordinatesOnY)
	{
		this.g = g;
		this.image = image;
		initialX = coordinatesOnX;
		initialY = coordinatesOnY;
		this.x = coordinatesOnX;
		this.y = coordinatesOnY;
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
		g.draw(topRight1CollisionDetector = new Rectangle(x+1+25,y-50,24,24));
		g.draw(topRight2CollisionDetector = new Rectangle(x+1+25,y-75,24,24));
		g.draw(topRight3CollisionDetector = new Rectangle(x+1+25,y-100,24,24));
		g.draw(topLeft1CollisionDetector = new Rectangle(x+1-25,y-50,24,24));
		g.draw(topLeft2CollisionDetector = new Rectangle(x+1-25,y-75,24,24));
		g.draw(topLeft3CollisionDetector = new Rectangle(x+1-25,y-100,24,24));
		g.draw(top1RightCollisionDetector = new Rectangle(x+1+50,y-25,24,24));
		g.draw(top2RightCollisionDetector = new Rectangle(x+1+75,y-25,24,24));
		g.draw(top3RightCollisionDetector = new Rectangle(x+1+100,y-25,24,24));
		g.draw(rightBottom1CollisionDetector = new Rectangle(x+1+50,y+25,24,24));
		g.draw(rightBottom2CollisionDetector = new Rectangle(x+1+75,y+25,24,24));
		g.draw(rightBottom3CollisionDetector = new Rectangle(x+1+100,y+25,24,24));
		g.draw(leftTop1CollisionDetector = new Rectangle(x+1-50,y-25,24,24));
		g.draw(leftTop2CollisionDetector = new Rectangle(x+1-75,y-25,24,24));
		g.draw(leftTop3CollisionDetector = new Rectangle(x+1-100,y-25,24,24));
		g.draw(leftBottom1CollisionDetector = new Rectangle(x+1-50,y+25,24,24));
		g.draw(leftBottom2CollisionDetector = new Rectangle(x+1-75,y+25,24,24));
		g.draw(leftBottom3CollisionDetector = new Rectangle(x+1-100,y+25,24,24));
		g.draw(bottomRight1CollisionDetector = new Rectangle(x+1+25,y+50,24,24));
		g.draw(bottomRight2CollisionDetector = new Rectangle(x+1+25,y+75,24,24));
		g.draw(bottomRight3CollisionDetector = new Rectangle(x+1+25,y+100,24,24));
		g.draw(bottomLeft1CollisionDetector = new Rectangle(x+1-25,y+50,24,24));
		g.draw(bottomLeft2CollisionDetector = new Rectangle(x+1-25,y+75,24,24));
		g.draw(bottomLeft3CollisionDetector = new Rectangle(x+1-25,y+100,24,24));
		g.setColor(Color.transparent);
		g.draw(wallCollisionDetector = new Rectangle(x+1,y,24,24));
		g.draw(additionalCollisionDetector = new Rectangle(x+1,y,24,24));
	}
	public boolean detectPlayerOnY(Shape player)
	{
		boolean tmp = false;
		if(!tmp && (topRight1CollisionDetector.intersects(player) || topRight2CollisionDetector.intersects(player) || topRight3CollisionDetector.intersects(player)))
			tmp = true;
		if(!tmp && (topLeft1CollisionDetector.intersects(player) || topLeft2CollisionDetector.intersects(player) || topLeft3CollisionDetector.intersects(player)))
			tmp = true;
		if(!tmp && (bottomRight1CollisionDetector.intersects(player) || bottomRight2CollisionDetector.intersects(player) || bottomRight3CollisionDetector.intersects(player)))
			tmp = true;
		if(!tmp && (bottomLeft1CollisionDetector.intersects(player) || bottomLeft2CollisionDetector.intersects(player) || bottomLeft3CollisionDetector.intersects(player)))
			tmp = true;
		return tmp;
	}
	public boolean detectPlayerOnX(Shape player)
	{
		boolean tmp = false;
		if(!tmp && (top1RightCollisionDetector.intersects(player) || top2RightCollisionDetector.intersects(player) || top3RightCollisionDetector.intersects(player)))
			tmp = true;
		if(!tmp && (rightBottom1CollisionDetector.intersects(player) || rightBottom2CollisionDetector.intersects(player) || rightBottom3CollisionDetector.intersects(player)))
			tmp = true;
		if(!tmp && (leftTop1CollisionDetector.intersects(player) || leftTop2CollisionDetector.intersects(player) || leftTop3CollisionDetector.intersects(player)))
			tmp = true;
		if(!tmp && (leftBottom1CollisionDetector.intersects(player) || leftBottom2CollisionDetector.intersects(player) || leftBottom3CollisionDetector.intersects(player)))
			tmp = true;
		return tmp;
	}
	public void moveWallCollisionDetectorToPlayerCoordinatesOnY(int playerCoordinatesOnY)
	{
		g.draw(wallCollisionDetector = new Rectangle(x+1,playerCoordinatesOnY,24,24));
	}
	public void moveWallCollisionDetectorToPlayerCoordinatesOnX(int playerCoordinatesOnX)
	{
		g.draw(wallCollisionDetector = new Rectangle(playerCoordinatesOnX+1,y,24,24));
	}
	public void moveAdditionalCollisionDetectorToPlayerCoordinatesOnY(int playerCoordinatesOnY)
	{
		g.draw(additionalCollisionDetector = new Rectangle(x+1,playerCoordinatesOnY,24,24));
	}
	public void moveAdditionalCollisionDetectorToPlayerCoordinatesOnX(int playerCoordinatesOnX)
	{
		g.draw(additionalCollisionDetector = new Rectangle(playerCoordinatesOnX+1,y,24,24));
	}
	public Shape getWallCollisionDetector()
	{
		return wallCollisionDetector;
	}
	public void moveToPlayerCoordinatesOnY(int playerCoordinatesOnX, int playerCoordinatesOnY)
	{
		this.playerCoordinatesOnX = playerCoordinatesOnX;
		this.playerCoordinatesOnY = playerCoordinatesOnY;
		y = playerCoordinatesOnY;
		moveToPlayerCoordinates = true;
		time = 0;
	}
	public void moveToPlayerCoordinatesOnX(int playerCoordinatesOnX, int playerCoordinatesOnY)
	{
		this.playerCoordinatesOnX = playerCoordinatesOnX;
		this.playerCoordinatesOnY = playerCoordinatesOnY;
		x = playerCoordinatesOnX;
		moveToPlayerCoordinates = true;
		time = 0;
	}
	public void moveToPlayerCoordinatesOnXAndY(int delta)
	{
		if(moveToPlayerCoordinates && !wait(delta))
		{
			y = playerCoordinatesOnY;
			x = playerCoordinatesOnX;
			moveToPlayerCoordinates = false;
		}
	}
	public boolean getMoveToPlayerCoordinatesValue()
	{
		return moveToPlayerCoordinates;
	}
	public void moveWallCollisionDetectorToPlayerCoordinatesOnXAndY()
	{
		g.draw(wallCollisionDetector = new Rectangle(playerCoordinatesOnX+1,playerCoordinatesOnY,24,24));
	}
	public void moveAdditionalCollisionDetectorToPlayerCoordinatesOnXAndY()
	{
		g.draw(additionalCollisionDetector = new Rectangle(playerCoordinatesOnX+1,playerCoordinatesOnY,24,24));
	}
	public void resetPosition()
	{
		moveToPlayerCoordinates = false;
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
