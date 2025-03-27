package ex05method;

import java.util.Scanner;
public class QuTemperature {
	
	static double celsiusToFahrenheit(double C_tem) {
		double F_tem = 1.8 * C_tem + 32;
		return F_tem;
	}
	static double fahrenheitToCelsius(double F_tem) {
		double C_tem = (F_tem - 32)/1.8;
		return C_tem;
	}
	public static void main(String[] args) {
		System.out.println("온도:");
		Scanner scanner = new Scanner(System.in);
		double temp = scanner.nextDouble();
		
		System.out.println("섭씨온도:"+celsiusToFahrenheit(temp));
		System.out.println("화씨온도:"+fahrenheitToCelsius(temp));
	}

}
