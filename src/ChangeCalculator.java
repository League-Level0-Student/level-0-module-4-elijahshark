//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String ans = JOptionPane.showInputDialog(null, "how many nickels do you have");
		// Convert their answer to an int using Integer.parseInt()
int num = Integer.parseInt(ans);
		// Ask the user how many dimes they have, and convert their answer
String ans1 = JOptionPane.showInputDialog(null, "how many dimes do you have");
int num1 = Integer.parseInt(ans);		
// Ask the user how many quarters they have, and convert their answer
String ans2 = JOptionPane.showInputDialog(null, "how many quarters do you have");
int num2 = Integer.parseInt(ans);
		// Calculate how much money the user has and save it in a double variable 
double money = 0.25 * num2 + 0.10 * num1 + 0.05 * num ;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, " you have "  + money + " dollars" );
	}
}

