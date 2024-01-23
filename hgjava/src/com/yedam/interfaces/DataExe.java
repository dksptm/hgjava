package com.yedam.interfaces;
// 개발자는 유지보수를 항상 생각해야한다.
public class DataExe {
	//Mysql vs. Oracle
	//처음엔 Mysql, 시간이 흐른뒤 Oracle
	public static void main(String[] args) {
//		MysqlDB mysql = new MysqlDB();
//		OracleDB oracle = new OracleDB();
		//interface타입의 변수 선언-> MysqlDB, OracleDB 둘다 할당가능!
		//interface참조변수에 구현클래스 할당. 인스턴스 생성.
		DAO dao = new MysqlDB();
		dao = new OracleDB(); //나중에 오라클로 바꾸면 이렇게 가능..
		// 개발코드에서는 DAO만 호출하면 그 뒤에 MysqlDB이든 OracleDB이든
		// 메소드는 반드시 있을거니깐! 그 결과를 리턴받을수있다.
		// 객체만 교환하면 끝
		int menu = 2;
		
		if(menu == 1) {
//			mysql.insert();
//			oracle.add();
			dao.insert();
		} else if (menu == 2) {
//			mysql.update();
//			oracle.modify();
			dao.update();
		} else if (menu == 3) {
//			mysql.delete();
//			oracle.remove();
			dao.delete();
		}
		System.out.println(dao.VER);
		
		
		
	}//main
}//class
