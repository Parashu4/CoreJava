package Inheritance;

public class Fish extends Animal {
	public Fish(String name, int brain, int body, int size, int weight) {
		super(name, 1, 1, size, weight);
		
		
	}
	public void move(int speed) {
		System.out.println("Swimming"+speed);
		super.move(5);
	}


}
