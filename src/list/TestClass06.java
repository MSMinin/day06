package list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass06 {
	public static void main(String[] args) {
		ArrayList<String> id = new ArrayList<>();
		ArrayList<String> pwd = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 모든 회원보기");
			System.out.print(">>>");
			int n = sc.nextInt();
			
			switch (n) {
			case 1:
				System.out.print("로그인 할 id 입력 > ");
				String myId = sc.next();
				System.out.print("로그인할 id의 pwd 입력 >");
				String myPwd = sc.next();
				
				
				for(int i = 0; i < id.size(); i++) {
					if(myId.equals(id.get(i))) {
						if(myPwd.equals(pwd.get(i))) {
							System.out.println("인증 완료");
							System.out.println("=================================");
							System.out.println("(1). 비밀번호 수정\t(2). 회원 탈퇴");
							System.out.println("=================================");
							System.out.println(">>>");
							int n2= sc.nextInt();
							switch (n2) {
							case 1:
								System.out.println("변경할 비밀번호를 입력하세요.");
								String chPwd = sc.next();
								pwd.set(i, chPwd);
								System.out.println("비밀번호가 변경되었습니다. 다시 로그인해주세요.");
								break;
							case 2:
								id.remove(i);
								pwd.remove(i);
								System.out.println("아이디와 비밀번호가 삭제되었습니다.");
							}	
						
						}else {
							System.out.println("비밀번호가 틀렸습니다.");
						}
					}
				}
				break;
			
			case 2:				
				System.out.print("저장할 id 입력 : ");
				String mkId = sc.next();
				System.out.print("저장할 pwd 입력 : ");
				String mkPwd = sc.next();
					
				if(id.contains(mkId) == true) {
					System.out.println("이미 존재하는 id입니다.");
					break;
				}else {
					id.add(mkId);
					pwd.add(mkPwd);
					System.out.println("가입을 축하합니다.");
					break;
				}
			case 3:	
				
				System.out.println("id\t\tpassword");
				System.out.println("--------------------------");
				for(int i = 0; i < id.size(); i++) {	
					if(id.get(i) == null && pwd.get(i) == null) {
						System.out.println("더 이상 정보가 없습니다.");
						break;
					}
					System.out.println(id.get(i)+"\t\t"+pwd.get(i));
					}
					System.out.println("--------------------------");
				}
			}
		}	
	}

