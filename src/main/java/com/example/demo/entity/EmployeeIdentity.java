package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeIdentity implements Serializable {
	
	private static final long SerialVersionUID = 1L;
	
	private String id;
	private String companyId;
	
	
	
	public EmployeeIdentity() {
		super();
		
	}
	public EmployeeIdentity(String employeeId, String employeeCompany) {
		super();
		this.id = employeeId;
		this.companyId = employeeCompany;
	}
	public String getEmployeeId() {
		return id;
	}
	public void setEmployeeId(String employeeId) {
		this.id = employeeId;
	}
	public String getEmployeeCompany() {
		return companyId;
	}
	public void setEmployeeCompany(String employeeCompany) {
		this.companyId = employeeCompany;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeIdentity other = (EmployeeIdentity) obj;
		if (companyId == null) {
			if (other.companyId != null)
				return false;
		} else if (!companyId.equals(other.companyId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
