package Game.Objects;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class PressurePlate 
{
	private Graphics g;
	private Image image;
	private int x;
	private int y;
	public Shape collisionDetector = null;
	public PressurePlate(Graphics g, Image image, int x, int y)
	{
		this.g = g;
		this.image = image;
		this.x = x;
		this.y = y;
	}
	public void draw()
	{
		image.draw(x + 1, y + 1, 0.125f);
		g.setColor(Color.transparent);
		g.draw(collisionDetector = new Rectangle(x+1,y,24,24));
	}
	public void unlockWall(UnlockableWall[] wallToUnlock)
	{
		for(UnlockableWall wallsToUnlock: wallToUnlock)
		{
			wallsToUnlock.changeCoordinates(-100, -100);
		}
	}
}
