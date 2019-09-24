package com.jargles.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("ja_banner")
public class BannerEntity implements Serializable{

	private static final long serialVersionUID = 4341216844975067540L;
	
	@TableId
	private Integer bannerId;
	
	private String bannerImg;
	
	
	

}
