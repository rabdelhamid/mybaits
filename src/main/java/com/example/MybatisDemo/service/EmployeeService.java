/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.MybatisDemo.service;
import com.example.MybatisDemo.model.Employee;
import com.example.MybatisDemo.model.Employee_mapper;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class EmployeeService {
    
     public List findAll() throws IOException
    {
        Reader reader = Resources.getResourceAsReader("MyBatisXmlConfiguration.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
        SqlSession session = sqlSessionFactory.openSession();
        session.getConfiguration().addMapper(Employee_mapper.class);
      
        Employee_mapper mapper = session.getMapper(Employee_mapper.class);      
         //Insert student data   
        List<Employee> nResult= mapper.getAll();
        
        session.commit();
        session.close(); 
        return nResult;
    }
    public void insert(Employee emp) throws IOException
    {
        Reader reader = Resources.getResourceAsReader("MyBatisXmlConfiguration.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
        SqlSession session = sqlSessionFactory.openSession();
        session.getConfiguration().addMapper(Employee_mapper.class);
      
        Employee_mapper mapper = session.getMapper(Employee_mapper.class);      
         //Insert student data   
        mapper.insert(emp);
        System.out.println("record inserted successfully");
        session.commit();
        session.close(); 
    }
}
