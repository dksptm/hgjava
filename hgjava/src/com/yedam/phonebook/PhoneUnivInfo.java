package com.yedam.phonebook;

// 학교 연락처.
public class PhoneUnivInfo extends PhoneInfo{
	private String major;
	private int year;

	public PhoneUnivInfo(String name, String phone, String major, int year) {
		super(name, phone);
		this.major = major;
		this.year = year;
	}
	
	@Override
	public void showPhoneInfor() {
		super.showPhoneInfor();
		System.out.println("major: " + this.major);
		System.out.println("year: " + this.year);
	}
	
	@Override
	public String toString() {
		return InputSelect.UNIV + "," + getName() + "," + getPhone() + "," + major + "," + year;
	}

}
