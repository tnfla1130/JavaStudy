package ex05method;

import java.util.Scanner;

public class E04MethodType03_2 {

	/*
	퀴즈] 사용자로부터 2개의 숫자를 입력받아 이에 해당하는 구구단을 출력하는 메서드를 작성하시오. 무조건 첫번째 입력받는수가 작아야한다.
	입력예]
		첫번째숫자 : 3
		두번째숫자 : 12
		3*1=3 3*2=6........
		........
		...................12*9=108
	메서드명 : inputGugudan(int sNum, int eNum)
	 */


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째숫자");
		int s =scanner.nextInt();
		System.out.println("두번째숫자");
		int e =scanner.nextInt();
		inputGugudan(s,e);
	}
	
	static void inputGugudan(int sNum,int eNum) {
		
		for (int i = sNum;i<=eNum;i++) {
			for(int su=1;su<=9;su++) {
				System.out.printf("%d*%d=%-2d ",i,su,i*su);
			}
			System.out.println();
		}
	}
	//=============================================================================
	//쌤이 한거
//	public class E04MethodType03_2 {
//		static void inputGugudan1(int sNum, int eNum) {
//			int dan = sNum; 
//			while(dan<=eNum) { 
//				int su = 1; 
//				while(su<=9) { 
//					System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
//					System.out.print(" ");
//					su++;
//				}
//				System.out.println(); 
//				dan++;
//			}
//		}
//		
//		static void inputGugudan2(int sNum, int eNum) {
//			for(int dan=sNum ; dan<=eNum ; dan++) {
//				for(int su=1 ; su<=9 ; su++) {
//					System.out.print(dan +"*"+ su +"="+ (dan*su) +" ");
//				}
//				System.out.println();
//			}
//		}
//
//		public static void main(String[] args) {
//			inputGugudan1(3, 12);
//			System.out.println("================================");
//			inputGugudan2(5, 8);
//		}
//	}

}
