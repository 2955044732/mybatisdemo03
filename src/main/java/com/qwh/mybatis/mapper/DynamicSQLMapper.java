package com.qwh.mybatis.mapper;

import com.qwh.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @auther qwh
 * @create 2023-04-2023/4/20 22:16
 */
public interface DynamicSQLMapper {
    /**
     * 多条件查询
     */
    List<Emp> getEmpByCondition(Emp emp);
    /**
     * 测试choose where otherwise
     */
    List<Emp> getEmpChoose(Emp emp);
    /**
     * 通过数组实现批量删除
     */
    int deleteMoreArray(@Param("eids") int[] eids);
    /**
     * 通过list集合实现批量添加
     */
    int insertMoreByList(@Param("emps") List<Emp> emps);

}
