package com.situ.entity;

import java.io.Serializable;

public class Class implements Serializable{
	private int id;
	private String name;
	private int sex;
	private int classid;
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	//数据模板文件 POJO对象，简单JAVA对象
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
