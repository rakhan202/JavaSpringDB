import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		System.out.println("What is your age?");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age < 13){
			System.out.println("child");
		}else if (age >= 13 && age <= 19){
			System.out.println("teenager");
		}else{
			System.out.println("adult");
		}
		
		scan.close();
	}
}
