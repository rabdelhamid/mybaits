/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.MybatisDemo.controllers;



import com.example.MybatisDemo.model.Employee;
import com.example.MybatisDemo.service.EmployeeService;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    
    @RequestMapping(method = RequestMethod.GET,value = "/getAllEmployees")    
    public List<Employee> getAllEmployees() throws IOException {
        
        return employeeService.findAll();
    }
    
    @RequestMapping(value = "/createEmployee", method = RequestMethod.POST)
    public ResponseEntity getProductDetails(@RequestBody Employee employee) throws IOException {
        
        employeeService.insert(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
      
    }
//    
//   
//    
//    @RequestMapping(method = RequestMethod.GET,value = "/getEmployeeByNameLike")    
//    public List<Employees> getEmployeeByNameLike(@RequestParam("name") String name) {
//        return employeeRepository.findAllByNameLike(name);
//    }
   
   
    
}
