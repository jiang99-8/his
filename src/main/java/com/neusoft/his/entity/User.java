package com.neusoft.his.entity;

public class User {
	private String userName;
	private String passWord;
	private String realName;
	private int UserType;
	private int docTitleId;
	private String isScheduling;
	private int deptId;
	private int registLeID;
	private int delMark;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getUserType() {
		return UserType;
	}
	public void setUserType(int userType) {
		UserType = userType;
	}
	public int getDocTitleId() {
		return docTitleId;
	}
	public void setDocTitleId(int docTitleId) {
		this.docTitleId = docTitleId;
	}
	public String getIsScheduling() {
		return isScheduling;
	}
	public void setIsScheduling(String isScheduling) {
		this.isScheduling = isScheduling;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getRegistLeID() {
		return registLeID;
	}
	public void setRegistLeID(int registLeID) {
		this.registLeID = registLeID;
	}
	public int getDelMark() {
		return delMark;
	}
	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}

}
