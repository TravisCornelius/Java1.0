public class Toyota extends Car {

	public Toyota() {
		// TODO Auto-generated constructor stub
		double mpg = mpg(60.3, 1.9);
	}

	@Override
	public void setupComputer() {
		// TODO Auto-generated method stub
		System.out.print("computer set up!");
	}

	@Override
	public void tireSize(int year, String model) {
		// TODO Auto-generated method stub
		System.out.print("For the model " +model+ " you need a small tire.");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.print("I am a Toyota");
	}

	
}
