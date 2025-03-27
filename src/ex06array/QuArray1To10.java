package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		System.out.println("초기화된 배열요소");
		for(int i=0; i<arr.length; i++) { 
			arr[i]= i+1;
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("배열전체요소의합:" + sum);
	}

}
