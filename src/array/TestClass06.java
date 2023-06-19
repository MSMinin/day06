package array;

import java.util.Scanner;

public class TestClass06 {
	public static void main(String[] args) {
		int arr[] = {10,54,13,17,25,30};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수, 홀수 입력 : ");
		String str = sc.next();
		
		
	  for(int i : arr) {
		  if(str.equals("짝수")) {
			if(i % 2 ==0) {
				System.out.println("짝수 : " + i);
			}
		}else if(str.equals("홀수")) {
			if(i % 2 == 1) {
				System.out.println("홀수 : " + i);
			}
		}
	  }
		
	}
}
