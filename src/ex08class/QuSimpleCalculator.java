package ex08class;

class CalculatorEx {
	
	int addcount =0;
	int mincount =0;
	int mulcount =0;
	int divcount =0;
	
	public CalculatorEx() {}
		
	void init() {
		addcount =0 ;
		mincount =0 ;
		mulcount =0 ;
		divcount =0 ;
	}
	double add(double a, double b) {
		addcount++;
		double result;
		result = a+b;
		return result;
	}
	double min(double a, double b) {
		mincount++;
		double result;
		result = a-b;
		return result;
	}
	double mul(double a, double b) {
		mulcount++;
		double result;
		result = a*b;
		return result;
	}
	double div(double a, double b) {
		divcount++;
		double result;
		result = a/b;
		return result;
	}
	void showOpCount() {
		System.out.println("덧셈횟수:"+ addcount);
		System.out.println("뺄셈횟수:"+ mincount);
		System.out.println("곱셈횟수:"+ mulcount);
		System.out.println("나눗셈횟수:"+ divcount);
	}
}


public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();

	}

}
