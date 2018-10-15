package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		String name =JOptionPane.showInputDialog("Dear user, what is your name?");
		String animal=JOptionPane.showInputDialog(name + ", what animal would you like to hear?");
		/* 2. Make it so that the user can keep entering new animals. */
		for(int i=0; i<6; i++) {
			
		
		if (animal.equalsIgnoreCase("dog")) {
			 playWoof();
			 JOptionPane.showInputDialog(name + ", what other animal would you like to hear?");
		}
		if (animal.equalsIgnoreCase("cat")) {
			 playMeow();
			 JOptionPane.showInputDialog(name + ", what other animal would you like to hear?");
				 
			 }
		if (animal.equalsIgnoreCase("cow")) {
			 playMoo();
			 JOptionPane.showInputDialog(name + ", what other animal would you like to hear?");
		}
		if (animal.equalsIgnoreCase("duck")) {
			 playQuack();
			 JOptionPane.showInputDialog(name + ", what other animal would you like to hear?");
	}
		if (animal.equalsIgnoreCase("llama")) {
			 playLlama();
			 JOptionPane.showInputDialog(name + ", what other animal would you like to hear?");
			 }
	else {
		JOptionPane.showMessageDialog(null, "Sorry, " +name+ ". We don't have those animals on our farm. What other animal would you like to hear?");
	}
		
	}
	
	}
	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
