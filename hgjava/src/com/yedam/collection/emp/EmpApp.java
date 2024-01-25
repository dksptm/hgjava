package com.yedam.collection.emp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		List<Employee> storage = new ArrayList<>();

		Scanner scn = new Scanner(System.in);
		boolean run = true;

		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		while (run) {
			System.out.println("1.등록 2.조회(입사일자) 3.예시 9.종료");
			System.out.print("메뉴입력>> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				System.out.print("(입력)사번 이름 입사일 월급>> ");
				String[] valAry = scn.nextLine().split(" ");
				try {
					storage.add(new Employee(Integer.parseInt(valAry[0]), 
							valAry[1], 
							sdf.parse(valAry[2]),
							Integer.parseInt(valAry[3])
					));
				} catch (Exception e) {
					System.out.println("오류.");
				}
				System.out.println("등록완료.");
				break;
			case 2:
				Date date = null;
				while(true) {
					System.out.print("조회날짜 입력>> ");
					try {
						date = sdf.parse(scn.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("날짜 포맷 부정확.");
					}					
				}
				System.out.println(sdf.format(date) + "이후 입사한 직원 조회.");
				for(Employee e : storage) {
					if(e.getHireDate().after(date) || e.getHireDate().equals(date)) {
						System.out.println(e);
					}
				}
//				System.out.println("다른방법");
//				for(int i=0; i<storage.size(); i++) {
//					if(storage.get(i).getHireDate().after(date)
//							|| storage.get(i).getHireDate().equals(date)) {
//						System.out.println(storage.get(i).toString());
//					}
//				}
				System.out.println("조회완료.");
				break;
			case 3:
				try {
					storage.add(new Employee(101, "제니", sdf.parse("23-10-01"), 250));
					storage.add(new Employee(102, "지수", sdf.parse("24-01-05"), 300));
					storage.add(new Employee(103, "로제", sdf.parse("23-09-01"), 150));
					storage.add(new Employee(104, "리사", sdf.parse("23-08-15"), 250));
				} catch (Exception e1) {
					System.out.println("3번에서 오류");
				}
				System.out.println("예시사원 등록완료.");
				break;
			case 9:
				run = false;
			}// end of switch

		} // end of while

		scn.close();
		System.out.println("end of prog.");
	}// end of main

	void method() {
		// "101 홍길동 23-05-08 100" -> split(" ")으로 공백기준 값을 나눔
		String val = "101 홍길동 23-05-08 100";
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		String[] valAry = val.split(" ");
		for (String value : valAry) {
			System.out.println(value);
		}

		try {
			new Employee(Integer.parseInt(valAry[0]), // 사번
					valAry[1], // 이름
					sdf.parse(valAry[2]), // 입사일
					Integer.parseInt(valAry[3]) // 급여
			);
		} catch (Exception e) {
			System.out.println("오류.");
		}

	}// end of method

}// end of class
