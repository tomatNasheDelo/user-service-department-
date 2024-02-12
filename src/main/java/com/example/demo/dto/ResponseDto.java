package com.example.demo.dto;



public class ResponseDto {
	
	
	
	 public ResponseDto() {
		super();
	}
	public ResponseDto(DepartmentDto department, UserDto user) {
		super();
		this.department = department;
		this.user = user;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	private DepartmentDto department;
	  private UserDto user;

}
