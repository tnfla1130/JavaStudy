package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		String man = "190419-3000000";
		String woman = "190419-4000000";
		
		System.out.println(man.charAt(7) == '3' ?
				"남자" :"여자" );
		
		System.out.println(woman.charAt(7) == '3' ?
				"남자" :"여자" );
		
		
	
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		String email1 = "hong@daum.net";
		String email2 = "notA@naver";
		
		System.out.println(email1.contains("@")&&email1.contains(".") ?
				"이메일형식임":"이메일형식이아님");
		System.out.println(email2.contains("@")&&email2.contains(".") ?
				"이메일형식임":"이메일형식이아님");
		
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
		
		String num = "011130-4000000";
		String[] NumArr = num.split("-");
		System.out.println(NumArr[1].charAt(0) ==3 ?
				"남자" : "여자");
		
	
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		
		String fileName = "my.file.images.jpg";
		
		System.out.println(fileName.substring(fileName.lastIndexOf(".")));

	}

}
