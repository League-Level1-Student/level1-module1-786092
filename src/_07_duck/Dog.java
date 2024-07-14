package _07_duck;

public class Dog {
	int friends = 0;
	String food = "";
	Dog(String food, int friends){
		this.food = food;
		this.friends = friends;
	}
	void playful() {
		System.out.println("Wagging my tail");
	}
	void bark() {
		System.out.println("RUFF,RUFF!!!");
	}
}
