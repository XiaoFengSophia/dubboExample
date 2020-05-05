package com.zxf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zxf.service.IBookService;
import com.zxf.entities.Emp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController{
    // dubbo 用@Reference 调用服务
    @Reference(timeout = 1000)
    private IBookService bookService;
	
    @RequestMapping(value = "/testRpcService", method = RequestMethod.GET)
    @ResponseBody
    public String  testRpc(String name){

        return bookService.testRpc(name);
    }

    @RequestMapping(value = "getModelEntity/", method = RequestMethod.GET)
    public String  getModelEntity(String modelId){
        System.out.println("------------" + modelId + "----------------");

        return bookService.getModelEntity(modelId);
    }

    @GetMapping(value = "/getEmpsv")
    public List<Emp> getEmps(String modelId){

        return bookService.getEmps();
    }

}
