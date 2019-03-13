/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hung.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hungdung
 */
@Entity
@Table(name = "EMPLOYEE_INFORMATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeInformation.findAll", query = "SELECT e FROM EmployeeInformation e")
    , @NamedQuery(name = "EmployeeInformation.findById", query = "SELECT e FROM EmployeeInformation e WHERE e.id = :id")
    , @NamedQuery(name = "EmployeeInformation.findByName", query = "SELECT e FROM EmployeeInformation e WHERE e.name = :name")
    , @NamedQuery(name = "EmployeeInformation.findBySalary", query = "SELECT e FROM EmployeeInformation e WHERE e.salary = :salary")})
public class EmployeeInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 1000)
    @Column(name = "NAME")
    private String name;
    @Column(name = "SALARY")
    private BigInteger salary;

    public EmployeeInformation() {
    }

    public EmployeeInformation(Integer id) {
        this.id = id;
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

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeInformation)) {
            return false;
        }
        EmployeeInformation other = (EmployeeInformation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hung.entity.EmployeeInformation[ id=" + id + " ]";
    }
    
}
