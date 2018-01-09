package com.JosiasOberholster;

import java.io.*;

public class NextGame 
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
