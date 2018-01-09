package com.JosiasOberholster;

public class Game 
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
