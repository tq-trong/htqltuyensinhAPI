package com.cusc.htqltuyensinh.dto;

import java.util.Date;

public class ChangeLogDTO extends BaseDTO<ChangeLogDTO>{
	private Date time;
	private AdminDTO admin;
	private String description;
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public AdminDTO getAdmin() {
		return admin;
	}
	public void setAdmin(AdminDTO admin) {
		this.admin = admin;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
