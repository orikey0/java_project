package com.situ.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.situ.entity.Class;

@Repository
public interface ClassDao {

	@Select("select * from  Class ")
	public List<Class> select();
	
	@Select("select * from Class where id =#{id}")
	public Class getById(int id);
	
	@Delete("delete from Class where id=#{id}")
	public void delete(int id);//ֻ��һ���������������ʱ��������ֻ��Ի�������
	
	@Insert("insert into Class (name) values(#{name})")
	public void insert(Class u);
	
	@Insert("update Class set name=#{name} where id=#{id}")
	public void update(Class u);
	
}
