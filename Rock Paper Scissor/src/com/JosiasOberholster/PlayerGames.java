package com.JosiasOberholster;

import java.io.*;

public class PlayerGames
{
	public String result;
	public static String playerResult;
	
	public void thePlayerGames()
	{
		new Player();
		StringBuffer getName = Player.name;
		StringBuffer playerName = getName;
				
		BufferedReader playerReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("");
		System.out.println(playerName + " please choose Rock, Paper or Scissor");
		
		try
		{
			result = playerReader.readLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		if(result.equalsIgnoreCase("Rock"))
		{
			System.out.println("");
			System.out.println(playerName + " chose Rock");
		}
		else if(result.equalsIgnoreCase("Paper"))
		{
			System.out.println("");
			System.out.println(playerName + " chose Paper");
		}
		else if(result.equalsIgnoreCase("Scissor"))
		{
			System.out.println("");
			System.out.println(playerName + " chose Scissor");
		}
		else
		{
			System.out.println("");
			System.out.println("Invalid choice, try again");
			thePlayerGames();
		}
		
		playerResult = result;
	}
}
