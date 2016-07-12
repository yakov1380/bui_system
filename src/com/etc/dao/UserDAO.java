package com.etc.dao;

import java.util.List;

import com.etc.entity.User;

/**
 * �û����ݷ��ʲ�ӿ�
 *
 */
public interface UserDAO {
	/**
	 * ��ѯ��ȡ�����û���Ϣ
	 * @return
	 */
	public List<User> getAllUsers();
	
	/**
	 * ͳ�Ʒ����������û�����
	 * @return
	 */
	public int getTotalUsers(User user);
	
	/**
	 * ��ҳ��ѯ�����������û�
	 * @return
	 */
	public List<User> getUsersPager(User user);
	
	/**
	 * ���ݱ�Ż�ȡ�û���ϸ��Ϣ
	 * @return
	 */
	public User getUserById(Integer uid);
	
	/**
	 * �����û�
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * �༭�û���Ϣ
	 * @param user
	 */
	public void editUser(User user);
	
	/**
	 * ����IDɾ���û�
	 * @param uids
	 */
	public void delUsers(Integer[] uids);
	
}
