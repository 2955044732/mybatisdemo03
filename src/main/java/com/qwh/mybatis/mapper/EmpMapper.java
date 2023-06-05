package com.qwh.mybatis.mapper;

import com.qwh.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @auther qwh
 * @create 2023-04-2023/4/20 19:05
 */
public interface EmpMapper {
    /**
     * 查询所有员工的信息
     * @return
     */
    List<Emp> getAllEmp();
    /**
     * 查询员工以及员工在内的部门信息
     */
    Emp getEmpAndDept(@Param("eid") Integer eid);
    /**
     * 通过分布查询员工及员工所对应的部门信息
     */
    Emp getEmpAndDeptByStep(@Param("eid") Integer eid);
    List<Emp> getDeptAndEmpByStep(@Param("did") Integer did);
//*******************************************************************
    Emp DeptAndEmpStepTwe(@Param("did") Integer did);
}