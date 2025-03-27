package ex12inheritance;

/*
구성관계로 표현하기에 적합한 Has-A관계
: X has a Y -> X가 Y를 소유(포함)이다.
Has-A와 같이 소유의 관계를 상속으로 표현하면 클래스간의 강한 연결고리가
형상되어 권총이 없는 경찰을 표현하기가 힘들어진다. 따라서
구성(Composition) 관계로 표현하는 것이 적합하다. 구성관계란
클래스의 멤버로 다른 클래스의 인스턴스를 사용하는 것을 말한다.
 */

//권총을 추상화한 클래스
class Gun {
	//탄환수 
	int bullet;
	public Gun(int bNum) {
		bullet = bNum;
	}
	//총을 발사한 후 탄환이 감소하는 것을 표현
	public void shutGun() {
		System.out.println("빵야");
		bullet--;
	}
}
//경찰을 표현
class Police {
	/*
	권총과 수갑을 보유한 경찰을 표현하기 위해 상속을 사용하지 않고
	멤버변수로 정의하고 있다.	 */
	//수갑 : 일반적인 멤버변수
	int handCuffs;
	//권총 : 인스턴스형 멤버변수
	Gun gun;
	
	public Police(int bNum, int hcuff) {
		//수갑은 단순한 정수값을 통해 보유여부 설정
		handCuffs = hcuff;
		/*
		권총의 보유여부는 탄환이 없는 상태라면 null로 초기화한다.
		참조변수가 null이라는 것은 참조할 인스턴스가 없는것을 의미하므로
		소유하지 않은 것을 표현할 수 있다. */
		if(bNum <=0) {
			gun = null;
		}
		else { 
			gun = new Gun(bNum);
		}
	}
	//수갑을 채우는 행위 표현
	public void putHandcuff() {
		System.out.println("수갑채움");
		handCuffs--;
	}
	//권총을 발사하는 행위 표현
	public void shut() {
		//조건문을 통해 소유한 총이 있을때만 발사할 수 있다.
		if(gun==null) {
			System.out.println("보유한 권총없음");
		}
		else {
			gun.shutGun();
		}
	}
}




public class E05HasAComposite {

	public static void main(String[] args) {
		
		//권총을 보유한 경찰
		System.out.println("==경찰1==");
		Police police1 = new Police(5, 3);
		police1.shut(); //발사가능
		police1.putHandcuff();
		
		//권총이 없는 경찰
		System.out.println("==경찰2==");
		Police police2 = new Police(0, 3);
		police2.shut(); //헛빵
		police2.putHandcuff();
		
		
	}

}































