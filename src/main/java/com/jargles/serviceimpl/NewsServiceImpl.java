package com.jargles.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jargles.entity.NewsEntity;
import com.jargles.mapper.NewsMapper;
import com.jargles.service.NewsService;

@Service("NewsService")
public class NewsServiceImpl extends ServiceImpl<NewsMapper, NewsEntity> implements NewsService{

	@Autowired
	NewsMapper newsMapper;
	
	@Override
	public List<NewsEntity> getNewsList() {
		return newsMapper.selectList(new QueryWrapper<NewsEntity>(null));
	}

	@Override
	public IPage<NewsEntity> getNews() {
		Page page = new Page<NewsEntity>();
		page.setCurrent(1);
		page.setSize(6);
		IPage news = newsMapper.selectPage(page, new QueryWrapper<NewsEntity>(null));
		System.out.println(news);
		return news;
	}
	

}
