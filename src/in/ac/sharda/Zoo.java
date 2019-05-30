package in.ac.sharda;

import java.util.ArrayList;

import java.util.List ;


public class Zoo {
	private List<Animal> animals;
	
	public Zoo() {
		this.animals =new ArrayList<>();
		
	}
	
	public void add(Animal a) {
		this.animals.add(a);
		
	}
	
	public void speak() {
	for(Animal a : animals) {
		a.speak();
	 }
	}
	
	public int count() {
		return animals.size();
	}
}

