package com.qwh.mybatis.Test;

import com.google.protobuf.ValueOrBuilder;
import com.qwh.mybatis.mapper.EmpMapper;
import com.qwh.mybatis.pojo.Emp;
import com.qwh.mybatis.utils.SqlSessionUtils;
import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;


/**
 * @auther qwh
 * @create 2023-04-2023/4/20 19:10
 */
public class EmpMapperTest {
    @Test
    public void getAllEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        for (Emp emp : allEmp) {            //--->不匹配            <-----//
            System.out.println(emp);//(1)Emp{eid=5, empName='null', age=123, sex='女', email='asd.com', dept=null}
                                    //(2)Emp{eid=5, empName='heihei', age=123, sex='女', email='asd.com', dept=null}
                                    //(3)Emp{eid=5, empName='heihei', age=123, sex='女', email='asd.com', dept=null}
                                    //(4)Emp{eid=5, empName='heihei', age=123, sex='女', email='asd.com', dept=null}
        }
    }
    @Test
    public void getEmpAndDept(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(1);
        System.out.println(emp);
    }
    @Test
    public void getEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStep(1);
        System.out.println(emp);
    }



}
