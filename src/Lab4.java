import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInt;
		String cont = "y";

		while (cont.equals("y")) {
			System.out.println("Enter an integer: ");
			userInt = scan.nextInt();
			scan.nextLine();
			System.out.println("Number Squared Cubed\n ====== ====== ======");
			
			for (int number = 1; number <= userInt; number++) {

				System.out.println(number + "       " + (number * number) + "       " + (number * number * number));

			}

			System.out.println("Do you want to continue? y/n");
			cont = scan.nextLine();
		}

		scan.close();
		System.out.println("Bye!");

	}
}
