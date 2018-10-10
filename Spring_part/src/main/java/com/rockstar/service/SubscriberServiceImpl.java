package com.rockstar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockstar.dao.SubscriberDao;
import com.rockstar.model.SubscriberInfo;
@Service
public class SubscriberServiceImpl implements SubscriberService {

	
	@Autowired
	private SubscriberDao subscriberdao;
	
	@Override
	public SubscriberInfo addSubscriberInfo(SubscriberInfo info) {
		return subscriberdao.addSubscriberInfo(info);
	}

	@Override
	public SubscriberInfo updateSubscriberInfo(SubscriberInfo info) {
		return subscriberdao.updateSubscriberInfo(info);
	}

	@Override
	public SubscriberInfo getSubscriberInfoByRmn(int rmn) {
		return subscriberdao.getSubscriberInfoByRmn(rmn);
	}

	@Override
	public boolean deleteSubscriberInfoByRmn(int rmn) {
		return subscriberdao.deleteSubscriberInfoByRmn(rmn);
	}

	@Override
	public List<SubscriberInfo> getAllSubscriberInfos() {
		return subscriberdao.getAllSubscriberInfos();
	}

}
