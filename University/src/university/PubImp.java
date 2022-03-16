package university;

import java.util.Scanner;

public class PubImp implements Pub {

	public String publisherervice() {
		// TODO Auto-generated method stub
		return "\n\n               Welcome to Rental Services...!!!               ";
	}

	@Override
	public int CheckEligibility() {
		// TODO Auto-generated method stub
		System.out.println("If you pass AL enter 1\n		Fail enter 2 ");

		System.out.println("Enter the AL status :");

		Scanner select = new Scanner(System.in);
		int selection = select.nextInt();

		if (selection == 1) {
			System.out.println("Congragulations! Now you have to face the apitude test");

			while (true) {
				System.out.println("Enter the marks");

				Scanner sc = new Scanner(System.in);
				float mrk = sc.nextFloat();

				if ((mrk > 100) || (mrk < 0)) {
					System.out.println("You entered invalid marks. Please re-enter");
				} else if (mrk >= 75) {
					System.out.println(
							"Congradulations! You have passed the apptitude test. Now you can select a course");

					System.out.println("Welcome to the degree management department.");
					System.out.println(
							"According to your AL stream, we are going to recomend pre-defined courses for your stream.");
					System.out.println("    Maths   1 \n			Biology    2\n			Commerce    3");

				}

				System.out.println("Enter the stream code :");
				Scanner st = new Scanner(System.in);
				int stream = st.nextInt();

				switch (stream) {
				case 1:
					System.out
							.println("You can choose these courses. \n Enginering  1\n Computing   2\n Buisness    3");
					break;
				case 2:
					System.out
							.println("You can choose these courses. \n Medicine    4\n Computing   2\n Buisness    3");
					break;
				case 3:
					System.out.println("You can choose these courses. \n Computing   2\n Buisness    3");

					break;
				}
				System.out.println("Enter the preferd course code");
				Scanner cr = new Scanner(System.in);
				int crs = cr.nextInt();

				return crs;
			}

		}
		return 0;

	}

}

