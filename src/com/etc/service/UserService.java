package com.etc.service;

import com.etc.entity.User;
import com.etc.utils.ResultHelper;

/**
 * 用户服务层接口
 *
 */
public interface UserService {
	/**
	 * 获取所有用户信息
	 * @return
	 */
	public ResultHelper getAllUsers();
	
	/**
	 * 分页查询符合条件的用户
	 * @return
	 */
	public ResultHelper getUsersPager(User user);
	
	/**
	 * 根据编号获取用户详细信息
	 * @return
	 */
	public User getUserById(Integer uid);
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	public ResultHelper addUser(User user);
	
	/**
	 * 编辑用户信息
	 * @param user
	 * @return
	 */
	public ResultHelper editUser(User user);
	
	/**
	 * 根据ID删除用户
	 * @param uids
	 * @return
	 */
	public ResultHelper delUsers(Integer[] uids);
}
