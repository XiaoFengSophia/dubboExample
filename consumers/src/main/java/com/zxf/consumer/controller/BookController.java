package com.zxf.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.dubbo.config.annotation.Reference;
import com.zxf.common.service.BookService;

@RestController
public class BookController{
    // dubbo 用@Reference 调用服务
    @Reference
    private BookService bookService;
	
    @RequestMapping(value = "testRpc/", method = RequestMethod.GET)
    @ResponseBody
    public String  testRpc(String name){

        return bookService.testRpc(name);
    }

}
