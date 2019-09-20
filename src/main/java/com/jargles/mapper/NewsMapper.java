package com.jargles.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jargles.entity.NewsEntity;

@Mapper
public interface NewsMapper extends BaseMapper<NewsEntity>{


}
