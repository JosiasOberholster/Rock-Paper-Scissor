package com.JosiasOberholster;

import java.io.*;

public class Player 
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