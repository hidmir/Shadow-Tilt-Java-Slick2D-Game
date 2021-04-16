package Game.Menu;

import java.awt.Font;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;

public class MainMenu
{
	public static int selected = 0;
	private static int time1 = 0;
	private static int time2 = 0;
	public static Image[] newGame;
	public static Image newGameToDraw;
	public static Image[] changeSkin;
	public static Image changeSkinToDraw;
	public static Image[] introduction;
	public static Image introductionToDraw;
	public static Image[] options;
	public static Image optionsToDraw;
	public static Image[] exit;
	public static Image exitToDraw;
	public static Image[] mainMenu;
	public static Image title;
	public static Image totalDeathsBoard;
	public static Font font = new Font("Arial", Font.BOLD , 26);
	public static TrueTypeFont ttf = new TrueTypeFont(font, true);
	public static void updateTime(int delta)
	{
		time2 += delta;
	}
	public static void drawMenu()
	{
		if(time2 >= 0 && time2 < 83)
			mainMenu[0].draw(149, 49, 0.5f);
		if(time2 >= 83 && time2 < 166)
			mainMenu[1].draw(149, 49, 0.5f);
		if(time2 >= 166 && time2 < 250)
			mainMenu[2].draw(149, 49, 0.5f);
		if(time2 >= 250 && time2 < 333)
			mainMenu[3].draw(149, 49, 0.5f);
		if(time2 >= 333 && time2 < 416)
			mainMenu[4].draw(149, 49, 0.5f);
		if(time2 >= 416 && time2 < 500)
			mainMenu[5].draw(149, 49, 0.5f);
		if(time2 >= 500 && time2 < 583)
			mainMenu[4].draw(149, 49, 0.5f);
		if(time2 >= 583 && time2 < 666)
			mainMenu[3].draw(149, 49, 0.5f);
		if(time2 >= 666 && time2 < 750)
			mainMenu[2].draw(149, 49, 0.5f);
		if(time2 >= 750 && time2 < 833)
			mainMenu[1].draw(149, 49, 0.5f);
		if(time2>=833)
		{
			time2 = 0;
			mainMenu[0].draw(149, 49, 0.5f);
		}
		title.draw(149, 49, 0.5f);
	}
	public static void drawTotalDeaths(Graphics g, int totalDeaths)
	{
		totalDeathsBoard.draw(149, 49, 0.5f);
		int x = 560;
		if(totalDeaths < 10)
			x = 590;
		else if(totalDeaths >= 10 && totalDeaths < 100)
			x = 582;
		else if(totalDeaths >= 100 && totalDeaths < 1000)
			x = 575;
		else if(totalDeaths >= 1000 && totalDeaths < 10000)
			x = 569;
		ttf.drawString(x, 75, "" + totalDeaths, new Color(149, 55, 0));
	}
	public static void drawMenuOptions()
	{
		newGameToDraw.draw(325, 223, 0.5f);
		changeSkinToDraw.draw(325, 278, 0.5f);
		introductionToDraw.draw(325, 337, 0.5f);
		optionsToDraw.draw(325, 410, 0.5f);
		exitToDraw.draw(325, 470, 0.5f);
	}
	public static int chooseSelected(Input input)
	{
		if(input.getMouseX()>=325 && input.getMouseX()<=475 && input.getMouseY()>=248 && input.getMouseY()<=298)
		{
	        return 0;
		}
		if(input.getMouseX()>=330 && input.getMouseX()<=470 && input.getMouseY()>=302 && input.getMouseY()<=352)
		{
	        return 1;
		}
		if(input.getMouseX()>=325 && input.getMouseX()<=475 && input.getMouseY()>=357 && input.getMouseY()<=417)
		{
	        return 2;
		}
		if(input.getMouseX()>=330 && input.getMouseX()<=470 && input.getMouseY()>=430 && input.getMouseY()<=488)
		{
	        return 3;
		}
		if(input.getMouseX()>=330 && input.getMouseX()<=457 && input.getMouseY()>=500 && input.getMouseY()<=537)
		{
	        return 4;
		}
		return -1;
	}
	public static void drawAnimation(Input input, int delta) throws SlickException
	{
		if(input.getMouseX()>=325 && input.getMouseX()<=475 && input.getMouseY()>=248 && input.getMouseY()<=298)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 83)
				newGameToDraw = newGame[1];
			if(time1 >= 83 && time1 < 166)
				newGameToDraw = newGame[2];
			if(time1 >= 166 && time1 < 250)
				newGameToDraw = newGame[3];
			if(time1 >= 250 && time1 < 333)
				newGameToDraw = newGame[4];
			if(time1 >= 333 && time1 < 416)
				newGameToDraw = newGame[3];
			if(time1 >= 500 && time1 < 583)
				newGameToDraw = newGame[2];
			if(time1>=583)
				time1 = 0;
		}
		else if(input.getMouseX()>=330 && input.getMouseX()<=470 && input.getMouseY()>=302 && input.getMouseY()<=352)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 83)
				changeSkinToDraw = changeSkin[1];
			if(time1 >= 83 && time1 < 166)
				changeSkinToDraw = changeSkin[2];
			if(time1 >= 166 && time1 < 250)
				changeSkinToDraw = changeSkin[3];
			if(time1 >= 250 && time1 < 333)
				changeSkinToDraw = changeSkin[4];
			if(time1 >= 333 && time1 < 416)
				changeSkinToDraw = changeSkin[3];
			if(time1 >= 500 && time1 < 583)
				changeSkinToDraw = changeSkin[2];
			if(time1>=583)
				time1 = 0;
		}
		else if(input.getMouseX()>=325 && input.getMouseX()<=475 && input.getMouseY()>=357 && input.getMouseY()<=417)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 83)
				introductionToDraw = introduction[1];
			if(time1 >= 83 && time1 < 166)
				introductionToDraw = introduction[2];
			if(time1 >= 166 && time1 < 250)
				introductionToDraw = introduction[3];
			if(time1 >= 250 && time1 < 333)
				introductionToDraw = introduction[4];
			if(time1 >= 333 && time1 < 416)
				introductionToDraw = introduction[3];
			if(time1 >= 500 && time1 < 583)
				introductionToDraw = introduction[2];
			if(time1>=583)
				time1 = 0;
		}
		else if(input.getMouseX()>=330 && input.getMouseX()<=470 && input.getMouseY()>=430 && input.getMouseY()<=488)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 83)
				optionsToDraw = options[1];
			if(time1 >= 83 && time1 < 166)
				optionsToDraw = options[2];
			if(time1 >= 166 && time1 < 250)
				optionsToDraw = options[3];
			if(time1 >= 250 && time1 < 333)
				optionsToDraw = options[4];
			if(time1 >= 333 && time1 < 416)
				optionsToDraw = options[3];
			if(time1 >= 500 && time1 < 583)
				optionsToDraw = options[2];
			if(time1>=583)
				time1 = 0;
		}
		else if(input.getMouseX()>=330 && input.getMouseX()<=457 && input.getMouseY()>=500 && input.getMouseY()<=537)
		{
			time1 += delta;
			if(time1 >= 0 && time1 < 83)
				exitToDraw = exit[1];
			if(time1 >= 83 && time1 < 166)
				exitToDraw = exit[2];
			if(time1 >= 166 && time1 < 250)
				exitToDraw = exit[3];
			if(time1 >= 250 && time1 < 333)
				exitToDraw = exit[4];
			if(time1 >= 333 && time1 < 416)
				exitToDraw = exit[3];
			if(time1 >= 500 && time1 < 583)
				exitToDraw = exit[2];
			if(time1>=583)
				time1 = 0;
		}
		else
		{
			newGameToDraw = newGame[0];
			changeSkinToDraw = changeSkin[0];
			introductionToDraw = introduction[0];
			optionsToDraw = options[0];
			exitToDraw = exit[0];
			time1 = 0;
		}
	}
}
