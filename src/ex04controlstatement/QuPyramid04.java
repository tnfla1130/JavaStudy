package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {
		for (int i=1; i<10;i++) {
			for(int j=1;j<6;j++) {
				if (i>=j && i+j < 11 ) {
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
