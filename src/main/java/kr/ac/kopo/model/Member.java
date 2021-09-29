package kr.ac.kopo.model;

public class Member {
	private String id;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean login() {
		if(id.equals("user") && password.equals("1234"))
			return true;
		else if(id.equals("admin") && password.equals("5678"))
			return true;
		
		return false;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + "]";
	}
}
