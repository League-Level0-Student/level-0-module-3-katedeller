
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 22nd";
		String dadsBirthday = "November 21st";
		String myBirthday = "November 22nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
		
String name = JOptionPane.showInputDialog("What is your name?");
		// 3. Print out what the user typed
	JOptionPane.showMessageDialog(null, name);
		// 4. if user asked for "mom"
			//print mom's birthday
	if (name.equals("mom")) {
		JOptionPane.showConfirmDialog(null, momsBirthday);
	}
		// 5. if user asked for "dad"
			// print dad's birthday
	if (name.equals("dad")) {
		JOptionPane.showConfirmDialog(null, dadsBirthday);
	}
		// 6. if user asked for your name
			// print myBirthday
		if (name.equals("kate")) {
			JOptionPane.showConfirmDialog(null, myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
	}