package mapsAndLists;

import java.util.List;

public class Animal {

	String type;
	double height;

	Animal biggestAnimal;

	List<Animal> animals;

	/**
	 * @param type
	 * @param height
	 * @param biggestAnimal
	 * @param animals
	 */
	public Animal(String type, double height, Animal biggestAnimal,
			List<Animal> animals) {
		this.type = type;
		this.height = height;
		this.biggestAnimal = biggestAnimal;
		this.animals = animals;
	}

	@Override
	public String toString() {

		String str = "Jungle [biggestAnimal=" + biggestAnimal + "]";
		str += "\n Animals in the jungle are: ";
		
		return str;

	}

}
