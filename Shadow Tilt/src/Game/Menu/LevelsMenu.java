package Game.Menu;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class LevelsMenu 
{
	public static int selected = 0;
	private static int time1 = 0;
	private static int time2 = 0;
	public static Image[] level1;
	public static Image level1ToDraw;
	public static Image[] level2;
	public static Image level2ToDraw;
	public static Image[] level3;
	public static Image level3ToDraw;
	public static Image[] level4;
	public static Image level4ToDraw;
	public static Image[] level5;
	public static Image level5ToDraw;
	public static Image[] level6;
	public static Image level6ToDraw;
	public static Image[] level7;
	public static Image level7ToDraw;
	public static Image[] level8;
	public static Image level8ToDraw;
	public static Image[] level9;
	public static Image level9ToDraw;
	public static Image[] level10;
	public static Image level10ToDraw;
	public static Image[] level11;
	public static Image level11ToDraw;
	public static Image[] levelsMenuExit;
	public static Image levelsMenuExitToDraw;
	public static Image[] levelsMenu;
	public static void updateTime(int delta)
	{
		time1 += delta;
		time2 += delta;
	}
	public static void drawLevelsMenu(Graphics g)
	{
		if(time2 >= 0 && time2 < 100)
			levelsMenu[0].draw(149, 49, 0.5f);
		else if(time2 >= 100 && time2 < 200)
			levelsMenu[1].draw(149, 49, 0.5f);
		else if(time2 >= 200 && time2 < 300)
			levelsMenu[2].draw(149, 49, 0.5f);
		else if(time2 >= 300 && time2 < 400)
			levelsMenu[3].draw(149, 49, 0.5f);
		else if(time2 >= 400 && time2 < 500)
			levelsMenu[4].draw(149, 49, 0.5f);
		else if(time2 >= 500 && time2 < 600)
			levelsMenu[3].draw(149, 49, 0.5f);
		else if(time2 >= 600 && time2 < 700)
			levelsMenu[2].draw(149, 49, 0.5f);
		else if(time2 >= 700 && time2 < 800)
			levelsMenu[1].draw(149, 49, 0.5f);
		else if(time2 >= 800)
		{
			levelsMenu[0].draw(149, 49, 0.5f);
			time2 = 0;
		}
	}
	public static void drawLevelsMenuOptions()
	{
		level1ToDraw.draw(149, 49, 0.5f);
		level2ToDraw.draw(149, 49, 0.5f);
		level3ToDraw.draw(149, 49, 0.5f);
		level4ToDraw.draw(149, 49, 0.5f);
		level5ToDraw.draw(149, 49, 0.5f);
		level6ToDraw.draw(149, 49, 0.5f);
		level7ToDraw.draw(149, 49, 0.5f);
		level8ToDraw.draw(149, 49, 0.5f);
		level9ToDraw.draw(149, 49, 0.5f);
		level10ToDraw.draw(149, 49, 0.5f);
		level11ToDraw.draw(149, 49, 0.5f);
		levelsMenuExitToDraw.draw(149, 49, 0.5f);
	}
	public static int chooseSelected(Input input)
	{
		//easy
		if(input.getMouseX()>=165 && input.getMouseX()<=270 && input.getMouseY()>=280 && input.getMouseY()<=315)
		{
	        return 10;
		}
		if(input.getMouseX()>=162 && input.getMouseX()<=267 && input.getMouseY()>=343 && input.getMouseY()<=383)
		{
	        return 12;
		}
		if(input.getMouseX()>=160 && input.getMouseX()<=265 && input.getMouseY()>=410 && input.getMouseY()<=448)
		{
	        return 13;
		}
		if(input.getMouseX()>=165 && input.getMouseX()<=270 && input.getMouseY()>=490 && input.getMouseY()<=525)
		{
	        return 18;
		}
		//medium
		if(input.getMouseX()>=325 && input.getMouseX()<=430 && input.getMouseY()>=275 && input.getMouseY()<=310)
		{
	        return 14;
		}
		if(input.getMouseX()>=330 && input.getMouseX()<=435 && input.getMouseY()>=355 && input.getMouseY()<=390)
		{
	        return 15;
		}
		if(input.getMouseX()>=326 && input.getMouseX()<=431 && input.getMouseY()>=421 && input.getMouseY()<=464)
		{
	        return 11;
		}
		if(input.getMouseX()>=320 && input.getMouseX()<=428 && input.getMouseY()>=490 && input.getMouseY()<=525)
		{
	        return 17;
		}
		//hard
		if(input.getMouseX()>=507 && input.getMouseX()<=617 && input.getMouseY()>=274 && input.getMouseY()<=314)
		{
	        return 16;
		}
		if(input.getMouseX()>=497 && input.getMouseX()<=607 && input.getMouseY()>=355 && input.getMouseY()<=390)
		{
	        return 19;
		}
		if(input.getMouseX()>=493 && input.getMouseX()<=603 && input.getMouseY()>=423 && input.getMouseY()<=460)
		{
	        return 20;
		}
		//exit
		if(input.getMouseX()>=495 && input.getMouseX()<=535 && input.getMouseY()>=475 && input.getMouseY()<=515)
		{
	        return -1;
		}
		if(input.getMouseX()>=515 && input.getMouseX()<=555 && input.getMouseY()>=490 && input.getMouseY()<=530)
		{
	        return -1;
		}
		if(input.getMouseX()>=535 && input.getMouseX()<=575 && input.getMouseY()>=510 && input.getMouseY()<=550)
		{
	        return -1;
		}
		if(input.getMouseX()>=555 && input.getMouseX()<=595 && input.getMouseY()>=525 && input.getMouseY()<=550)
		{
	        return -1;
		}
		return 0;
	}
	public static void drawAnimation(Input input, int delta) throws SlickException
	{
		float timeScaling = 2f;
		if(input.getMouseX()>=165 && input.getMouseX()<=270 && input.getMouseY()>=280 && input.getMouseY()<=315)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level1ToDraw = level1[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level1ToDraw = level1[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level1ToDraw = level1[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level1ToDraw = level1[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=162 && input.getMouseX()<=267 && input.getMouseY()>=343 && input.getMouseY()<=383)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level2ToDraw = level2[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level2ToDraw = level2[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level2ToDraw = level2[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level2ToDraw = level2[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=160 && input.getMouseX()<=265 && input.getMouseY()>=410 && input.getMouseY()<=448)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level3ToDraw = level3[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level3ToDraw = level3[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level3ToDraw = level3[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level3ToDraw = level3[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=165 && input.getMouseX()<=270 && input.getMouseY()>=490 && input.getMouseY()<=525)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level4ToDraw = level4[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level4ToDraw = level4[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level4ToDraw = level4[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level4ToDraw = level4[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=325 && input.getMouseX()<=430 && input.getMouseY()>=275 && input.getMouseY()<=310)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level5ToDraw = level5[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level5ToDraw = level5[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level5ToDraw = level5[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level5ToDraw = level5[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=330 && input.getMouseX()<=435 && input.getMouseY()>=355 && input.getMouseY()<=390)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level6ToDraw = level6[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level6ToDraw = level6[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level6ToDraw = level6[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level6ToDraw = level6[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=326 && input.getMouseX()<=431 && input.getMouseY()>=421 && input.getMouseY()<=464)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level7ToDraw = level7[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level7ToDraw = level7[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level7ToDraw = level7[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level7ToDraw = level7[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=320 && input.getMouseX()<=428 && input.getMouseY()>=490 && input.getMouseY()<=525)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level8ToDraw = level8[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level8ToDraw = level8[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level8ToDraw = level8[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level8ToDraw = level8[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=507 && input.getMouseX()<=617 && input.getMouseY()>=274 && input.getMouseY()<=314)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level9ToDraw = level9[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level9ToDraw = level9[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level9ToDraw = level9[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level9ToDraw = level9[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=497 && input.getMouseX()<=607 && input.getMouseY()>=355 && input.getMouseY()<=390)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level10ToDraw = level10[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level10ToDraw = level10[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level10ToDraw = level10[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level10ToDraw = level10[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=493 && input.getMouseX()<=603 && input.getMouseY()>=423 && input.getMouseY()<=460)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				level11ToDraw = level11[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				level11ToDraw = level11[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				level11ToDraw = level11[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				level11ToDraw = level11[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=495 && input.getMouseX()<=535 && input.getMouseY()>=475 && input.getMouseY()<=515)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=515 && input.getMouseX()<=555 && input.getMouseY()>=490 && input.getMouseY()<=530)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=535 && input.getMouseX()<=575 && input.getMouseY()>=510 && input.getMouseY()<=550)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else if(input.getMouseX()>=555 && input.getMouseX()<=595 && input.getMouseY()>=525 && input.getMouseY()<=550)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[0];
			if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[1];
			if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[2];
			if(time1 >= 300*timeScaling && time1 < 400*timeScaling)
				levelsMenuExitToDraw = levelsMenuExit[1];
			if(time1>=400*timeScaling)
				time1 = 0;
		}
		else
		{
			level1ToDraw = level1[0];
			level2ToDraw = level2[0];
			level3ToDraw = level3[0];
			level4ToDraw = level4[0];
			level5ToDraw = level5[0];
			level6ToDraw = level6[0];
			level7ToDraw = level7[0];
			level8ToDraw = level8[0];
			level9ToDraw = level9[0];
			level10ToDraw = level10[0];
			level11ToDraw = level11[0];
			levelsMenuExitToDraw = levelsMenuExit[0];
			time1 = 0;
		}
	}
}
