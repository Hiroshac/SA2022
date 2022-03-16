package computing;

import java.util.Scanner;

public class Computing implements ComputingInt {

	@Override
	public int selectDegree() {
		System.out.println("Welcome to Computing");
		System.out.println("Software engineering 1");
		System.out.println("Cyber security 2");
		System.out.println("Data science 3");

		System.out.println("Please select the Degree code :");
		Scanner sc = new Scanner(System.in);
		int selectd = sc.nextInt();

		if (selectd == 1) {
			System.out.println("Welcome to Software");
		          
		} else if(selectd==2) {
			System.out.println("welcome to Cyber Security");

		}

		return selectDegree();
	}

}
