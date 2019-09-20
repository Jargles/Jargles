package com.jargles.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jargles.entity.NewsEntity;

public interface NewsService extends IService<NewsEntity>{

	List<NewsEntity> getNewsList();



}
