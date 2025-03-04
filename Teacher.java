package JavaLibrary;

public class Teacher {
	int salary;
	String name;

	Teacher(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}

	public String toString() {

		return "name " + name + "salary" + salary;
	}

	public static void main(String[] args) {
		Teacher t1 = new Teacher(147000, "Shivam");
		Teacher t2 = new Teacher(2000000, "Ravi Poddar");
		System.out.println(t1);
		System.out.println(t2);

		System.out.println("-------------");

		System.out.println("name" + t1.name + " Salary " + t1.salary);
		System.out.println("name" + t2.name + " Salary " + t2.salary);
	}
}
