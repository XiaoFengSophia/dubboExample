package com.zxf.idao.com.zxf.idao.impl;

import com.zxf.entities.Emp;
import com.zxf.idao.EmpIDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("empIdao")
public class EmpDaoImpl implements EmpIDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Emp> getEmps() {
        String sql = "select * from emp";
//        return jdbcTemplate.query(sql, new EmpRowMapper());
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
    }
}
