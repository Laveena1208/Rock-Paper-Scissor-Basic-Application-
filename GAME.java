//GUI VERSION OF ROCK PAPER SCISSOR

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

enum Selection {ROCK, PAPER,SCISSOR}

class App1 extends JFrame
{
	
	Container c;
	JLabel lblmsg;
	JRadioButton rbrock, rbpaper, rbscissor;
	JButton btnsubmit;
	App1()
	{
		c = getContentPane();
		c.setLayout(null);
		
		Font f = new Font("Arial", Font.BOLD, 20);
		
		lblmsg = new JLabel("PLEASE SELECT ANY ONE OPTION");
		rbrock = new JRadioButton("ROCK", true);
		rbpaper = new JRadioButton("PAPER");
		rbscissor = new JRadioButton("SCISSOR");
		btnsubmit = new JButton("SUBMIT");
		
		lblmsg.setFont(f);
		rbrock.setFont(f);
		rbpaper.setFont(f);
		rbscissor.setFont(f);
		btnsubmit.setFont(f);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbrock);
		bg.add(rbpaper);
		bg.add(rbscissor);
		
		
		lblmsg.setBounds(10,10,400,20);
		rbrock.setBounds(10,50,200,20);
		rbpaper.setBounds(10,100,200,20);
		rbscissor.setBounds(10,150,200,20);
		btnsubmit.setBounds(100,200,200,40);
		
		
		
		c.add(lblmsg);
		c.add(rbrock);
		c.add(rbpaper);
		c.add(rbscissor);
		c.add(btnsubmit);
		
		ActionListener al = (ae) ->
		{
			Selection computer, user;
			//computer choice
			int r = (int)(Math.random() * 3);
			if (r == 0)   			computer = Selection.ROCK;
			else if (r == 1)		computer = Selection.PAPER;
			else         			computer = Selection.SCISSOR;
			
			//USER choice
		
		if (rbrock.isSelected())   			user = Selection.ROCK;
		else if (rbpaper.isSelected())		user = Selection.PAPER;
		else         			user = Selection.SCISSOR;
		
		System.out.println( user + " " + computer);
		String msg = "\n user = " + user + " computer = " + computer;
		
			
		//code to decide winner
		if (computer == Selection.ROCK && user == Selection.ROCK)
				JOptionPane.showMessageDialog(c,"ITS A TIE" + msg);
		else if(computer == Selection.PAPER && user == Selection.PAPER)
				JOptionPane.showMessageDialog(c,"ITS A TIE" + msg);
		else if(computer == Selection.SCISSOR && user == Selection.SCISSOR)
				JOptionPane.showMessageDialog(c,"ITS A TIE" + msg);
		else if(computer == Selection.ROCK && user == Selection.SCISSOR)
				JOptionPane.showMessageDialog(c,"COMPUTER WINS" + msg);
		else if(computer == Selection.PAPER && user == Selection.ROCK)
				JOptionPane.showMessageDialog(c,"COMPUTER WINS" + msg);
		else if(computer == Selection.SCISSOR && user == Selection.PAPER)
				JOptionPane.showMessageDialog(c,"COMPUTER WINS" + msg);
		else if(user == Selection.ROCK && computer == Selection.SCISSOR)
				JOptionPane.showMessageDialog(c,"USER WINS" + msg);
		else if(user == Selection.PAPER && computer == Selection.ROCK)
				JOptionPane.showMessageDialog(c,"USER WINS" + msg);
		else if(user == Selection.SCISSOR && computer == Selection.PAPER)
				JOptionPane.showMessageDialog(c,"USER WINS" + msg);
		};
		btnsubmit.addActionListener(al);
		setTitle("ROCK PAPER SCISSOR GAME:");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
class GAME
{
	public static void main(String args[])
	{
		App1 a = new App1();
	}
}