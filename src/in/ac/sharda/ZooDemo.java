package in.ac.sharda;

public class ZooDemo {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.add(new Animal());
		z.add(new Animal());
		z.add(new Animal());
		z.add(new Animal());
		z.add(new Animal());
		z.add(new Cat());
		z.add(new Cat());
		z.add(new Dog());
		z.add(new Dog());
		z.add(new Tiger());
		z.add(new Tiger());
		z.add(new Tiger());
		System.out.println(z.count());
		z.speak();
		
	}

}
