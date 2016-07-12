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
	
	// ƥ�� http://localhost:8080/bui_mysystem/user/getAllUsers.action
	// ��ѯ�����û�
	@RequestMapping("/getAllUsers.action")
	@ResponseBody
	public Object getAllUsers() {
		return userService.getAllUsers();
	}
	
	// ��������ҳ��ѯ�û�
	@RequestMapping("/getUsersPager.action")
	@ResponseBody
	public Object getUsersPager(User user) {
		return userService.getUsersPager(user);
	}
	
	// ����ID��ȡ�û���ϸ��Ϣ
	@RequestMapping("/getUserById.action")
	@ResponseBody
	public ModelAndView getUserById(Integer uid) {
		// ����ת������ת��userinfo.jsp�����ݲ��ҵ����û���Ϣ
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("user", userService.getUserById(uid));
		// ��ת�� /user/userinfo.jspҳ��
		return new ModelAndView("userinfo", data);
	}
	
	// �����û�
	@RequestMapping("/addUser.action")
	@ResponseBody
	public Object addUser(User user) {
		return userService.addUser(user);
	}
	
	// �༭�û���Ϣ
	@RequestMapping("/editUser.action")
	@ResponseBody
	public Object editUser(User user) {
		return userService.editUser(user);
	}
	
	// ����IDɾ���û�
	@RequestMapping("/delUsers.action")
	@ResponseBody
	public Object delUsers(@RequestParam("uids[]") Integer[] uids) {
		return userService.delUsers(uids);
	}

}
