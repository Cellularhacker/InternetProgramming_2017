//Calculator2 (2017-04-11)
package MethodExample;

public class Calculator2 {
	double a, b;
	public void setData(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double add() {
		return a + b;
	}
	public double sub() {
		return a - b;
	}
	public double mul() {
		return a * b;
	}
	public double div() {
		return a / b;
	}
	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		cal.setData(20, 10);
		System.out.println("덧셈=" + cal.add());
		System.out.println("뺄셈=" + cal.sub());
		System.out.println("곱셈=" + cal.mul());
		System.out.println("나눗셈=" + cal.div());
	}
}