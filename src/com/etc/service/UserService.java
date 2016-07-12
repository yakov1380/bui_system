package com.etc.service;

import com.etc.entity.User;
import com.etc.utils.ResultHelper;

/**
 * �û������ӿ�
 *
 */
public interface UserService {
	/**
	 * ��ȡ�����û���Ϣ
	 * @return
	 */
	public ResultHelper getAllUsers();
	
	/**
	 * ��ҳ��ѯ�����������û�
	 * @return
	 */
	public ResultHelper getUsersPager(User user);
	
	/**
	 * ���ݱ�Ż�ȡ�û���ϸ��Ϣ
	 * @return
	 */
	public User getUserById(Integer uid);
	
	/**
	 * �����û�
	 * @param user
	 * @return
	 */
	public ResultHelper addUser(User user);
	
	/**
	 * �༭�û���Ϣ
	 * @param user
	 * @return
	 */
	public ResultHelper editUser(User user);
	
	/**
	 * ����IDɾ���û�
	 * @param uids
	 * @return
	 */
	public ResultHelper delUsers(Integer[] uids);
}
