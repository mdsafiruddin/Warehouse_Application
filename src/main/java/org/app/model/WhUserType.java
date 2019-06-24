package org.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WhUserType {
	@Id
	@GeneratedValue
	@Column(name="uid")
	private Integer id;
	
	
	@Column(name="uType")
	private String userType;
	@Column(name="ucode")
     private String  userCode;
	
	@Column(name="ufor")
	private String userFor;
	@Column(name="uemail")
	private  String userEmail;
	
	@Column(name="contact")
	private Long ucontact;
	@Column(name="uidtype")
	private  String uidType ;
	
	@Column(name="Idnum")
	private  String idNumber;
	
	
	
	
	public WhUserType() {
	System.out.println("WhUserType object");
	}




	public Integer getid() {
		return id;
	}




	public void setUserId(Integer id) {
		this.id = id;
	}




	public String getUserType() {
		return userType;
	}




	public void setUserType(String userType) {
		this.userType = userType;
	}




	public String getUserCode() {
		return userCode;
	}




	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}




	public String getUserFor() {
		return userFor;
	}




	public void setUserFor(String userFor) {
		this.userFor = userFor;
	}




	public String getUserEmail() {
		return userEmail;
	}




	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}




	public Long getUcontact() {
		return ucontact;
	}




	public void setUcontact(Long ucontact) {
		this.ucontact = ucontact;
	}




	public String getUidType() {
		return uidType;
	}




	public void setUidType(String uidType) {
		this.uidType = uidType;
	}




	public String getIdNumber() {
		return idNumber;
	}




	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}




	@Override
	public String toString() {
		return "WhUserType [id=" + id + ", userType=" + userType + ", userCode=" + userCode + ", userFor="
				+ userFor + ", userEmail=" + userEmail + ", ucontact=" + ucontact + ", uidType=" + uidType
				+ ", idNumber=" + idNumber + "]";
	}


}
