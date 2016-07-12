package com.etc.dao;

import java.util.List;

import com.etc.entity.User;

/**
 * 用户数据访问层接口
 *
 */
public interface UserDAO {
	/**
	 * 查询获取所有用户信息
	 * @return
	 */
	public List<User> getAllUsers();
	
	/**
	 * 统计符合条件的用户数量
	 * @return
	 */
	public int getTotalUsers(User user);
	
	/**
	 * 分页查询符合条件的用户
	 * @return
	 */
	public List<User> getUsersPager(User user);
	
	/**
	 * 根据编号获取用户详细信息
	 * @return
	 */
	public User getUserById(Integer uid);
	
	/**
	 * 新增用户
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * 编辑用户信息
	 * @param user
	 */
	public void editUser(User user);
	
	/**
	 * 根据ID删除用户
	 * @param uids
	 */
	public void delUsers(Integer[] uids);
	
}
