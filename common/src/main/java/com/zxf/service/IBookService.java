package com.zxf.service;

import com.zxf.entities.Emp;

import java.util.List;

public interface IBookService {
	String testRpc(String name);

	String getModelEntity(String mainId);

	public List<Emp> getEmps();

}
