
public class Listing {

	private String name;
	private int age;

	public String toString() {
		return ("Name:" + name + " Age: " + age);

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}

	public Listing(String name, int age) {
		this.name = name;
		this.age = age;

	}

}
