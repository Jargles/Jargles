package com.jargles.service;


import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jargles.entity.UserEntity;

public interface UserService extends IService<UserEntity>{

	UserEntity findByUserName(String userName);

	UserEntity findUserById(Integer id);

	List<UserEntity> getUserList();

	boolean login(UserEntity user);


}
