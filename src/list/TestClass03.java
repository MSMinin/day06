package list;

import java.util.ArrayList;

public class TestClass03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		System.out.println(arr.contains("222"));
		System.out.println(arr.contains("없는 값"));
		//constatins는 해당 arraylist에 값이 있는지 확인하는 것
		boolean bool = arr.contains("없는 값");
		System.out.println("bool : " + bool);
		
		System.out.println("");
		
		System.out.println("삭제 전 : " + arr);
		arr.remove(0);
		// remove는 값을 삭제한다. [index로 삭제함]
		System.out.println("0번째 삭제 후 값 : " + arr);
		//0번째 값을 삭제해서 1번째에 있는 값이 0으로 땡겨진다.
		arr.remove("333"); // 데이터를 넣어서 삭제도 가능하다.
		System.out.println("333 삭제 후 값 : " + arr);
	}
}
