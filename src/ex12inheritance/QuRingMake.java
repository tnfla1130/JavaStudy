package ex12inheritance;

class Point {
   	int xDot, yDot;
   	public Point(int x, int y) {
         		xDot=x;
         		yDot=y;
   	}
   	public void showPointInfo() {
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	public Circle(int radian, Point center) {
		super();
		this.radian = radian;
		this.center = center;
	}
	
	
}
//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	
	public Ring(Circle innerCircle, Circle outerCircle) {
		super();
		this.innerCircle = innerCircle;
		this.outerCircle = outerCircle;
	}
	
	public void showRingInfo() {
		
	}	

	
}
public class QuRingMake {
	public static void main(String[] args) {
		
//		Ring c = new Ring(1,1,3,2,2,9);
//		c.showRingInfo();
	}
}


