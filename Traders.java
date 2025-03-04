package JavaLibrary;

public class Traders {
	String name;
	int investment;

	Traders(String name, int investment) {
		this.name = name;
		this.investment = investment;

	}

//to String
	@Override
	public String toString() {
		return "name " + name + " investment " + investment;
	}

	public static void main(String[] args) {
		Traders t1 = new Traders("Shivam_ poddar ", 100000);
		Traders t2 = new Traders("Ravi Kishore poddar ", 5000000);
		System.out.println("Poddar Traders");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("----------");
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}
}
