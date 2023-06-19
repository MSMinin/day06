package array;

public class TestClass05 {
	public static void main(String[] args) {
		int arr[] = {10, 54, 13, 17, 25, 30};
		
		for(int i : arr) {
			if(i % 2 == 0) {
				System.out.println("짝수 : " + i);
			}else {
				System.out.println("홀수 : " + i);
			}
		}
	}
}

 /*
  * ==출력 결과
  * 짝수 : 10
  * 짝수 : 54
  * 홀수 : 13
  * 홀수 : 25
  * 짝수 : 30
  * */
