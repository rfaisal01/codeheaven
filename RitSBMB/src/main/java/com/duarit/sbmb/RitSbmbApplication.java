package com.duarit.sbmb;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.duarit.sbmb.model.Users;


@MappedTypes(Users.class) //all classes from MODEL/BEANS
@MapperScan("com.duarit.sbmb.mapper") // package for all mapper classes for each MODEL
@SpringBootApplication
public class RitSbmbApplication {

	public static void main(String[] args) {
		SpringApplication.run(RitSbmbApplication.class, args);
	}

}
