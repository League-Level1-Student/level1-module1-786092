package _05_popcorn;

public class PopcornRunner {
	public static void main(String[]args) {
		
		Popcorn pop = new Popcorn("Butter");
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(pop);
		
	}
}
