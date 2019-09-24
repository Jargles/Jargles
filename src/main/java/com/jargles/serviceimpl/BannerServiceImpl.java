package com.jargles.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jargles.entity.BannerEntity;
import com.jargles.mapper.BannerMapper;
import com.jargles.service.BannerService;

@Service("BannerService")
public class BannerServiceImpl extends ServiceImpl<BannerMapper,BannerEntity> implements BannerService{

	@Autowired
	BannerMapper  bannerMapper;
	
	
	@Override
	public List<BannerEntity> getBannerList() {
		return bannerMapper.selectList(new QueryWrapper<BannerEntity>(null));
	}

	

}
