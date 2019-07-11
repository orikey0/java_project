package com.situ.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.situ.entity.User;

@Repository
public interface UserDao {

	@Select("select user.*,class.name classname from "
			+ "user inner join class on user.classid=class.id")
	public List<User> select();
	
	@Select("select * from user where id =#{id}")
	public User getById(int id);
	
	@Delete("delete from user where id=#{id}")
	public void delete(int id);//只认一个参数，多个参数时创建对象，只针对基本类型
	
	@Insert("insert into user (name,sex,classid) "
			+"values(#{name} ,#{sex},#{classid})")
	public void insert(User u);
	
	@Insert("update user set name=#{name},id=#{id},classid=#{classid} where id=#{id}")//
	public void update(User u);
	
}
