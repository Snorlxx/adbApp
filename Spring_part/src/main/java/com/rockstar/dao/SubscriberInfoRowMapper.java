package com.rockstar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rockstar.model.SubscriberInfo;

public class SubscriberInfoRowMapper implements RowMapper<SubscriberInfo> {

	@Override
	public SubscriberInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		SubscriberInfo newsubscriber=new SubscriberInfo();
		
	
		newsubscriber.setTitle(rs.getString(1));
		newsubscriber.setFirstname(rs.getString(2));
		newsubscriber.setMiddlename(rs.getString(3));
		newsubscriber.setLastname(rs.getString(4));
		newsubscriber.setGender(rs.getString(5));
		newsubscriber.setRmn(rs.getInt(6));
		newsubscriber.setContact(rs.getInt(7));
		newsubscriber.setEmail(rs.getString(8));
		
		newsubscriber.setAddress(rs.getString(9));
		newsubscriber.setLandmark(rs.getString(10));
		newsubscriber.setLocation(rs.getString(11));
		newsubscriber.setBuilding(rs.getString(12));
		newsubscriber.setDistrict(rs.getString(13));
		newsubscriber.setCity(rs.getString(14));
		newsubscriber.setState(rs.getString(15));
		newsubscriber.setCountry(rs.getString(16));
		newsubscriber.setPincode(rs.getInt(17));
		
		return newsubscriber;
	}

}
