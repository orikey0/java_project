package com.situ.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.situ.entity.Class;

@Repository
public interface ClassDao {

	@Select("select * from  class ")
	public List<Class> select();
	
	@Select("select * from class where id =#{id}")
	public Class getById(int id);
	
	@Delete("delete from class where id=#{id}")
	public void delete(int id);
	
	@Insert("insert into class (name) values(#{name})")
	public void insert(Class u);
	
	@Insert("update class set name=#{name} where id=#{id}")
	public void update(Class u);
	
	
}
