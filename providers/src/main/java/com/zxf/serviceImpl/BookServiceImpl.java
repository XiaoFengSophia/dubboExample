package com.zxf.serviceImpl;

//import com.alibaba.dubbo.config.annotation.Service;
import com.zxf.entities.Emp;
import com.zxf.entity.Model;
import com.zxf.idao.EmpIDAO;
import com.zxf.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service// dubbo的 com.alibaba.dubbo.config.annotation.Service;
@Service("bookService") //spring的 org.springframework.stereotype.Service;
public class BookServiceImpl implements IBookService {

	@Autowired
	private EmpIDAO empIdao;
	
	@Value("${server.port}")
	private String provitePort;

	@Override
	public String testRpc(String name) {
		// TODO Auto-generated method stub
		return "接受到的name=" + name + " 端口号为=" + provitePort;
	}

	@Override
	public String getModelEntity(String mainId) {
		System.out.println("接受到的mainId=" + mainId);
		if("qwret23456bfbdfe".equals(mainId)){
			Model model = new Model("qwret23456bfbdfe","阶段答复模板");
			return model.toString();
		}
		try{
			Thread.sleep(5000);
		}catch (Exception e){

		}
		return null;
	}

	@Override
	public List<Emp> getEmps() {
		List<Emp> list = empIdao.getEmps();
		System.out.println("list:" + list);
		return list;
	}

}
