package com.yedam.phonebook;

// PhoneBookManager 에서 읽어들인 문자열을 담아서 보여주는.
public class PhoneInfo {
	private String name;
	private String phone;
	
	public PhoneInfo(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void showPhoneInfor() {
		System.out.println("name: " + this.name);
		System.out.println("phone: " + this.phone);
	}
	
	// getter추가
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		//1,홍길동,010-1111
		return InputSelect.NORMAL + "," + name + "," + phone;
	}
	
}
