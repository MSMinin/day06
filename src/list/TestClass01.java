package list;

import java.util.ArrayList;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		  Collection Framework
		  - 데이터 군을 저장하는 클래스들을 표준화한 설계
		  Collection
		  - 자료구조
		     - 데이터를 사용하는 방식
		  Framework
		  - 표준화되어 있는 틀
		  
		  List
		  - ArrayList
		  - LinkedList
		  ...
		  - 데이터의 순서가 존재한다. index를 사용할 수 있다.
		  - 저장데이터의 중복은 허용된다.
		 */
		
		// String[] arr = new String[5]; //일반 배열 > 고정 크기
		 
		ArrayList<String> arr = new ArrayList<>(); // 가변 크기
		arr.add("안녕"); //add를 사용해서 문자열을 추가한다.
		arr.add("하세요.");
		
		System.out.println("arr : " + arr);
		
		
		
		
	}
}
