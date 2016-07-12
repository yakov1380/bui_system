package com.etc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.dao.UserDAO;
import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.utils.Constant;
import com.etc.utils.ResultHelper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	/**
	 * 获取所有用户信息
	 * @return
	 */
	public ResultHelper getAllUsers() {
		List<User> usersList = userDAO.getAllUsers();
		return new ResultHelper(usersList, usersList.size(), Constant.SUCCESS_CODE, Constant.SUCCESS_MSG);
	}
	
	/**
	 * 分页查询符合条件的用户
	 * @return
	 */
	public ResultHelper getUsersPager(User user) {
		return new ResultHelper(userDAO.getUsersPager(user), userDAO.getTotalUsers(user), Constant.SUCCESS_CODE, Constant.SUCCESS_MSG);
	}
	
	/**
	 * 根据编号获取用户详细信息
	 * @return
	 */
	public User getUserById(Integer uid) {
		return userDAO.getUserById(uid);
	}

	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	public ResultHelper addUser(User user) {
		// 初始密码
		user.setUpwd("123");
		userDAO.addUser(user);
		return new ResultHelper(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG);
	}
	
	/**
	 * 编辑用户信息
	 * @param user
	 * @return
	 */
	public ResultHelper editUser(User user) {
		userDAO.editUser(user);
		return new ResultHelper(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG);
	}
	
	/**
	 * 根据ID删除用户
	 * @param uids
	 * @return
	 */
	public ResultHelper delUsers(Integer[] uids) {
		userDAO.delUsers(uids);
		return new ResultHelper(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG);
	}
}
