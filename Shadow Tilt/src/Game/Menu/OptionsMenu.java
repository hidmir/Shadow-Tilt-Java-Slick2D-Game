package Game.Menu;

import java.io.IOException;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import Game.Properties.PropertyValues;

public class OptionsMenu 
{
	private static int time1 = 0;
	private static int time2 = 0;
	private static int selectedResolutionNumber = 0;
	public static int screenWidth = 800;
	public static int screenHeight = 600;
	public static int actualScreenWidth;
	public static int actualScreenHeight;
	protected static int currentScreenWidth = 800;
	protected static int currentScreenHeight = 600;
	public static boolean fullScreenMode = false;
	protected static boolean isFullScreenModeActive = false;
	public static Image[] optionsMenu;
	public static Image[] save;
	public static Image saveToDraw;
	public static Image[] cancel;
	public static Image cancelToDraw;
	public static Image[] res;
	public static Image trueImage;
	public static Image falseImage;
	public static Image[] resolutionLeftArrow;
	public static Image resolutionLeftArroweToDraw;
	public static Image[] resolutionRightArrow;
	public static Image resolutionRightArrowToDraw;
	public static Image[] fullScreenLeftArrow;
	public static Image fullScreenLeftArrowToDraw;
	public static Image[] fullScreenRightArrow;
	public static Image fullScreenRightArrowToDraw;
	public static void drawMenu(Graphics g)
	{
		if(time2 >= 0 && time2 < 100)
			optionsMenu[0].draw(149, 49, 0.5f);
		else if(time2 >= 100 && time2 < 200)
			optionsMenu[1].draw(149, 49, 0.5f);
		else if(time2 >= 200 && time2 < 300)
			optionsMenu[2].draw(149, 49, 0.5f);
		else if(time2 >= 300 && time2 < 400)
			optionsMenu[3].draw(149, 49, 0.5f);
		else if(time2 >= 400 && time2 < 500)
			optionsMenu[4].draw(149, 49, 0.5f);
		else if(time2 >= 500 && time2 < 600)
			optionsMenu[3].draw(149, 49, 0.5f);
		else if(time2 >= 600 && time2 < 700)
			optionsMenu[2].draw(149, 49, 0.5f);
		else if(time2 >= 700 && time2 < 800)
			optionsMenu[1].draw(149, 49, 0.5f);
		else if(time2 >= 800)
		{
			optionsMenu[0].draw(149, 49, 0.5f);
			time2 = 0;
		}
		g.setColor(Color.black);
		switch(selectedResolutionNumber)
		{
		case 0:
			res[0].draw(149, 49, 0.5f);
			break;
		case 1:
			res[1].draw(149, 49, 0.5f);
			break;
		case 2:
			res[2].draw(149, 49, 0.5f);
			break;
		case 3:
			res[3].draw(149, 49, 0.5f);
			break;
		case 4:
			res[4].draw(149, 49, 0.5f);
			break;
		case 5:
			res[5].draw(149, 49, 0.5f);
			break;
		case 6:
			res[6].draw(149, 49, 0.5f);
			break;
		case 7:
			res[7].draw(149, 49, 0.5f);
			break;
		case 8:
			res[8].draw(149, 49, 0.5f);
			break;
		default:
			res[1].draw(149, 49, 0.5f);
			break;
		}
		if(fullScreenMode)
			trueImage.draw(149, 49, 0.5f);
		else
			falseImage.draw(149, 49, 0.5f);
		resolutionLeftArroweToDraw.draw(149, 49, 0.5f);
		resolutionRightArrowToDraw.draw(149, 49, 0.5f);
		fullScreenLeftArrowToDraw.draw(149, 49, 0.5f);
		fullScreenRightArrowToDraw.draw(149, 49, 0.5f);
		saveToDraw.draw(149, 49, 0.5f);
		cancelToDraw.draw(149, 49, 0.5f);
	}
	public static void drawAnimation(Input input, int delta) throws SlickException
	{
		if(input.getMouseX()>=185 && input.getMouseX()<=(185 + 135) && input.getMouseY()>=395 && input.getMouseY()<=(395 + 60))
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
		else if(input.getMouseX()>=475 && input.getMouseX()<=(475 + 135) && input.getMouseY()>=410 && input.getMouseY()<=(410 + 60))
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
		else if(input.getMouseX()>=150 && input.getMouseX()<=(150+50) && input.getMouseY()>=290 && input.getMouseY()<=(290+40))
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100)
				resolutionLeftArroweToDraw = resolutionLeftArrow[0];
			if(time1 >= 100 && time1 < 200)
				resolutionLeftArroweToDraw = resolutionLeftArrow[1];
			if(time1 >= 200 && time1 < 300)
				resolutionLeftArroweToDraw = resolutionLeftArrow[2];
			if(time1>=300)
				time1 = 0;
		}
		else if(input.getMouseX()>=320 && input.getMouseX()<=(320+50) && input.getMouseY()>=290 && input.getMouseY()<=(290+40))
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100)
				resolutionRightArrowToDraw = resolutionRightArrow[0];
			if(time1 >= 100 && time1 < 200)
				resolutionRightArrowToDraw = resolutionRightArrow[1];
			if(time1 >= 200 && time1 < 300)
				resolutionRightArrowToDraw = resolutionRightArrow[2];
			if(time1>=300)
				time1 = 0;
		}
		else if(input.getMouseX()>=420 && input.getMouseX()<=(420+50) && input.getMouseY()>=290 && input.getMouseY()<=(290+40))
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100)
				fullScreenLeftArrowToDraw = fullScreenLeftArrow[0];
			if(time1 >= 100 && time1 < 200)
				fullScreenLeftArrowToDraw = fullScreenLeftArrow[1];
			if(time1 >= 200 && time1 < 300)
				fullScreenLeftArrowToDraw = fullScreenLeftArrow[2];
			if(time1>=300)
				time1 = 0;
		}
		else if(input.getMouseX()>=600 && input.getMouseX()<=(600+50) && input.getMouseY()>=290 && input.getMouseY()<=(290+40))
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 100)
				fullScreenRightArrowToDraw = fullScreenRightArrow[0];
			if(time1 >= 100 && time1 < 200)
				fullScreenRightArrowToDraw = fullScreenRightArrow[1];
			if(time1 >= 200 && time1 < 300)
				fullScreenRightArrowToDraw = fullScreenRightArrow[2];
			if(time1>=300)
				time1 = 0;
		}
		else
		{
			time1 = 0;
			cancelToDraw = cancel[0];
			saveToDraw = save[0];
		}
	}
	public static void onOpen() throws IOException
	{
		currentScreenWidth = PropertyValues.getIntConfigValue("screenWidth", 800);
		currentScreenHeight = PropertyValues.getIntConfigValue("screenHeight", 600);
		isFullScreenModeActive = PropertyValues.getBooleanConfigValue("fullScreenMode", false);
		screenWidth = currentScreenWidth;
		screenHeight = currentScreenHeight;
		fullScreenMode = isFullScreenModeActive;
		switch(currentScreenWidth)
		{
		case 640:
			selectedResolutionNumber = 0;
			break;
		case 800:
			selectedResolutionNumber = 1;
			break;
		case 1024:
			selectedResolutionNumber = 2;
			break;
		case 1280:
			selectedResolutionNumber = 3;
			break;
		case 1366:
			selectedResolutionNumber = 4;
			break;
		case 1600:
			selectedResolutionNumber = 5;
			break;
		case 1920:
			selectedResolutionNumber = 6;
			break;
		case 2048:
			selectedResolutionNumber = 7;
			break;
		case 4096:
			selectedResolutionNumber = 8;
			break;
		default:
			selectedResolutionNumber = 1;
			break;
		}
	}
	public static void chooseSelected(Input input)
	{
		if(input.getMouseX()>=150 && input.getMouseX()<=(150+50) && input.getMouseY()>=290 && input.getMouseY()<=(290+40))
		{
			if(selectedResolutionNumber>0)
	        	selectedResolutionNumber--;
			else
				selectedResolutionNumber = 8;
			loadResolution();
		}
		if(input.getMouseX()>=320 && input.getMouseX()<=(320+50) && input.getMouseY()>=290 && input.getMouseY()<=(290+40))
		{
			if(selectedResolutionNumber<8)
	        	selectedResolutionNumber++;
			else
				selectedResolutionNumber = 0;
			loadResolution();
		}
		if(input.getMouseX()>=420 && input.getMouseX()<=(420+50) && input.getMouseY()>=290 && input.getMouseY()<=(290+40))
		{
			fullScreenMode = !fullScreenMode;
		}
		if(input.getMouseX()>=600 && input.getMouseX()<=(600+50) && input.getMouseY()>=290 && input.getMouseY()<=(290+40))
		{
			fullScreenMode = !fullScreenMode;
		}
	}
	private static void loadResolution()
	{
		switch(selectedResolutionNumber)
		{
			case 0:
			{
				screenWidth = 640;
	        	screenHeight = 480;
			}
			break;
			case 1:
			{
				screenWidth = 800;
	        	screenHeight = 600;
			}
			break;
			case 2:
			{
				screenWidth = 1024;
	        	screenHeight = 768;
			}
			break;
			case 3:
			{
				screenWidth = 1280;
	        	screenHeight = 1024;
			}
			break;
			case 4:
			{
				screenWidth = 1366;
	        	screenHeight = 768;
			}
			break;
			case 5:
			{
				screenWidth = 1600;
	        	screenHeight = 1200;
			}
			break;
			case 6:
			{
				screenWidth = 1920;
	        	screenHeight = 1080;
			}
			break;
			case 7:
			{
				screenWidth = 2048;
	        	screenHeight = 1152;
			}
			break;
			case 8:
			{
				screenWidth = 4096;
	        	screenHeight = 2304;
			}
			break;
			default:
			{
				screenWidth = 800;
	        	screenHeight = 600;
			}
			break;
		}
	}
	public static void updateTime(int delta)
	{
		time2 += delta;
	}
	public static boolean applyOptions(Input input)
	{
		boolean apply = false;
		if(input.getMouseX()>=185 && input.getMouseX()<=(185 + 135) && input.getMouseY()>=395 && input.getMouseY()<=(395 + 60))
		{
			if(screenHeight * screenWidth <= actualScreenHeight * actualScreenWidth)//(screenHeight <= realScreenHeight && screenWidth <= realScreenWidth)
				apply = true;
		}
		return apply;
	}
	public static boolean quitOptions(Input input)
	{
		boolean quit = false;
		if(input.getMouseX()>=475 && input.getMouseX()<=(475 + 135) && input.getMouseY()>=410 && input.getMouseY()<=(410 + 60))
		{
			screenWidth = currentScreenWidth;
			screenHeight = currentScreenHeight;
			fullScreenMode = isFullScreenModeActive;
			quit = true;
		}
		return quit;
	}
}
