package ex05method;
//다시해보기
import java.util.Scanner;
public class QuFindPrimeNumber {
	
	static boolean isPrimeNumber(int a) {
		if (a==1) return false;
		
		for (int i =2; i<a;i++) {
			if (a%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("숫자:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("소수인가?"+isPrimeNumber(num));
		
	}

}
