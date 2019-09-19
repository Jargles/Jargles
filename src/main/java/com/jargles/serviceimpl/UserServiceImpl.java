package com.jargles.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jargles.entity.UserEntity;
import com.jargles.mapper.UserMapper;
import com.jargles.service.UserService;
import com.jargles.util.JsonUtil;


@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public UserEntity findByUserName(String userName) {
		return userMapper.selectByUserName(userName);
	}

	@Override
	public UserEntity findUserById(Integer id) {
		return userMapper.selectById(id);
	}

	@Override
	public List<UserEntity> getUserList() {
		return userMapper.selectList(new QueryWrapper<UserEntity>(null));
	}

	@Override
	public boolean login(UserEntity user) {
		UserEntity sqluser = findByUserName(user.getUserName());
		if(sqluser.getPassword().equals(user.getPassword())) {
			return true;
		}else {
			return false;
		}
	}

}
