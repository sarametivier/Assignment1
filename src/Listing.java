
public class Listing {

	private String name;
	private int age;

	public String toString() {
		return ("Name:" + name + " Age: " + age);

	}

	public void input() {

	}

	public void setName(String name) {
		this.name = name;
	}

	// redeclaring age as a String??
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}
}
