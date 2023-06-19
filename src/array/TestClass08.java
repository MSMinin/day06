package array;

import java.util.Scanner;

public class TestClass08 {
	public static void main(String[] args) {
		String[] id = new String[5];
		String[] pwd = new String[5];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 모든 회원보기");
			System.out.print(">>>");
			int n = sc.nextInt();
			
			switch (n) {
			case 1: 
				System.out.print("비교 id 입력 > ");
				String myId = sc.next();
				System.out.print("비교 pwd 입력 >");
				String myPwd = sc.next();
				
				// 아이디 입력 > 아이디 존재하는지 조회 > 아이디의 배열위치에 있는 비밀번호와 같은지 확인
				
				for(int i = 0; i < id.length; i++) {
					if(myId.equals(id[i])) {
						if(myPwd.equals(pwd[i])) {
							System.out.println("인증 완료");
						}else {
							System.out.println("비밀번호가 틀렸습니다.");
						}
					}
				}
				
				int r = 0; //여기부터 고치삼
				if(r < 10) {
					
				}
				// 여기까지
				break;
				
			case 2: 
				System.out.print("저장할 id 입력 : ");
				String mkId = sc.next();
				for(int i = 0; i < id.length; i++) {
					if(mkId.equals(id[i])) {
						System.out.println("이미 존재하는 id입니다.");
						break;
					}else {
						if(id[i] == null) {
							id[i] = mkId;
							System.out.print("저장할 pwd 입력 : ");
							String mkPwd = sc.next();
							pwd[i] = mkPwd;
							System.out.println("가입을 축하합니다.");
							
							break;
						}
					}
				}
				if(id[4] != null) {
						System.out.println("더 이상 저장할 공간이 없습니다.");
					}
				break;
				
			case 3: 
				if(id[0] == null && pwd[0] == null) {
					System.out.println("저장된 정보가 없습니다.");
				}else {
					System.out.println("id\t\tpassword");
					System.out.println("--------------------------");
					for(int i = 0; i < id.length; i++) {	
						if(id[i] == null && pwd[i] == null) {
							break;
						}
						System.out.println(id[i]+"\t\t"+pwd[i]);
					}
					System.out.println("--------------------------");
				}
				
			}
			
			
			
			
		}
	}
}
