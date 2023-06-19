package list;

import java.util.ArrayList;

public class TestClass02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		System.out.println(arr.size());
		//ArrayList에는 length대신 size가 있다.
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		String s = arr.get(0);
		// 값을 가져올때는 get을 사용하면 된다.
		System.out.println("0 : " + s);
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("");
		//일반 배열과 같이 향상된 for문 사용 가능하다.
		for(String ss : arr) {
			System.out.println(ss);
		}
	
	}
}
