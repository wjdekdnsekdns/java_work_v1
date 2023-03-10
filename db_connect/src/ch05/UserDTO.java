package ch05;

public class UserDTO {
	String username;
	String birthYear;
	String addr;
	String mobile;
	
	public UserDTO(String username, String birthYear, String addr, String mobile) {
		super();
		this.username = username;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public String getAddr() {
		return addr;
	}

	public String getMobile() {
		return mobile;
	}
	
	
}
