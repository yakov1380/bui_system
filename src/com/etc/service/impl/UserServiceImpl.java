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
	 * ��ȡ�����û���Ϣ
	 * @return
	 */
	public ResultHelper getAllUsers() {
		List<User> usersList = userDAO.getAllUsers();
		return new ResultHelper(usersList, usersList.size(), Constant.SUCCESS_CODE, Constant.SUCCESS_MSG);
	}
	
	/**
	 * ��ҳ��ѯ�����������û�
	 * @return
	 */
	public ResultHelper getUsersPager(User user) {
		return new ResultHelper(userDAO.getUsersPager(user), userDAO.getTotalUsers(user), Constant.SUCCESS_CODE, Constant.SUCCESS_MSG);
	}
	
	/**
	 * ���ݱ�Ż�ȡ�û���ϸ��Ϣ
	 * @return
	 */
	public User getUserById(Integer uid) {
		return userDAO.getUserById(uid);
	}

	/**
	 * �����û�
	 * @param user
	 * @return
	 */
	public ResultHelper addUser(User user) {
		// ��ʼ����
		user.setUpwd("123");
		userDAO.addUser(user);
		return new ResultHelper(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG);
	}
	
	/**
	 * �༭�û���Ϣ
	 * @param user
	 * @return
	 */
	public ResultHelper editUser(User user) {
		userDAO.editUser(user);
		return new ResultHelper(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG);
	}
	
	/**
	 * ����IDɾ���û�
	 * @param uids
	 * @return
	 */
	public ResultHelper delUsers(Integer[] uids) {
		userDAO.delUsers(uids);
		return new ResultHelper(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG);
	}
}
