package ex04controlstatement;

import java.util.Scanner;

public class P01practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		char operator;
		
		System.out.println("숫자1:");
		num1 = scanner.nextInt();
		System.out.println("숫자2:");
		num2 = scanner.nextInt();
		System.out.println("사칙연산:");
		operator = scanner.next().charAt(0);
		
		if (operator=='+') {
			System.out.printf("%d+%d=%2d",num1,num2,num1+num2);
		}
		else if (operator=='-') {
			System.out.printf("%d-%d=%2d",num1,num2,num1-num2);
		}
		else if (operator=='*') {
			System.out.printf("%d*%d=%2d",num1,num2,num1*num2);
		}
		else if (operator=='/') {
			System.out.printf("%d/%d=%2d",num1,num2,num1/num2);
		}
		else {
			System.out.println("잘못된 사칙연산");
		}
//		
		switch (operator) {
			case '+' :
				System.out.printf("%d+%d=%2d",num1,num2,num1+num2);
				break;
			case '-':
				System.out.printf("%d-%d=%2d",num1,num2,num1-num2);
				break;
			case '*':
				System.out.printf("%d*%d=%2d",num1,num2,num1*num2);
				break;
			case '/':
				System.out.printf("%d/%d=%2d",num1,num2,num1/num2);
				break;
			default :
				System.out.println("잘못된 사칙연산");
				break;
		}
	}

}



























