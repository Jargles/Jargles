package com.jargles.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jargles.entity.UserEntity;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity>{

	@Select("select * from ja_user where user_name = #{userName}")
	UserEntity selectByUserName(String userName);

}
