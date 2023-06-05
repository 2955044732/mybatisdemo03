package com.qwh.mybatis.mapper;

import com.qwh.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @auther qwh
 * @create 2023-04-2023/4/20 19:05
 */
public interface DeptMapper {

    /**
     * 通过分步查询查询员工以及员工所对应的部门信息
     */
    Dept getDeptAndEmpByStep(@Param("did") Integer did);
    /**
     * 获取部门以及部门中所有员工的信息
     */
    Dept getDeptAndEmp(@Param("did") Integer did);


    /**
     * 通过分步查询查询员工以及员工所对应的部门信息
     * 分步查询第二步：通过did查询员工所对应的部门
     */
    Dept getEmpAndDeptByStepTwe(@Param("eid") Integer eid);
    /**
     * 通过分布查询部门以及部门所有的员工信息
     */
    Dept DeptAndEmpStepOne(@Param("did") Integer did);
}
