package Game.Levels;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import Game.Enemies.Enemy1;
import Game.Enemies.Enemy2;
import Game.Enemies.Enemy3;
import Game.Enemies.Enemy4;
import Game.Enemies.Enemy5;
import Game.Objects.MovableObject;
import Game.Objects.Player;
import Game.Objects.PressurePlate;
import Game.Objects.UnlockableWall;

public class Levels 
{
	protected static boolean isEnemy1Created = false;
	protected static boolean isEnemy2Created = false;
	protected static boolean isEnemy3Created = false;
	protected static boolean isEnemy4Created = false;
	protected static boolean isEnemy5Created = false;
	protected static boolean isPlayerCreated = false;
	protected static boolean isMovableObjectCreated = false;
	protected static boolean isPressurePlate1Created = false;
	protected static boolean isUnlockableWall1Created = false;
	protected static boolean isPressurePlate2Created = false;
	protected static boolean isUnlockableWall2Created = false;
	protected static boolean isPressurePlate3Created = false;
	protected static boolean isUnlockableWall3Created = false;
	protected static boolean isPressurePlate4Created = false;
	protected static boolean isUnlockableWall4Created = false;
	protected static boolean isPressurePlate5Created = false;
	protected static boolean isUnlockableWall5Created = false;
	protected static PressurePlate[] pressurePlate1 = null;
	protected static UnlockableWall[] unlockableWalls1 = null;
	protected static PressurePlate[] pressurePlate2 = null;
	protected static UnlockableWall[] unlockableWalls2 = null;
	protected static PressurePlate[] pressurePlate3 = null;
	protected static UnlockableWall[] unlockableWalls3 = null;
	protected static PressurePlate[] pressurePlate4 = null;
	protected static UnlockableWall[] unlockableWalls4 = null;
	protected static PressurePlate[] pressurePlate5 = null;
	protected static UnlockableWall[] unlockableWalls5 = null;
	protected static Shape levelEnd = null;
	protected static Shape[] wall = null;
	protected static Enemy1[] enemies1 = null;
	protected static Enemy2[] enemies2 = null;
	protected static Enemy3[] enemies3 = null;
	protected static Enemy4[] enemies4 = null;
	protected static Enemy5[] enemies5 = null;
	protected static MovableObject[] movableObjects = null;
	public static Player player = null;
	protected static int time1 = 0;
	
	public static void updateTime(int delta)
	{
		time1 += delta;
	}
	protected static void drawFrame(Graphics g, Image image)
	{
		image.draw(149, 49, 0.5f);
	}
	protected static Shape drawWall(Graphics g, Image wall, int x, int y)
	{
		wall.draw(x + 1, y + 1, 0.125f);
		g.setColor(Color.transparent);
		return new Rectangle(x + 1, y, 24, 24);
	}
	private static Shape[] getEnemies1()
	{
		Shape enemy[] = new Shape[enemies1.length];
		for(int i = 0; i < enemies1.length; i++)
		{
			enemy[i] = enemies1[i].centralCollisionDetector;
		}
		return enemy;
	}
	private static Shape[] getEnemies2()
	{
		Shape enemy[] = new Shape[enemies2.length];
		for(int i = 0; i < enemies2.length; i++)
		{
			enemy[i] = enemies2[i].centralCollisionDetector;
		}
		return enemy;
	}
	private static Shape[] getEnemies3()
	{
		Shape enemy[] = new Shape[enemies3.length];
		for(int i = 0; i < enemies3.length; i++)
		{
			enemy[i] = enemies3[i].centralCollisionDetector;
		}
		return enemy;
	}
	private static Shape[] getEnemies4()
	{
		Shape enemy[] = new Shape[enemies4.length];
		for(int i = 0; i < enemies4.length; i++)
		{
			enemy[i] = enemies4[i].centralCollisionDetector;
		}
		return enemy;
	}
	private static Shape[] getEnemies5()
	{
		Shape enemy[] = new Shape[enemies5.length];
		for(int i = 0; i < enemies5.length; i++)
		{
			enemy[i] = enemies5[i].centralCollisionDetector;
		}
		return enemy;
	}
	public static void movePlayer(Input input)
	{
		player.move(input, wall, getUnlockableWall1(), getUnlockableWall2(), getUnlockableWall3(), getUnlockableWall4(), getUnlockableWall5());
	}
	protected static void moveMovableObjects()
	{
		for(MovableObject movableObject: movableObjects)
		{
			movableObject.move(wall, movableObjects, levelEnd, enemies1, enemies2, enemies3, enemies4, enemies5, player, unlockableWalls1, unlockableWalls2, unlockableWalls3, unlockableWalls4, unlockableWalls5);
		}
	}
	public static void moveEnemies1(int delta)
	{
		for(Enemy1 enemy: enemies1)
		{
			if(!enemyCollisionWithObjects(enemy.leftCollisionDetector) || !enemyCollisionWithObjects(enemy.rightCollisionDetector))
				enemy.move(delta);
			if(enemyCollisionWithObjects(enemy.leftCollisionDetector))
				enemy.rightDirection = true;
			if(enemyCollisionWithObjects(enemy.rightCollisionDetector))
				enemy.rightDirection = false;
		}
	}
	public static void moveEnemies2(int delta)
	{
		for(Enemy2 enemy: enemies2)
		{
			if(!enemyCollisionWithObjects(enemy.topCollisionDetector) || !enemyCollisionWithObjects(enemy.bottomCollisionDetector))
				enemy.move(delta);
			if(enemyCollisionWithObjects(enemy.bottomCollisionDetector))
				enemy.upDirection = true;
			if(enemyCollisionWithObjects(enemy.topCollisionDetector))
				enemy.upDirection = false;
		}
	}
	public static void moveEnemies3(int delta)
	{
		for(Enemy3 enemy: enemies3)
		{
			if(!enemyCollisionWithObjects(enemy.topCollisionDetector) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector) && !enemyCollisionWithObjects(enemy.rightCollisionDetector) && !enemyCollisionWithObjects(enemy.leftCollisionDetector))
				enemy.move(delta, true, true, true, true);
			else if((!enemyCollisionWithObjects(enemy.topCollisionDetector) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector) && enemyCollisionWithObjects(enemy.rightCollisionDetector) && !enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, true, true, false, true);
			else if((!enemyCollisionWithObjects(enemy.topCollisionDetector) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector) && !enemyCollisionWithObjects(enemy.rightCollisionDetector) && enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, true, true, true, false);
			else if((!enemyCollisionWithObjects(enemy.topCollisionDetector) && enemyCollisionWithObjects(enemy.bottomCollisionDetector) && !enemyCollisionWithObjects(enemy.rightCollisionDetector) && !enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, true, false, true, true);
			else if((enemyCollisionWithObjects(enemy.topCollisionDetector) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector) && !enemyCollisionWithObjects(enemy.rightCollisionDetector) && !enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, false, true, true, true);
			else if((!enemyCollisionWithObjects(enemy.topCollisionDetector) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector) && enemyCollisionWithObjects(enemy.rightCollisionDetector) && enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, true, true, false, false);
			else if((!enemyCollisionWithObjects(enemy.topCollisionDetector) && enemyCollisionWithObjects(enemy.bottomCollisionDetector) && enemyCollisionWithObjects(enemy.rightCollisionDetector) && !enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, true, false, false, true);
			else if((!enemyCollisionWithObjects(enemy.topCollisionDetector) && enemyCollisionWithObjects(enemy.bottomCollisionDetector) && !enemyCollisionWithObjects(enemy.rightCollisionDetector) && enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, true, false, true, false);
			else if((enemyCollisionWithObjects(enemy.topCollisionDetector) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector) && enemyCollisionWithObjects(enemy.rightCollisionDetector) && !enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, false, true, false, true);
			else if((enemyCollisionWithObjects(enemy.topCollisionDetector) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector) && !enemyCollisionWithObjects(enemy.rightCollisionDetector) && enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, false, true, true, false);
			else if((enemyCollisionWithObjects(enemy.topCollisionDetector) && enemyCollisionWithObjects(enemy.bottomCollisionDetector) && !enemyCollisionWithObjects(enemy.rightCollisionDetector) && !enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, false, false, true, true);
			else if((!enemyCollisionWithObjects(enemy.topCollisionDetector) && enemyCollisionWithObjects(enemy.bottomCollisionDetector) && enemyCollisionWithObjects(enemy.rightCollisionDetector) && enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, true, false, false, true);
			else if((enemyCollisionWithObjects(enemy.topCollisionDetector) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector) && enemyCollisionWithObjects(enemy.rightCollisionDetector) && enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, false, true, false, false);
			else if((enemyCollisionWithObjects(enemy.topCollisionDetector) && enemyCollisionWithObjects(enemy.bottomCollisionDetector) && !enemyCollisionWithObjects(enemy.rightCollisionDetector) && enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, false, false, true, false);
			else if((enemyCollisionWithObjects(enemy.topCollisionDetector) && enemyCollisionWithObjects(enemy.bottomCollisionDetector) && enemyCollisionWithObjects(enemy.rightCollisionDetector) && !enemyCollisionWithObjects(enemy.leftCollisionDetector)))
				enemy.move(delta, false, false, false, true);
		}
	}
	public static void moveEnemies4(int delta)
	{
		for(Enemy4 enemy: enemies4)
		{
			if(enemy.detectPlayerOnX(player.getCentralCollisionDetector()))
			{
				enemy.moveWallCollisionDetectorToPlayerCoordinatesOnX(player.getX());
				if(!enemyCollisionWithObjects(enemy.getWallCollisionDetector()) && !enemyCollisionWithEnemy4(enemy.getWallCollisionDetector()) && !enemyCollisionWithAdditionalCollisionDetector(enemy.getWallCollisionDetector()))
				{
					enemy.moveAdditionalCollisionDetectorToPlayerCoordinatesOnX(player.getX());
					enemy.moveToPlayerCoordinatesOnX(player.getX(), player.getY());
				}
			}
			else if(enemy.detectPlayerOnY(player.getCentralCollisionDetector()))
			{
				enemy.moveWallCollisionDetectorToPlayerCoordinatesOnY(player.getY());
				if(!enemyCollisionWithObjects(enemy.getWallCollisionDetector()) && !enemyCollisionWithEnemy4(enemy.getWallCollisionDetector()) && !enemyCollisionWithAdditionalCollisionDetector(enemy.getWallCollisionDetector()))
				{
					enemy.moveAdditionalCollisionDetectorToPlayerCoordinatesOnY(player.getY());
					enemy.moveToPlayerCoordinatesOnY(player.getX(), player.getY());
				}
			}
			if(enemy.getMoveToPlayerCoordinatesValue())
			{
				enemy.moveWallCollisionDetectorToPlayerCoordinatesOnXAndY();
				if(!enemyCollisionWithObjects(enemy.getWallCollisionDetector()) && !enemyCollisionWithAdditionalCollisionDetector(enemy.getWallCollisionDetector()))
				{
					enemy.moveToPlayerCoordinatesOnXAndY(delta);
					enemy.moveAdditionalCollisionDetectorToPlayerCoordinatesOnXAndY();
				}
			}
		}
	}
	public static void moveEnemies5(int delta)
	{
		for(Enemy5 enemy: enemies5)
		{
			if(enemy.detectPlayerOnRight(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.rightCollisionDetector))
				enemy.moveRight(delta);
			else if(enemy.detectPlayerOnBottom(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector))
				enemy.moveDown(delta);
			else if(enemy.detectPlayerOnLeft(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.leftCollisionDetector))
				enemy.moveLeft(delta);
			else if(enemy.detectPlayerOnTop(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.topCollisionDetector))
				enemy.moveUp(delta);
			
			else if(enemy.detectPlayerOnTopRight(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.topRightCollisionDetector) && !enemyCollisionWithObjects(enemy.topCollisionDetector) && !enemyCollisionWithObjects(enemy.rightCollisionDetector))
				enemy.moveUpRight(delta);
			else if(enemy.detectPlayerOnTopRight(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.topCollisionDetector))
				enemy.moveUp(delta);
			else if(enemy.detectPlayerOnTopRight(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.rightCollisionDetector))
				enemy.moveRight(delta);
			
			else if(enemy.detectPlayerOnBottomRight(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.bottomRightCollisionDetector) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector) && !enemyCollisionWithObjects(enemy.rightCollisionDetector))
				enemy.moveDownRight(delta);
			else if(enemy.detectPlayerOnBottomRight(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector))
				enemy.moveDown(delta);
			else if(enemy.detectPlayerOnBottomRight(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.rightCollisionDetector))
				enemy.moveRight(delta);
			
			else if(enemy.detectPlayerOnBottomLeft(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.bottomLeftCollisionDetector) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector) && !enemyCollisionWithObjects(enemy.leftCollisionDetector))
				enemy.moveDownLeft(delta);
			else if(enemy.detectPlayerOnBottomLeft(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.bottomCollisionDetector))
				enemy.moveDown(delta);
			else if(enemy.detectPlayerOnBottomLeft(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.leftCollisionDetector))
				enemy.moveLeft(delta);
			
			else if(enemy.detectPlayerOnTopLeft(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.topLeftCollisionDetector) && !enemyCollisionWithObjects(enemy.topCollisionDetector) && !enemyCollisionWithObjects(enemy.leftCollisionDetector))
				enemy.moveUpLeft(delta);
			else if(enemy.detectPlayerOnTopLeft(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.topCollisionDetector))
				enemy.moveUp(delta);
			else if(enemy.detectPlayerOnTopLeft(player.getCentralCollisionDetector()) && !enemyCollisionWithObjects(enemy.leftCollisionDetector))
				enemy.moveLeft(delta);
		}
	}
	public static boolean playerDeath()
	{
		if(player.death(getEnemies1()))
			return true;
		if(player.death(getEnemies2()))
			return true;
		if(player.death(getEnemies3()))
			return true;
		if(player.death(getEnemies4()))
			return true;
		if(player.death(getEnemies5()))
			return true;
		return false;
	}
	public static boolean quitGame(Input input)
	{
		return player.quitGame(input);
	}
	public static boolean completeLevel()
	{
		return player.completeLevel(levelEnd);
	}
	public static boolean resetGame(Input input)
	{
		return player.resetGame(input);
	}
	private static void resetPlayerPosition()
	{
		player.resetCoordinates();
	}
	private static void resetEnemies1Position()
	{
		for(Enemy1 enemy: enemies1)
		{
			enemy.resetPosition();
		}
	}
	private static void resetEnemies2Position()
	{
		for(Enemy2 enemy: enemies2)
		{
			enemy.resetPosition();
		}
	}
	private static void resetEnemies3Position()
	{
		for(Enemy3 enemy: enemies3)
		{
			enemy.resetPosition();
		}
	}
	private static void resetEnemies4Position()
	{
		for(Enemy4 enemy: enemies4)
		{
			enemy.resetPosition();
		}
	}
	private static void resetEnemies5Position()
	{
		for(Enemy5 enemy: enemies5)
		{
			enemy.resetPosition();
		}
	}
	private static void resetMovableObjectsPosition()
	{
		for(MovableObject movableObject: movableObjects)
		{
			movableObject.resetPosition();
		}
	}
	private static void resetUnlockableWallsPosition()
	{
		for(UnlockableWall unlockableWall: unlockableWalls1)
		{
			unlockableWall.resetPosition();
		}
		for(UnlockableWall unlockableWall: unlockableWalls2)
		{
			unlockableWall.resetPosition();
		}
		for(UnlockableWall unlockableWall: unlockableWalls3)
		{
			unlockableWall.resetPosition();
		}
		for(UnlockableWall unlockableWall: unlockableWalls4)
		{
			unlockableWall.resetPosition();
		}
		for(UnlockableWall unlockableWall: unlockableWalls5)
		{
			unlockableWall.resetPosition();
		}
	}
	public static void resetObjectsPosition()
	{
		resetPlayerPosition();
		resetEnemies1Position();
		resetEnemies2Position();
		resetEnemies3Position();
		resetEnemies4Position();
		resetEnemies5Position();
		resetMovableObjectsPosition();
		resetUnlockableWallsPosition();
	}
	public static void clearObjects()
	{
		isEnemy1Created = false;
		isEnemy2Created = false;
		isEnemy3Created = false;
		isEnemy4Created = false;
		isEnemy5Created = false;
		isPlayerCreated = false;
		isMovableObjectCreated = false;
		isPressurePlate1Created = false;
		isUnlockableWall1Created = false;
		isPressurePlate2Created = false;
		isUnlockableWall2Created = false;
		isPressurePlate3Created = false;
		isUnlockableWall3Created = false;
		isPressurePlate4Created = false;
		isUnlockableWall4Created = false;
		isPressurePlate5Created = false;
		isUnlockableWall5Created = false;
	}
	private static boolean enemyCollisionWithEnemy4(Shape enemy)
	{
		boolean collision = false;
		for(Enemy4 enemy4: enemies4)
		{
			if(!collision)
				if(enemy.intersects(enemy4.centralCollisionDetector))
					collision = true;
		}
		return collision;
	}
	private static boolean enemyCollisionWithAdditionalCollisionDetector(Shape enemy)
	{
		boolean collision = false;
		for(Enemy4 enemy4: enemies4)
		{
			if(!collision)
				if(enemy.intersects(enemy4.additionalCollisionDetector))
					collision = true;
		}
		return collision;
	}
	private static boolean enemyCollisionWithObjects(Shape enemy)
	{
		boolean collision = false;
		for(Shape wall: wall)
		{
			if(!collision)
				if(enemy.intersects(wall))
					collision = true;
		}
		for(MovableObject movableObject: movableObjects)
		{
			if(!collision)
				if(enemy.intersects(movableObject.centralCollisionDetector))
					collision = true;
		}
		for(UnlockableWall unlockableWall: unlockableWalls1)
		{
			if(!collision)
				if(enemy.intersects(unlockableWall.collisionDetector))
					collision = true;
		}
		for(UnlockableWall unlockableWall: unlockableWalls2)
		{
			if(!collision)
				if(enemy.intersects(unlockableWall.collisionDetector))
					collision = true;
		}
		for(UnlockableWall unlockableWall: unlockableWalls3)
		{
			if(!collision)
				if(enemy.intersects(unlockableWall.collisionDetector))
					collision = true;
		}
		for(UnlockableWall unlockableWall: unlockableWalls4)
		{
			if(!collision)
				if(enemy.intersects(unlockableWall.collisionDetector))
					collision = true;
		}
		for(UnlockableWall unlockableWall: unlockableWalls5)
		{
			if(!collision)
				if(enemy.intersects(unlockableWall.collisionDetector))
					collision = true;
		}
		if(!collision)
			if(enemy.intersects(levelEnd))
				collision = true;
		return collision;
	}
	private static Shape[] getUnlockableWall1()
	{
		Shape unlockableWalls[] = new Shape[unlockableWalls1.length];
		for(int i = 0; i < unlockableWalls1.length; i++)
		{
			unlockableWalls[i] = unlockableWalls1[i].collisionDetector;
		}
		return unlockableWalls;
	}
	private static boolean pressurePlate1CollisionWithMovableObject()
	{
		boolean collision = false;
		for(PressurePlate unlockObject: pressurePlate1)
		{
			for(MovableObject movableObject: movableObjects)
			{
				if(!collision)
					if(unlockObject.collisionDetector.intersects(movableObject.centralCollisionDetector))
						collision = true;
			}
		}
		return collision;
	}
	public static void unlockWall1()
	{
		if(pressurePlate1CollisionWithMovableObject())
		{
			for(PressurePlate unlockObject: pressurePlate1)
			{
				unlockObject.unlockWall(unlockableWalls1);
			}
		}
	}
	private static Shape[] getUnlockableWall2()
	{
		Shape unlockableWalls[] = new Shape[unlockableWalls2.length];
		for(int i = 0; i < unlockableWalls2.length; i++)
		{
			unlockableWalls[i] = unlockableWalls2[i].collisionDetector;
		}
		return unlockableWalls;
	}
	private static boolean pressurePlate2CollisionWithMovableObject()
	{
		boolean collision = false;
		for(PressurePlate unlockObject: pressurePlate2)
		{
			for(MovableObject movableObject: movableObjects)
			{
				if(!collision)
					if(unlockObject.collisionDetector.intersects(movableObject.centralCollisionDetector))
						collision = true;
			}
		}
		return collision;
	}
	public static void unlockWall2()
	{
		if(pressurePlate2CollisionWithMovableObject())
		{
			for(PressurePlate unlockObject: pressurePlate2)
			{
				unlockObject.unlockWall(unlockableWalls2);
			}
		}
	}
	private static Shape[] getUnlockableWall3()
	{
		Shape unlockableWalls[] = new Shape[unlockableWalls3.length];
		for(int i = 0; i < unlockableWalls3.length; i++)
		{
			unlockableWalls[i] = unlockableWalls3[i].collisionDetector;
		}
		return unlockableWalls;
	}
	private static boolean pressurePlate3CollisionWithMovableObject()
	{
		boolean collision = false;
		for(PressurePlate unlockObject: pressurePlate3)
		{
			for(MovableObject movableObject: movableObjects)
			{
				if(!collision)
					if(unlockObject.collisionDetector.intersects(movableObject.centralCollisionDetector))
						collision = true;
			}
		}
		return collision;
	}
	public static void unlockWall3()
	{
		if(pressurePlate3CollisionWithMovableObject())
		{
			for(PressurePlate unlockObject: pressurePlate3)
			{
				unlockObject.unlockWall(unlockableWalls3);
			}
		}
	}
	private static Shape[] getUnlockableWall4()
	{
		Shape unlockableWalls[] = new Shape[unlockableWalls4.length];
		for(int i = 0; i < unlockableWalls4.length; i++)
		{
			unlockableWalls[i] = unlockableWalls4[i].collisionDetector;
		}
		return unlockableWalls;
	}
	private static boolean pressurePlate4CollisionWithMovableObject()
	{
		boolean collision = false;
		for(PressurePlate unlockObject: pressurePlate4)
		{
			for(MovableObject movableObject: movableObjects)
			{
				if(!collision)
					if(unlockObject.collisionDetector.intersects(movableObject.centralCollisionDetector))
						collision = true;
			}
		}
		return collision;
	}
	public static void unlockWall4()
	{
		if(pressurePlate4CollisionWithMovableObject())
		{
			for(PressurePlate unlockObject: pressurePlate4)
			{
				unlockObject.unlockWall(unlockableWalls4);
			}
		}
	}
	private static Shape[] getUnlockableWall5()
	{
		Shape unlockableWalls[] = new Shape[unlockableWalls5.length];
		for(int i = 0; i < unlockableWalls5.length; i++)
		{
			unlockableWalls[i] = unlockableWalls5[i].collisionDetector;
		}
		return unlockableWalls;
	}
	private static boolean pressurePlate5CollisionWithMovableObject()
	{
		boolean collision = false;
		for(PressurePlate unlockObject: pressurePlate5)
		{
			for(MovableObject movableObject: movableObjects)
			{
				if(!collision)
					if(unlockObject.collisionDetector.intersects(movableObject.centralCollisionDetector))
						collision = true;
			}
		}
		return collision;
	}
	public static void unlockWall5()
	{
		if(pressurePlate5CollisionWithMovableObject())
		{
			for(PressurePlate unlockObject: pressurePlate5)
			{
				unlockObject.unlockWall(unlockableWalls5);
			}
		}
	}
}
