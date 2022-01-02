package PhonInfo;

class PhoneInfo {
	String name;
	String phone;
	String birth;
	PhoneInfo next;
	public PhoneInfo() {
		// TODO Auto-generated constructor stub
		this.name = null;
		this.phone =null;
		this.birth = null;
		this.next = null;
	}
	public void setPhoneInfo(String name, String phone, String birth) {
		this.name = name;
		this.phone =phone;
		this.birth = birth;
	}
	public PhoneInfo(String name, String phone, String birth) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.phone =phone;
		this.birth = birth;
		this.next = null;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 번호 : " + phone + ", 생일 : " + birth;
	}
}
