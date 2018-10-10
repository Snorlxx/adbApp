package com.rockstar.dao;

public interface IQueryMapper {

	public static final String INS_SUBSCRIBER_QRY = 
			"INSERT INTO subscriberinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String DEL_SUBSCRIBER_QRY = 
			"DELETE FROM subscriberinfo WHERE rmn=?";
	public static final String UPDATE_SUBSCRIBER_QRY =
			"UPDATE subscriberinfo SET title=?,firstname=?,middlename=?,lastname=?,"
			+ "gender=?,contact=?,email=?,address=?,landmark=?,location=?,building=?,"
			+ "district=?,city=?,state=?,country=?,pincode=? WHERE rmn=?";
	public static final String GET_SUBSCRIBER_QRY = 
			"SELECT * FROM subscriberinfo WHERE rmn=?";
	public static final String GET_ALL_SUBSCRIBERS_QRY =
			"SELECT * FROM subscriberinfo";

}
