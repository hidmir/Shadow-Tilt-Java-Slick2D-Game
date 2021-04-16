package Game.Objects;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class UnlockableWall 
{
	private Graphics g;
	private Image image;
	private int x;
	private int y;
	private int initialX;
	private int initialY;
	private boolean rotate;
	public Shape collisionDetector = null;
	public UnlockableWall(Graphics g, Image image, int x, int y, boolean rotate)
	{
		this.g = g;
		this.image = image;
		initialX = x;
		initialY = y;
		this.x = x;
		this.y = y;
		this.rotate = rotate;
	}
	public void draw()
	{
		if(rotate == false)
			image.draw(x + 1, y + 1, 0.125f);
		if(rotate == true)
		{
			image.setCenterOfRotation(image.getWidth()/2*0.125f, image.getHeight()/2*0.125f);
			image.setRotation(90);
			image.draw(x + 1, y + 1, 0.125f);
			image.setRotation(0);
		}
		g.setColor(Color.transparent);
		g.draw(collisionDetector = new Rectangle(x+1,y,24,24));
	}
	protected void changeCoordinates(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void resetPosition()
	{
		x = initialX;
		y = initialY;
	}
}
