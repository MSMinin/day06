package array;

public class TestClass02 {
	public static void main(String[] args) {
		double dos[] = new double[] {1.11, 2.22, 3.33};
		// double dos[] = {1.11, 2.22, 3.33};
		// 값을 바로 넣어서 초기화할 수도 있다.
		
		System.out.println(dos.length);
		// 배열의 길이를 알려주는 length메소드가 존재한다.
		
		for(int i = 0; i < dos.length; i++) {
			System.out.println(i + ". " + dos[i]);
		}
		System.out.println("=========");
		System.out.println(dos[0]);
		System.out.println(dos[1]);
		System.out.println(dos[2]);
		
	}
}
