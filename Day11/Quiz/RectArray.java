//Quiz01:RectArray.java (p.187-No.3) 2017-05-23 KST
package Quiz;

import java.util.Scanner;

class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() { return width*height; }
}

public class RectArray {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		Rect[] rects = new Rect[4];
		int total = 0;
		for(int i=0; i<rects.length; i++) {
			System.out.print( (i+1) + " 너비와 높이 >>");
			rects[i] = new Rect(scann.nextInt(), scann.nextInt());
		}
		System.out.println("저장하였습니다...");
		for(int i=0; i<rects.length; i++)
			total += rects[i].getArea();
		System.out.println("사각형의 전체 합은 " + total);
		
		scann.close();
	}
}