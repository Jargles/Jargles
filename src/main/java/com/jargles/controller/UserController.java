package com.jargles.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jargles.entity.UserEntity;
import com.jargles.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	UserService userService;
	
	@RequestMapping("/")
    public String index() {
        return "redirect:/user/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<UserEntity> users=userService.getUserList();
        model.addAttribute("users", users);
        return "user/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "user/userAdd";
    }

    @RequestMapping("/add")
    public String add(UserEntity user) {
        userService.save(user);
        return "redirect:/user/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Integer userId) {
    	UserEntity user=userService.findUserById(userId);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(UserEntity user) {
        userService.updateById(user);
        return "redirect:/user/list";
    }

    @RequestMapping("/delete")
    public String delete(Integer userId) {
        userService.removeById(userId);
        return "redirect:/user/list";
    }
    
    @RequestMapping("login")
    public String login(UserEntity user) {
    	if(userService.login(user)) {
    		return "/user/list";
    	}else {
			return "login";
		}
    }

}
