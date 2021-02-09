/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.MybatisDemo.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author user
 */

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;    
    private Integer id;   
    private String name;  
    private String email;   
    private short active;   
    private String firstName;    
    private String lastName;    
    private Date birthDate;  
    private Date entryDate;

    public Employee() {
    }

    public Employee(Integer id, String name, String email, short active, String firstName, String lastName, Date birthDate, Date entryDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.entryDate = entryDate;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getActive() {
        return active;
    }

    public void setActive(short active) {
        this.active = active;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    

    @Override
    public String toString() {
        return "com.example.demo.security.entities.Employees[ id=" + id + " ]";
    }
    
}
