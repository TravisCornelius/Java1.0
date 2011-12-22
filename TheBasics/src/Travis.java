public class Travis {

	int age;
	
	public Travis(int age) {
		this(age, "Travis");
	}
	
	public Travis(int age, String name) {
		this.age = age;
		System.out.print ( name + " " + this.age);
	}
	
}
