package com.etc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.etc.entity.User;
import com.etc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	// 匹配 http://localhost:8080/bui_mysystem/user/getAllUsers.action
	// 查询所有用户
	@RequestMapping("/getAllUsers.action")
	@ResponseBody
	public Object getAllUsers() {
		return userService.getAllUsers();
	}
	
	// 按条件分页查询用户
	@RequestMapping("/getUsersPager.action")
	@ResponseBody
	public Object getUsersPager(User user) {
		return userService.getUsersPager(user);
	}
	
	// 根据ID获取用户详细信息
	@RequestMapping("/getUserById.action")
	@ResponseBody
	public ModelAndView getUserById(Integer uid) {
		// 请求转发，跳转到userinfo.jsp并传递查找到的用户信息
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("user", userService.getUserById(uid));
		// 跳转到 /user/userinfo.jsp页面
		return new ModelAndView("userinfo", data);
	}
	
	// 新增用户
	@RequestMapping("/addUser.action")
	@ResponseBody
	public Object addUser(User user) {
		return userService.addUser(user);
	}
	
	// 编辑用户信息
	@RequestMapping("/editUser.action")
	@ResponseBody
	public Object editUser(User user) {
		return userService.editUser(user);
	}
	
	// 根据ID删除用户
	@RequestMapping("/delUsers.action")
	@ResponseBody
	public Object delUsers(@RequestParam("uids[]") Integer[] uids) {
		return userService.delUsers(uids);
	}

}
