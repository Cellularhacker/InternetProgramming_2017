//2017-05-11 KST
class Point {//class: Point의 정의
	private int x;
	private int y;
	
	public Point(int x, int y) {	//생성자: 좌표값 두개를 매개변수로 넘겨받아 멤버변수에 대입
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {	//setter: 멤버변수 x의 값을 설정
		this.x = x;
	}
	public void setY(int y) {	//setter: 멤버변수 y의 값을 설정
		this.y = y;
	}
	public int getX() {	//getter: 멤버변수 x의 값을 반환
		return this.x;
	}
	public int getY() {	//getter: 멤버변수 y의 값을 반환
		return this.y;
	}
	
	public String toString() {	//toString 메소드 정의
		return "x:" + this.x + ", y:" + this.y;
	}
	public String toJSON() {	//JSON형태로 내보내는 메소드 정의
		return "{\"x\":\"" + this.x + "\",\"y\":\"" + this.y + "\"}";
	}
}
class Rect {// class: Rect의 정의
	private Point start;
	private Point end;
	
	public Rect(Point p1, Point p2) {	//생성자: Point객체 두개를 받아, 앞의 객체는 멤버변수 start에, 뒤의 객체는 멤버변수 end에 대입
		this.start = p1;
		this.end = p2;
	}
	public Rect(int x1, int y1, int x2, int y2) {	//생성자: 좌표값 두 개치를 받아서 동적 할당후, 그 Reference 값을 멤버 변수에 대입
		this.start = new Point(x1, y1);
		this.end = new Point(x2, y2);
	}
	
	public void setStart(int x, int y) {	//setter: start Point객체에 새로운 좌표값을 대입
		this.start.setX(x);
		this.start.setY(y);
	}
	public void setStart(Point pStart) {	//setter: start Point객체에 새로운 Reference를 대입
		this.start = pStart;
	}
	public void setEnd(int x, int y) {	//setter: end Point객체에 새로운 좌표값을 대입
		this.end.setX(x);
		this.end.setY(y);
	}
	public void setEnd(Point pEnd) {	//setter: end Point객체에 새로운 Reference를 대입
		this.end = pEnd;
	}
	
	public Point getStart() {	//getter: start Point객체의 Reference를 반환
		return this.start;
	}
	public Point getEnd() {	//getter: end Point객체의 Reference를 반환
		return this.end;
	}
	public int getArea() {	//(가로)*(세로) 의 값을 반환
		return (this.end.getX() - this.start.getX()) * (this.end.getY() - this.start.getY()); 
	}
	public int getCircum() {	//2*(가로+세로) 의 값을 반환
		return 2 * (this.end.getX() - this.start.getX()) + (this.end.getY() - this.start.getY());
	}
	
	public String toString() {	//toString 메소드 정의
		return "start->" + start + ", end->" + end;
	}
	public String toJSON() {	//JSON형태로 내보내는 메소드 정의
		return "{\"start\":" + start.toJSON() + ",\"end\":" + end.toJSON();
	}
	
}

public class RectTest {
	public static void main(String[] args) {
		Point p1 = new Point(10, 10);
		Point p2 = new Point(20, 20);
		Rect a = new Rect(p1, p2);
		System.out.print("시작점(" + a.getStart().getX() + "," + a.getStart().getY() + ")");
		System.out.println("끝점(" + a.getEnd().getX() + "," + a.getEnd().getY() + ")");
		System.out.println("넓이=" + a.getArea());
		System.out.println("둘레=" + a.getCircum());
		Rect b = new Rect(10, 10, 20, 20);
		System.out.print("시작점(" + b.getStart().getX() + "," + b.getStart().getY() + ")");
		System.out.println("끝점(" + b.getEnd().getX() + "," + b.getEnd().getY() + ")");
		System.out.println("넓이=" + b.getArea());
		System.out.println("둘레=" + b.getCircum());
	}
}
