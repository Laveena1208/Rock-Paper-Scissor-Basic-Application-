//CUI VERSION OF ROCK PAPER SCISSOR

import java.io.*;
enum Selection {ROCK, PAPER,SCISSOR}

class RPSGAME
{
	public static void main(String args[])
	{
		Console c = System.console();
		Selection computer, user;
		
		//computer choice
		int r = (int)(Math.random() * 3);
		if (r == 0)   			computer = Selection.ROCK;
		else if (r == 1)		computer = Selection.PAPER;
		else         			computer = Selection.SCISSOR;
		
		
		//USER choice
		int op = Integer.parseInt(c.readLine("1 ROCK, 2 PAPER AND 3 SCISSOR"));
		if (op == 1)   			user = Selection.ROCK;
		else if (op == 2)		user = Selection.PAPER;
		else         			user = Selection.SCISSOR;
		
		System.out.println( user + " " + computer);
		
		//code to decide winner
		if (computer == Selection.ROCK && user == Selection.ROCK)
				System.out.println("ITS A TIE");
		else if(computer == Selection.PAPER && user == Selection.PAPER)
				System.out.println("ITS A TIE");
		else if(computer == Selection.SCISSOR && user == Selection.SCISSOR)
				System.out.println("ITS A TIE");
		else if(computer == Selection.ROCK && user == Selection.SCISSOR)
				System.out.println("COMPUTER WINS");
		else if(computer == Selection.PAPER && user == Selection.ROCK)
				System.out.println("COMPUTER WINS");
		else if(computer == Selection.SCISSOR && user == Selection.PAPER)
				System.out.println("COMPUTER WINS");
		else if(user == Selection.ROCK && computer == Selection.SCISSOR)
				System.out.println("USER WINS");
		else if(user == Selection.PAPER && computer == Selection.ROCK)
				System.out.println("USER WINS");
		else if(user == Selection.SCISSOR && computer == Selection.PAPER)
				System.out.println("USER WINS");
		
	}
}