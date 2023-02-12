package egovframework.course.com.service;

public class MemberVO {
	
	/**@class Name : MemberVO.java
	 * @Description : MemberVO class
	 * @Modification 
	 * 
	 * @author hyeju
	 * @since 2023.01.29
	 * @version 1.0
	 */

	private static final long serialVersionID = 1L;
	
	/**시퀀스*/
	private int idx;
	
	/**아이디 (email)*/
	private String email;
	
	/**핸드폰*/
	private String phone;
	
	/**주소*/
	private String addres;
	
	/**비밀번호*/
	private String pw;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public static long getSerialversionid() {
		return serialVersionID;
	}
	
	
	
	
}
