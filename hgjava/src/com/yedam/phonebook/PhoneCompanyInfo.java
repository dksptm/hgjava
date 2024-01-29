package com.yedam.phonebook;

// 회사연락처.
public class PhoneCompanyInfo extends PhoneInfo{
	String company;
	
	public PhoneCompanyInfo(String name, String phone, String company) {
		super(name, phone); //부모생성자.
		this.company = company;
	}

	@Override
	public void showPhoneInfor() {
		super.showPhoneInfor();
		System.out.println("company: " + this.company);
	}
	
	@Override
	public String toString() {
		return InputSelect.COMPANY + "," + getName() + "," + getPhone() + "," + company;
		// 그냥 name도 super.name도 불가. private라서.
	}
}
