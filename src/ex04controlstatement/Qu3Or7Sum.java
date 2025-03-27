package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		int i1=1;
		int sum1 =0;
		
		while(i1<=100) {
			if (i1%3 == 0 || i1%7 ==0) {
				sum1 += i1;
				
				System.out.println("sum1 ="+sum1);
			}
			i1++;
			
		}
		int i2 =1;
		int sum2 =0;
		do { 
			if (i2%3 == 0 || i2%7 ==0) {
				sum2 += i2;
			}
			i2++;
		} while(i2<=100);
		System.out.println("sum2 ="+sum2);
		
		int sum3 =0;
		for(int j=1; j<=100; j++) {
			if (j%3 == 0 || j%7 ==0) {
				sum3 += j;
			}
		}
		System.out.println("sum3 ="+sum3);
		
		
		
		
		
		
		
		
		
		
		
	}

}
