package Game.Menu;

import java.io.IOException;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class SkinSelectMenu 
{
	private static int time1 = 0;
	private static int time2 = 0;
	public static int selectedSkin = 0;
	private static boolean lvl1 = false;
	private static boolean lvl2 = false;
	private static boolean lvl3 = false;
	private static boolean lvl4 = false;
	private static boolean lvl5 = false;
	private static boolean lvl6 = false;
	private static boolean lvl7 = false;
	private static boolean lvl8 = false;
	private static boolean lvl9 = false;
	private static boolean lvl10 = false;
	private static boolean lvl11 = false;
	public static Image[] skinSelectMenu;
	public static Image[] save;
	public static Image saveToDraw;
	public static Image[] cancel;
	public static Image cancelToDraw;
	public static Image[] arrowLeft;
	public static Image arrowLeftToDraw;
	public static Image[] arrowRight;
	public static Image arrowRightToDraw;
	public static void drawMenu(Graphics g, Image skin0, Image skin1, Image skin2, Image skin3, Image lockedSkin, Image board, Image[] uncompletedLevels, Image[] completedLevels)
	{
		if(time2 >= 0 && time2 < 100)
			skinSelectMenu[0].draw(149, 49, 0.5f);
		else if(time2 >= 100 && time2 < 200)
			skinSelectMenu[1].draw(149, 49, 0.5f);
		else if(time2 >= 200 && time2 < 300)
			skinSelectMenu[2].draw(149, 49, 0.5f);
		else if(time2 >= 300 && time2 < 400)
			skinSelectMenu[3].draw(149, 49, 0.5f);
		else if(time2 >= 400 && time2 < 500)
			skinSelectMenu[4].draw(149, 49, 0.5f);
		else if(time2 >= 500 && time2 < 600)
			skinSelectMenu[3].draw(149, 49, 0.5f);
		else if(time2 >= 600 && time2 < 700)
			skinSelectMenu[2].draw(149, 49, 0.5f);
		else if(time2 >= 700 && time2 < 800)
			skinSelectMenu[1].draw(149, 49, 0.5f);
		else if(time2 >= 800)
		{
			skinSelectMenu[0].draw(149, 49, 0.5f);
			time2 = 0;
		}
		g.setColor(Color.black);
		board.draw(149, 49, 0.5f);
		if(selectedSkin == 0)
		{
			skin0.draw(354, 240, 0.5f);
		}
		else if(selectedSkin == 1)
		{
			
			if(!lvl1 || !lvl2 || !lvl3 || !lvl4)
				lockedSkin.draw(354, 240, 0.5f);
			else
				skin1.draw(354, 240, 0.5f);
			drawLevel(lvl1, uncompletedLevels[0], completedLevels[0]);
			drawLevel(lvl2, uncompletedLevels[1], completedLevels[1]);
			drawLevel(lvl3, uncompletedLevels[2], completedLevels[2]);
			drawLevel(lvl4, uncompletedLevels[3], completedLevels[3]);
		}
		else if(selectedSkin == 2)
		{
			if(!lvl5 || !lvl6 || !lvl7 || !lvl8)
				lockedSkin.draw(354, 240, 0.5f);
			else
				skin2.draw(354, 240, 0.5f);
			drawLevel(lvl5, uncompletedLevels[4], completedLevels[4]);
			drawLevel(lvl6, uncompletedLevels[5], completedLevels[5]);
			drawLevel(lvl7, uncompletedLevels[6], completedLevels[6]);
			drawLevel(lvl8, uncompletedLevels[7], completedLevels[7]);
		}
		else if(selectedSkin == 3)
		{
			if(!lvl9 || !lvl10 || !lvl11)
				lockedSkin.draw(354, 240, 0.5f);
			else
				skin3.draw(354, 240, 0.5f);
			drawLevel(lvl9, uncompletedLevels[8], completedLevels[8]);
			drawLevel(lvl10, uncompletedLevels[9], completedLevels[9]);
			drawLevel(lvl11, uncompletedLevels[10], completedLevels[10]);
		}
		saveToDraw.draw(149, 49, 0.5f);
		cancelToDraw.draw(149, 49, 0.5f);
		arrowLeftToDraw.draw(149, 49, 0.5f);
		arrowRightToDraw.draw(149, 49, 0.5f);
	}
	public static void drawAnimation(Input input, int delta) throws SlickException
	{
		if(input.getMouseX()>=340 && input.getMouseX()<=(340 + 90) && input.getMouseY()>=520 && input.getMouseY()<=(520 + 30))
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100)
				saveToDraw = save[0];
			if(time1 >= 100 && time1 < 200)
				saveToDraw = save[1];
			if(time1 >= 200 && time1 < 300)
				saveToDraw = save[2];
			if(time1 >= 300 && time1 < 400)
				saveToDraw = save[3];
			if(time1>=400)
				time1 = 0;
		}
		else if(input.getMouseX()>=340 && input.getMouseX()<=(340 + 90) && input.getMouseY()>=485 && input.getMouseY()<=(485 + 30))
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100)
				cancelToDraw = cancel[0];
			if(time1 >= 100 && time1 < 200)
				cancelToDraw = cancel[1];
			if(time1 >= 200 && time1 < 300)
				cancelToDraw = cancel[2];
			if(time1 >= 300 && time1 < 400)
				cancelToDraw = cancel[3];
			if(time1>=400)
				time1 = 0;
		}
		else if(input.getMouseX()>=205 && input.getMouseX()<=(205 + 80) && input.getMouseY()>=250 && input.getMouseY()<=(250 + 40))
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100)
				arrowLeftToDraw = arrowLeft[0];
			if(time1 >= 100 && time1 < 200)
				arrowLeftToDraw = arrowLeft[1];
			if(time1 >= 200 && time1 < 300)
				arrowLeftToDraw = arrowLeft[2];
			if(time1 >= 300 && time1 < 400)
				arrowLeftToDraw = arrowLeft[1];
			if(time1>=400)
				time1 = 0;
		}
		else if(input.getMouseX()>=505 && input.getMouseX()<=(505 + 80) && input.getMouseY()>=250 && input.getMouseY()<=(250 + 40))
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100)
				arrowRightToDraw = arrowRight[0];
			if(time1 >= 100 && time1 < 200)
				arrowRightToDraw = arrowRight[1];
			if(time1 >= 200 && time1 < 300)
				arrowRightToDraw = arrowRight[2];
			if(time1 >= 300 && time1 < 400)
				arrowRightToDraw = arrowRight[1];
			if(time1>=400)
				time1 = 0;
		}
		else
		{
			time1 = 0;
			cancelToDraw = cancel[0];
			saveToDraw = save[0];
		}
	}
	public static void onOpen(boolean lvl1, boolean lvl2, boolean lvl3, boolean lvl4, boolean lvl5, boolean lvl6, boolean lvl7, boolean lvl8, boolean lvl9, boolean lvl10, boolean lvl11) throws IOException
	{
		SkinSelectMenu.lvl1 = lvl1;
		SkinSelectMenu.lvl2 = lvl2;
		SkinSelectMenu.lvl3 = lvl3;
		SkinSelectMenu.lvl4 = lvl4;
		SkinSelectMenu.lvl5 = lvl5;
		SkinSelectMenu.lvl6 = lvl6;
		SkinSelectMenu.lvl7 = lvl7;
		SkinSelectMenu.lvl8 = lvl8;
		SkinSelectMenu.lvl9 = lvl9;
		SkinSelectMenu.lvl10 = lvl10;
		SkinSelectMenu.lvl11 = lvl11;
	}
	public static void chooseSelected(Input input)
	{
		if(input.getMouseX()>=205 && input.getMouseX()<=(205 + 80) && input.getMouseY()>=250 && input.getMouseY()<=(250 + 40))
		{
			if(selectedSkin > 0)
				selectedSkin--;
			else if(selectedSkin == 0)
				selectedSkin = 3;
		}
		if(input.getMouseX()>=505 && input.getMouseX()<=(505 + 80) && input.getMouseY()>=250 && input.getMouseY()<=(250 + 40))
		{
			if(selectedSkin < 3)
				selectedSkin++;
			else if(selectedSkin == 3)
				selectedSkin = 0;
		}
	}
	public static void updateTime(int delta)
	{
		time2 += delta;
	}
	public static boolean applyOptions(Input input)
	{
		boolean apply = false;
		if(input.getMouseX()>=340 && input.getMouseX()<=(340 + 90) && input.getMouseY()>=520 && input.getMouseY()<=(520 + 30))
		{
			if(selectedSkin == 0)
			{
				apply = true;
			}
			else if(selectedSkin == 1)
			{
				if(lvl1 && lvl2 && lvl3 && lvl4)
					apply = true;
			}
			else if(selectedSkin == 2)
			{
				if(lvl5 && lvl6 && lvl7 && lvl8)
					apply = true;
			}
			else if(selectedSkin == 3)
			{
				if(lvl9 && lvl10 && lvl11)
					apply = true;
			}
		}
		return apply;
	}
	public static boolean quitOptions(Input input)
	{
		boolean quit = false;
		if(input.getMouseX()>=340 && input.getMouseX()<=(340 + 90) && input.getMouseY()>=485 && input.getMouseY()<=(485 + 30))
			quit = true;
		return quit;
	}
	private static void drawLevel(boolean lvl, Image uncompleted, Image completed)
	{
		if(lvl)
			completed.draw(149, 49, 0.5f);
		else
			uncompleted.draw(149, 49, 0.5f);
	}
}
