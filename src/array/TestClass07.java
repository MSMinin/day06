package array;

import java.util.Scanner;

public class TestClass07 {
	public static void main(String[] args) {
		int arr[] = {10, 54, 13, 17, 25, 30};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("index의 짝수, 홀수 입력 : ");
		String str = sc.next();
		/*
		  짝 입력 : index번호가 짝수 번째로 출력(0,2,4)
		  홀 입력 : index번호가 홀수 번째로 출력(1,3,5)
		 */
		
		for (int i = 0; i < arr.length; i++) {
			if(str.equals("짝수")) {
				if (i % 2 == 0) {
				System.out.println( i + ": " + arr[i]);
				}
			}else {
				if (i % 2 == 1) {
				System.out.println( i + ": " + arr[i]);
				}
			}
		}
		
		System.out.println("-------------------------");
		int k = 0;
		if(str.equals("짝수")) {
			k = 0;
			for(; k < arr.length; k += 2) {
				System.out.println(k + ". " + arr[k]);
			}
				
		}else {
			k = 1;
			for(; k < arr.length; k += 2) {
				System.out.println(k + ". " + arr[k]);
			}
		}
		System.out.println("-------------------------");
		for(int i = (str.equals("짝수") ? 0 : 1); i < arr.length; i +=2 ) {
			System.out.println(i + ". " + arr[i]);
		}
	}
}
