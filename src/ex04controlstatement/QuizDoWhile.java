package ex04controlstatement;

public class QuizDoWhile {

	public static void main(String[] args) {
		
		/*
		퀴즈) 다음과 같은 피라미드를 출력하는 프로그램을 
			do~while문으로 작성하시오.
		 *
		 **
		 ***
		 ****
		 *****
		*/
		
		
		//내가 쓴 코드
		int x=1;
		do {
			int y=1;
			do {
				if (x>=y){
					System.out.print("*");	
					
				}
				y+=1;	
			}while(y<=5);
			System.out.println();
			x+=1;
		}while(x<=5);
		
		//쌤이 쓴 코드 1
		//1.행을 위한 반복문 생성
		int a=1;
		do {
			//2.열을 위한 반복문 생성
			int b=1;
			do {
				//3.반복문확인
				System.out.print("*");
				b++;
			//5.행에 해당하는 a의 갯수만큼만 *를 출력한다.
			}while(b<=a);
			//4.5개 출력후 줄바꿈
			System.out.println();
			a++;
		}while(a<=5);
		
		//쌤이 쓴 코드 2
		System.out.println("if문으로 구현하기");
		int i =1;
		do {
			int j=1;
			do {
				//i의 크기만큼 반복해서 *를 출력한다.
				if(i>=j ) {
					System.out.print("* ");
					
				}
				j++;
			}while(j<=5);
			System.out.println();
			i++;
		}while(i<=5);
	}

}
