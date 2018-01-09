package com.JosiasOberholster;

public class GameHelper 
{
	public String playerResult;
	public String gameResult;
	public StringBuffer playerName;
	public int gamePoints;
	public int playerPoints;
	public static int pPoints;
	public static int gPoints;
	
	public void theGameHelper()
	{
		Player getName = new Player();
		playerName = getName.name;
		
		PlayerGames playerPlays = new PlayerGames();
		playerResult = playerPlays.playerResult;
		
		Game gamePlays = new Game();
		gameResult = gamePlays.gameHas;

		Results result = new Results();
		
		System.out.println("Game chose: " + gameResult);
		
		if(playerResult.equalsIgnoreCase("Rock") && gameResult.equalsIgnoreCase("Rock"))
		{
			System.out.println("Tie!");
		}
		else if(playerResult.equalsIgnoreCase("Paper") && gameResult.equalsIgnoreCase("Paper"))
		{
			System.out.println("Tie!");
		}
		else if(playerResult.equalsIgnoreCase("Scissor") && gameResult.equalsIgnoreCase("Scissor"))
		{
			System.out.println("Tie!");
		}
		
		else if(playerResult.equalsIgnoreCase("Rock") && gameResult.equalsIgnoreCase("Paper"))
		{
			System.out.println("Game Wins");
			result.gCall();
		}
		else if(playerResult.equalsIgnoreCase("Rock") && gameResult.equalsIgnoreCase("Scissor"))
		{
			System.out.println("Player Wins");
			result.pCall();
		}
		
		else if(playerResult.equalsIgnoreCase("Paper") && gameResult.equalsIgnoreCase("Scissor"))
		{
			System.out.println("Game Wins");
			result.gCall();
		}
		else if(playerResult.equalsIgnoreCase("Paper") && gameResult.equalsIgnoreCase("Rock"))
		{
			System.out.println("Player Wins");
			result.pCall();
		}

		else if(playerResult.equalsIgnoreCase("Scissor") && gameResult.equalsIgnoreCase("Rock"))
		{
			System.out.println("Game Wins");
			result.gCall();
		}
		else if(playerResult.equalsIgnoreCase("Scissor") && gameResult.equalsIgnoreCase("Paper"))
		{
			System.out.println("Player Wins");
			result.pCall();
		}
		
		result.finalResults();
	}
}
