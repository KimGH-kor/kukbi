package ch06;

class SubInfo{
	String name, id, address;
	int password, phoneNo;
	
	public SubInfo(String name, String id, int password){
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public SubInfo(String name, String id, int password, int phoneNo, String address){
		this(name, id, password);
		this.phoneNo = phoneNo;
		this.address = address;
	}
	void setPassword(int password) {
		this.password = password;
	}
	void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	void setAddress(String address) {
		this.address = address;
	}
	
	void showInfo() {
		System.out.println(name+" "+id+" "+address+" "+password+" "+phoneNo);
	}
	
}


public class SubscriberInfo {
	public static void main(String[] args) {
		SubInfo si = new SubInfo("���ȯ", "mopn", 1535782);
		si.setAddress("socool");
		si.setPhoneNo(0100000000);
		si.showInfo();
		SubInfo si2 = new SubInfo("������", "sod", 123123, 0100000000, "sosocool");
		si2.showInfo();
	}
}
