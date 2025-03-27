package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {
		int i=1;
		
		while (i<=5) {
			int j=1; //위치 조심
			while(j<=5) {
				if (i>=j) {
					System.out.print("* ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
