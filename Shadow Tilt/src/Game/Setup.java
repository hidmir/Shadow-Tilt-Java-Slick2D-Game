package Game;

import java.io.IOException;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.ScalableGame;
import org.newdawn.slick.SlickException;

import Game.Levels.Levels;
import Game.Menu.Introduction;
import Game.Menu.LevelsMenu;
import Game.Menu.MainMenu;
import Game.Menu.OptionsMenu;
import Game.Menu.SkinSelectMenu;
import Game.Properties.PropertyValues;
import Game.Levels.Level1;
import Game.Levels.Level10;
import Game.Levels.Level11;
import Game.Levels.Level2;
import Game.Levels.Level3;
import Game.Levels.Level4;
import Game.Levels.Level5;
import Game.Levels.Level6;
import Game.Levels.Level7;
import Game.Levels.Level8;
import Game.Levels.Level9;

public class Setup extends BasicGame
{
	private int gameState = -1;
	private int time1 = 0;
	private int time2 = 0;
	private int screenWidth = 800;
	private int screenHeight = 600;
	private int actualScreenWidth;
	private int actualScreenHeight;
	private int selectedSkin = 0;
	private static int totalDeaths = 0;
	private Image wall = null;
	private Image player = null;
	private Image[] playerDeath = new Image[3];
	private Image playerSkin1 = null;
	private Image[] playerDeath1 = new Image[3];
	private Image playerSkin2 = null;
	private Image[] playerDeath2 = new Image[3];
	private Image playerSkin3 = null;
	private Image[] playerDeath3 = new Image[3];
	private Image playerSkin4 = null;
	private Image[] playerDeath4 = new Image[3];
	private Image[] playerUnlockedSkin = new Image[4];
	private Image playerLockedSkin = null;
	private Image levelEnd = null;
	private Image movableObject = null;
	private Image enemy1 = null;
	private Image enemy2 = null;
	private Image enemy3 = null;
	private Image enemy4 = null;
	private Image enemy5 = null;
	private Image[] mainMenu = new Image[6];
	private Image[] newGame = new Image[5];
	private Image[] changeSkin = new Image[5];
	private Image[] introduction = new Image[5];
	private Image[] options = new Image[5];
	private Image[] exit = new Image[5];
	private Image[] mouse = new Image[4];
	private Image[] description = new Image[3];
	private Image[] levelsMenu = new Image[5];
	private Image[] level1 = new Image[3];
	private Image[] level2 = new Image[3];
	private Image[] level3 = new Image[3];
	private Image[] level4 = new Image[3];
	private Image[] level5 = new Image[3];
	private Image[] level6 = new Image[3];
	private Image[] level7 = new Image[3];
	private Image[] level8 = new Image[3];
	private Image[] level9 = new Image[3];
	private Image[] level10 = new Image[3];
	private Image[] level11 = new Image[3];
	private Image[] level1Completed = new Image[3];
	private Image[] level2Completed = new Image[3];
	private Image[] level3Completed = new Image[3];
	private Image[] level4Completed = new Image[3];
	private Image[] level5Completed = new Image[3];
	private Image[] level6Completed = new Image[3];
	private Image[] level7Completed = new Image[3];
	private Image[] level8Completed = new Image[3];
	private Image[] level9Completed = new Image[3];
	private Image[] level10Completed = new Image[3];
	private Image[] level11Completed = new Image[3];
	private Image[] levelsMenuExit = new Image[3];
	private Image[] lightsAndShadowsLevel1 = new Image[3];
	private Image[] lightsAndShadowsLevel2 = new Image[3];
	private Image[] lightsAndShadowsLevel3 = new Image[3];
	private Image[] lightsAndShadowsLevel4 = new Image[3];
	private Image[] lightsAndShadowsLevel5 = new Image[3];
	private Image[] lightsAndShadowsLevel6 = new Image[3];
	private Image[] lightsAndShadowsLevel7 = new Image[3];
	private Image[] lightsAndShadowsLevel8 = new Image[3];
	private Image[] lightsAndShadowsLevel9 = new Image[3];
	private Image[] lightsAndShadowsLevel10 = new Image[3];
	private Image[] lightsAndShadowsLevel11 = new Image[3];
	private Image[] optionsMenu = new Image[5];
	private Image[] skinSelectMenu = new Image[5];
	private Image board = null;
	private Image[] completedLevels = new Image[11];
	private Image[] uncompletedLevels = new Image[11];
	private Image currentlyUsedMouse = null;
	private Image emptyImage = null;
	private Image background = null;
	private Image background1 = null;
	private Image pressurePlate1 = null;
	private Image unlockableWall1 = null;
	private Image pressurePlate2 = null;
	private Image unlockableWall2 = null;
	private Image pressurePlate3 = null;
	private Image unlockableWall3 = null;
	private Image pressurePlate4 = null;
	private Image unlockableWall4 = null;
	private Image pressurePlate5 = null;
	private Image unlockableWall5 = null;
	private Image unlockableWall6 = null;
	private Input input = null;
	private Image board1 = null;
	private Image[] exit2 = new Image[4];
	private Image[] optionsSave = new Image[4];
	private Image[] optionsCancel = new Image[4];
	private Image[] skinSelectSave = new Image[4];
	private Image[] skinSelectCancel = new Image[4];
	private Image[] skinSelectLeftArrow = new Image[3];
	private Image[] skinSelectRightArrow = new Image[3];
	private Image[] resolution = new Image[9];
	private Image[] resolutionLeftArrow = new Image[3];
	private Image[] resolutionRightArrow = new Image[3];
	private Image[] fullScreenLeftArrow = new Image[3];
	private Image[] fullScreenRightArrow = new Image[3];
	private Image trueImage = null;
	private Image falseImage = null;
	private Image title = null;
	private Image boardWithTotalNumberOfDeaths = null;
	private boolean tmpBoolean = true;
	private boolean fullScreenMode = false;
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
	public Setup(String title) 
	{
		super(title);
	}
	@Override
	public void init(GameContainer container) throws SlickException 
	{
		wall = new Image("images/Objects/wall.png");
		playerSkin1 = new Image("images/Characters/player_1/player_1.png");
		playerDeath1[0] = new Image("images/Characters/player_1/player_2.png");
		playerDeath1[1] = new Image("images/Characters/player_1/player_3.png");
		playerDeath1[2] = new Image("images/Characters/player_1/player_4.png");
		playerSkin2 = new Image("images/Characters/player_2/player_1.png");
		playerDeath2[0] = new Image("images/Characters/player_2/player_2.png");
		playerDeath2[1] = new Image("images/Characters/player_2/player_3.png");
		playerDeath2[2] = new Image("images/Characters/player_2/player_4.png");
		playerSkin3 = new Image("images/Characters/player_3/player_1.png");
		playerDeath3[0] = new Image("images/Characters/player_3/player_2.png");
		playerDeath3[1] = new Image("images/Characters/player_3/player_3.png");
		playerDeath3[2] = new Image("images/Characters/player_3/player_4.png");
		playerSkin4 = new Image("images/Characters/player_4/player_1.png");
		playerDeath4[0] = new Image("images/Characters/player_4/player_2.png");
		playerDeath4[1] = new Image("images/Characters/player_4/player_3.png");
		playerDeath4[2] = new Image("images/Characters/player_4/player_4.png");
		playerUnlockedSkin[0] = new Image("images/Characters/player_1/player_5.png");
		playerUnlockedSkin[1] = new Image("images/Characters/player_2/player_5.png");
		playerUnlockedSkin[2] = new Image("images/Characters/player_3/player_5.png");
		playerUnlockedSkin[3] = new Image("images/Characters/player_4/player_5.png");
		playerLockedSkin = new Image("images/Characters/player_locked.png");
		levelEnd = new Image("images/Objects/end_level_object.png");
		enemy1 = new Image("images/Characters/enemy_1.png");
		enemy2 = new Image("images/Characters/enemy_2.png");
		enemy3 = new Image("images/Characters/enemy_3.png");
		enemy4 = new Image("images/Characters/enemy_4.png");
		enemy5 = new Image("images/Characters/enemy_5.png");
		movableObject = new Image("images/Characters/movable_object.png");
		mainMenu[0] = new Image("images/MainMenu/menu_1.png");
		mainMenu[1] = new Image("images/MainMenu/menu_2.png");
		mainMenu[2] = new Image("images/MainMenu/menu_3.png");
		mainMenu[3] = new Image("images/MainMenu/menu_4.png");
		mainMenu[4] = new Image("images/MainMenu/menu_5.png");
		mainMenu[5] = new Image("images/MainMenu/menu_6.png");
		newGame[0] = new Image("images/MainMenu/new_game_1.png");
		newGame[1] = new Image("images/MainMenu/new_game_2.png");
		newGame[2] = new Image("images/MainMenu/new_game_3.png");
		newGame[3] = new Image("images/MainMenu/new_game_4.png");
		newGame[4] = new Image("images/MainMenu/new_game_5.png");
		changeSkin[0] = new Image("images/MainMenu/change_skin_1.png");
		changeSkin[1] = new Image("images/MainMenu/change_skin_2.png");
		changeSkin[2] = new Image("images/MainMenu/change_skin_3.png");
		changeSkin[3] = new Image("images/MainMenu/change_skin_4.png");
		changeSkin[4] = new Image("images/MainMenu/change_skin_5.png");
		introduction[0] = new Image("images/MainMenu/introduction_1.png");
		introduction[1] = new Image("images/MainMenu/introduction_2.png");
		introduction[2] = new Image("images/MainMenu/introduction_3.png");
		introduction[3] = new Image("images/MainMenu/introduction_4.png");
		introduction[4] = new Image("images/MainMenu/introduction_5.png");
		options[0] = new Image("images/MainMenu/options_1.png");
		options[1] = new Image("images/MainMenu/options_2.png");
		options[2] = new Image("images/MainMenu/options_3.png");
		options[3] = new Image("images/MainMenu/options_4.png");
		options[4] = new Image("images/MainMenu/options_5.png");
		exit[0] = new Image("images/MainMenu/exit_1.png");
		exit[1] = new Image("images/MainMenu/exit_2.png");
		exit[2] = new Image("images/MainMenu/exit_3.png");
		exit[3] = new Image("images/MainMenu/exit_4.png");
		exit[4] = new Image("images/MainMenu/exit_5.png");
		emptyImage = new Image("images/Game/empty_image.png");
		mouse[0] = new Image("images/Game/mouse_1.png");
		mouse[1] = new Image("images/Game/mouse_2.png");
		mouse[2] = new Image("images/Game/mouse_3.png");
		mouse[3] = new Image("images/Game/mouse_4.png");
		description[0] = new Image("images/Introduction/introduction_1.png");
		description[1] = new Image("images/Introduction/introduction_2.png");
		description[2] = new Image("images/Introduction/introduction_3.png");
		levelsMenu[0] = new Image("images/LevelsMenu/levels_menu_1.png");
		levelsMenu[1] = new Image("images/LevelsMenu/levels_menu_2.png");
		levelsMenu[2] = new Image("images/LevelsMenu/levels_menu_3.png");
		levelsMenu[3] = new Image("images/LevelsMenu/levels_menu_4.png");
		levelsMenu[4] = new Image("images/LevelsMenu/levels_menu_5.png");
		level1[0] = new Image("images/LevelsMenu/Uncompleted/level_1_1.png");
		level1[1] = new Image("images/LevelsMenu/Uncompleted/level_1_2.png");
		level1[2] = new Image("images/LevelsMenu/Uncompleted/level_1_3.png");
		level2[0] = new Image("images/LevelsMenu/Uncompleted/level_2_1.png");
		level2[1] = new Image("images/LevelsMenu/Uncompleted/level_2_2.png");
		level2[2] = new Image("images/LevelsMenu/Uncompleted/level_2_3.png");
		level3[0] = new Image("images/LevelsMenu/Uncompleted/level_3_1.png");
		level3[1] = new Image("images/LevelsMenu/Uncompleted/level_3_2.png");
		level3[2] = new Image("images/LevelsMenu/Uncompleted/level_3_3.png");
		level4[0] = new Image("images/LevelsMenu/Uncompleted/level_4_1.png");
		level4[1] = new Image("images/LevelsMenu/Uncompleted/level_4_2.png");
		level4[2] = new Image("images/LevelsMenu/Uncompleted/level_4_3.png");
		level5[0] = new Image("images/LevelsMenu/Uncompleted/level_5_1.png");
		level5[1] = new Image("images/LevelsMenu/Uncompleted/level_5_2.png");
		level5[2] = new Image("images/LevelsMenu/Uncompleted/level_5_3.png");
		level6[0] = new Image("images/LevelsMenu/Uncompleted/level_6_1.png");
		level6[1] = new Image("images/LevelsMenu/Uncompleted/level_6_2.png");
		level6[2] = new Image("images/LevelsMenu/Uncompleted/level_6_3.png");
		level7[0] = new Image("images/LevelsMenu/Uncompleted/level_7_1.png");
		level7[1] = new Image("images/LevelsMenu/Uncompleted/level_7_2.png");
		level7[2] = new Image("images/LevelsMenu/Uncompleted/level_7_3.png");
		level8[0] = new Image("images/LevelsMenu/Uncompleted/level_8_1.png");
		level8[1] = new Image("images/LevelsMenu/Uncompleted/level_8_2.png");
		level8[2] = new Image("images/LevelsMenu/Uncompleted/level_8_3.png");
		level9[0] = new Image("images/LevelsMenu/Uncompleted/level_9_1.png");
		level9[1] = new Image("images/LevelsMenu/Uncompleted/level_9_2.png");
		level9[2] = new Image("images/LevelsMenu/Uncompleted/level_9_3.png");
		level10[0] = new Image("images/LevelsMenu/Uncompleted/level_10_1.png");
		level10[1] = new Image("images/LevelsMenu/Uncompleted/level_10_2.png");
		level10[2] = new Image("images/LevelsMenu/Uncompleted/level_10_3.png");
		level11[0] = new Image("images/LevelsMenu/Uncompleted/level_11_1.png");
		level11[1] = new Image("images/LevelsMenu/Uncompleted/level_11_2.png");
		level11[2] = new Image("images/LevelsMenu/Uncompleted/level_11_3.png");
		level1Completed[0] = new Image("images/LevelsMenu/Completed/level_1_1_completed.png");
		level1Completed[1] = new Image("images/LevelsMenu/Completed/level_1_2_completed.png");
		level1Completed[2] = new Image("images/LevelsMenu/Completed/level_1_3_completed.png");
		level2Completed[0] = new Image("images/LevelsMenu/Completed/level_2_1_completed.png");
		level2Completed[1] = new Image("images/LevelsMenu/Completed/level_2_2_completed.png");
		level2Completed[2] = new Image("images/LevelsMenu/Completed/level_2_3_completed.png");
		level3Completed[0] = new Image("images/LevelsMenu/Completed/level_3_1_completed.png");
		level3Completed[1] = new Image("images/LevelsMenu/Completed/level_3_2_completed.png");
		level3Completed[2] = new Image("images/LevelsMenu/Completed/level_3_3_completed.png");
		level4Completed[0] = new Image("images/LevelsMenu/Completed/level_4_1_completed.png");
		level4Completed[1] = new Image("images/LevelsMenu/Completed/level_4_2_completed.png");
		level4Completed[2] = new Image("images/LevelsMenu/Completed/level_4_3_completed.png");
		level5Completed[0] = new Image("images/LevelsMenu/Completed/level_5_1_completed.png");
		level5Completed[1] = new Image("images/LevelsMenu/Completed/level_5_2_completed.png");
		level5Completed[2] = new Image("images/LevelsMenu/Completed/level_5_3_completed.png");
		level6Completed[0] = new Image("images/LevelsMenu/Completed/level_6_1_completed.png");
		level6Completed[1] = new Image("images/LevelsMenu/Completed/level_6_2_completed.png");
		level6Completed[2] = new Image("images/LevelsMenu/Completed/level_6_3_completed.png");
		level7Completed[0] = new Image("images/LevelsMenu/Completed/level_7_1_completed.png");
		level7Completed[1] = new Image("images/LevelsMenu/Completed/level_7_2_completed.png");
		level7Completed[2] = new Image("images/LevelsMenu/Completed/level_7_3_completed.png");
		level8Completed[0] = new Image("images/LevelsMenu/Completed/level_8_1_completed.png");
		level8Completed[1] = new Image("images/LevelsMenu/Completed/level_8_2_completed.png");
		level8Completed[2] = new Image("images/LevelsMenu/Completed/level_8_3_completed.png");
		level9Completed[0] = new Image("images/LevelsMenu/Completed/level_9_1_completed.png");
		level9Completed[1] = new Image("images/LevelsMenu/Completed/level_9_2_completed.png");
		level9Completed[2] = new Image("images/LevelsMenu/Completed/level_9_3_completed.png");
		level10Completed[0] = new Image("images/LevelsMenu/Completed/level_10_1_completed.png");
		level10Completed[1] = new Image("images/LevelsMenu/Completed/level_10_2_completed.png");
		level10Completed[2] = new Image("images/LevelsMenu/Completed/level_10_3_completed.png");
		level11Completed[0] = new Image("images/LevelsMenu/Completed/level_11_1_completed.png");
		level11Completed[1] = new Image("images/LevelsMenu/Completed/level_11_2_completed.png");
		level11Completed[2] = new Image("images/LevelsMenu/Completed/level_11_3_completed.png");
		levelsMenuExit[0] = new Image("images/LevelsMenu/exit_1.png");
		levelsMenuExit[1] = new Image("images/LevelsMenu/exit_2.png");
		levelsMenuExit[2] = new Image("images/LevelsMenu/exit_3.png");
		lightsAndShadowsLevel1[0] = new Image("images/Level1/lights_and_shadows_1.png");
		lightsAndShadowsLevel1[1] = new Image("images/Level1/lights_and_shadows_2.png");
		lightsAndShadowsLevel1[2] = new Image("images/Level1/lights_and_shadows_3.png");
		lightsAndShadowsLevel2[0] = new Image("images/Level2/lights_and_shadows_1.png");
		lightsAndShadowsLevel2[1] = new Image("images/Level2/lights_and_shadows_2.png");
		lightsAndShadowsLevel2[2] = new Image("images/Level2/lights_and_shadows_3.png");
		lightsAndShadowsLevel3[0] = new Image("images/Level3/lights_and_shadows_1.png");
		lightsAndShadowsLevel3[1] = new Image("images/Level3/lights_and_shadows_2.png");
		lightsAndShadowsLevel3[2] = new Image("images/Level3/lights_and_shadows_3.png");
		lightsAndShadowsLevel4[0] = new Image("images/Level4/lights_and_shadows_1.png");
		lightsAndShadowsLevel4[1] = new Image("images/Level4/lights_and_shadows_2.png");
		lightsAndShadowsLevel4[2] = new Image("images/Level4/lights_and_shadows_3.png");
		lightsAndShadowsLevel5[0] = new Image("images/Level5/lights_and_shadows_1.png");
		lightsAndShadowsLevel5[1] = new Image("images/Level5/lights_and_shadows_2.png");
		lightsAndShadowsLevel5[2] = new Image("images/Level5/lights_and_shadows_3.png");
		lightsAndShadowsLevel6[0] = new Image("images/Level6/lights_and_shadows_1.png");
		lightsAndShadowsLevel6[1] = new Image("images/Level6/lights_and_shadows_2.png");
		lightsAndShadowsLevel6[2] = new Image("images/Level6/lights_and_shadows_3.png");
		lightsAndShadowsLevel7[0] = new Image("images/Level7/lights_and_shadows_1.png");
		lightsAndShadowsLevel7[1] = new Image("images/Level7/lights_and_shadows_2.png");
		lightsAndShadowsLevel7[2] = new Image("images/Level7/lights_and_shadows_3.png");
		lightsAndShadowsLevel8[0] = new Image("images/Level8/lights_and_shadows_1.png");
		lightsAndShadowsLevel8[1] = new Image("images/Level8/lights_and_shadows_2.png");
		lightsAndShadowsLevel8[2] = new Image("images/Level8/lights_and_shadows_3.png");
		lightsAndShadowsLevel9[0] = new Image("images/Level9/lights_and_shadows_1.png");
		lightsAndShadowsLevel9[1] = new Image("images/Level9/lights_and_shadows_2.png");
		lightsAndShadowsLevel9[2] = new Image("images/Level9/lights_and_shadows_3.png");
		lightsAndShadowsLevel10[0] = new Image("images/Level10/lights_and_shadows_1.png");
		lightsAndShadowsLevel10[1] = new Image("images/Level10/lights_and_shadows_2.png");
		lightsAndShadowsLevel10[2] = new Image("images/Level10/lights_and_shadows_3.png");
		lightsAndShadowsLevel11[0] = new Image("images/Level11/lights_and_shadows_1.png");
		lightsAndShadowsLevel11[1] = new Image("images/Level11/lights_and_shadows_2.png");
		lightsAndShadowsLevel11[2] = new Image("images/Level11/lights_and_shadows_3.png");
		currentlyUsedMouse = mouse[0];
		background = new Image("images/Game/back.png");
		background1 = new Image("images/Game/background.png");
		pressurePlate1 = new Image("images/Objects/unlock_object_1.png");
		unlockableWall1 = new Image("images/Objects/wall_to_unlock_1.png");
		pressurePlate2 = new Image("images/Objects/unlock_object_2.png");
		unlockableWall2 = new Image("images/Objects/wall_to_unlock_2.png");
		pressurePlate3 = new Image("images/Objects/unlock_object_3.png");
		unlockableWall3 = new Image("images/Objects/wall_to_unlock_3.png");
		pressurePlate4 = new Image("images/Objects/unlock_object_4.png");
		unlockableWall4 = new Image("images/Objects/wall_to_unlock_4.png");
		pressurePlate5 = new Image("images/Objects/unlock_object_5.png");
		unlockableWall5 = new Image("images/Objects/wall_to_unlock_5.png");
		unlockableWall6 = new Image("images/Objects/wall_to_unlock_6.png");
		optionsMenu[0] = new Image("images/OptionsMenu/options_menu_1.png");
		optionsMenu[1] = new Image("images/OptionsMenu/options_menu_2.png");
		optionsMenu[2] = new Image("images/OptionsMenu/options_menu_3.png");
		optionsMenu[3] = new Image("images/OptionsMenu/options_menu_4.png");
		optionsMenu[4] = new Image("images/OptionsMenu/options_menu_5.png");
		skinSelectMenu[0] = new Image("images/SkinSelectMenu/skin_select_menu_1.png");
		skinSelectMenu[1] = new Image("images/SkinSelectMenu/skin_select_menu_2.png");
		skinSelectMenu[2] = new Image("images/SkinSelectMenu/skin_select_menu_3.png");
		skinSelectMenu[3] = new Image("images/SkinSelectMenu/skin_select_menu_4.png");
		skinSelectMenu[4] = new Image("images/SkinSelectMenu/skin_select_menu_5.png");
		board = new Image("images/SkinSelectMenu/board_2.png");
		completedLevels[0] = new Image("images/SkinSelectMenu/completed/completed_1.png");
		completedLevels[1] = new Image("images/SkinSelectMenu/completed/completed_2.png");
		completedLevels[2] = new Image("images/SkinSelectMenu/completed/completed_3.png");
		completedLevels[3] = new Image("images/SkinSelectMenu/completed/completed_4.png");
		completedLevels[4] = new Image("images/SkinSelectMenu/completed/completed_5.png");
		completedLevels[5] = new Image("images/SkinSelectMenu/completed/completed_6.png");
		completedLevels[6] = new Image("images/SkinSelectMenu/completed/completed_7.png");
		completedLevels[7] = new Image("images/SkinSelectMenu/completed/completed_8.png");
		completedLevels[8] = new Image("images/SkinSelectMenu/completed/completed_9.png");
		completedLevels[9] = new Image("images/SkinSelectMenu/completed/completed_10.png");
		completedLevels[10] = new Image("images/SkinSelectMenu/completed/completed_11.png");
		uncompletedLevels[0] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_1.png");
		uncompletedLevels[1] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_2.png");
		uncompletedLevels[2] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_3.png");
		uncompletedLevels[3] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_4.png");
		uncompletedLevels[4] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_5.png");
		uncompletedLevels[5] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_6.png");
		uncompletedLevels[6] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_7.png");
		uncompletedLevels[7] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_8.png");
		uncompletedLevels[8] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_9.png");
		uncompletedLevels[9] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_10.png");
		uncompletedLevels[10] = new Image("images/SkinSelectMenu/uncompleted/uncompleted_11.png");
		board1 = new Image("images/Introduction/board_1.png");
		exit2[0] = new Image("images/Introduction/exit_1.png");
		exit2[1] = new Image("images/Introduction/exit_2.png");
		exit2[2] = new Image("images/Introduction/exit_3.png");
		exit2[3] = new Image("images/Introduction/exit_4.png");
		optionsSave[0] = new Image("images/OptionsMenu/save_1.png");
		optionsSave[1] = new Image("images/OptionsMenu/save_2.png");
		optionsSave[2] = new Image("images/OptionsMenu/save_3.png");
		optionsSave[3] = new Image("images/OptionsMenu/save_4.png");
		optionsCancel[0] = new Image("images/OptionsMenu/cancel_1.png");
		optionsCancel[1] = new Image("images/OptionsMenu/cancel_2.png");
		optionsCancel[2] = new Image("images/OptionsMenu/cancel_3.png");
		optionsCancel[3] = new Image("images/OptionsMenu/cancel_4.png");
		skinSelectSave[0] = new Image("images/SkinSelectMenu/save_1.png");
		skinSelectSave[1] = new Image("images/SkinSelectMenu/save_2.png");
		skinSelectSave[2] = new Image("images/SkinSelectMenu/save_3.png");
		skinSelectSave[3] = new Image("images/SkinSelectMenu/save_4.png");
		skinSelectCancel[0] = new Image("images/SkinSelectMenu/cancel_1.png");
		skinSelectCancel[1] = new Image("images/SkinSelectMenu/cancel_2.png");
		skinSelectCancel[2] = new Image("images/SkinSelectMenu/cancel_3.png");
		skinSelectCancel[3] = new Image("images/SkinSelectMenu/cancel_4.png");
		skinSelectLeftArrow[0] = new Image("images/SkinSelectMenu/arrow_left_1.png");
		skinSelectLeftArrow[1] = new Image("images/SkinSelectMenu/arrow_left_2.png");
		skinSelectLeftArrow[2] = new Image("images/SkinSelectMenu/arrow_left_3.png");
		skinSelectRightArrow[0] = new Image("images/SkinSelectMenu/arrow_right_1.png");
		skinSelectRightArrow[1] = new Image("images/SkinSelectMenu/arrow_right_2.png");
		skinSelectRightArrow[2] = new Image("images/SkinSelectMenu/arrow_right_3.png");
		resolution[0] = new Image("images/OptionsMenu/res_1.png");
		resolution[1] = new Image("images/OptionsMenu/res_2.png");
		resolution[2] = new Image("images/OptionsMenu/res_3.png");
		resolution[3] = new Image("images/OptionsMenu/res_4.png");
		resolution[4] = new Image("images/OptionsMenu/res_5.png");
		resolution[5] = new Image("images/OptionsMenu/res_6.png");
		resolution[6] = new Image("images/OptionsMenu/res_7.png");
		resolution[7] = new Image("images/OptionsMenu/res_8.png");
		resolution[8] = new Image("images/OptionsMenu/res_9.png");
		trueImage = new Image("images/OptionsMenu/true.png");
		resolutionLeftArrow[0] = new Image("images/OptionsMenu/res_left_arrow_1.png");
		resolutionLeftArrow[1] = new Image("images/OptionsMenu/res_left_arrow_2.png");
		resolutionLeftArrow[2] = new Image("images/OptionsMenu/res_left_arrow_3.png");
		resolutionRightArrow[0] = new Image("images/OptionsMenu/res_right_arrow_1.png");
		resolutionRightArrow[1] = new Image("images/OptionsMenu/res_right_arrow_2.png");
		resolutionRightArrow[2] = new Image("images/OptionsMenu/res_right_arrow_3.png");
		fullScreenLeftArrow[0] = new Image("images/OptionsMenu/full_screen_left_arrow_1.png");
		fullScreenLeftArrow[1] = new Image("images/OptionsMenu/full_screen_left_arrow_2.png");
		fullScreenLeftArrow[2] = new Image("images/OptionsMenu/full_screen_left_arrow_3.png");
		fullScreenRightArrow[0] = new Image("images/OptionsMenu/full_screen_right_arrow_1.png");
		fullScreenRightArrow[1] = new Image("images/OptionsMenu/full_screen_right_arrow_2.png");
		fullScreenRightArrow[2] = new Image("images/OptionsMenu/full_screen_right_arrow_3.png");
		falseImage = new Image("images/OptionsMenu/false.png");
		title = new Image("images/MainMenu/title.png");
		boardWithTotalNumberOfDeaths = new Image("images/MainMenu/total_deaths.png");
		
		MainMenu.newGame = newGame;
		MainMenu.newGameToDraw = newGame[0];
		MainMenu.changeSkin = changeSkin;
		MainMenu.changeSkinToDraw = changeSkin[0];
		MainMenu.introduction = introduction;
		MainMenu.introductionToDraw = introduction[0];
		MainMenu.options = options;
		MainMenu.optionsToDraw = options[0];
		MainMenu.exit = exit;
		MainMenu.exitToDraw = exit[0];
		MainMenu.mainMenu = mainMenu;
		MainMenu.title = title;
		MainMenu.totalDeathsBoard = boardWithTotalNumberOfDeaths;
		Introduction.introduction = description;
		Introduction.exitToDraw = exit2[0];
		Introduction.exit = exit2;
		OptionsMenu.saveToDraw = optionsSave[0];
		OptionsMenu.save = optionsSave;
		OptionsMenu.cancelToDraw = optionsCancel[0];
		OptionsMenu.cancel = optionsCancel;
		OptionsMenu.res = resolution;
		OptionsMenu.trueImage = trueImage;
		OptionsMenu.falseImage = falseImage;
		OptionsMenu.resolutionLeftArrow = resolutionLeftArrow;
		OptionsMenu.resolutionLeftArroweToDraw = resolutionLeftArrow[0];
		OptionsMenu.resolutionRightArrow = resolutionRightArrow;
		OptionsMenu.resolutionRightArrowToDraw = resolutionRightArrow[0];
		OptionsMenu.fullScreenLeftArrow = fullScreenLeftArrow;
		OptionsMenu.fullScreenLeftArrowToDraw = fullScreenLeftArrow[0];
		OptionsMenu.fullScreenRightArrow = fullScreenRightArrow;
		OptionsMenu.fullScreenRightArrowToDraw = fullScreenRightArrow[0];
		SkinSelectMenu.saveToDraw = skinSelectSave[0];
		SkinSelectMenu.save = skinSelectSave;
		SkinSelectMenu.cancelToDraw = skinSelectCancel[0];
		SkinSelectMenu.cancel = skinSelectCancel;
		SkinSelectMenu.arrowLeftToDraw = skinSelectLeftArrow[0];
		SkinSelectMenu.arrowLeft = skinSelectLeftArrow;
		SkinSelectMenu.arrowRightToDraw = skinSelectRightArrow[0];
		SkinSelectMenu.arrowRight = skinSelectRightArrow;
		LevelsMenu.levelsMenu = levelsMenu;
		if(!lvl1)
		{
			LevelsMenu.level1 = level1;
			LevelsMenu.level1ToDraw = level1[0];
		}
		else
		{
			LevelsMenu.level1 = level1Completed;
			LevelsMenu.level1ToDraw = level1Completed[0];
		}
		if(!lvl2)
		{
			LevelsMenu.level2 = level2;
			LevelsMenu.level2ToDraw = level2[0];
		}
		else
		{
			LevelsMenu.level2 = level2Completed;
			LevelsMenu.level2ToDraw = level2Completed[0];
		}
		if(!lvl3)
		{
			LevelsMenu.level3 = level3;
			LevelsMenu.level3ToDraw = level3[0];
		}
		else
		{
			LevelsMenu.level3 = level3Completed;
			LevelsMenu.level3ToDraw = level3Completed[0];
		}
		if(!lvl4)
		{
			LevelsMenu.level4 = level4;
			LevelsMenu.level4ToDraw = level4[0];
		}
		else
		{
			LevelsMenu.level4 = level4Completed;
			LevelsMenu.level4ToDraw = level4Completed[0];
		}
		if(!lvl5)
		{
			LevelsMenu.level5 = level5;
			LevelsMenu.level5ToDraw = level5[0];
		}
		else
		{
			LevelsMenu.level5 = level5Completed;
			LevelsMenu.level5ToDraw = level5Completed[0];
		}
		if(!lvl6)
		{
			LevelsMenu.level6 = level6;
			LevelsMenu.level6ToDraw = level6[0];
		}
		else
		{
			LevelsMenu.level6 = level6Completed;
			LevelsMenu.level6ToDraw = level6Completed[0];
		}
		if(!lvl7)
		{
			LevelsMenu.level7 = level7;
			LevelsMenu.level7ToDraw = level7[0];
		}
		else
		{
			LevelsMenu.level7 = level7Completed;
			LevelsMenu.level7ToDraw = level7Completed[0];
		}
		if(!lvl8)
		{
			LevelsMenu.level8 = level8;
			LevelsMenu.level8ToDraw = level8[0];
		}
		else
		{
			LevelsMenu.level8 = level8Completed;
			LevelsMenu.level8ToDraw = level8Completed[0];
		}
		if(!lvl9)
		{
			LevelsMenu.level9 = level9;
			LevelsMenu.level9ToDraw = level9[0];
		}
		else
		{
			LevelsMenu.level9 = level9Completed;
			LevelsMenu.level9ToDraw = level9Completed[0];
		}
		if(!lvl10)
		{
			LevelsMenu.level10 = level10;
			LevelsMenu.level10ToDraw = level10[0];
		}
		else
		{
			LevelsMenu.level10 = level10Completed;
			LevelsMenu.level10ToDraw = level10Completed[0];
		}
		if(!lvl11)
		{
			LevelsMenu.level11 = level11;
			LevelsMenu.level11ToDraw = level11[0];
		}
		else
		{
			LevelsMenu.level11 = level11Completed;
			LevelsMenu.level11ToDraw = level11Completed[0];
		}
		LevelsMenu.levelsMenuExit = levelsMenuExit;
		LevelsMenu.levelsMenuExitToDraw = levelsMenuExit[0];
		SkinSelectMenu.skinSelectMenu = skinSelectMenu;
		OptionsMenu.optionsMenu = optionsMenu;
		actualScreenWidth = container.getScreenWidth();
		actualScreenHeight = container.getScreenHeight();
		OptionsMenu.actualScreenWidth = actualScreenWidth;
		OptionsMenu.actualScreenHeight = actualScreenHeight;
		
		container.setMouseCursor(emptyImage, 0, 0);
		
		try {
			selectedSkin = PropertyValues.getSelectedSkin("skin", 0);
		} catch(IOException e) {e.printStackTrace();}
		SkinSelectMenu.selectedSkin = selectedSkin;
	}
	@SuppressWarnings("static-access")
	@Override
	public void update(GameContainer container, int delta) throws SlickException 
	{
		input = container.getInput();
		mouseAnimation(delta);
		if(selectedSkin == 0)
		{
			player = playerSkin1;
			playerDeath[0] = playerDeath1[0];
			playerDeath[1] = playerDeath1[1];
			playerDeath[2] = playerDeath1[2];
		}
		else if(selectedSkin == 1)
		{
			player = playerSkin2;
			playerDeath[0] = playerDeath2[0];
			playerDeath[1] = playerDeath2[1];
			playerDeath[2] = playerDeath2[2];
		}
		else if(selectedSkin == 2)
		{
			player = playerSkin3;
			playerDeath[0] = playerDeath3[0];
			playerDeath[1] = playerDeath3[1];
			playerDeath[2] = playerDeath3[2];
		}
		else if(selectedSkin == 3)
		{
			player = playerSkin4;
			playerDeath[0] = playerDeath4[0];
			playerDeath[1] = playerDeath4[1];
			playerDeath[2] = playerDeath4[2];
		}	
		if(gameState == -1)
		{
			MainMenu.updateTime(delta);
			if(input.isMousePressed(input.MOUSE_LEFT_BUTTON))
			{
				gameState = MainMenu.chooseSelected(input);
				MainMenu.selected = 0;
			}
			MainMenu.drawAnimation(input, delta);
		}
		if(gameState == 0)
		{
			LevelsMenu.updateTime(delta);
			if(input.isMousePressed(input.MOUSE_LEFT_BUTTON))
			{
				gameState = LevelsMenu.chooseSelected(input);
				LevelsMenu.selected = 0;
			}
			LevelsMenu.drawAnimation(input, delta);
		}
		if(gameState == 1)
		{
			SkinSelectMenu.updateTime(delta);
			if(tmpBoolean)
			{
				try {
					SkinSelectMenu.onOpen(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
				} catch (IOException e) {}
				tmpBoolean = !tmpBoolean;
			}
			if(input.isMousePressed(input.MOUSE_LEFT_BUTTON))
			{
				SkinSelectMenu.chooseSelected(input);
				if(SkinSelectMenu.applyOptions(input))
				{
					selectedSkin = SkinSelectMenu.selectedSkin;
					try {
						PropertyValues.setSelectedSkin(selectedSkin);
					} catch (IOException e) {}
					gameState = -1;
					tmpBoolean = !tmpBoolean;
				}
				else if(SkinSelectMenu.quitOptions(input))
				{
					SkinSelectMenu.selectedSkin = selectedSkin;
					gameState = -1;
					tmpBoolean = !tmpBoolean;
				}
			}
			SkinSelectMenu.drawAnimation(input, delta);
		}
		if(gameState == 2)
		{
			Introduction.updateTime(delta);
			if(Introduction.quitIntroduction1(input))
				gameState = -1;
			if(input.isMousePressed(input.MOUSE_LEFT_BUTTON))
			{
				if(Introduction.quitIntroduction2(input))
					gameState = -1;
			}
			Introduction.drawAnimation(input, delta);
		}
		if(gameState == 3)
		{
			OptionsMenu.updateTime(delta);
			if(tmpBoolean)
			{
				try {
					OptionsMenu.onOpen();
				} catch (IOException e) {}
				tmpBoolean = !tmpBoolean;
			}
			if(input.isMousePressed(input.MOUSE_LEFT_BUTTON))
			{
				OptionsMenu.chooseSelected(input);
				if(OptionsMenu.applyOptions(input))
				{
					screenWidth = OptionsMenu.screenWidth;
					screenHeight = OptionsMenu.screenHeight;
					fullScreenMode = OptionsMenu.fullScreenMode;
					try {
						PropertyValues.setConfigValues(fullScreenMode, screenWidth, screenHeight);
					} catch (IOException e) {}
					AppGameContainer gc = (AppGameContainer) container;
					gc.setDisplayMode(screenWidth, screenHeight, fullScreenMode);
					gameState = -1;
					tmpBoolean = !tmpBoolean;
				}
				else if(OptionsMenu.quitOptions(input))
				{
					gameState = -1;
					tmpBoolean = !tmpBoolean;
				}
			}
			OptionsMenu.drawAnimation(input, delta);
		}
		if(gameState == 4)
		{
			container.exit();
		}
		if(gameState == 10)
		{
			updateLevel(delta, input);
		}
		if(gameState == 11)
		{
			updateLevel(delta, input);
		}
		if(gameState == 12)
		{
			updateLevel(delta, input);
		}
		if(gameState == 13)
		{
			updateLevel(delta, input);
		}
		if(gameState == 14)
		{
			updateLevel(delta, input);
		}
		if(gameState == 15)
		{
			updateLevel(delta, input);
		}
		if(gameState == 16)
		{
			updateLevel(delta, input);
		}
		if(gameState == 17)
		{
			updateLevel(delta, input);
		}
		if(gameState == 18)
		{
			updateLevel(delta, input);
		}
		if(gameState == 19)
		{
			updateLevel(delta, input);
		}
		if(gameState == 20)
		{
			updateLevel(delta, input);
		}
	}
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException 
	{
		background1.draw(0, 0, 0.5f);
		if(gameState == -1)
		{
			MainMenu.drawMenu();
			MainMenu.drawMenuOptions();
			MainMenu.drawTotalDeaths(g, totalDeaths);
			try{drawMouse(input);}catch(NullPointerException e){}
		}
		if(gameState == 0)
		{
			LevelsMenu.drawLevelsMenu(g);
			LevelsMenu.drawLevelsMenuOptions();
			try{drawMouse(input);}catch(NullPointerException e){}
		}
		if(gameState == 1)
		{
			SkinSelectMenu.drawMenu(g, playerUnlockedSkin[0], playerUnlockedSkin[1], playerUnlockedSkin[2], playerUnlockedSkin[3], playerLockedSkin, board, uncompletedLevels, completedLevels);
			try{drawMouse(input);}catch(NullPointerException e){}
		}
		if(gameState == 2)
		{
			Introduction.drawBackground(background);
			Introduction.drawIntroduction(g, player, movableObject, wall, levelEnd, pressurePlate1, unlockableWall6, enemy1, board1);
			try{drawMouse(input);}catch(NullPointerException e){}
		}
		if(gameState == 3)
		{
			OptionsMenu.drawMenu(g);
			try{drawMouse(input);}catch(NullPointerException e){}
		}
		if(gameState == 10)
		{
			Level1.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel1);
			if(Level1.completeLevel())
			{
				Level1.resetObjectsPosition();
				Level1.clearObjects();
				gameState = 0;
				lvl1 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level1 = level1Completed;
					LevelsMenu.level1ToDraw = level1Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
		if(gameState == 11)
		{
			Level2.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel7);
			if(Level2.completeLevel())
			{
				Level2.resetObjectsPosition();
				Level2.clearObjects();
				gameState = 0;
				lvl7 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level7 = level7Completed;
					LevelsMenu.level7ToDraw = level7Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
		if(gameState == 12)
		{
			Level3.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel2);
			if(Level3.completeLevel())
			{
				Level3.resetObjectsPosition();
				Level3.clearObjects();
				gameState = 0;
				lvl2 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level2 = level2Completed;
					LevelsMenu.level2ToDraw = level2Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
		if(gameState == 13)
		{
			Level4.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel3);
			if(Level4.completeLevel())
			{
				Level4.resetObjectsPosition();
				Level4.clearObjects();
				gameState = 0;
				lvl3 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level3 = level3Completed;
					LevelsMenu.level3ToDraw = level3Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
		if(gameState == 14)
		{
			Level5.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel5);
			if(Level5.completeLevel())
			{
				Level5.resetObjectsPosition();
				Level5.clearObjects();
				gameState = 0;
				lvl5 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level5 = level5Completed;
					LevelsMenu.level5ToDraw = level5Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
		if(gameState == 15)
		{
			Level6.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel6);
			if(Level6.completeLevel())
			{
				Level6.resetObjectsPosition();
				Level6.clearObjects();
				gameState = 0;
				lvl6 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level6 = level6Completed;
					LevelsMenu.level6ToDraw = level6Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
		if(gameState == 16)
		{
			Level7.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel9);
			if(Level7.completeLevel())
			{
				Level7.resetObjectsPosition();
				Level7.clearObjects();
				gameState = 0;
				lvl9 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level9 = level9Completed;
					LevelsMenu.level9ToDraw = level9Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
		if(gameState == 17)
		{
			Level8.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel8);
			if(Level8.completeLevel())
			{
				Level8.resetObjectsPosition();
				Level8.clearObjects();
				gameState = 0;
				lvl8 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level8 = level8Completed;
					LevelsMenu.level8ToDraw = level8Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
		if(gameState == 18)
		{
			Level9.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel4);
			if(Level9.completeLevel())
			{
				Level9.resetObjectsPosition();
				Level9.clearObjects();
				gameState = 0;
				lvl4 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level4 = level4Completed;
					LevelsMenu.level4ToDraw = level4Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
		if(gameState == 19)
		{
			Level10.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel10);
			if(Level10.completeLevel())
			{
				Level10.resetObjectsPosition();
				Level10.clearObjects();
				gameState = 0;
				lvl10 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level10 = level10Completed;
					LevelsMenu.level10ToDraw = level10Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
		if(gameState == 20)
		{
			Level11.drawAllObjects(g, background, wall, levelEnd, enemy1, enemy2, enemy3, enemy4, enemy5, movableObject, player, pressurePlate1, unlockableWall1, pressurePlate2, unlockableWall2, pressurePlate3, unlockableWall3, pressurePlate4, unlockableWall4, pressurePlate5, unlockableWall5, lightsAndShadowsLevel11);
			if(Level11.completeLevel())
			{
				Level11.resetObjectsPosition();
				Level11.clearObjects();
				gameState = 0;
				lvl11 = true;
				try 
				{
					PropertyValues.setPlayerProgress(lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10, lvl11);
					LevelsMenu.level11 = level11Completed;
					LevelsMenu.level11ToDraw = level11Completed[0];
				} catch (IOException e) {e.printStackTrace();}
			}
		}
	}
	public static void main(String[] args) throws SlickException, IOException 
	{
		boolean fullScreenMode = PropertyValues.getBooleanConfigValue("fullScreenMode", false);
		int screenWidth = PropertyValues.getIntConfigValue("screenWidth", 800);
		int screenHeight = PropertyValues.getIntConfigValue("screenHeight", 600);
		ScalableGame s = new ScalableGame(new Setup("Shadow Tilt"), 800, 600, true);
		AppGameContainer appgc = new AppGameContainer(s);
		lvl1 = PropertyValues.getLevelCompletionData("lvl1", false);
		lvl2 = PropertyValues.getLevelCompletionData("lvl2", false);
		lvl3 = PropertyValues.getLevelCompletionData("lvl3", false);
		lvl4 = PropertyValues.getLevelCompletionData("lvl4", false);
		lvl5 = PropertyValues.getLevelCompletionData("lvl5", false);
		lvl6 = PropertyValues.getLevelCompletionData("lvl6", false);
		lvl7 = PropertyValues.getLevelCompletionData("lvl7", false);
		lvl8 = PropertyValues.getLevelCompletionData("lvl8", false);
		lvl9 = PropertyValues.getLevelCompletionData("lvl9", false);
		lvl10 = PropertyValues.getLevelCompletionData("lvl10", false);
		lvl11 = PropertyValues.getLevelCompletionData("lvl11", false);
		totalDeaths = PropertyValues.getTotalDeaths("deaths", 0);

		appgc.setDisplayMode(screenWidth, screenHeight, fullScreenMode);
	    	appgc.setAlwaysRender(true);
	    	String[] icons = {"images/Icons/icon_32.png", "images/Icons/icon_24.png", "images/Icons/icon_16.png", "images/Icons/icon_128.png"};
	    	appgc.setIcons(icons);
	    	appgc.start();
	}
	private void playerDeathAnimation(int delta) throws SlickException
	{
		time1 += delta;
		if(time1 >= 0 && time1 < 83)
			Levels.player.changeImage(playerDeath[0]);
		if(time1 >= 83 && time1 < 166)
			Levels.player.changeImage(playerDeath[1]);
		if(time1 >= 166 && time1 < 250)
			Levels.player.changeImage(playerDeath[2]);
		if(time1 >= 250 && time1 < 500)
			Levels.player.changeImage(player);
		if(time1 >= 500 && time1 < 583)
			Levels.player.changeImage(playerDeath[0]);
		if(time1 >= 583 && time1 < 666)
			Levels.player.changeImage(playerDeath[1]);
		if(time1 >= 666 && time1 < 750)
			Levels.player.changeImage(playerDeath[2]);
		if(time1 >= 750 && time1 < 1000)
			Levels.player.changeImage(player);
		if(time1>=1000)
		{
			time1 = 0;
			Levels.resetObjectsPosition();
			totalDeaths++;
			try{PropertyValues.setTotalDeaths(totalDeaths);} catch(IOException e){}
		}
	}
	private void updateLevel(int delta, Input input) throws SlickException
	{
		try
		{
			if(!Levels.playerDeath())
			{
				try{Levels.movePlayer(input);}catch(NullPointerException e){}
				try{Levels.moveEnemies1(delta);}catch(NullPointerException e){}
				try{Levels.moveEnemies2(delta);}catch(NullPointerException e){}
				try{Levels.moveEnemies3(delta);}catch(NullPointerException e){}
				try{Levels.moveEnemies4(delta);}catch(NullPointerException e){}
				try{Levels.moveEnemies5(delta);}catch(NullPointerException e){}
				try{Levels.unlockWall1();}catch(NullPointerException e){}
				try{Levels.unlockWall2();}catch(NullPointerException e){}
				try{Levels.unlockWall3();}catch(NullPointerException e){}
				try{Levels.unlockWall4();}catch(NullPointerException e){}
				try{Levels.unlockWall5();}catch(NullPointerException e){}
				try{Levels.updateTime(delta);}catch(NullPointerException e){}
				try
				{
					if(Levels.quitGame(input))
					{
						gameState = 0;
						Levels.resetObjectsPosition();
						Levels.clearObjects();
					}
				}catch(NullPointerException e){}
				try
				{
					if(Levels.resetGame(input))
						Levels.resetObjectsPosition();
				}catch(NullPointerException e){}
			}
			else
			{
				playerDeathAnimation(delta);
				input.clearKeyPressedRecord();
			}
		}catch(NullPointerException e){}
	}
	private void drawMouse(Input input)
	{
		currentlyUsedMouse.draw(input.getMouseX(), input.getMouseY());
	}
	private void mouseAnimation(int delta)
	{
		time2 += delta;
		if(time2 >= 0 && time2 < 150)
			currentlyUsedMouse = mouse[0];
		if(time2 >= 150 && time2 < 300)
			currentlyUsedMouse = mouse[1];
		if(time2 >= 350 && time2 < 500)
			currentlyUsedMouse = mouse[2];
		if(time2 >= 500 && time2 < 750)
			currentlyUsedMouse = mouse[3];
		if(time2 >= 750 && time2 < 900)
			currentlyUsedMouse = mouse[2];
		if(time2 >= 900 && time2 < 1050)
			currentlyUsedMouse = mouse[1];
		if(time2 >= 1050)
		{
			time2 = 0;
			currentlyUsedMouse = mouse[0];
		}
	}
}
