package com.xworkz.xworkzapp.Hospital;

public class HospitalDto {

	private String licenceNo;
	private String name;
	private String location;
	private String founder;
	private String specilaization;
	private String phNo;
	public HospitalDto(String licenceNo, String name, String location, String founder, String specilaization,
			String phNo) {
		this.licenceNo = licenceNo;
		this.name = name;
		this.location = location;
		this.founder = founder;
		this.specilaization = specilaization;
		this.phNo = phNo;
	}
	public String getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public String getSpecilaization() {
		return specilaization;
	}
	public void setSpecilaization(String specilaization) {
		this.specilaization = specilaization;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public HospitalDto() {
	}
	
}
