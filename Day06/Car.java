//2016-04-18
public class Car {
	int velocity;	// declare velocity with int.
	int wheelNum;	// declare numbr of wheels with int
	String carName;	// declare name of the car with String Class
	public Car(String name) {	// Generator that save the name by String Class
		carName = name;
	}
	public Car(int speed) {	// Generator that gets velocity value initially.
		velocity = speed;
	}
	public Car(int speed, String name) {	// Generator that gets velocity value and name initially.
		carName = name;
		velocity = speed;
	}
	public void speedUp() {
		velocity = velocity + 1;
	}
	// Overloaded Method. Setting up the speed by parameter
	public void speedUp(int speed) {
		velocity += speed;
	}
	public void speedDown() {
		velocity = velocity - 1;
		if(velocity < 0)
			velocity = 0;
	}
	public void stop() {
		velocity = 0;
	}
	public static void main(String args[]) {
		Car myCar, yourCar;
		myCar = new Car("소나타");
		yourCar = new Car(80, "라노스");
		myCar.speedUp(100);	// Resize the velocity with overloaded Method. speed it up like 100km/h. 
		yourCar.speedUp();
		System.out.println(myCar.carName + " : " + myCar.velocity);
		System.out.println(yourCar.carName + " : " + yourCar.velocity);
	}
}
