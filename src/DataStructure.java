
public class DataStructure {
	Listing[] data;
	int size = 50;
	int next = 0;

	public DataStructure(int size) {
		// super();
		this.size = size;

		data = new Listing[size];
	}

	public void addListing(Listing newListing) {
		// new data into next block
		data[next] = newListing;
		// move empty space over
		next = next + 1;
	}

	public void showAllListings() {
		// loop

		for (int i = 0; i < next; i++) {
			System.out.println(data[i]);
		}
	}

}
