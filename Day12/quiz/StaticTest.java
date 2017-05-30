//StaticTest.java / Quiz02 (p.188 - No.5) / 2017-05-30 KST
package quiz;

class Circle {
	private int radius;
	public Circle(int radius) { this.radius = radius; }
	public int getRadius() { return this.radius; }
	public void setRadius(int radius) { this.radius = radius; }
}

class CircleManager {
	public static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	public static boolean equals(Circle a, Circle b) {
		if(a.getRadius() == b.getRadius())
			return true;
		else
			return false;
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleManager.equals(pizza, waffle);
		if(res == true)
			System.out.println("pizza와 waffle 크기 같음");
		else
			System.out.println("pizza와 waffle 크기 다름");
		
		CircleManager.copy(pizza, waffle);
		res = CircleManager.equals(pizza, waffle);
		if(res == true)
			System.out.println("pizza와 waffle 크기 같음");
		else
			System.out.println("pizza와 waffle 크기 다름"); 
	}
}