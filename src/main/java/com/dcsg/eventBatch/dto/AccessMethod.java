package com.dcsg.eventBatch.dto;

import java.util.Date;

public class AccessMethod {
	public String method;
    public Date created_at;
    public boolean employee_only;
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public boolean isEmployee_only() {
		return employee_only;
	}
	public void setEmployee_only(boolean employee_only) {
		this.employee_only = employee_only;
	}
    
    

}
