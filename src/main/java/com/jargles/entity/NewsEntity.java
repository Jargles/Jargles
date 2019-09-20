package com.jargles.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("ja_news")
public class NewsEntity implements Serializable{

	private static final long serialVersionUID = 4341216844975067540L;
	
	@TableId
	private Integer newId;
	
	private String newTitle;
	
	private String newSubhead;
	
	private String promTime;
	
	private String newWriter;
	
	private String newSmBody;
	
	private String newBody;
	
	private String picMain;
	
	private String addUser;
	
	private String addTime;
	
	private Integer newStatus;
	

}
