package com.zxf.rowmapper;

import com.zxf.entities.Emp;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpRowMapper implements RowMapper<Emp> {
    @Override
    public Emp mapRow(ResultSet rs, int i) throws SQLException {
        // 对数据的返回处理
        Emp emp = new Emp();
        emp.setEmpNo(rs.getString("empNo"));
        emp.setEname(rs.getString("ename"));
        emp.setJob(rs.getString("job"));
        emp.setMgr(rs.getString("mgr"));
        emp.setHireDate(rs.getDate("hireDate"));
        emp.setSal(rs.getDouble("sal"));
        emp.setComm(rs.getDouble("comm"));
        emp.setDeptNo(rs.getString("deptNo"));

        return emp;
    }
}
