package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle
{
    private int width,height;
    
    //외부로 반환하기 위해 만듬
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
    public void showAreaInfo() {
    	int result;
    	result = width*height;
    	System.out.println("직사각형 면적:"+ result);
    }
    
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{	
//	int w;
//	
//    public int getW() {
//		return w;
//	}
	//이거 개쩐다
	public Square(int w) {
		super(w,w);
		
	}
	@Override
	public void showAreaInfo() {
		System.out.println("정사각형 면적:" +(getWidth()*getHeight()));
	}
	
} 
class QuRectangleMain {
	public static void main(String[] args) {
		
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.showAreaInfo();
 
       		Square sqr = new Square(7);
	       	sqr.showAreaInfo();
   	}
}

