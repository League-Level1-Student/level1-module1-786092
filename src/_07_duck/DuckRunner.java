package _07_duck;

public class DuckRunner {
	public static void main(String[]args) {
		Duck duck = new Duck("Corn",5);
		duck.quack();
		duck.waddle();
		Dog dog = new Dog("Bones",3);
		dog.playful();
		dog.bark();
		Cat cat = new Cat("Milk", 0);
		cat.meow();
		cat.soft();
	}
}
