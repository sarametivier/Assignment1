import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	private static Listing[] listingArray;

	public static void main(String[] args) throws FileNotFoundException {
		ReadInListing();
	}

	public static void ReadInListing() throws FileNotFoundException {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = myScanner.nextLine();
		System.out.println("What is your age?");
		int age = myScanner.nextInt();
		myScanner.close();

	}

}
