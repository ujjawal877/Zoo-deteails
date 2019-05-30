package in.ac.sharda;

public class AnimalDemo {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.speak();
		a.walk();
		
	    Cat c = new Cat();
	    c.walk();
		c.speak();
		
		Dog d =new Dog();
		d.speak();
		d.walk();
		d.bite();
		
		Tiger t =new Tiger();
		t.speak();
		t.walk();
			

	}

}
