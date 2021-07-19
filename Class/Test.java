package Class;

public class Test {
	public static void main(String[] args) {
		Car bmw= new Car();
		Car audi= new Car();
		bmw.setModel("GTX");
		System.out.println(bmw.getModel());
		audi.setModel("AudiS");
		System.out.println(audi.getModel());
		audi.setBrand("Audi");
		System.out.println(audi.getBrand());
		audi.setColor("Black");
		System.out.println(audi.getColor());
		audi.setCost(10000.00);
		System.out.println(audi.getCost());
		
		
		
	}

}
