package com.zxf.provider.serviceImpl;

import org.springframework.beans.factory.annotation.Value;
import com.alibaba.dubbo.config.annotation.Service;
import com.zxf.common.service.BookService;

@Service()
public class BookServiceImpl implements BookService {
	
	@Value("${server.port}")
	private String provitePort;

	@Override
	public String testRpc(String name) {
		// TODO Auto-generated method stub
		return "接受到的name=" + name + " 端口号为=" + provitePort;
	}

}
