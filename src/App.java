import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// OLD WAY
		// Person p = new Person("Omar Malik", 22, "blue", 5.5);
		// System.out.println(p);

		// SPRING WAY

		// 1. Get access to your Spring container i.e. the beans XML file
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

		Person p1 = (Person) context.getBean("p1");
		Person p2 = (Person) context.getBean("p2");
		Person p3 = (Person) context.getBean("p3");
		Person p4 = (Person) context.getBean("p4");
		
		Address add1 = (Address) context.getBean("add1");
		System.out.println(add1);

		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);

		for (Person person : personList) {
			System.out.println(person);
		}

				Address johnAddress = new Address(1234, "Heavenly Lane", "Warren", "MI", 48092);

				// Dependecy injection of johnAddress
				Person john = new Person("John Doe", 22, "blue", 5.5, johnAddress);

				System.out.println(john);
			}
	
}
