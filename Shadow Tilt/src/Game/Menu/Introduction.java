package Game.Menu;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Introduction 
{
	private static int time1 = 0;
	private static int time2 = 0;
	private static int time3 = 0;
	private static int time4 = 0;
	private static int time5 = 0;
	private static int time6 = 0;
	private static int time7 = 0;
	private static boolean escapePressed = false;
	public static Image[] introduction;
	public static Image[] exit;
	public static Image exitToDraw;
	public static void drawBackground(Image background) 
	{
		background.draw(149, 49, 0.5f);
	}
	public static void drawIntroduction(Graphics g, Image player, Image movableObject, Image wall, Image endLevelObject, Image unlockObject, Image unlockWall, Image enemy1, Image board)
	{
		drawIntroductioToMoving(player, wall);
		drawIntroductionToReset(player, movableObject, wall, endLevelObject);
		drawIntroductionToCompleteLevel(player, wall, endLevelObject);
		drawIntroductionToMovableObject(player, movableObject, wall, endLevelObject, unlockObject, unlockWall, enemy1);
		drawIntroductionToEnemies(player, wall, endLevelObject, enemy1);
		drawIntroductionDescription();
		endLevelObject.draw(420, 218, 0.125f);
		movableObject.draw(410, 320, 0.125f);
		board.draw(149, 49, 0.5f);
		exitToDraw.draw(149, 49, 0.5f);
	}
	public static void drawAnimation(Input input, int delta) throws SlickException
	{
		float timeScaling = 1f;
		if(input.getMouseX()>=540 && input.getMouseX()<=(540 + 110) && input.getMouseY()>=510 && input.getMouseY()<=(510 + 40))
		{
			time7 += delta;
			if(time7 >= 0 && time7 < 100*timeScaling)
				exitToDraw = exit[0];
			if(time7 >= 100*timeScaling && time7 < 200*timeScaling)
				exitToDraw = exit[1];
			if(time7 >= 200*timeScaling && time7 < 300*timeScaling)
				exitToDraw = exit[2];
			if(time7 >= 300*timeScaling && time7 < 400*timeScaling)
				exitToDraw = exit[3];
			if(time7>=400*timeScaling)
				time7 = 0;
		}
		else
		{
			time7 = 0;
			exitToDraw = exit[0];
		}
	}
	private static void drawIntroductionDescription()
	{
		int xOffset = 60;
		int yOffset = 40;
		float timeScaling = 1.1f;
		if(time6 >= 0 && time6 < 100*timeScaling)
			introduction[0].draw(149 + xOffset, 49 + yOffset, 0.45f);
		if(time6 >= 100*timeScaling && time6 < 200*timeScaling)
			introduction[1].draw(149 + xOffset, 49 + yOffset, 0.45f);
		if(time6 >= 200*timeScaling && time6 < 300*timeScaling)
			introduction[2].draw(149 + xOffset, 49 + yOffset, 0.45f);
		if(time6 >= 300*timeScaling && time6 < 400*timeScaling)
			introduction[1].draw(149 + xOffset, 49 + yOffset, 0.45f);
		if(time6 >= 400*timeScaling)
		{
			introduction[0].draw(149 + xOffset, 49 + yOffset, 0.45f);
			time6 = 0;
		}
	}
	private static void drawIntroductioToMoving(Image player, Image wall)
	{
		int x = 200;
		int y = 100;
		wall.draw(x-50, y+50, 0.125f);
		wall.draw(x-50, y+25, 0.125f);
		wall.draw(x-50, y, 0.125f);
		wall.draw(x-50, y-25, 0.125f);
		wall.draw(x-50, y-50, 0.125f);
		wall.draw(x-25, y-50, 0.125f);
		wall.draw(x, y-50, 0.125f);
		wall.draw(x+25, y-50, 0.125f);
		wall.draw(x+50, y-50, 0.125f);
		wall.draw(x+75, y-50, 0.125f);
		wall.draw(x+75, y-25, 0.125f);
		wall.draw(x+75, y, 0.125f);
		wall.draw(x+75, y+25, 0.125f);
		wall.draw(x+100, y-50, 0.125f);
		wall.draw(x+100, y-25, 0.125f);
		wall.draw(x+100, y, 0.125f);
		wall.draw(x+100, y+25, 0.125f);
		wall.draw(x+50, y-25, 0.125f);
		wall.draw(x+50, y, 0.125f);
		wall.draw(x+50, y+25, 0.125f);
		if(time1 >= 0 && time1 < 400)
			player.draw(x, y, 0.125f);
		if(time1 >= 400 && time1 < 800)
			player.draw(x, y-25, 0.125f);
		if(time1 >= 800 && time1 < 1200)
			player.draw(x, y, 0.125f);
		if(time1 >= 1200 && time1 < 1600)
			player.draw(x, y+25, 0.125f);
		if(time1 >= 1600 && time1 < 2000)
			player.draw(x, y, 0.125f);
		if(time1 >= 2000 && time1 < 2400)
			player.draw(x+25, y, 0.125f);
		if(time1 >= 2400 && time1 < 2800)
			player.draw(x, y, 0.125f);
		if(time1 >= 2800 && time1 < 3200)
			player.draw(x-25, y, 0.125f);
		if(time1 >= 3200)
		{
			player.draw(x, y, 0.125f);
			time1 = 0;
		}
	}
	private static void drawIntroductionToCompleteLevel(Image player, Image wall, Image levelEnd)
	{
		int x = 200;
		int y = 175;
		wall.draw(x-50, y, 0.125f);
		wall.draw(x-50, y-25, 0.125f);
		wall.draw(x-25, y-25, 0.125f);
		wall.draw(x, y-25, 0.125f);
		wall.draw(x+25, y-25, 0.125f);
		wall.draw(x+50, y-25, 0.125f);
		wall.draw(x+75, y-25, 0.125f);
		wall.draw(x+75, y, 0.125f);
		wall.draw(x+75, y+25, 0.125f);
		wall.draw(x+50, y+25, 0.125f);
		wall.draw(x+25, y+25, 0.125f);
		wall.draw(x, y+25, 0.125f);
		wall.draw(x-25, y+25, 0.125f);
		wall.draw(x-50, y+25, 0.125f);
		wall.draw(x+100, y-25, 0.125f);
		wall.draw(x+100, y, 0.125f);
		wall.draw(x+100, y+25, 0.125f);
		levelEnd.draw(x+50, y, 0.125f);
		if(time2 >= 0 && time2 < 400)
			player.draw(x-25, y, 0.125f);
		if(time2 >= 400 && time2 < 800)
			player.draw(x, y, 0.125f);
		if(time2 >= 800 && time2 < 1200)
			player.draw(x+25, y, 0.125f);
		if(time2 >= 1200 && time2 < 1600)
			player.draw(x+50, y, 0.125f);
		if(time2 >= 1600)
		{
			player.draw(x-25, y, 0.125f);
			time2 = 0;
		}
	}
	private static void drawIntroductionToEnemies(Image player, Image wall, Image levelEnd, Image enemy1)
	{
		int x = 175;
		int y = 275;
		wall.draw(x-25, y, 0.125f);
		wall.draw(x-25, y-25, 0.125f);
		wall.draw(x-25, y-50, 0.125f);
		wall.draw(x+25, y, 0.125f);
		wall.draw(x+50, y, 0.125f);
		wall.draw(x+75, y, 0.125f);
		wall.draw(x+125, y+25, 0.125f);
		wall.draw(x+125, y, 0.125f);
		wall.draw(x+125, y-25, 0.125f);
		wall.draw(x+125, y-50, 0.125f);
		wall.draw(x+125, y-75, 0.125f);
		levelEnd.draw(x+100, y, 0.125f);
		if(time5 >= 0 && time5 < 200)
		{
			player.draw(x, y, 0.125f);
			enemy1.draw(x+100, y-25, 0.125f);
		}
		if(time5 >= 200 && time5 < 400)
		{
			player.draw(x, y, 0.125f);
			enemy1.draw(x+75, y-25, 0.125f);
		}
		if(time5 >= 400 && time5 < 600)
		{
			player.draw(x, y, 0.125f);
			enemy1.draw(x+50, y-25, 0.125f);
		}
		if(time5 >= 600 && time5 < 800)
		{
			player.draw(x, y, 0.125f);
			enemy1.draw(x+25, y-25, 0.125f);
		}
		if(time5 >= 800 && time5 < 1000)
		{
			player.draw(x, y, 0.125f);
			enemy1.draw(x, y-25, 0.125f);
		}
		if(time5 >= 1000 && time5 < 1200)
		{
			player.draw(x, y, 0.125f);
			enemy1.draw(x+25, y-25, 0.125f);
		}
		if(time5 >= 1200 && time5 < 1400)
		{
			player.draw(x, y-25, 0.125f);
			enemy1.draw(x+50, y-25, 0.125f);
		}
		if(time5 >= 1400 && time5 < 1600)
		{
			player.draw(x, y-25, 0.125f);
			enemy1.draw(x+75, y-25, 0.125f);
		}
		if(time5 >= 1600 && time5 < 1800)
		{
			player.draw(x, y-50, 0.125f);
			enemy1.draw(x+100, y-25, 0.125f);
		}
		if(time5 >= 1800 && time5 < 2000)
		{
			player.draw(x, y-50, 0.125f);
			enemy1.draw(x+75, y-25, 0.125f);
		}
		if(time5 >= 2000 && time5 < 2200)
		{
			player.draw(x+25, y-50, 0.125f);
			enemy1.draw(x+50, y-25, 0.125f);
		}
		if(time5 >= 2200 && time5 < 2400)
		{
			player.draw(x+25, y-50, 0.125f);
			enemy1.draw(x+25, y-25, 0.125f);
		}
		if(time5 >= 2400 && time5 < 2600)
		{
			player.draw(x+50, y-50, 0.125f);
			enemy1.draw(x+0, y-25, 0.125f);
		}
		if(time5 >= 2600 && time5 < 2800)
		{
			player.draw(x+50, y-50, 0.125f);
			enemy1.draw(x+25, y-25, 0.125f);
		}
		if(time5 >= 2800 && time5 < 3000)
		{
			player.draw(x+75, y-50, 0.125f);
			enemy1.draw(x+50, y-25, 0.125f);
		}
		if(time5 >= 3000 && time5 < 3200)
		{
			player.draw(x+75, y-50, 0.125f);
			enemy1.draw(x+75, y-25, 0.125f);
		}
		if(time5 >= 3200 && time5 < 3400)
		{
			player.draw(x+100, y-50, 0.125f);
			enemy1.draw(x+100, y-25, 0.125f);
		}
		if(time5 >= 3400 && time5 < 3600)
		{
			player.draw(x+100, y-50, 0.125f);
			enemy1.draw(x+75, y-25, 0.125f);
		}
		if(time5 >= 3600 && time5 < 3800)
		{
			player.draw(x+100, y-25, 0.125f);
			enemy1.draw(x+50, y-25, 0.125f);
		}
		if(time5 >= 3800 && time5 < 4000)
		{
			player.draw(x+100, y-25, 0.125f);
			enemy1.draw(x+25, y-25, 0.125f);
		}
		if(time5 >= 4000 && time5 < 4400)
		{
			player.draw(x+100, y, 0.125f);
			enemy1.draw(x, y-25, 0.125f);
		}
		if(time5 >= 4400)
		{
			player.draw(x, y, 0.125f);
			enemy1.draw(x+100, y-25, 0.125f);
			time5 = 0;
		}
	}
	private static void drawIntroductionToMovableObject(Image player, Image movableObject, Image wall, Image levelEnd, Image pressurePlate, Image unlockableWall, Image enemy1)
	{
		int x = 175;
		int y = 350;
		wall.draw(x-25, y, 0.125f);
		wall.draw(x-25, y-25, 0.125f);
		wall.draw(x, y-25, 0.125f);
		wall.draw(x-25, y-50, 0.125f);
		wall.draw(x, y-50, 0.125f);
		wall.draw(x+25, y-50, 0.125f);
		wall.draw(x+50, y-50, 0.125f);
		wall.draw(x+75, y-50, 0.125f);
		wall.draw(x+100, y-50, 0.125f);
		wall.draw(x+100, y-25, 0.125f);
		wall.draw(x+100, y, 0.125f);
		wall.draw(x+100, y+25, 0.125f);
		wall.draw(x+100, y+50, 0.125f);
		wall.draw(x+100, y+75, 0.125f);
		wall.draw(x+75, y+25, 0.125f);
		wall.draw(x+75, y+50, 0.125f);
		wall.draw(x+75, y+75, 0.125f);
		wall.draw(x+50, y+25, 0.125f);
		wall.draw(x+50, y+50, 0.125f);
		wall.draw(x+50, y+75, 0.125f);
		wall.draw(x+25, y+75, 0.125f);
		wall.draw(x, y+25, 0.125f);
		wall.draw(x, y+50, 0.125f);
		wall.draw(x, y+75, 0.125f);
		wall.draw(x-25, y+25, 0.125f);
		wall.draw(x-25, y+50, 0.125f);
		wall.draw(x-25, y+75, 0.125f);
		wall.draw(x+125, y-50, 0.125f);
		wall.draw(x+125, y-25, 0.125f);
		wall.draw(x+125, y, 0.125f);
		wall.draw(x+125, y+25, 0.125f);
		wall.draw(x+125, y+50, 0.125f);
		wall.draw(x+125, y+75, 0.125f);
		levelEnd.draw(x+25, y+50, 0.125f);
		pressurePlate.draw(x+75, y-25, 0.125f);
		if(time4 >= 0 && time4 < 200)
		{
			player.draw(x, y, 0.125f);
			movableObject.draw(x+25, y, 0.125f);
			movableObject.draw(x+50, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
			unlockableWall.setCenterOfRotation(unlockableWall.getWidth()/2*0.125f, unlockableWall.getHeight()/2*0.125f);
			unlockableWall.setRotation(90);
			unlockableWall.draw(x+25, y+25, 0.125f);
		}
		if(time4 >= 200 && time4 < 400)
		{
			player.draw(x, y, 0.125f);
			movableObject.draw(x+25, y, 0.125f);
			movableObject.draw(x+50, y-25, 0.125f);
			enemy1.draw(x+50, y, 0.125f);
			unlockableWall.draw(x+25, y+25, 0.125f);
		}
		if(time4 >= 400 && time4 < 600)
		{
			player.draw(x, y, 0.125f);
			movableObject.draw(x+25, y, 0.125f);
			movableObject.draw(x+50, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
			unlockableWall.draw(x+25, y+25, 0.125f);
		}
		if(time4 >= 600 && time4 < 800)
		{
			player.draw(x, y, 0.125f);
			movableObject.draw(x+25, y, 0.125f);
			movableObject.draw(x+50, y-25, 0.125f);
			enemy1.draw(x+50, y, 0.125f);
			unlockableWall.draw(x+25, y+25, 0.125f);
		}
		if(time4 >= 800 && time4 < 1000)
		{
			player.draw(x, y, 0.125f);
			movableObject.draw(x+25, y, 0.125f);
			movableObject.draw(x+50, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
			unlockableWall.draw(x+25, y+25, 0.125f);
		}
		if(time4 >= 1000 && time4 < 1400)
		{
			player.draw(x+25, y, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
			movableObject.draw(x+50, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
			unlockableWall.draw(x+25, y+25, 0.125f);
		}
		if(time4 >= 1400 && time4 < 1800)
		{
			player.draw(x+25, y-25, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
			movableObject.draw(x+50, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
			unlockableWall.draw(x+25, y+25, 0.125f);
		}
		if(time4 >= 1800 && time4 < 2200)
		{
			player.draw(x+50, y-25, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
			movableObject.draw(x+75, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
		}
		if(time4 >= 1800 && time4 < 2200)
		{
			player.draw(x+50, y-25, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
			movableObject.draw(x+75, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
		}
		if(time4 >= 2200 && time4 < 2600)
		{
			player.draw(x+25, y-25, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
			movableObject.draw(x+75, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
		}
		if(time4 >= 2600 && time4 < 3000)
		{
			player.draw(x+25, y, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
			movableObject.draw(x+75, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
		}
		if(time4 >= 3000 && time4 < 3400)
		{
			player.draw(x+25, y+25, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
			movableObject.draw(x+75, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
		}
		if(time4 >= 3400 && time4 < 3800)
		{
			player.draw(x+25, y+50, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
			movableObject.draw(x+75, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
		}
		if(time4 >= 3800)
		{
			player.draw(x, y, 0.125f);
			movableObject.draw(x+25, y, 0.125f);
			movableObject.draw(x+50, y-25, 0.125f);
			enemy1.draw(x+75, y, 0.125f);
			unlockableWall.draw(x+25, y+25, 0.125f);
			time4 = 0;
		}
	}
	private static void drawIntroductionToReset(Image player, Image movableObject, Image wall, Image levelEnd)
	{
		int x = 175;
		int y = 475;
		wall.draw(x-25, y, 0.125f);
		wall.draw(x-25, y-25, 0.125f);
		wall.draw(x, y-25, 0.125f);
		wall.draw(x, y-50, 0.125f);
		wall.draw(x+25, y-50, 0.125f);
		wall.draw(x+50, y-50, 0.125f);
		wall.draw(x+75, y-50, 0.125f);
		wall.draw(x+100, y-50, 0.125f);
		wall.draw(x+100, y-25, 0.125f);
		wall.draw(x+125, y-50, 0.125f);
		wall.draw(x+125, y-25, 0.125f);
		wall.draw(x+125, y, 0.125f);
		wall.draw(x+125, y+25, 0.125f);
		wall.draw(x+125, y+50, 0.125f);
		wall.draw(x+100, y+25, 0.125f);
		wall.draw(x+100, y+50, 0.125f);
		wall.draw(x+75, y+50, 0.125f);
		wall.draw(x+50, y+50, 0.125f);
		wall.draw(x+25, y+50, 0.125f);
		wall.draw(x, y+50, 0.125f);
		wall.draw(x, y+25, 0.125f);
		wall.draw(x-25, y+25, 0.125f);
		wall.draw(x+75, y+25, 0.125f);
		wall.draw(x-25, y-50, 0.125f);
		wall.draw(x-25, y+50, 0.125f);
		levelEnd.draw(x+100, y, 0.125f);
		if(time3 >= 0 && time3 < 400)
		{
			player.draw(x, y, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
		}
		if(time3 >= 400 && time3 < 800)
		{
			player.draw(x+25, y, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
		}
		if(time3 >= 800 && time3 < 1600)
		{
			player.draw(x+50, y, 0.125f);
			movableObject.draw(x+75, y, 0.125f);
		}
		if(time3 >= 1600 && time3 < 2000)
		{
			player.draw(x, y, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
		}
		if(time3 >= 2000 && time3 < 2400)
		{
			player.draw(x+25, y, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
		}
		if(time3 >= 2400 && time3 < 2800)
		{
			player.draw(x+25, y-25, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
		}
		if(time3 >= 2800 && time3 < 3200)
		{
			player.draw(x+50, y-25, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
		}
		if(time3 >= 3200 && time3 < 3600)
		{
			player.draw(x+75, y-25, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
		}
		if(time3 >= 3600 && time3 < 4000)
		{
			player.draw(x+75, y, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
		}
		if(time3 >= 4000 && time3 < 4400)
		{
			player.draw(x+100, y, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
		}
		if(time3 >= 4400)
		{
			player.draw(x, y, 0.125f);
			movableObject.draw(x+50, y, 0.125f);
			time3 = 0;
		}
	}
	public static void updateTime(int delta)
	{
		time1 += delta;
		time2 += delta;
		time3 += delta;
		time4 += delta;
		time5 += delta;
		time6 += delta;
	}
	public static boolean quitIntroduction1(Input input)
	{
		if(input.isKeyPressed(Input.KEY_ESCAPE))
			escapePressed = true;
		else
			escapePressed = false;
		return escapePressed;
	}
	public static boolean quitIntroduction2(Input input)
	{
		boolean quit = false;
		if(input.getMouseX()>=540 && input.getMouseX()<=(540 + 110) && input.getMouseY()>=510 && input.getMouseY()<=(510 + 40))
			quit = true;
		return quit;
	}
}
