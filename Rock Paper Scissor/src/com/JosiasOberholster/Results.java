package com.JosiasOberholster;

public class Results 
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
