package extra;

import javax.swing.JOptionPane;

public class RollarCoaster {
public static void main(String[] args) {
String name= JOptionPane.showInputDialog("Dear player,  what is your name?");
String height=JOptionPane.showInputDialog(name +", what is your height? (In Inches)");
int i= Integer.parseInt(height);
if (i>48) {
	JOptionPane.showMessageDialog(null, "Congratulation, "+name+ "! You are tall enough! Enjoy yourself!");
}
else {
	JOptionPane.showMessageDialog(null, "Grow faster " +name+ ", and you might be able to ride next year! Mua-hahahaha...hahahaha");
}















}
}
