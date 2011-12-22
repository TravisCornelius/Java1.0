public abstract class Car {
	public Car() {
		// TODO Auto-generated constructor stub
		//System.out.print("print");
	}
	
	public double mpg(double miles, double gallons){
		return (miles/gallons);
	}
	
	public abstract void setupComputer();
	
	public abstract void tireSize(int year, String model);
	
	public void speak(){
		System.out.print("I am a Car");
	}
}
