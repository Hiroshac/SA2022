package computing;

import java.util.Scanner;

public class Computing implements ComputingInt {

	public String publisherervice() {
		// TODO Auto-generated method stub
		return "\n\n               Welcome TO THE AHNP INSTITUTE...!!!               ";
	}

	@Override
	public int CheckEligibility() {
		// TODO Auto-generated method stub
		System.out.println("\n\n\n\nPlease fill the details\n\n");
		
		System.out.print("Enter the name :");
		Scanner n = new Scanner(System.in);
		String name = n.next();

		System.out.print("Enter the school :");
		Scanner s = new Scanner(System.in);
		String school = s.next();
		
		System.out.print("Enter the gender(m/f) :");
		Scanner g = new Scanner(System.in);
		String gender = g.next();
		
		System.out.print("Enter the email address :");
		Scanner e = new Scanner(System.in);
		String email = e.next();
		
		System.out.print("Enter the phone number :");
		Scanner p = new Scanner(System.in);
		int phoneNo = p.nextInt();
		
		
		
		System.out.println("\n\n\n\n* If you pass AL enter  1\n");
		System.out.println("* If you fail AL enter  2 ");

		System.out.print("\n\nEnter the AL status  :");

		Scanner select = new Scanner(System.in);
		int selection = select.nextInt();

		if (selection == 1) {
			System.out.println("\n\n***Congragulations "+name+"!, you have to face the apitude test***\n\n\n");
			System.out.println("We send the marks of the apitude test to your email ("+email+") please check the email.\n\n\n");
			

			while (true) {
				
				System.out.print("Enter the marks :");

				Scanner sc = new Scanner(System.in);
				float mrk = sc.nextFloat();

				if ((mrk > 100) || (mrk < 0)) {
					System.out.println("\n\nYou entered invalid marks. Please re-enter");
				} else if (mrk >= 75) {
					System.out.println(
							"\n\n***Congradulations "+name+"!, you have passed the apptitude test. Now you can select a course***");

					System.out.println("\n\nWelcome to the degree management department");
					System.out.println(
							"According to your AL stream, we are going to recomend pre-defined courses for your stream.");
					System.out.println("			Maths   1 \n			Biology    2\n			Commerce    3");

				}

				System.out.print("Enter the stream code :");
				Scanner st = new Scanner(System.in);
				int stream = st.nextInt();

				switch (stream) {
				case 1:
					System.out
							.println("\n\nYou can choose these courses. \n Software Engineering  1\n Data Science   2\n Information Technology    3\n\n\n");
					break;
				case 2:
					System.out
							.println("You can choose these courses. \n Software Engineering    4\n Information Technology\n\n\n");
					break;
				case 3:
					System.out.println("You can choose these courses. \n Information Technology\n\n\n");

					break;
				}
				
//				System.out.println("\n\nWelcome to Computing\n\n\n");
//				System.out.println("*Software engineering 1");
//				System.out.println("*Cyber security 2");
//				System.out.println("*Information Technology  3");

				System.out.print("\n\nPlease select the Degree code :");
				Scanner sc1 = new Scanner(System.in);
				int selectd = sc1.nextInt();

				switch (selectd) {
				case 1:
					System.out.println("\n\nWelcome to Software Engineering");
					break;
				case 2:
					System.out.println("\n\nWelcome to Cyber Security");
					break;
				case 3:
					System.out.println("\n\nWelcome to Data science");
					break;
				}
				System.out.println("\n\n***AHNP Institute providing chacne to buy a laptop with reasonable*** \n\n");

				System.out.print("Do you want buy ? (1 -Yes/ 0 -No) :");
				Scanner buy = new Scanner(System.in);
				int pref = buy.nextInt();

				if (pref == 1) {

					System.out.println("*************************************************************** ");

					System.out.println("Model				  Price  	code");
					System.out.println("MacBook pro			250000.00	1");
					System.out.println("MacBook Air			200000.00	2");
					System.out.println("Asus Rog			300000.00	3");

					System.out.println("If you prefer to buy a laptop please place a order with the code");

					System.out.print("Enter the laptop code :");
					Scanner lap = new Scanner(System.in);
					int cal = lap.nextInt();

					if ((selectd == 1) && (cal == 1)) {
						System.out.println("Payment details pf the Software engineering\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						double tot = 175000.00 + 250000.00;

						System.out.println("\n\nTotal payment for the 1st semaster(Includes the price of the laptop ) :"
								+ tot + "\n\n\n\n");

						System.out.println("*************************************************************** ");

					} else if ((selectd == 1) && (cal == 2)) {
						System.out.println("Payment details pf the Software engineering\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						double tot = 175000.00 + 200000.00;

						System.out.println("\n\nTotal payment for the 1st semaster(Includes the price of the laptop ) :"
								+ tot + "\n\n\n\n");

						System.out.println("*************************************************************** ");

					}

					else if ((selectd == 1) && (cal == 3)) {
						System.out.println("Payment details pf the Software engineering\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						double tot = 175000.00 + 300000.00;

						System.out.println("\n\nTotal payment for the 1st semaster(Includes the price of the laptop ) :"
								+ tot + "\n\n\n\n");

						System.out.println("*************************************************************** ");

					}

					else if ((selectd == 2) && (cal == 1)) {
						System.out.println("Payment details pf the Cyber Security\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						double tot = 175000.00 + 250000.00;

						System.out.println("\n\nTotal payment for the 1st semaster(Includes the price of the laptop ) :"
								+ tot + "\n\n\n\n");

						System.out.println("*************************************************************** ");

					}

					else if ((selectd == 2) && (cal == 2)) {
						System.out.println("Payment details pf the Cyber Security\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						double tot = 175000.00 + 200000.00;

						System.out.println("\n\nTotal payment for the 1st semaster(Includes the price of the laptop ) :"
								+ tot + "\n\n\n\n");

						System.out.println("*************************************************************** ");

					}

					else if ((selectd == 2) && (cal == 3)) {
						System.out.println("Payment details pf the Cyber Security\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						double tot = 175000.00 + 300000.00;

						System.out.println("\n\nTotal payment for the 1st semaster(Includes the price of the laptop ) :"
								+ tot + "\n\n\n\n");

						System.out.println("*************************************************************** ");

					} else if ((selectd == 3) && (cal == 1)) {
						System.out.println("Payment details pf the Data science\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						double tot = 175000.00 + 250000.00;

						System.out.println("\n\nTotal payment for the 1st semaster(Includes the price of the laptop ) :"
								+ tot + "\n\n\n\n");

						System.out.println("*************************************************************** ");

					}

					else if ((selectd == 3) && (cal == 2)) {
						System.out.println("Payment details pf the Data science\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						double tot = 175000.00 + 200000.00;

						System.out.println("\n\nTotal payment for the 1st semaster(Includes the price of the laptop ) :"
								+ tot + "\n\n\n\n");

						System.out.println("*************************************************************** ");

					}

					else if ((selectd == 3) && (cal == 3)) {
						System.out.println("Payment details pf the Data science\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						double tot = 175000.00 + 300000.00;

						System.out.println("\n\nTotal payment for the 1st semaster(Includes the price of the laptop ) :"
								+ tot + "\n\n\n\n");

						System.out.println("*************************************************************** ");

					}

				} else if (pref == 0) {

					if (selectd == 1) {
						System.out.println("Payment details pf the Software engineering\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						System.out.println("\n\nTotal payment for the 1st semaster : 175000.00\n\n\n\n");

					} else if (selectd == 2) {
						System.out.println("Payment details pf the Cyber security\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						System.out.println("\n\nTotal payment for the 1st semaster : 175000.00\n\n\n\n");

					} else if (selectd == 3) {
						System.out.println("Payment details pf the Data science\n ");

						System.out.println("Year		Semaster 1		Semaster 2");
						System.out.println("1			175000.00		175000.00");
						System.out.println("2			175000.00		175000.00");
						System.out.println("3			200000.00		200000.00");
						System.out.println("1			215000.00		215000.00");

						System.out.println("\n\nTotal payment for the 1st semaster : 175000.00\n\n\n\n");

					}

				}

			}
		}
		return CheckEligibility();
	}

}
