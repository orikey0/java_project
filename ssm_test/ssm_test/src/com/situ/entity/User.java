package com.situ.entity;

import java.io.Serializable;

public class User implements Serializable{
	public static String[] sexs= {"��","Ů"};
	public String getsexname() {
		return sexs[sex];
	}//���������
	private String classname;
	
	private int id;
	private String name;
	private int sex;
	private int classid; 
	private String pass="";
	//����ģ���ļ� POJO���󣬼�JAVA����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
//	public String getPass() {
//		return pass.length()==0?"":MD5UTIL.MD5(pass);
//	}
//	public void setPass(String pass) {
//		this.pass = pass;
//	}
	
	
}
