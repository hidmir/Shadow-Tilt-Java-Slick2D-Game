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

public class Level6 extends Levels
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
		player = new Player(g, image, 475, 425);
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
		levelEnd = new Rectangle(300+1, 350, 24, 24);
		image.draw(300+1, 350, 0.125f);
		g.setColor(Color.transparent);
		g.draw(levelEnd);
	}
	private static void drawWalls(Graphics g, Image walls)
	{	
		wall = new Rectangle[192];
		int tmp = 0;
		for(int i = tmp, j = 0; tmp < i + 20; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 150 + j *25, 50));
		for(int i = tmp, j = 0; tmp < i + 20; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 150 + j *25, 525));
		for(int i = tmp, j = 0; tmp < i + 18; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 150 , 75 + j * 25));
		for(int i = tmp, j = 0; tmp < i + 18; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 625 , 75 + j * 25));
		for(int i = tmp, j = 0; tmp < i + 3; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 350 + j *25, 75));
		g.draw(wall[tmp++] = drawWall(g, walls, 350, 100));
		for(int i = tmp, j = 0; tmp < i + 8; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 400 + j *25, 100));
		for(int i = tmp, j = 0; tmp < i + 4; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 275 + j *25, 125));
		g.draw(wall[tmp++] = drawWall(g, walls, 400, 125));
		g.draw(wall[tmp++] = drawWall(g, walls, 275, 150));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 150));
		g.draw(wall[tmp++] = drawWall(g, walls, 350, 150));
		for(int i = tmp, j = 0; tmp < i + 4; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 400 + j *25, 150));
		for(int i = tmp, j = 0; tmp < i + 5; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 175 + j *25, 175));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 175));
		g.draw(wall[tmp++] = drawWall(g, walls, 350, 175));
		g.draw(wall[tmp++] = drawWall(g, walls, 400, 175));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 225));
		g.draw(wall[tmp++] = drawWall(g, walls, 350, 225));
		g.draw(wall[tmp++] = drawWall(g, walls, 400, 225));
		g.draw(wall[tmp++] = drawWall(g, walls, 425, 225));
		for(int i = tmp, j = 0; tmp < i + 5; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 175 + j *25, 250));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 250));
		g.draw(wall[tmp++] = drawWall(g, walls, 425, 250));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 275));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 300));
		g.draw(wall[tmp++] = drawWall(g, walls, 425, 300));
		for(int i = tmp, j = 0; tmp < i + 4; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 525 + j *25, 300));
		for(int i = tmp, j = 0; tmp < i + 5; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 175 + j *25, 325));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 325));
		g.draw(wall[tmp++] = drawWall(g, walls, 425, 325));
		g.draw(wall[tmp++] = drawWall(g, walls, 275, 350));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 350));
		g.draw(wall[tmp++] = drawWall(g, walls, 425, 350));
		g.draw(wall[tmp++] = drawWall(g, walls, 525, 350));
		for(int i = tmp, j = 0; tmp < i + 5; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 225 + j *25, 375));
		g.draw(wall[tmp++] = drawWall(g, walls, 375, 375));
		for(int i = tmp, j = 0; tmp < i + 5; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 425 + j *25, 375));
		g.draw(wall[tmp++] = drawWall(g, walls, 225, 400));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 400));
		g.draw(wall[tmp++] = drawWall(g, walls, 425, 400));
		g.draw(wall[tmp++] = drawWall(g, walls, 525, 400));
		g.draw(wall[tmp++] = drawWall(g, walls, 225, 425));
		g.draw(wall[tmp++] = drawWall(g, walls, 525, 425));
		g.draw(wall[tmp++] = drawWall(g, walls, 225, 450));
		g.draw(wall[tmp++] = drawWall(g, walls, 325, 450));
		g.draw(wall[tmp++] = drawWall(g, walls, 425, 450));
		g.draw(wall[tmp++] = drawWall(g, walls, 525, 450));
		for(int i = tmp, j = 0; tmp < i + 5; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 225 + j *25, 475));
		for(int i = tmp, j = 0; tmp < i + 5; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 425 + j *25, 475));
		for(int i = tmp, j = 0; tmp < i + 5; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 225 + j *25, 500));
		for(int i = tmp, j = 0; tmp < i + 5; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 425 + j *25, 500));
		for(int i = tmp, j = 0; tmp < i + 7; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 575 , 125 + j * 25));
		for(int i = tmp, j = 0; tmp < i + 3; tmp++, j++)
			g.draw(wall[tmp] = drawWall(g, walls, 525 , 225 + j * 25));
		g.draw(wall[tmp++] = drawWall(g, walls, 275, 400));
		g.draw(wall[tmp++] = drawWall(g, walls, 250, 425));
		g.draw(wall[tmp++] = drawWall(g, walls, 275, 450));
		g.draw(wall[tmp++] = drawWall(g, walls, 450, 325));
	}
	private static void createEnemies1(Graphics g, Image image)
	{
		enemies1 = new Enemy1[5];
		enemies1[0] = new Enemy1(g, image, 425, 125, true);
		enemies1[1] = new Enemy1(g, image, 175, 200, true);
		enemies1[2] = new Enemy1(g, image, 175, 225, true);
		enemies1[3] = new Enemy1(g, image, 175, 275, true);
		enemies1[4] = new Enemy1(g, image, 175, 300, true);
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
		enemies2 = new Enemy2[6];
		enemies2[0] = new Enemy2(g, image, 350, 250, false);
		enemies2[1] = new Enemy2(g, image, 375, 100, false);
		enemies2[2] = new Enemy2(g, image, 400, 250, false);
		enemies2[3] = new Enemy2(g, image, 550, 275, true);
		enemies2[4] = new Enemy2(g, image, 550, 500, true);
		enemies2[5] = new Enemy2(g, image, 600, 500, true);
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
		movableObjects = new MovableObject[3];
		movableObjects[0] = new MovableObject(g, image, 325, 425);
		movableObjects[1] = new MovableObject(g, image, 575, 475);
		movableObjects[2] = new MovableObject(g, image, 300, 175);
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
		pressurePlate1 = new PressurePlate[1];
		pressurePlate1[0] = new PressurePlate(g, image, 275, 425);
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
		unlockableWalls1 = new UnlockableWall[3];
		unlockableWalls1[0] = new UnlockableWall(g, image, 350, 375, true);
		unlockableWalls1[1] = new UnlockableWall(g, image, 375, 225, true);
		unlockableWalls1[2] = new UnlockableWall(g, image, 400, 375, true);
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
		pressurePlate2 = new PressurePlate[1];
		pressurePlate2[0] = new PressurePlate(g, image, 550, 125);
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
		unlockableWalls2 = new UnlockableWall[4];
		unlockableWalls2[0] = new UnlockableWall(g, image, 550, 225, true);
		unlockableWalls2[1] = new UnlockableWall(g, image, 475, 125, false);
		unlockableWalls2[2] = new UnlockableWall(g, image, 400, 200, false);
		unlockableWalls2[3] = new UnlockableWall(g, image, 350, 200, false);
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
		pressurePlate3 = new PressurePlate[1];
		pressurePlate3[0] = new PressurePlate(g, image, 300, 150);
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
		unlockableWalls3 = new UnlockableWall[6];
		unlockableWalls3[0] = new UnlockableWall(g, image, 275, 200, false);
		unlockableWalls3[1] = new UnlockableWall(g, image, 275, 225, true);
		unlockableWalls3[2] = new UnlockableWall(g, image, 275, 225, false);
		unlockableWalls3[3] = new UnlockableWall(g, image, 300, 225, true);
		unlockableWalls3[4] = new UnlockableWall(g, image, 275, 275, false);
		unlockableWalls3[5] = new UnlockableWall(g, image, 275, 300, false);
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
