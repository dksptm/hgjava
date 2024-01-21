package com.yedam.todo.classes;
// API-기능모음

// 필드, 등록, 목록, 한건조회(한줄평), 수정, 삭제, 별점
// 중복번호확인
// 추후 대출, 반납도.
public class BookApp {
	// 필드
	private static Book[] books;
	private static String[] numList;
	
	// 생성자(그냥생략함)
	
	// static
	static {
		books = new Book[10];
		//String number, String title, String author, int pubY
		Book b1 = new Book("1001", "멋진 신세계", "올더스 헉슬리", 2004);
		Book b2 = new Book("1002", "폭풍의 언덕", "에밀리 브론테", 2005);
		Book b3 = new Book("1003", "파우스트", "괴테", 1998);
		Book b4 = new Book("2001", "논어", "공자",2015);
		Book b5 = new Book("2002", "목민심서", "정약용", 2017);
		Book b6 = new Book("2003", "유토피아", "토마스 모어", 2007);
		Book b7 = new Book("3001", "수리철학의 기초", "버트런드 러셀", 1990);
		
		books = new Book[] {b1, b2, b3, b4, b5, b6, b7, null, null, null};
		numList = new String[30];
		for(int i=0; i<7; i++) {
			numList[i] = books[i].getNumber();
		}
	}
	
	//////메소드//////
	
	// 등록
	// null, index확인
	public static int isNul() {
		for(int i=0; i<books.length; i++) {
			if(books[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	// 중복번호 확인
	public static boolean overlap(String number) {
		for(int i=0; i<numList.length;i++) {
			if(numList[i] != null && numList[i].equals(number)) {
				return true;
			}
			if(numList[i] == null){
				numList[i] = number;
				return false;
			}
		}
		return false;
	}
	
	// 도서등록
	public static void bookAdd(int idx, Book book) {
		books[idx] = book;
		books[idx].showTitle();
	}
	
	// 목록
	// 목록조회
	public static Book[] list() {
		return books;
	}
	
	//단건조회
	public static int get(String str) {
		for(int i=0; i<books.length; i++) {
			if(books[i] != null && books[i].getTitle().equals(str)) {
				return i;
			}
			if(books[i] != null && books[i].getNumber().equals(str)) {
				return i;
			}
		}
		return -1;
	}
	
	//삭제
	public static void remove(int idx) {
		books[idx] = null;
	}
	
	//평가
	public static void review(int idx, String hanjul, double star) {
		String str = reviewStar(star);
		books[idx].setHanjul(hanjul+str);
		books[idx].setStarred(star);
	}
	
	public static String reviewStar(double star) {
		int fullStar = (int)(star * 10) /10;
		int halfStar = (int)(star * 10) %10;
		String result = "";
		for(int i=0; i<fullStar; i++) {
			result += "★";
		}
		if(halfStar != 0) {
			result += "☆";
		}
		return result;
	}
	
	// 평가조회
	public static void reviewList() {
		for(int i=0; i<books.length; i++) {
			if(books[i] != null) {
				if(books[i].getHanjul() != null 
						|| books[i].getStarred() != 0.0) {
					books[i].assessment();
				}
			}
		}	
	}
	
	

}
