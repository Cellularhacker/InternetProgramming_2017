//Calculator1 (2017-04-11)
package MethodExample;

public class Calculator1 {
	public double add(double a, double b) {
		return a + b;
	}
	public double sub(double a, double b) {
		return a - b;
	}
	public double mul(double a, double b) {
		return a * b;
	}
	public double div(double a, double b) {
		return a / b;
	}
	public static void main(String[] args) {
		Calculator1 cal = new Calculator1();
		double r = cal.add(20, 10);
		System.out.println("덧셈=" + r);
		r = cal.sub(20, 10);
		System.out.println("뺄셈=" + r);
		r = cal.mul(20, 10);
		System.out.println("곱셈=" + r);
		r = cal.div(20, 10);
		System.out.println("나눗셈=" + r);
	}
}