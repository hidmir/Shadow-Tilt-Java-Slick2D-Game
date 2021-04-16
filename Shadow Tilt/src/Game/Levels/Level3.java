package Game.Levels;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;

import Game.Enemies.Enemy1;
import Game.Enemies.Enemy2;
import Game.Enemies.Enemy3;
import Game.Enemies.Enemy4;
import Game.Enemies.Enemy5;
import Game.Objects.MovableObject;
import Game.Objects.Player;
import Game.Objects.PressurePlate;
import Game.Objects.UnlockableWall;

public class Level3 extends Levels
{
	public static void drawAllObjects(Graphics g, Image background, Image wall, Image levelEnd, Image enemy1, Image enemy2, Image enemy3, Image enemy4, Image enemy5, Image movableObject, Image player, Image pressurePlate1, Image unlockableWall1, Image pressurePlate2, Image unlockableWall2, Image pressurePlate3, Image unlockableWall3, Image pressurePlate4, Image unlockableWall4, Image pressurePlate5, Image unlockableWall5, Image[] lightsAndShadows)
	{
		drawFrame(g, background);
		drawWalls(g, wall);
		drawPressurePlate1(g, pressurePlate1);
		drawUnlockableWall1Objects(g, unlockableWall1);
		drawPressurePlate2(g, pressurePlate2);
		drawUnlockableWall2Objects(g, unlockableWall2);
		drawPressurePlate3(g, pressurePlate3);
		drawUnlockableWall3Objects(g, unlockableWall3);
		drawPressurePlate4(g, pressurePlate4);
		drawUnlockableWall4Objects(g, unlockableWall4);
		drawPressurePlate5(g, pressurePlate5);
		drawUnlockableWall5Objects(g, unlockableWall5);
		drawLevelEnd(g, levelEnd);
		drawEnemies1(g, enemy1);
		drawEnemies2(g, enemy2);
		drawEnemies3(g, enemy3);
		drawEnemies4(g, enemy4);
		drawEnemies5(g, enemy5);
		drawMovableObjects(g, movableObject);
		drawPlayer(g, player);
		moveMovableObjects();
		drawLightAndShadowAnimation(lightsAndShadows);
	}
	private static void drawLightAndShadowAnimation(Image[] lightsAndShadows)
	{
		float timeScaling = 1.3f;
		if(time1 >= 0 && time1 < 100*timeScaling)
			lightsAndShadows[0].draw(149, 49, 1f);
		else if(time1 >= 100*timeScaling && time1 < 200*timeScaling)
			lightsAndShadows[1].draw(149, 49, 1f);
		else if(time1 >= 200*timeScaling && time1 < 300*timeScaling)
			lightsAndShadows[2].draw(149, 49, 1f);
		else if(time1 >= 300*timeScaling)
		{
			time1 = 0;
			lightsAndShadows[0].draw(149, 49, 1f);
		}
	}
	private static void createPlayer(Graphics g, Image image)
	{
		player = new Player(g, image, 450, 400);
		isPlayerCreated = true;
	}
	private static void drawPlayer(Graphics g, Image image)
	{
		if(!isPlayerCreated)
			createPlayer(g, image);
		player.draw(wall);
	}
	private static void drawLevelEnd(Graphics g, Image image)
	{
		levelEnd = new Rectangle(575+1, 225,24 ,24);
		image.draw(575+1, 225, 0.125f);
		g.setColor(Color.transparent);
		g.draw(levelEnd);
	}
	private static void drawWalls(Graphics g, Image walls)
	{	
		wall = new Rectangle[182];
		int tmp = 0;
		for(int i = tmp, j = 0; tmp < i + 20; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 150 + j *25, 50));
		for(int i = tmp, j = 0; tmp < i + 20; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 150 + j *25, 525));
		for(int i = tmp, j = 0; tmp < i + 18; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 150 , 75 + j * 25));
		for(int i = tmp, j = 0; tmp < i + 18; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 625 , 75 + j * 25));
		for(int i = tmp, j = 0; tmp < i + 12; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 250 + j * 25, 75));
		g.draw(wall[tmp++] = drawWall(g, walls, 250, 100));
		g.draw(wall[tmp++] = drawWall(g, walls, 525, 100));
		g.draw(wall[tmp++] = drawWall(g, walls, 250, 125));
		g.draw(wall[tmp++] = drawWall(g, walls, 525, 125));
		g.draw(wall[tmp++] = drawWall(g, walls, 250, 150));
		g.draw(wall[tmp++] = drawWall(g, walls, 525, 150));
		g.draw(wall[tmp++] = drawWall(g, walls, 250, 175));
		for(int i = tmp, j = 0; tmp < i + 4; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 525 + j * 25, 175));
		for(int i = tmp, j = 0; tmp < i + 4; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 175 + j * 25, 200));
		g.draw(wall[tmp++] = drawWall(g, walls, 525, 200));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 225));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 250));
		for(int i = tmp, j = 0; tmp < i + 13; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 225 + j * 25, 250));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 275));
		g.draw(wall[tmp++] = drawWall(g, walls, 225, 275));
		g.draw(wall[tmp++] = drawWall(g, walls, 250, 275));
		g.draw(wall[tmp++] = drawWall(g, walls, 300, 275));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 275));
		for(int i = tmp, j = 0; tmp < i + 10; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 375 + j * 25, 275));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 300));
		g.draw(wall[tmp++] = drawWall(g, walls, 500, 300));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 325));
		g.draw(wall[tmp++] = drawWall(g, walls, 500, 325));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 350));
		g.draw(wall[tmp++] = drawWall(g, walls, 500, 350));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 375));
		g.draw(wall[tmp++] = drawWall(g, walls, 225, 375));
		g.draw(wall[tmp++] = drawWall(g, walls, 250, 375));
		g.draw(wall[tmp++] = drawWall(g, walls, 300, 375));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 375));
		g.draw(wall[tmp++] = drawWall(g, walls, 375, 375));
		g.draw(wall[tmp++] = drawWall(g, walls, 400, 375));
		g.draw(wall[tmp++] = drawWall(g, walls, 500, 375));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 400));
		for(int i = tmp, j = 0; tmp < i + 2; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 225 + j * 25, 400));
		for(int i = tmp, j = 0; tmp < i + 2; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 300 + j * 25, 400));
		for(int i = tmp, j = 0; tmp < i + 2; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 375 + j * 25, 400));
		for(int i = tmp, j = 0; tmp < i + 2; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 300 + j * 25, 425));
		for(int i = tmp, j = 0; tmp < i + 6; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 250 + j * 25, 450));
		g.draw(wall[tmp++] = drawWall(g, walls, 250, 425));
		g.draw(wall[tmp++] = drawWall(g, walls, 375, 425));
		g.draw(wall[tmp++] = drawWall(g, walls, 500, 400));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 425));
		g.draw(wall[tmp++] = drawWall(g, walls, 225, 425));
		g.draw(wall[tmp++] = drawWall(g, walls, 400, 425));
		g.draw(wall[tmp++] = drawWall(g, walls, 500, 425));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 450));
		g.draw(wall[tmp++] = drawWall(g, walls, 225, 450));
		for(int i = tmp, j = 0; tmp < i + 5; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 400 + j * 25, 450));
		g.draw(wall[tmp++] = drawWall(g, walls, 175, 475));
		g.draw(wall[tmp++] = drawWall(g, walls, 225, 475));
		for(int i = tmp, j = 0; tmp < i + 3; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 175 + j * 25, 500));
	}
	private static void createEnemies1(Graphics g, Image image)
	{
		enemies1 = new Enemy1[0];
		isEnemy1Created = true;
	}
	private static void drawEnemies1(Graphics g, Image image)
	{
		if(!isEnemy1Created)
			createEnemies1(g, image);
		for(Enemy1 enemy1: enemies1)
		{
			enemy1.draw();
		}
	}
	private static void createEnemies2(Graphics g, Image image)
	{
		enemies2 = new Enemy2[11];
		enemies2[0] = new Enemy2(g, image, 350, 275, false);
		enemies2[1] = new Enemy2(g, image, 275, 275, false);
		enemies2[2] = new Enemy2(g, image, 200, 475, false);
		enemies2[3] = new Enemy2(g, image, 275, 200, false);
		enemies2[4] = new Enemy2(g, image, 300, 175, false);
		enemies2[5] = new Enemy2(g, image, 325, 150, false);
		enemies2[6] = new Enemy2(g, image, 350, 125, false);
		enemies2[7] = new Enemy2(g, image, 425, 200, false);
		enemies2[8] = new Enemy2(g, image, 450, 175, false);
		enemies2[9] = new Enemy2(g, image, 475, 150, false);
		enemies2[10] = new Enemy2(g, image, 500, 125, false);
		isEnemy2Created = true;
	}
	private static void drawEnemies2(Graphics g, Image image)
	{
		if(!isEnemy2Created)
			createEnemies2(g, image);
		for(Enemy2 enemy2: enemies2)
		{
			enemy2.draw();
		}
	}
	private static void createEnemies3(Graphics g, Image image)
	{
		enemies3 = new Enemy3[0];
		isEnemy3Created = true;
	}
	private static void drawEnemies3(Graphics g, Image image)
	{
		if(!isEnemy3Created)
			createEnemies3(g, image);
		for(Enemy3 enemy3: enemies3)
		{
			enemy3.draw();
		}
	}
	private static void createEnemies4(Graphics g, Image image)
	{
		enemies4 = new Enemy4[0];
		isEnemy4Created = true;
	}
	private static void drawEnemies4(Graphics g, Image image)
	{
		if(!isEnemy4Created)
			createEnemies4(g, image);
		for(Enemy4 enemy4: enemies4)
		{
			enemy4.draw();
		}
	}
	private static void createEnemies5(Graphics g, Image image)
	{
		enemies5 = new Enemy5[0];
		isEnemy5Created = true;
	}
	private static void drawEnemies5(Graphics g, Image image)
	{
		if(!isEnemy5Created)
			createEnemies5(g, image);
		for(Enemy5 enemy: enemies5)
		{
			enemy.draw();
		}
	}
	private static void createMovableObjects(Graphics g, Image image)
	{
		movableObjects = new MovableObject[0];
		isMovableObjectCreated = true;
	}
	private static void drawMovableObjects(Graphics g, Image image)
	{
		if(!isMovableObjectCreated)
			createMovableObjects(g, image);
		for(MovableObject movableObject: movableObjects)
		{
			movableObject.draw();
		}
	}
	private static void createPressurePlate1(Graphics g, Image image)
	{
		pressurePlate1 = new PressurePlate[0];
		isPressurePlate1Created = true;
	}
	private static void drawPressurePlate1(Graphics g, Image image)
	{
		if(!isPressurePlate1Created)
			createPressurePlate1(g, image);
		for(PressurePlate pressurePlate: pressurePlate1)
		{
			pressurePlate.draw();
		}
	}
	private static void createUnlockableWall1Objects(Graphics g, Image image)
	{
		unlockableWalls1 = new UnlockableWall[0];
		isUnlockableWall1Created = true;
	}
	private static void drawUnlockableWall1Objects(Graphics g, Image image)
	{
		if(!isUnlockableWall1Created)
			createUnlockableWall1Objects(g, image);
		for(UnlockableWall unlockableWall: unlockableWalls1)
		{
			unlockableWall.draw();
		}
	}
	private static void createPressurePlate2(Graphics g, Image image)
	{
		pressurePlate2 = new PressurePlate[0];
		isPressurePlate2Created = true;
	}
	private static void drawPressurePlate2(Graphics g, Image image)
	{
		if(!isPressurePlate2Created)
			createPressurePlate2(g, image);
		for(PressurePlate pressurePlate: pressurePlate2)
		{
			pressurePlate.draw();
		}
	}
	private static void createUnlockableWall2Objects(Graphics g, Image image)
	{
		unlockableWalls2 = new UnlockableWall[0];
		isUnlockableWall2Created = true;
	}
	private static void drawUnlockableWall2Objects(Graphics g, Image image)
	{
		if(!isUnlockableWall2Created)
			createUnlockableWall2Objects(g, image);
		for(UnlockableWall unlockableWall: unlockableWalls2)
		{
			unlockableWall.draw();
		}
	}
	private static void createPressurePlate3(Graphics g, Image image)
	{
		pressurePlate3 = new PressurePlate[0];
		isPressurePlate3Created = true;
	}
	private static void drawPressurePlate3(Graphics g, Image image)
	{
		if(!isPressurePlate3Created)
			createPressurePlate3(g, image);
		for(PressurePlate pressurePlate: pressurePlate3)
		{
			pressurePlate.draw();
		}
	}
	private static void createUnlockableWall3Objects(Graphics g, Image image)
	{
		unlockableWalls3 = new UnlockableWall[0];
		isUnlockableWall3Created = true;
	}
	private static void drawUnlockableWall3Objects(Graphics g, Image image)
	{
		if(!isUnlockableWall3Created)
			createUnlockableWall3Objects(g, image);
		for(UnlockableWall unlockableWall: unlockableWalls3)
		{
			unlockableWall.draw();
		}
	}
	private static void createPressurePlate4(Graphics g, Image image)
	{
		pressurePlate4 = new PressurePlate[0];
		isPressurePlate4Created = true;
	}
	private static void drawPressurePlate4(Graphics g, Image image)
	{
		if(!isPressurePlate4Created)
			createPressurePlate4(g, image);
		for(PressurePlate pressurePlate: pressurePlate4)
		{
			pressurePlate.draw();
		}
	}
	private static void createUnlockableWall4Objects(Graphics g, Image image)
	{
		unlockableWalls4 = new UnlockableWall[0];
		isUnlockableWall4Created = true;
	}
	private static void drawUnlockableWall4Objects(Graphics g, Image image)
	{
		if(!isUnlockableWall4Created)
			createUnlockableWall4Objects(g, image);
		for(UnlockableWall unlockableWall: unlockableWalls4)
		{
			unlockableWall.draw();
		}
	}
	private static void createPressurePlate5(Graphics g, Image image)
	{
		pressurePlate5 = new PressurePlate[0];
		isPressurePlate5Created = true;
	}
	private static void drawPressurePlate5(Graphics g, Image image)
	{
		if(!isPressurePlate5Created)
			createPressurePlate5(g, image);
		for(PressurePlate pressurePlate: pressurePlate5)
		{
			pressurePlate.draw();
		}
	}
	private static void createUnlockableWall5Objects(Graphics g, Image image)
	{
		unlockableWalls5 = new UnlockableWall[0];
		isUnlockableWall5Created = true;
	}
	private static void drawUnlockableWall5Objects(Graphics g, Image image)
	{
		if(!isUnlockableWall5Created)
			createUnlockableWall5Objects(g, image);
		for(UnlockableWall unlockableWall: unlockableWalls5)
		{
			unlockableWall.draw();
		}
	}
}
