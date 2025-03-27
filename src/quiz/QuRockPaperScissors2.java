package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors2 {
	
	public interface Game {
		int SCISSOR=1, ROCK=2, PAPER=3;
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com;
		int my;
		com = scan.nextInt();
		my = random.nextInt();
		
		if (com==1&&my==3||com==2&&my==1||com==3&&my==2) {
			
		}
		
	}

}




























