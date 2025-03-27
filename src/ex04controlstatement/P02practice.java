package ex04controlstatement;


public class P02practice {

	public static void main(String[] args) {
		
		
		for(int dan=1;dan<=9;dan++) {
			for(int su=1;su<=9;su++) {
				if (dan>=su) {
					System.out.printf("%d*%d=%-2d ",dan,su,dan*su);
				}
				
			}
			System.out.println();
		}
		
		
	}

}
