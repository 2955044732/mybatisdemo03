package com.qwh.mybatis.Test;

import com.qwh.mybatis.mapper.DeptMapper;
import com.qwh.mybatis.pojo.Dept;
import com.qwh.mybatis.utils.SqlSessionUtils;
import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @auther qwh
 * @create 2023-04-2023/4/20 21:02
 */
public class DeptMapperTest {
//    @Test
//    public void getDeptAndEmpByStep(){
//        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
//        Dept dept = mapper.getDeptAndEmpByStep(1);
//        System.out.println(dept);
//
//    }    @Test
//    public void getEmpAndDeptByStep(){
//        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
//        Dept dept = mapper.getDeptAndEmpByStep(1);
//        System.out.println(dept);
//    }
//    @Test
//    public void getDeptAndEmp(){
//        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
//        Dept dept = mapper.getDeptAndEmp(1);
//        System.out.println(dept);
//    }
    @Test
    public void DeptAndEmpStep(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.DeptAndEmpStepOne(1);
        System.out.println(dept);
    }


}
