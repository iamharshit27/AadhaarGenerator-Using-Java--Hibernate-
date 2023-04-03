package com.harshit.model;

import java.sql.Blob;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class AadhaarDetails {
	@Id
	private long aadhaarNo;
	private String name;
	private String dob;
	private String gender;
	private String address;
	@Lob
	private byte[] photo;
	
	public AadhaarDetails(long aadhaarNo, String name, String dob, String gender, String address, byte[] photo) {
		super();
		this.aadhaarNo = aadhaarNo;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.photo = photo;
	}
	public byte[]  getPhoto() {
		return photo;
	}
	public void setPhoto(byte[]  photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "AadhaarDetails [aadhaarNo=" + aadhaarNo + ", name=" + name + ", dob=" + dob + ", gender=" + gender
				+ ", address=" + address + ", photo=" + photo + "]";
	}
	public long getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(long aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public AadhaarDetails() {
		super();
		
	}
	
	
	

}
