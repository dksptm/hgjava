package com.yedam.classes.friendStatic;
// API 기능모음 목적 -> 인스턴스 딱히 필요업다. 하나만 생성하면 된다. -> 정적이다.. static, 정적
// 멤버: 필드, 생성자, 메소드 이런것들을 멤버라고 한다.

// main이 있는 Exe에서 static붙은것들은 굳이 인스턴스 안만들어도 사용할 준비를 해놓는다.
// 사용방법 : 클래스이름.메소드();

// 등록기능, 수정기능, 삭제기능, 목록, 단건조회 기능.
public class FriendApp {
	// 데이터를 저장하는 App이기때문에 필드선언(메모리에 공간할당)
//	코딩잘못함 (선언만 할 것!)private Friend[] friends = new Friend[10]; 
//	 		 생성자에 초기화 데이터(배열10개)!!
	
	// 1.필드
	private static Friend[] friends;
	
	// 2. 생성자+초기값
	public FriendApp() {
		friends = new Friend[6];
		
		//////////////////////
		Friend f1 = new Friend("카리나", "010-1111-1111", 20);
		Friend f2 = new Friend("장원영", "010-2222-1111", 25);
		Friend f3 = new Friend("아이유", "010-3333-1111", 31);
		Friend f4 = new Friend("이태연", "010-4444-1111", 33);
		Friend f5 = new Friend("김청하", "010-5555-1111", 27);
		friends = new Friend[] {f1, f2, f3, f4, f5, null};
		/////////////////////
	}
	
	static {
		friends = new Friend[6];
		Friend f1 = new Friend("카리나", "010-1111-1111", 20);
		Friend f2 = new Friend("장원영", "010-2222-1111", 25);
		Friend f3 = new Friend("아이유", "010-3333-1111", 31);
		Friend f4 = new Friend("이태연", "010-4444-1111", 33);
		Friend f5 = new Friend("김청하", "010-5555-1111", 27);
		friends = new Friend[] {f1, f2, f3, f4, f5, null};
	}
	
	
	
	// 3. 메소드
	
	/// 1)등록
	/// *** 매개변수에 꼭 기본타입만X, 내가만든 Friend타입도 가능 *** <-생각못함..
	public static int preAdd() {
		int idx = 0;
		for(int i=0; i<friends.length; i++) {
			if(friends[i] == null) return i;
		}
		return -1;
	}
	
	public static void add(Friend friend, int i) {
		friends[i] = friend;
		friend.showName(i);
	}
	
	/// 2-1)목록
	public static Friend[] list() {
		return friends;
	}

	/// 2-2)단건조회
	public static int get(String name) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null 
					&& friends[i].getFname().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	/// 3)수정
	public static Friend modify(int i, String phone) {
		friends[i].setFphone(phone);
		return friends[i];
	}
	
	/// 4)삭제
	public static void remove(int i) {
		friends[i] = null;
	}
	
	
	
	
	
	
}
