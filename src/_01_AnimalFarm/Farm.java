package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(new Cow());
		farm.add(new Chicken());
		farm.add(new Sheep());
		farm.add(new Pig());
		farm.add(new Sheep());
		farm.add(new Pig());
		
		for (Animal i : farm) {
			i.makeNoise();
			i.eat();
		}
	}

}
