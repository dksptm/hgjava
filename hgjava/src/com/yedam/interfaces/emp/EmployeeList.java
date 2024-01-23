package com.yedam.interfaces.emp;
//(배열먼저사용하다가 컬렉션으로업그레이드하는상황)
//interface : 규칙정의
public interface EmployeeList {
	// 규칙.(배열 vs. 컬렉션)
	public void init();					//초기화(저장공간크기)
	public void input();				//사원입력
	public String search(int empId);	//사번조회
	public void print();				//목록
	public int sum();	
}
