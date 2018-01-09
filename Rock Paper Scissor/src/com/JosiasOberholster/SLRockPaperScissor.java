package com.JosiasOberholster;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SLRockPaperScissor
{
	public static void main(String[] args)
	{
		new Player().thePlayer();
		new Game().theGame();
		new GameHelper().theGameHelper();		
		new NextGame().theNextGame();
	}
	
	public static class Player 
	{
		public static StringBuffer name;
		public String playerName;
		public String question;
		
		public void thePlayer()
		{
			String playerName = null;
			String question = null;
			
			StringBuffer buffer = new StringBuffer();
			BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Insert player name:");
			
			try
			{
				playerName = nameReader.readLine();
				buffer.append(playerName);
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
			System.out.println("\nPlayer name is: " + buffer);
			
			BufferedReader nameReady = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Is that Correct?[yes/no]");
			
	        try
	        {
	            question = nameReady.readLine();
	        }
	        catch(Exception ex)
	        {
	            ex.printStackTrace();
	        }

	        if(question.equalsIgnoreCase("yes"))
	        {
	            System.out.println("\nWelcome " + buffer);
	            name = buffer;
	            new PlayerGames().thePlayerGames();
	        }
	        else if(question.equalsIgnoreCase("no"))
	        {
	            buffer.delete(0, buffer.length());
	            thePlayer();
	        }
	        else
	        {
	            System.out.println("\nReply with a yes or no");
	            buffer.delete(0, buffer.length());
	            thePlayer();
	        }

	       
		}
	}
	
	public static class Game 
	{
		public static String gameHas;
		
		public void theGame()
		{
			String[] gameChoose = {"Rock", "Paper", "Scissor", "Paper", "Scissor", "Rock", "Scissor", "Rock", "Paper"};
			
			int length = gameChoose.length;
			int chooseRand = (int)(Math.random() * length);
			String gameChose = gameChoose[chooseRand];
			
			gameHas = gameChose;
		}
	}
	
	public static class GameHelper 
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
	
	public static class NextGame 
	{
		public void theNextGame()
		{		
			Results results = new Results();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("\nPlay again? [Yes/No]");
			String read = null;
			
			try
			{
				read = reader.readLine();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
			if(read.equalsIgnoreCase("Yes"))
			{
				GameHelperNewGame newGame = new GameHelperNewGame();
				newGame.theGameHelperNewGame();
				theNextGame();
			}
			else if(read.equalsIgnoreCase("No"))
			{
				System.out.println("\nFinal result is: ");
				results.finalResults();
			}	
			else
			{
				System.out.println("\nInvalid choice");
				theNextGame();
			}
		}
	}
	
	public static class GameHelperNewGame 
	{
		public void theGameHelperNewGame()
		{
			new PlayerGames().thePlayerGames();
			new Game().theGame();
			new GameHelper().theGameHelper();
		}
	}
	
	public static class PlayerGames
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
	
	public static class Results 
	{
		public static int playerResult;
		public static int gameResult;
		
		public static int pCall()
		{
			playerResult++;
			return playerResult;
		}
		
		public static int gCall()
		{
			gameResult++;
			return gameResult;
		}
		
		public void finalResults()
		{		
			System.out.println("\nPlayer Points: " + playerResult);
			System.out.println("Game Points: " + gameResult);
		}
	}
}