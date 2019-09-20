package com.jargles.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jargles.entity.BannerEntity;
import com.jargles.entity.NewsEntity;

public interface BannerService extends IService<BannerEntity>{

	List<BannerEntity> getBannerList();



}
