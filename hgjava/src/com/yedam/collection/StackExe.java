package com.yedam.collection;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		// push, pop
		Stack<String> stack = new Stack<>();
		stack.push("1.홍길동");
		stack.push("2.김민수");
		stack.push("3.최만석");
		
		stack.pop(); //제거.(3.최만석).
		while(!stack.isEmpty()) {
			String result = stack.pop(); //peek()를 쓰면 while때문에 무한반복
			System.out.println(result);
		}
		System.out.println(stack.size()); //0. pop()를 써서 하나씩 제거.
		
		// home->product->sell->시점.
		// 실행했던 정보를 담아놓으면, 나중에 하나씩 빼올수있음.

		
	}//main
}//class
