package ex06array;

public class QuNumberCounter {

	public static void main(String[] args) {
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4]; //[0,0,0,0]
		
		for(int i=0;i<answer.length;i++) {
			if (answer[i] == 1)
				counter[0]++;
			else if (answer[i]==2)
				counter[1]++;
			else if (answer[i]==3)
				counter[2]++;
			else if (answer[i]==4)
				counter[3]++;
				
		}
		System.out.println("counter[0]=>"+ counter[0]);
		System.out.println("counter[1]=>"+ counter[1]);
		System.out.println("counter[2]=>"+ counter[2]);
		System.out.println("counter[3]=>"+ counter[3]);
	}

}
