package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {
	
	public static void arithmetic() 
	{
		System.out.println("A:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("B:");
		Scanner scanner1 = new Scanner(System.in);
		int b = scanner1.nextInt();
		System.out.println("덧셈결과:"+ (a+b));
		System.out.println("뺄셈결과:"+ (a-b));
		System.out.println("곱셈결과:"+ (a*b));
		System.out.println("나눗셈 몫 결과:"+ (a/b));
		System.out.println("나눗셈 나머지 결과:"+ (a%b));
		
	}
	
	public static void main(String[] args) {
		arithmetic();

	}

}
