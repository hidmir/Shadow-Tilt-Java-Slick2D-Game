package Game.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Properties;

public class PropertyValues 
{
	static InputStream inputStream;
	static OutputStream outputStream;
	public static boolean getBooleanConfigValue(String propertyName, boolean defaultValue) throws IOException {
		boolean value = defaultValue;
		try {
			Properties property = new Properties();
			String fileName = "config.properties";
			inputStream = new FileInputStream(fileName);
			if (inputStream != null) 
				property.load(inputStream);
			else 
				return defaultValue;
			String propToReturn = property.getProperty(propertyName);
			value = Boolean.parseBoolean(propToReturn);
		} catch (Exception e) {} 
		finally {
			if(inputStream != null)
				inputStream.close();
		}
		return value;
	}
	public static int getIntConfigValue(String propertyName, int defaultValue) throws IOException {
		int value = defaultValue;
		try {
			Properties property = new Properties();
			String fileName = "config.properties";
			inputStream = new FileInputStream(fileName);
			if (inputStream != null) 
				property.load(inputStream);
			else 
				return defaultValue;
			String propToReturn = property.getProperty(propertyName);
			value = Integer.parseInt(propToReturn);
		} catch (Exception e) {} 
		finally {
			if(inputStream != null)
				inputStream.close();
		}
		return value;
	}
	public static void setConfigValues(boolean fullScreenMode, int screenWidth, int screenHeight) throws IOException {
		try {
			Properties property = new Properties();
			String fileName = "config.properties";
			outputStream = new FileOutputStream(fileName);
			if (outputStream != null) 
			{
				String fullScreenModeToSet = Boolean.toString(fullScreenMode);
				String screenWidthToSet = Integer.toString(screenWidth);
				String screenHeightToSet = Integer.toString(screenHeight);
				property.setProperty("fullScreenMode", fullScreenModeToSet);
				property.setProperty("screenWidth", screenWidthToSet);
				property.setProperty("screenHeight", screenHeightToSet);
				property.store(outputStream, "");
			}
		} catch (Exception e) {} 
		finally {
			if(outputStream != null)
				outputStream.close();
		}
	}
	public static void setPlayerProgress(boolean lvl1, boolean lvl2, boolean lvl3, boolean lvl4, boolean lvl5, boolean lvl6, boolean lvl7, boolean lvl8, boolean lvl9, boolean lvl10, boolean lvl11) throws IOException
	{
		try {
			Properties property = new Properties();
			String fileName = "saves.properties";
			outputStream = new FileOutputStream(fileName);
			ArrayList<Boolean> levels = new ArrayList<Boolean>();
			levels.add(lvl1);
			levels.add(lvl2);
			levels.add(lvl3);
			levels.add(lvl4);
			levels.add(lvl5);
			levels.add(lvl6);
			levels.add(lvl7);
			levels.add(lvl8);
			levels.add(lvl9);
			levels.add(lvl10);
			levels.add(lvl11);
			if (outputStream != null) 
			{
				for(int i = 0; i < levels.size(); i++)
				{
					String progressToSet = Boolean.toString(levels.get(i));
					property.setProperty("lvl" + (i + 1), progressToSet);
				}
				property.store(outputStream, "");
			} 
		} catch (Exception e) {} 
		finally {
			if(outputStream != null)
				outputStream.close();
		}
	}
	public static boolean getLevelCompletionData(String propertyName, boolean defaultValue) throws IOException 
	{
		boolean value = defaultValue;
		try {
			Properties property = new Properties();
			String fileName = "saves.properties";
			inputStream = new FileInputStream(fileName);
			if (inputStream != null) 
				property.load(inputStream);
			else 
				return defaultValue;
			String propToReturn = property.getProperty(propertyName);
			value = Boolean.parseBoolean(propToReturn);
		} catch (Exception e) {} 
		finally {
			if(inputStream != null)
				inputStream.close();
		}
		return value;
	}
	public static int getSelectedSkin(String propertyName, int defaultValue) throws IOException 
	{
		int value = defaultValue;
		try {
			Properties property = new Properties();
			String fileName = "skin.properties";
			inputStream = new FileInputStream(fileName);
			if (inputStream != null) 
				property.load(inputStream);
			else 
				return defaultValue;
			String propToReturn = property.getProperty(propertyName);
			value = Integer.parseInt(propToReturn);
		} catch (Exception e) {} 
		finally {
			if(inputStream != null)
				inputStream.close();
		}
		return value;
	}
	public static int getTotalDeaths(String propertyName, int defaultValue) throws IOException 
	{
		int value = defaultValue;
		try {
			Properties property = new Properties();
			String fileName = "totaldeaths.properties";
			inputStream = new FileInputStream(fileName);
			if (inputStream != null) 
				property.load(inputStream);
			else 
				return defaultValue;
			String propToReturn = property.getProperty(propertyName);
			value = Integer.parseInt(propToReturn);
		} catch (Exception e) {} 
		finally {
			if(inputStream != null)
				inputStream.close();
		}
		return value;
	}
	public static void setSelectedSkin(int skin) throws IOException {
		try {
			Properties property = new Properties();
			String fileName = "skin.properties";
			outputStream = new FileOutputStream(fileName);
			if (outputStream != null) 
			{
				String skinToSet = Integer.toString(skin);
				property.setProperty("skin", skinToSet);
				property.store(outputStream, "");
			}
		} catch (Exception e) {} 
		finally {
			if(outputStream != null)
				outputStream.close();
		}
	}
	public static void setTotalDeaths(int deaths) throws IOException {
		try {
			Properties property = new Properties();
			String fileName = "totaldeaths.properties";
			outputStream = new FileOutputStream(fileName);
			if (outputStream != null) 
			{
				String totalDeaths = Integer.toString(deaths);
				property.setProperty("deaths", totalDeaths);
				property.store(outputStream, "");
			}
		} catch (Exception e) {} 
		finally {
			if(outputStream != null)
				outputStream.close();
		}
	}
}
