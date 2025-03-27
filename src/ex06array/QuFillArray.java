package ex06array;

import java.util.Scanner;
public class QuFillArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		int add;
		
		for(int i=1; i<=10; i++) {
			System.out.println(i + "번째 정수를 입력하세요:");
			add = scan.nextInt();
			arr[i-1] = add;
		}
		System.out.println("순서대로 입력된 결과");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
	
		}
		///////////////////////////////////////////////
		int[] arr2 = new int[10];
		int indexStart = 0;
		int indexEnd = arr2.length-1;
		System.out.println();
		System.out.println("홀수/짝수 구분입력결과");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				arr2[indexEnd--] = arr[i];
			}
			else {
				arr2[indexStart++] = arr[i];
			}
			
		}
		for(int i=0; i<arr2.length; i++) {
			
			System.out.print(arr2[i]);
		}
	}
}
