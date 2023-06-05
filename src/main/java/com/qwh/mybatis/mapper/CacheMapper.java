package com.qwh.mybatis.mapper;

import com.qwh.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @auther qwh
 * @create 2023-04-2023/4/20 23:18
 */
public interface CacheMapper {
    Emp getEmpById(@Param("eid") Integer eid);
    Boolean insertEmp(Emp emp);
}
