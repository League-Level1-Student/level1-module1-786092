package _07_duck;

public class Cat {
	int friends = 0;
	String food = "";
	Cat(String food, int friends){
		this.food = food;
		this.friends = friends;
	}
	void meow() {
		System.out.println("MEOW");
	}
	void soft() {
		System.out.println("Soft");
	}
}
