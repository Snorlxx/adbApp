package com.rockstar.restapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rockstar.model.SubscriberInfo;
import com.rockstar.service.SubscriberService;

@RestController
@CrossOrigin
@RequestMapping("/myinfo")

public class MyAccountInfoApi {

	
	@Autowired
	private SubscriberService subscriberserv;
	
	@GetMapping
	public String defaultAction() {
		return "HELLO BRooo";
	}
	
	@GetMapping("/{rmn}")
	public ResponseEntity<SubscriberInfo> getSubscriberAction(@PathVariable("rmn") int rmn) {
		ResponseEntity<SubscriberInfo> resp = null;
		SubscriberInfo newsubscriber = subscriberserv.getSubscriberInfoByRmn(rmn);
		if (newsubscriber == null)
			resp = new ResponseEntity<SubscriberInfo>(HttpStatus.NOT_FOUND);
		else
			resp = new ResponseEntity<SubscriberInfo>(newsubscriber, HttpStatus.OK);

		return (resp);
	}
}
