package JavaLibrary;

public class Employees {
	String name;

	public Employees(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		Employees e1 = new Employees("Ravi Kishore Poddar");
		Employees e2 = new Employees("Shivam poddar, chotta Bhai");

		System.out.println(e1);
		System.out.println(e2);

		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}
}
