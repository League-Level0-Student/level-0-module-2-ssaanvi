//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random x= new Random();
	
	int r=x.nextInt((4));
	// 3. Print out this variable
System.out.println(r);
	// 4. Get the user to enter a question for the 8 ball
String name =JOptionPane.showInputDialog("Dear player, what is your name?");
JOptionPane.showInputDialog( name+ ", please enter a question for the eight ball into the box below.");
	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
}