package extra;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String name= JOptionPane.showInputDialog("Dear player,  what is your name?");
	String age=JOptionPane.showInputDialog(name +", what is your age?");
	int i= Integer.parseInt(age);	
	if (i>18) {
		JOptionPane.showMessageDialog(null, "Hey " +name+ ", who do YOU think the next president should be?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Yo " +name+ ", who care what you think?! Get lost!!! Mua-hahahaha...hahahaha");
	}






























}
}
