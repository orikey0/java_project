package com.situ.entity;

import java.io.Serializable;

import com.situ.utils.MD5Util;

public class User implements Serializable{
	public static final String[] sexs= {"ÄÐ","Å®"};
	public String getSexname() {
		return sexs[sex];
	}
	
	private String classname;
	
	
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}

	private int id;
	private String name;
	private int sex;
	private int classid;
	private String pass="";
	
	public String getPass() {
		/*
		 * System.out.println(MD5Util.MD5(pass));
		 * System.out.println("*******************************************");
		 */
		return pass.length()==0?"":MD5Util.MD5(pass);
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
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

	
}
