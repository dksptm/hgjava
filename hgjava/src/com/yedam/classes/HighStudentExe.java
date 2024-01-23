package com.yedam.classes;

public class HighStudentExe {
	public static void main(String[] args) {
		HighStudent hiStd = new HighStudent("T001", "홍길동", 90, "김쌤");
		
		// HighStudent의 getter, setter는 teacher밖에 없지만
		System.out.println(hiStd.getSno()); //Student의 getSno()를 사용가능(getSno-->이런 메소드, 필드들을 멤버라고 한다.
		System.out.println(hiStd.getTeacher());
		hiStd.showInfo(); //부모클래스의 멤버
		
		// 부모클래스Student의 참조변수에 자식클래스HighStudent의 인스턴스를 대입할수있다.
		// 타입이 다른데 왜가능? 자식클래스가 형변환됨
//		Student std = (Student) new HighStudent("T002", "박길동", 80, "김쌤"); <-- 이런 의미!
		Student std = new HighStudent("T002", "박길동", 80, "김쌤");
		// but! 기능이 조금 차이남(가지고있는 메소드를 쓸수없음...) "김쌤"값을 담을수는 있는데...
//		System.out.println(std.getTeacher()); 이거 사용못함
		// std가 HighStudent의 인스턴스가 맞기는 한데..
		// 부모클래스의 참조변수에 값이 할당될수있다가 큰 특징..
		
		// 왜 이렇게할까? 데이터를 담을때 보통 배열에 담는데 이렇게안한다면
		Student[] students = new Student[10];
//		HighStudent[] histudents = new HighStudent[10]; //이렇게 해야..
		
		// 그런데 위에서 Student std = new HighStudent(); 이렇게해놓으면..잘모르겠다..
		students[0] = new Student("S001", "김민석", 90);
		students[1] = hiStd; //이렇게 할수있다..hiStd가 자동형변환됨
		System.out.println("-------------");
		for(int i=0; i<students.length; i++) {
			if(students[i] != null) {
				students[i].showInfo();
				//여기서 showInfo에 highstudent에서 선생님 이름도 가져오고싶음
				//>> HighStudent 부모메소드 재정의(오버라이딩)
			}
		}
		//번호는 S001, 이름은 김민석, 점수는 90
		//번호는 T001, 이름은 홍길동, 점수는 90, 선생님은 김쌤입니다.
		//알아서 위에서처럼 나온다!
		// 아래는 오버라이딩된 메소드를 불러온다
		
		// 이것도 가능하다. 강제형변환
//		HighStudent std1 = (HighStudent)(new Student("T002", "박길동", 80)); 컴파일오류는 아닌데 런타임오류
		//
		HighStudent hstd = (HighStudent) std;
		System.out.println(hstd.getTeacher()); // 이거사용가능함
		
		
		System.out.println("-------------");
		Student std1 = new HighStudent("T002", "박길동", 80, "김쌤"); //런타임오류-->if문통해 걸러야함
//		HighStudent hstd1 = (HighStudent) std1; 이걸 if안에 넣어야
		if(std1 instanceof HighStudent) {
			HighStudent hstd1 = (HighStudent) std1;
			System.out.println(hstd1.getTeacher());			
		}
		
		Student std2 = new Student("T003", "김길동", 70); //
		if(std2 instanceof HighStudent) {
			HighStudent hstd1 = (HighStudent) std1;
			System.out.println(hstd1.getTeacher());			
		}
		
		
		
		
		
		// 큰 범위의 변수 = (큰 범위 변수)작은 범위값
		long ln1 = (long)10;//자동형변환(promotion)
		int n1 = (int)ln1; //강제형변환(casting)
		
		
	}
}
