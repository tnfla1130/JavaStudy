package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {
		int i=1;
		
		do {
			int j=1; //위치 조심
			do {
				if (i<=j) {
					System.out.print("* ");
				}
				j++;
			} while(j<=5);
			System.out.println();
			i++;
				
		} while(i<=5);
	}
}
