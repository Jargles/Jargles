package com.jargles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("/")
    public String index() {
        return "redirect:/index";
    }
	
	@RequestMapping("/index")
    public String index(Model model) {
        return "chiaic/index";
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
	
	@RequestMapping("/news")
    public String news(Model model) {
        return "chiaic/news";
    }
	
	
	

}
