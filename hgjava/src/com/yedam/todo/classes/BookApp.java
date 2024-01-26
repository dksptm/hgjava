//package com.yedam.todo.classes;
//// API-기능모음
//
//// 필드, 등록, 목록, 한건조회(한줄평), 수정, 삭제, 별점
//// 중복번호확인
//// 추후 대출, 반납도.
//public class BookApp {
//	private static BookApp instance = new BookApp();
//	// 필드
//	private static Book[] books;
//	private static int[] numList;
//	
//	// 생성자
//	private BookApp() {}
//	
//	//getInstance
//	public static BookApp getInstance() {
//		return instance;
//	}
//	
//	// static
//	static {
//		books = new Book[10];
//		numList = new int[10];
//	}
//	
//	//////메소드//////
//	
//	//예시목록 넣기
//	public static void example() {
////		books[0] = new Book(66101, "멋진 신세계", "올더스 헉슬리", 2004);
////		books[1] = new Book(66102, "폭풍의 언덕", "에밀리 브론테", 2005);
////		books[2] = new Book(66103, "파우스트", "괴테", 1998);
////		books[3] = new Book(66104, "논어", "공자",2015);
////		books[4] = new Book(66105, "목민심서", "정약용", 2017);
////		books[5] = new Book(68106, "유토피아", "토마스 모어", 2007);
////		books[6] = new Book(68107, "수리철학의 기초", "버트런드 러셀", 1990);
////		for(int i=0; i<7; i++) {
////			numList[i] = books[i].getNumber();
////		}		
//	}
//	
//	// 등록
//	
//	// 중복번호 확인
//	public static boolean overlap(int number) {
//		for(int i=0; i<numList.length;i++) {
//			if(numList[i] != 0 && numList[i] == number) {
//				return true;
//			}
//			if(numList[i] == 0){
//				numList[i] = number;
//				return false;
//			}
//		}
//		return false;
//	}
//	
//	// 도서등록
//	public static boolean bookAdd(Book book) {
//		for(int i=0; i<books.length; i++) {
//			if(books[i] == null) {
//				books[i] = book;
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	// 목록
//	// 목록조회
//	
//	public static Book[] list() {
//		return books;
//	}
//	
//	//단건조회
//	public static int get(String title) {
//		for(int i=0; i<books.length; i++) {
//			if(books[i] != null && books[i].getTitle().equals(title)) {
//				return i;
//			}
//		}
//		return -1;
//	}
//	
//	//삭제
//	public static void remove(int idx) {
//		books[idx] = null;
//	}
//	
//	//평가
//	public static void review(int idx, String hanjul, double star) {
//		String str = reviewStar(star);
//		books[idx].setHanjul(hanjul+str);
//		books[idx].setStarred(star);
//	}
//	
//	public static String reviewStar(double star) {
//		int fullStar = (int)(star * 10) /10;
//		int halfStar = (int)(star * 10) %10;
//		String result = "";
//		for(int i=0; i<fullStar; i++) {
//			result += "★";
//		}
//		if(halfStar != 0) {
//			result += "☆";
//		}
//		return result;
//	}
//	
//	// 평가조회
//	public static void reviewList() {
//		for(int i=0; i<books.length; i++) {
//			if(books[i] != null) {
//				if(books[i].getHanjul() != null 
//						|| books[i].getStarred() != 0.0) {
//					books[i].assessment();
//				}
//			}
//		}	
//	}
//	
//	
//
//}