public class Person {

	String name;
	int age;
	String eyeColor;
	double height;

	Address address;
	

	/**
	 * @param name
	 * @param age
	 * @param eyeColor
	 * @param height
	 */
	public Person(String name, int age, String eyeColor, double height) {
		this.name = name;
		this.age = age;
		this.eyeColor = eyeColor;
		this.height = height;
	}


	/**
	 * @param name
	 * @param age
	 * @param eyeColor
	 * @param height
	 * @param address
	 */
	public Person(String name, int age, String eyeColor, double height,
			Address address) {
		this.name = name;
		this.age = age;
		this.eyeColor = eyeColor;
		this.height = height;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", eyeColor="
				+ eyeColor + ", height=" + height + ", address=" + address
				+ "]";
	}


	

	
	
	

	/**
	 * @param name
	 * @param age
	 * @param eyeColor
	 * @param height
	 */

}
