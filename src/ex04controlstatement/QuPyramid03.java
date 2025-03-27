package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {
		
		for (int i=1; i<6;i++) {
			for(int j=0;j<10;j++) {
				if (i+j >= 6 && j-i <=4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
