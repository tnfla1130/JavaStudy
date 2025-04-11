package ex17collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class QuArrayList {
	
	
	public static void main(String[] args) {

//		ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		//1.검색할 이름을 입력받음
		String searchName;
		boolean remove;
		System.out.println("검색할 이름을 입력하세요:");
		Scanner scan = new Scanner(System.in);
		searchName = scan.nextLine();
		
		int index = -1;
		//2.확장for문으로 컬렉션 전체를 접근
			
		for (Student st : list) {
			//3.검색결과 유/무에 따라 
			//검색결과 있을때…검색된 데이터 삭제
			//검색결과 없을때...검색결과가 없다고 출력
			//st.getName().equals(searchName)
			if(searchName.equals(st.getName())) {
				list.remove(st);
				System.out.println("[검색되었습니다]");
				break;
			}
			else {
				System.out.println("검색된 결과가 없습니다.");
			}
		}

		//4.전체정보 출력
		System.out.println("[삭제 후 정보출력]");
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}
