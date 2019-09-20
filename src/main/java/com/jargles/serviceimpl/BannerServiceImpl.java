package com.jargles.serviceimpl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jargles.entity.BannerEntity;
import com.jargles.entity.NewsEntity;
import com.jargles.mapper.BannerMapper;
import com.jargles.mapper.NewsMapper;
import com.jargles.service.BannerService;
import com.jargles.service.NewsService;

@Service("BannerService")
public class BannerServiceImpl extends ServiceImpl<BannerMapper,BannerEntity> implements BannerService{

	@Override
	public List<BannerEntity> getBannerList() {
		return null;
	}

	

}
