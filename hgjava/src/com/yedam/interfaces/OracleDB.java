package com.yedam.interfaces;
//인터페이스를 구현하는 클래스(자식클래스가 아니다!)
//구현 implements
public class OracleDB implements DAO{
//	public void add() {
//		System.out.println("[Oracle] 입력.");
//	}
//	public void modify() {
//		System.out.println("[Oracle] 수정.");
//	}
//	public void remove() {
//		System.out.println("[Oracle] 삭제.");
//	}
	//아래의 메소드를 반드시 구현할수밖에 없다.
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("[Oracle] 입력.");
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("[Oracle] 수정.");
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("[Oracle] 삭제.");
	}

}
