package ex08class;

class Triangle {
	int width,height;
	
	/*해도되고 안해도됨 근데 지금은 매개변수도 없고 
	실행부도 없으니까 안하는게 나음
	 */
	public Triangle() {}
	
	//초기화 메서드
	//매개변수와 멤버변수명이 다르면 this가 없어도됨
	void init(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		double result = width*height*0.5;
		return result;
	}
	void setBottom(int width) {
		this.width = width;
	}
	void setHeight(int height) {
		this.height = height;
	}
}	

public class QuTriangle {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());

	}

}
