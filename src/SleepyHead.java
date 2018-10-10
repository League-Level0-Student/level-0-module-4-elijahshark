
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */

		int num = JOptionPane.showConfirmDialog(null, "Is it a Vacation day?", "Sleepy Head",
				JOptionPane.YES_NO_OPTION);
		if (num == 0) {
			isVacation = true;
		} else {
			isVacation = false;
		}
		int num0 = JOptionPane.showConfirmDialog(null, "Is it a Weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if (num0 == 0) {
			isWeekday = true;
		} else {
			isWeekday = false;
		}

		if (isVacation == true || isWeekday == false) {
			JOptionPane.showMessageDialog(null, "SLEEEP INNNN");
		} else if (isWeekday == true) {
			JOptionPane.showMessageDialog(null, "GET UP LAZY BONE");
		} else if (isVacation == true && isWeekday == true) {
			JOptionPane.showMessageDialog(null, "SLEEEP INNNN");
		}
	}
}
