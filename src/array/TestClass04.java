package array;

public class TestClass04 {
	public static void main(String[] args) {
		int[] arr = {100, 200, 300};
		double[] dos = {1.11, 2.22, 3.33};
		String[] str = {"aaa", "bbb", "ccc"};
		
		//향상된 for문
		for(int i : arr) { 
			// int i : arr을 넣으면 arr의 index 0번부터 마지막까지 들어가 있는 값을 
			// 1개씩 순차적으로 앞에 있는 변수에 저장해준다.
			System.out.println(i);
		}
		
		for(double d : dos) {
			System.out.println(d);
		}
		
		for(String s : str) {
			System.out.println(s);
		}
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
