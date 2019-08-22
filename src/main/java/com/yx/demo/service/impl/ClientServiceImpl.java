package com.yx.demo.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.yx.demo.model.ClientModel;
import com.yx.demo.service.IClientService;

@Service
public class ClientServiceImpl implements IClientService {

	private static final String REST_URL_PREFIX = "http://yaoxi-micro-provider-client-8001";
	
	@Autowired
	private RestTemplate rt;
	
	@Override
	public List<ClientModel> getListByAll() throws Exception {
		return rt.getForObject(REST_URL_PREFIX+"/client/getListByAll", List.class);
	}

}
