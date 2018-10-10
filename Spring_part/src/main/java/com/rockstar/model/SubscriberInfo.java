package com.rockstar.model;

public class SubscriberInfo {

	private String title;
	private String firstname;
	private String middlename;
	private String lastname;
	private String gender;
	private int rmn;
	private int contact;
	private String email;
	
	private String address;
	private String landmark;
	private String location;
	private String building;
	private String district;
	private String city;
	private String state;
	private String country;
	private int pincode;
	
	
	public SubscriberInfo() {
		
	}

	
	

	public SubscriberInfo(String title, String firstname, String middlename, String lastname, String gender,
			int rmn, int contact, String email, String address, String landmark, String location, String building,
			String district, String city, String state, String country, int pincode) {
		super();
		this.title = title;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.gender = gender;
		this.rmn = rmn;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.landmark = landmark;
		this.location = location;
		this.building = building;
		this.district = district;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}




	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMiddlename() {
		return middlename;
	}


	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getRmn() {
		return rmn;
	}


	public void setRmn(int rmn) {
		this.rmn = rmn;
	}


	public int getContact() {
		return contact;
	}


	public void setContact(int contact) {
		this.contact = contact;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getLandmark() {
		return landmark;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getBuilding() {
		return building;
	}


	public void setBuilding(String building) {
		this.building = building;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
