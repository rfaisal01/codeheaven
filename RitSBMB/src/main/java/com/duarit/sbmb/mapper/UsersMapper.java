package com.duarit.sbmb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.duarit.sbmb.model.Users;

@Mapper
public interface UsersMapper {

	
	@Select("select * from Users")
	List<Users> findAll();
	
	@Select("select * from Users where name = #{name}")
	List<Users> findByName(@Param("name") String name);
	
	
	@Insert("INSERT INTO Users (id,name, salary) values(#{id},#{name},#{salary})")
	void insertUsers(Users u);
}
