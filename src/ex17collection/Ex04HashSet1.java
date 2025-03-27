package ex17collection;

import java.util.Date;
import java.util.HashSet;

import common.Teacher;

public class Ex04HashSet1 {

	public static void main(String[] args) {

		HashSet<Object> set = new HashSet<Object>();
		
		String varString1 = "JAVA";
		String varString2 = new String("개발자");
		
		Date varDate = new Date();
		int varInt = 100;
		Teacher varTeacher = new Teacher("김봉두", 55, "체육");
		
		/*
		객체저장
		 */
		System.out.println("add결과"+set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt);
		set.add(varTeacher);
		
		System.out.println("[중복 저장전 객체수]:"+set.size());
		
		
		
		
		
		
	}

}
