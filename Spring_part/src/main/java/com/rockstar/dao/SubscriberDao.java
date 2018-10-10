package com.rockstar.dao;

import java.util.List;

import com.rockstar.model.SubscriberInfo;


public interface SubscriberDao {


	SubscriberInfo addSubscriberInfo(SubscriberInfo info);
	SubscriberInfo updateSubscriberInfo(SubscriberInfo info);
	SubscriberInfo getSubscriberInfoByRmn(int rmn);
	boolean deleteSubscriberInfoByRmn(int rmn);
	List<SubscriberInfo> getAllSubscriberInfos();
}
