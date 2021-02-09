/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.MybatisDemo.model;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 *
 * @author user
 */
public interface  Employee_mapper {
    final String getAll = "SELECT * FROM employees"; 
   final String getById = "SELECT * FROM EMPLOYEES WHERE ID = #{id}";
   final String deleteById = "DELETE from EMPLOYEES WHERE ID = #{id}";
   final String insert = "INSERT INTO EMPLOYEES (name, email, active, first_name, last_name,birth_date,entry_date ) VALUES (#{name}, #{email}, #{active}, #{firstName}, #{lastName}, #{birthDate}, #{entryDate})";
   final String update = "UPDATE EMPLOYEES SET email = #{email}, name = #{name}, active = #{active}, first_name = #{firstName}, last_name = #{lastName},birth_date = #{birthDate},,birth_date = #{entryDate} WHERE ID = #{id}";

   @Select(getAll)
   @Results(value = {
      @Result(property = "id", column = "id"),
      @Result(property = "name", column = "name"),
      @Result(property = "email", column = "email"),
      @Result(property = "active", column = "active"),       
      @Result(property = "firstName", column = "first_name"),
      @Result(property = "lastName", column = "last_name"),
      @Result(property = "birthDate", column = "birth_date"),
      @Result(property = "entryDate", column = "entry_date")
   })
   //http://discocid1.blogspot.com/2011/06/mybatis-javalangunsupportedoperationexc.html
   //java.lang.UnsupportedOperationException
   List<Employee> getAll();
  
   @Select(getById)
   @Results(value = {
     @Result(property = "id", column = "id"),
      @Result(property = "name", column = "name"),
      @Result(property = "email", column = "email"),
      @Result(property = "active", column = "active"),       
      @Result(property = "firstName", column = "first_name"),
      @Result(property = "lastName", column = "last_name"),
      @Result(property = "birthDate", column = "birth_date"),
      @Result(property = "entryDate", column = "entry_date")
   })
   
   Employee getById(int id);

   @Update(update)
   void update(Employee employee);

   @Delete(deleteById)
   void delete(int id);
  
   @Insert(insert)
   @Options(useGeneratedKeys = true, keyProperty = "id")
   void insert(Employee employee);

}
