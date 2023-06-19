package list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass04 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for( int i = 0;  i < 3; i++) {
			System.out.print(i + "번째 입력 : ");
			String msg = sc.next();
			arr.add(msg);
			// arr.add(sc.next());
		}
		System.out.println("arr : " + arr);
		System.out.println("찾는 값 입력");
		String search = sc.next();
		System.out.println("contains : " + arr.contains(search));
		// contains는 참(true),거짓(false)으로 출력한다.
		System.out.println("indexof : " + arr.indexOf(search));
		// indexOf는 현재 찾고자 하는 값의 index를 알려준다. 
		// 찾는 값이 없으면 -1 출력한다.
	}
}
