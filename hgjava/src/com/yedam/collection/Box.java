package com.yedam.collection;

public class Box<T> {
	//Box -> Box<T> --->이게 제너릭
	//어떤타입으로 올지모르지만
	//어떤 값을 담았으면, 그걸로 정하자!
	//obj를 String으로 정하면 밑의 obj는 다 String이 됨(나중에)
	//값을 담을 시점(사용하는 시점)에 정하겠다는 뜻!!
	//T : 타입파라미터..?
	
	//Object obj -> Object를 변수로 선언했기때문에, 
	//문자열 등 어떤타입도 다 담을수 있다!
	T obj;
	
	//getter, setter
	void setObj(T object) {
		this.obj = object;
	}
	T getObj() {
		return obj;
	}
	
}//end of class
