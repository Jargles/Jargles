package com.jargles.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jargles.entity.BannerEntity;
import com.jargles.entity.NewsEntity;
import com.jargles.service.BannerService;
import com.jargles.service.NewsService;


@Controller
@RequestMapping("/")
public class IndexController {
	
	@Resource
	NewsService newsService;
	
	@Resource
	BannerService bannerService;
	
	@RequestMapping("/")
    public String index() {
        return "redirect:/index";
    }
	
	@RequestMapping("/index")
    public String index(Model model) {
		List<NewsEntity> news = newsService.getNewsList();
		List<BannerEntity> banners = bannerService.getBannerList();
        model.addAttribute("news", news);
        model.addAttribute("banners", banners);
        System.out.println(model);
        return "chiaic/index";
    }
	
	@RequestMapping("/news")
    public String newslist(Model model) {
		JSONObject date = new JSONObject();
		List<NewsEntity> news = newsService.getNewsList();
		List<BannerEntity> banners = bannerService.getBannerList();
		IPage page = newsService.getNews();
      //  model.addAttribute("news", news);
      //  model.addAttribute("banners", banners);
        date.put("page", page);
        model.addAttribute("date", date);
        System.out.println(model);
        return "chiaic/news";
    }
	
	@RequestMapping("/newmain")
    public String newmain(Model model,Integer newId) {
		NewsEntity news = newsService.getById(newId);
        model.addAttribute("news", news);
        System.out.println(model);
        return "chiaic/newmain";
    }
	
	@RequestMapping("/banner")
    public String banner(Model model) {
        return "chiaic/banner";
    }
	
	@RequestMapping("/joinus")
    public String joinus(Model model) {
        return "chiaic/joinus";
    }
	
	@RequestMapping("/baidumap")
    public String baidumap(Model model) {
        return "chiaic/baidumap";
    }
	
	@RequestMapping("/privacy")
    public String privacy(Model model) {
        return "chiaic/privacy";
    }
	
	@RequestMapping("/gsjj")
    public String gsjj(Model model) {
        return "chiaic/gsjj";
    }
	
	@RequestMapping("/ldtd")
    public String ldtd(Model model) {
        return "chiaic/ldtd";
    }

	@RequestMapping("/spzx")
    public String spzx(Model model) {
        return "chiaic/spzx";
    }
	
	@RequestMapping("/cpzs")
    public String cpzs(Model model) {
        return "chiaic/cpzs";
    }
	
	@RequestMapping("/jsfu")
    public String jsfu(Model model) {
        return "chiaic/jsfu";
    }
	
	@RequestMapping("/newslist")
    public String news(Model model) {
        return "chiaic/news";
    }
	
	
	

}
