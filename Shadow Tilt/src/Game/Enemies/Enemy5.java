package Game.Enemies;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Enemy5 
{
	private Graphics g;
	private Image image;
	private int initialX;
	private int initialY;
	private int x;
	private int y;
	private int time = 0;
	private final int NUMBER_OF_MILLISECONDS_TO_MOVE = 250;
	public Shape topCollisionDetector = null;
	public Shape bottomCollisionDetector = null;
	public Shape leftCollisionDetector = null;
	public Shape rightCollisionDetector = null;
	public Shape centralCollisionDetector = null;
	private Shape right1CollisionDetector = null;
	private Shape right2CollisionDetector = null;
	private Shape right3CollisionDetector = null;
	private Shape right4CollisionDetector = null;
	private Shape right5CollisionDetector = null;
	private Shape bottom1CollisionDetector = null;
	private Shape bottom2CollisionDetector = null;
	private Shape bottom3CollisionDetector = null;
	private Shape bottom4CollisionDetector = null;
	private Shape bottom5CollisionDetector = null;
	private Shape left1CollisionDetector = null;
	private Shape left2CollisionDetector = null;
	private Shape left3CollisionDetector = null;
	private Shape left4CollisionDetector = null;
	private Shape left5CollisionDetector = null;
	private Shape top1CollisionDetector = null;
	private Shape top2CollisionDetector = null;
	private Shape top3CollisionDetector = null;
	private Shape top4CollisionDetector = null;
	private Shape top5CollisionDetector = null;
	public Shape topRightCollisionDetector = null;
	private Shape topRight1CollisionDetector = null;
	private Shape topRight2CollisionDetector = null;
	private Shape topRight3CollisionDetector = null;
	private Shape top1RightCollisionDetector = null;
	private Shape top2RightCollisionDetector = null;
	private Shape top3RightCollisionDetector = null;
	private Shape top1Right1CollisionDetector = null;
	private Shape top1Right2CollisionDetector = null;
	private Shape top1Right3CollisionDetector = null;
	private Shape top2Right1CollisionDetector = null;
	private Shape top3Right1CollisionDetector = null;
	private Shape top2Right2CollisionDetector = null;
	public Shape bottomRightCollisionDetector = null;
	private Shape bottomRight1CollisionDetector = null;
	private Shape bottomRight2CollisionDetector = null;
	private Shape bottomRight3CollisionDetector = null;
	private Shape bottom1RightCollisionDetector = null;
	private Shape bottom2RightCollisionDetector = null;
	private Shape bottom3RightCollisionDetector = null;
	private Shape bottom1Right1CollisionDetector = null;
	private Shape bottom1Right2CollisionDetector = null;
	private Shape bottom1Right3CollisionDetector = null;
	private Shape bottom2Right1CollisionDetector = null;
	private Shape bottom3Right1CollisionDetector = null;
	private Shape bottom2Right2CollisionDetector = null;
	public Shape bottomLeftCollisionDetector = null;
	private Shape bottomLeft1CollisionDetector = null;
	private Shape bottomLeft2CollisionDetector = null;
	private Shape bottomLeft3CollisionDetector = null;
	private Shape bottom1LeftCollisionDetector = null;
	private Shape bottom2LeftCollisionDetector = null;
	private Shape bottom3LeftCollisionDetector = null;
	private Shape bottom1Left1CollisionDetector = null;
	private Shape bottom1Left2CollisionDetector = null;
	private Shape bottom1Left3CollisionDetector = null;
	private Shape bottom2Left1CollisionDetector = null;
	private Shape bottom3Left1CollisionDetector = null;
	private Shape bottom2Left2CollisionDetector = null;
	public Shape topLeftCollisionDetector = null;
	private Shape topLeft1CollisionDetector = null;
	private Shape topLeft2CollisionDetector = null;
	private Shape topLeft3CollisionDetector = null;
	private Shape top1LeftCollisionDetector = null;
	private Shape top2LeftCollisionDetector = null;
	private Shape top3LeftCollisionDetector = null;
	private Shape top1Left1CollisionDetector = null;
	private Shape top1Left2CollisionDetector = null;
	private Shape top1Left3CollisionDetector = null;
	private Shape top2Left1CollisionDetector = null;
	private Shape top3Left1CollisionDetector = null;
	private Shape top2Left2CollisionDetector = null;
	public Enemy5(Graphics g, Image image, int x, int y)
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
		/////////////////main/////////////////
		g.setColor(Color.transparent);
		g.draw(topCollisionDetector = new Rectangle(x+1,y-25,24,24));
		g.draw(bottomCollisionDetector = new Rectangle(x+1,y+25,24,24));
		g.draw(leftCollisionDetector = new Rectangle(x+1-25,y,24,24));
		g.draw(rightCollisionDetector = new Rectangle(x+1+25,y,24,24));
		g.draw(centralCollisionDetector = new Rectangle(x+1,y,24,24));
		/////////////////right/////////////////
		g.draw(right1CollisionDetector = new Rectangle(x+1+50,y,24,24));
		g.draw(right2CollisionDetector = new Rectangle(x+1+75,y,24,24));
		g.draw(right3CollisionDetector = new Rectangle(x+1+100,y,24,24));
		g.draw(right4CollisionDetector = new Rectangle(x+1+125,y,24,24));
		g.draw(right5CollisionDetector = new Rectangle(x+1+150,y,24,24));
		/////////////////bottom/////////////////
		g.draw(bottom1CollisionDetector = new Rectangle(x+1,y+50,24,24));
		g.draw(bottom2CollisionDetector = new Rectangle(x+1,y+75,24,24));
		g.draw(bottom3CollisionDetector = new Rectangle(x+1,y+100,24,24));
		g.draw(bottom4CollisionDetector = new Rectangle(x+1,y+125,24,24));
		g.draw(bottom5CollisionDetector = new Rectangle(x+1,y+150,24,24));
		/////////////////left/////////////////
		g.draw(left1CollisionDetector = new Rectangle(x+1-50,y,24,24));
		g.draw(left2CollisionDetector = new Rectangle(x+1-75,y,24,24));
		g.draw(left3CollisionDetector = new Rectangle(x+1-100,y,24,24));
		g.draw(left4CollisionDetector = new Rectangle(x+1-125,y,24,24));
		g.draw(left5CollisionDetector = new Rectangle(x+1-150,y,24,24));
		/////////////////top/////////////////
		g.draw(top1CollisionDetector = new Rectangle(x+1,y-50,24,24));
		g.draw(top2CollisionDetector = new Rectangle(x+1,y-75,24,24));
		g.draw(top3CollisionDetector = new Rectangle(x+1,y-100,24,24));
		g.draw(top4CollisionDetector = new Rectangle(x+1,y-125,24,24));
		g.draw(top5CollisionDetector = new Rectangle(x+1,y-150,24,24));
		/////////////////topright/////////////////
		g.draw(topRightCollisionDetector = new Rectangle(x+1+25,y-25,24,24));
		g.draw(topRight1CollisionDetector = new Rectangle(x+1+50,y-25,24,24));
		g.draw(topRight2CollisionDetector = new Rectangle(x+1+75,y-25,24,24));
		g.draw(topRight3CollisionDetector = new Rectangle(x+1+100,y-25,24,24));
		g.draw(top1RightCollisionDetector = new Rectangle(x+1+25,y-50,24,24));
		g.draw(top2RightCollisionDetector = new Rectangle(x+1+25,y-75,24,24));
		g.draw(top3RightCollisionDetector = new Rectangle(x+1+25,y-100,24,24));
		g.draw(top1Right1CollisionDetector = new Rectangle(x+1+50,y-50,24,24));
		g.draw(top1Right2CollisionDetector = new Rectangle(x+1+75,y-50,24,24));
		g.draw(top1Right3CollisionDetector = new Rectangle(x+1+100,y-50,24,24));
		g.draw(top2Right1CollisionDetector = new Rectangle(x+1+50,y-75,24,24));
		g.draw(top3Right1CollisionDetector = new Rectangle(x+1+50,y-100,24,24));
		g.draw(top2Right2CollisionDetector = new Rectangle(x+1+75,y-75,24,24));
		/////////////////bottomright/////////////////
		g.draw(bottomRightCollisionDetector = new Rectangle(x+1+25,y+25,24,24));
		g.draw(bottomRight1CollisionDetector = new Rectangle(x+1+50,y+25,24,24));
		g.draw(bottomRight2CollisionDetector = new Rectangle(x+1+75,y+25,24,24));
		g.draw(bottomRight3CollisionDetector = new Rectangle(x+1+100,y+25,24,24));
		g.draw(bottom1RightCollisionDetector = new Rectangle(x+1+25,y+50,24,24));
		g.draw(bottom2RightCollisionDetector = new Rectangle(x+1+25,y+75,24,24));
		g.draw(bottom3RightCollisionDetector = new Rectangle(x+1+25,y+100,24,24));
		g.draw(bottom1Right1CollisionDetector = new Rectangle(x+1+50,y+50,24,24));
		g.draw(bottom1Right2CollisionDetector = new Rectangle(x+1+75,y+50,24,24));
		g.draw(bottom1Right3CollisionDetector = new Rectangle(x+1+100,y+50,24,24));
		g.draw(bottom2Right1CollisionDetector = new Rectangle(x+1+50,y+75,24,24));
		g.draw(bottom3Right1CollisionDetector = new Rectangle(x+1+50,y+100,24,24));
		g.draw(bottom2Right2CollisionDetector = new Rectangle(x+1+75,y+75,24,24));
		/////////////////bottomleft/////////////////
		g.draw(bottomLeftCollisionDetector = new Rectangle(x+1-25,y+25,24,24));
		g.draw(bottomLeft1CollisionDetector = new Rectangle(x+1-50,y+25,24,24));
		g.draw(bottomLeft2CollisionDetector = new Rectangle(x+1-75,y+25,24,24));
		g.draw(bottomLeft3CollisionDetector = new Rectangle(x+1-100,y+25,24,24));
		g.draw(bottom1LeftCollisionDetector = new Rectangle(x+1-25,y+50,24,24));
		g.draw(bottom2LeftCollisionDetector = new Rectangle(x+1-25,y+75,24,24));
		g.draw(bottom3LeftCollisionDetector = new Rectangle(x+1-25,y+100,24,24));
		g.draw(bottom1Left1CollisionDetector = new Rectangle(x+1-50,y+50,24,24));
		g.draw(bottom1Left2CollisionDetector = new Rectangle(x+1-75,y+50,24,24));
		g.draw(bottom1Left3CollisionDetector = new Rectangle(x+1-100,y+50,24,24));
		g.draw(bottom2Left1CollisionDetector = new Rectangle(x+1-50,y+75,24,24));
		g.draw(bottom3Left1CollisionDetector = new Rectangle(x+1-50,y+100,24,24));
		g.draw(bottom2Left2CollisionDetector = new Rectangle(x+1-75,y+75,24,24));
		/////////////////topleft/////////////////
		g.draw(topLeftCollisionDetector = new Rectangle(x+1-25,y-25,24,24));
		g.draw(topLeft1CollisionDetector = new Rectangle(x+1-50,y-25,24,24));
		g.draw(topLeft2CollisionDetector = new Rectangle(x+1-75,y-25,24,24));
		g.draw(topLeft3CollisionDetector = new Rectangle(x+1-100,y-25,24,24));
		g.draw(top1LeftCollisionDetector = new Rectangle(x+1-25,y-50,24,24));
		g.draw(top2LeftCollisionDetector = new Rectangle(x+1-25,y-75,24,24));
		g.draw(top3LeftCollisionDetector = new Rectangle(x+1-25,y-100,24,24));
		g.draw(top1Left1CollisionDetector = new Rectangle(x+1-50,y-50,24,24));
		g.draw(top1Left2CollisionDetector = new Rectangle(x+1-75,y-50,24,24));
		g.draw(top1Left3CollisionDetector = new Rectangle(x+1-100,y-50,24,24));
		g.draw(top2Left1CollisionDetector = new Rectangle(x+1-50,y-75,24,24));
		g.draw(top3Left1CollisionDetector = new Rectangle(x+1-50,y-100,24,24));
		g.draw(top2Left2CollisionDetector = new Rectangle(x+1-75,y-75,24,24));
	}
	public boolean detectPlayerOnRight(Shape player)
	{
		boolean tmp = false;
		if(!tmp && (rightCollisionDetector.intersects(player) || right1CollisionDetector.intersects(player) || right2CollisionDetector.intersects(player) || right3CollisionDetector.intersects(player) || right4CollisionDetector.intersects(player) || right5CollisionDetector.intersects(player)))
			tmp = true;
		return tmp;
	}
	public boolean detectPlayerOnBottom(Shape player)
	{
		boolean tmp = false;
		if(!tmp && (bottomCollisionDetector.intersects(player) || bottom1CollisionDetector.intersects(player) || bottom2CollisionDetector.intersects(player) || bottom3CollisionDetector.intersects(player) || bottom4CollisionDetector.intersects(player) || bottom5CollisionDetector.intersects(player)))
			tmp = true;
		return tmp;
	}
	public boolean detectPlayerOnLeft(Shape player)
	{
		boolean tmp = false;
		if(!tmp && (leftCollisionDetector.intersects(player) || left1CollisionDetector.intersects(player) || left2CollisionDetector.intersects(player) || left3CollisionDetector.intersects(player) || left4CollisionDetector.intersects(player) || left5CollisionDetector.intersects(player)))
			tmp = true;
		return tmp;
	}
	public boolean detectPlayerOnTop(Shape player)
	{
		boolean tmp = false;
		if(!tmp && (topCollisionDetector.intersects(player) || top1CollisionDetector.intersects(player) || top2CollisionDetector.intersects(player) || top3CollisionDetector.intersects(player) || top4CollisionDetector.intersects(player) || top5CollisionDetector.intersects(player)))
			tmp = true;
		return tmp;
	}
	public boolean detectPlayerOnTopRight(Shape player)
	{
		boolean tmp = false;
		if(!tmp && (topRightCollisionDetector.intersects(player) || topRight1CollisionDetector.intersects(player) || topRight2CollisionDetector.intersects(player) || topRight3CollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (top1RightCollisionDetector.intersects(player) || top2RightCollisionDetector.intersects(player) || top3RightCollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (top1Right1CollisionDetector.intersects(player) || top1Right2CollisionDetector.intersects(player) || top1Right3CollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (top2Right1CollisionDetector.intersects(player) || top3Right1CollisionDetector.intersects(player) || top2Right2CollisionDetector.intersects(player)))
			tmp = true;
		return tmp;
	}
	public boolean detectPlayerOnBottomRight(Shape player)
	{
		boolean tmp = false;
		if(!tmp && (bottomRightCollisionDetector.intersects(player) || bottomRight1CollisionDetector.intersects(player) || bottomRight2CollisionDetector.intersects(player) || bottomRight3CollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (bottom1RightCollisionDetector.intersects(player) || bottom2RightCollisionDetector.intersects(player) || bottom3RightCollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (bottom1Right1CollisionDetector.intersects(player) || bottom1Right2CollisionDetector.intersects(player) || bottom1Right3CollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (bottom2Right1CollisionDetector.intersects(player) || bottom3Right1CollisionDetector.intersects(player) || bottom2Right2CollisionDetector.intersects(player)))
			tmp = true;
		return tmp;
	}
	public boolean detectPlayerOnBottomLeft(Shape player)
	{
		boolean tmp = false;
		if(!tmp && (bottomLeftCollisionDetector.intersects(player) || bottomLeft1CollisionDetector.intersects(player) || bottomLeft2CollisionDetector.intersects(player) || bottomLeft3CollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (bottom1LeftCollisionDetector.intersects(player) || bottom2LeftCollisionDetector.intersects(player) || bottom3LeftCollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (bottom1Left1CollisionDetector.intersects(player) || bottom1Left2CollisionDetector.intersects(player) || bottom1Left3CollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (bottom2Left1CollisionDetector.intersects(player) || bottom3Left1CollisionDetector.intersects(player) || bottom2Left2CollisionDetector.intersects(player)))
			tmp = true;
		return tmp;
	}
	public boolean detectPlayerOnTopLeft(Shape player)
	{
		boolean tmp = false;
		if(!tmp && (topLeftCollisionDetector.intersects(player) || topLeft1CollisionDetector.intersects(player) || topLeft2CollisionDetector.intersects(player) || topLeft3CollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (top1LeftCollisionDetector.intersects(player) || top2LeftCollisionDetector.intersects(player) || top3LeftCollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (top1Left1CollisionDetector.intersects(player) || top1Left2CollisionDetector.intersects(player) || top1Left3CollisionDetector.intersects(player)))
			tmp = true;
		else if(!tmp && (top2Left1CollisionDetector.intersects(player) || top3Left1CollisionDetector.intersects(player) || top2Left2CollisionDetector.intersects(player)))
			tmp = true;
		return tmp;
	}
	public void moveRight(int delta)
	{
		if(!wait(delta))
			moveRight();
	}
	public void moveDown(int delta)
	{
		if(!wait(delta))
			moveDown();
	}
	public void moveLeft(int delta)
	{
		if(!wait(delta))
			moveLeft();
	}
	public void moveUp(int delta)
	{
		if(!wait(delta))
			moveUp();
	}
	public void moveUpRight(int delta)
	{
		if(!wait(delta))
		{
			moveUp();
			moveRight();
		}
	}
	public void moveDownRight(int delta)
	{
		if(!wait(delta))
		{
			moveDown();
			moveRight();
		}
	}
	public void moveDownLeft(int delta)
	{
		if(!wait(delta))
		{
			moveDown();
			moveLeft();
		}
	}
	public void moveUpLeft(int delta)
	{
		if(!wait(delta))
		{
			moveUp();
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
