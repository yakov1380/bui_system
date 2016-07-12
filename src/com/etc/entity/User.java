package com.etc.entity;

import com.etc.utils.PageHelper;

/**
 * 用户实体类
 *
 */
public class User extends PageHelper<User> {
	private Integer uid;
	private String uname;
	private String upwd;
	private String pname;
	private Integer sex; // 0-女 1-男
	private Integer age;
	private String birthday;
	private Double account;
	private String phone;
	private String address;

	public User() {
		super();
	}

	public User(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}

	public User(String uname, String upwd, String pname, Integer sex, Integer age,
			String birthday, Double account, String phone, String address) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.pname = pname;
		this.sex = sex;
		this.age = age;
		this.birthday = birthday;
		this.account = account;
		this.phone = phone;
		this.address = address;
	}

	public User(Integer uid, String uname, String upwd, String pname, Integer sex,
			Integer age, String birthday, Double account, String phone,
			String address) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.pname = pname;
		this.sex = sex;
		this.age = age;
		this.birthday = birthday;
		this.account = account;
		this.phone = phone;
		this.address = address;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = (birthday.length() <= 10) ? birthday : birthday.substring(0, birthday.length()-2);
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd
				+ ", pname=" + pname + ", sex=" + sex + ", age=" + age
				+ ", birthday=" + birthday + ", account=" + account
				+ ", phone=" + phone + ", address=" + address + "]";
	}

}
