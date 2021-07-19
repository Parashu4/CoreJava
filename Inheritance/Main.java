package Inheritance;

public class Main {
	public static void main(String[] args) {
		
		Dog rotwiler=new Dog("Rotwiler", 2, 28, 2, 4, 1, "straight and coarse");
		
		rotwiler.eat();
		rotwiler.walk();
		rotwiler.run();
		 
		Fish s=new Fish("Pamphlet",1,1,4,40);
		s.move(12);

	}


}
