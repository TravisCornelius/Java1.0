public class StartingPoint {
	public static void main(String args[]) {

		Toyota t = new Toyota();
		t.speak();
		
		Car c1, c2, c3;
		c1 = new Toyota();
		c2 = new Honda();
		c3 = new Ford();
		
		c1.speak();
		c2.speak();
		c3.speak();
		
	}
}
