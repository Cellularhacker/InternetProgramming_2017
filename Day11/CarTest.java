//CarTest.java 2017-05-23 KST
class Car {
	private int speed;	//속도
	private int mileage; //주행거리
	private String color; //색상
	
	public Car() {
		speed = mileage = 0;
		color = "red";
	}
	public void speedUp() {	//속도 증가 메소드
		speed += 10;
	}
	public String toString() {//객체의 상태를 문자열로 반환하는 메소드
		return "속도: " + speed + " 주행거리: " + mileage + " 색상: " + color;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car[] cars = new Car[5];	//배열 생성
		for(int i=0; i<cars.length; i++)
			cars[i] = new Car();
		for(int i=0; i<cars.length; i++)
			cars[i].speedUp();
		for(int i=0; i<cars.length; i++)
			System.out.println(cars[i]);
	}
}