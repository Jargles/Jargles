package com.jargles.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("ja_user")
public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = 7814360331301464552L;

	@TableId
	private Integer userId;
	
	private Integer jarglesId;
	
	private String userName;
	
	private String password;
	
	private String realName;
	
	private Integer sex;
	
	private Integer age;
	
	private String birthday;
	
	private String phone;
	
	private String qqNum;

}
