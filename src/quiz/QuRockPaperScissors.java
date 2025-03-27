package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors {
	static Random random = new Random();
	static Scanner scan = new Scanner(System.in);
	public interface Game {
		int SCISSOR=1, ROCK=2, PAPER=3;
	}

	/*
	i로 게임횟수세지말고 gamecount변수만들어서 세기
	중첩 if문
	게임횟수세는 if문 따로 만들기
	뺄셈으로 하는 방법이 있음
	displayRPS라는 메서드를 만듬
	 */
	public static void Game() {
		
		int com;
		int user;
		int i=0;
		com = random.nextInt(3)+1;
		System.out.println("컴퓨터:"+com);
		
		
		System.out.println
		("무엇을 내겠습니까?(1:가위, 2:바위, 3:보):");
		user = scan.nextInt();
			
			if (user == 1) {
				if(com ==1) {
					System.out.println("사용자: 가위, 컴퓨터:가위");
					System.out.println("비겼습니다.");
				}
				else if(com ==2) {
					System.out.println("사용자: 가위, 컴퓨터:바위");
					System.out.println("졌습니다.");
				}
				else if(com ==3) {
					System.out.println("사용자: 가위, 컴퓨터:보");
					System.out.println("이겼습니다.");
				}
				i++;
			}
			else if (user == 2) {
				if(com ==1) {
					System.out.println("사용자: 바위, 컴퓨터:가위");
					System.out.println("이겼습니다.");
				}
				else if(com ==2) {
					System.out.println("사용자: 바위, 컴퓨터:바위");
					System.out.println("비겼습니다.");
				}
				else if(com ==3) {
					System.out.println("사용자: 바위, 컴퓨터:보");
					System.out.println("졌습니다.");
				}
				i++;
			}
			else if (user ==3) {
				if(com ==1) {
					System.out.println("사용자: 보, 컴퓨터:가위");
					System.out.println("졌습니다.");
				}
				else if(com ==2) {
					System.out.println("사용자: 보, 컴퓨터:바위");
					System.out.println("이겼습니다.");
				}
				else if(com ==3) {
					System.out.println("사용자: 보, 컴퓨터:보");
					System.out.println("비겼습니다.");
				}
				i++;
			}
			else {
				System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
				return;
			}
		}

	
	public static void main(String[] args) {
		int i =0;
		int restart;
		while (true) {
			
			Game();
			i++;
			
			if (i==5) {
				System.out.println("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까?"
						+"재시작(1), 종료(0)");
				restart = scan.nextInt();
				
				if (restart==0) {
					break;
				}
				else if(restart==1) {
					i=0;
					continue;
					/*
					continue는 굳이 할 필요없음
					 */
				}
				else {
					System.out.println("잘못 입력하셨습니다."
							+ "재시작(1), 종료(0) 중에 입력하세요");
					return;
				}
			}
			
		}
		
	}

}




























