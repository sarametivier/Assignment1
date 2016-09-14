import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	// static // private static Listing[] listingArray;

	public static void main(String[] args) throws FileNotFoundException {
		ReadInListing();
	}

	public static void ReadInListing() throws FileNotFoundException {
		DataStructure struct = new DataStructure(10);
		Scanner myScanner = new Scanner(System.in);
		// DataStructure struct = new DataStructure(10);
		// for (int i = 0; i < 10; i++) {
		while (myScanner.hasNext()) {

			// Scanner myScanner = new Scanner(System.in);
			// System.out.println("What is your name?");
			// String name = myScanner.nextLine();
			// System.out.println("What is your age?");
			// int age = myScanner.nextInt();
			String line = myScanner.nextLine();
			int idx = line.indexOf(',');
			String name = line.substring(0, idx);
			int age = Integer.parseInt(line.substring(idx + 1).trim());

			System.out.println("Name = " + name + ", age = " + age);

			Listing myListing = new Listing(name, age);

			// taking listing and adding it to data structure
			struct.addListing(myListing);

		}
		myScanner.close();
		struct.showAllListings();
	}
}
