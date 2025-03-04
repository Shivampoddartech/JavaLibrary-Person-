package JavaLibrary;

public class Students {
	String name;

	 Students(String name) { // void ????
		this.name = name;
	}

	public String toString() {
		return name;
	}
	public static void main(String[] args) {
		Students s1= new Students("Shivam");
		Students s2 = new Students("Ravi");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
			
	}

}
