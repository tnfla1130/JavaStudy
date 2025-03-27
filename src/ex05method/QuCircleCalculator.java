package ex05method;

import java.util.Scanner;
public class QuCircleCalculator {
	
	static double circleArea(double rad) {
		double circleArea = 3.14 * rad * rad;
		return circleArea;
	}
	static double circleRound(double rad) {
		double circleRound = 3.14 * 2 * rad;
		return circleRound;
	}
	public static void main(String[] args) {
		
//		System.out.println("원의 반지름:");
//		Scanner scanner = new Scanner(System.in);
//		double rad = scanner.nextDouble();
		System.out.println("원의넓이:"+circleArea(5.5));
		System.out.println("원의 둘레:"+circleRound(5.5));
		
		
	}

}
