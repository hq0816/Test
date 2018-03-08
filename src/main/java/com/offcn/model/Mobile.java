package com.offcn.model;

public class Mobile {

	private int id;
	private String mobileNumber;
	private String mobileArea;
	private String mobileType;
	private String areaCode;
	private String postCode;
	
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobileArea() {
		return mobileArea;
	}
	public void setMobileArea(String mobileArea) {
		this.mobileArea = mobileArea;
	}
	public String getMobileType() {
		return mobileType;
	}
	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileNumber=" + mobileNumber + ", mobileArea=" + mobileArea + ", mobileType="
				+ mobileType + ", areaCode=" + areaCode + ", postCode=" + postCode + "]";
	}
			
			
}
