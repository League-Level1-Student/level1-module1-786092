package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[]args) {
		
		String flavor = JOptionPane.showInputDialog("Enter a popcorn flavor? ");
		String minutes = JOptionPane.showInputDialog("How many minutes should we cook the popcorn in the microwave?");
		int time = Integer.parseInt(minutes);
		Popcorn pop = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(pop);
		microwave.setTime(time);
		microwave.startMicrowave();
	}
}
