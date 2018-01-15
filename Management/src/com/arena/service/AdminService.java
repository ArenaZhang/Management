package com.arena.service;

import java.util.List;
import com.arena.pojo.Admin;
public interface AdminService {

	//登陆服务
	public int login(Admin admin) throws Exception;
	
	//查询个人信息服务
	 public Admin selectByPrimaryKey(String aid) throws Exception;
	 
	//更改个人信息服务
	 public boolean updateSelfInfo(Admin admin) throws Exception;
	
	 //查询所有用户服务
	 public List<Admin> selectAdminList() throws Exception;
	 
	 //插入个人信息服务
	 public void insertAdmin(Admin admin) throws Exception;
	 
	 //批量更改个人信息服务
	 public void updateAdminInfo(List<Admin> adminList) throws Exception;
	 
	 //删除管理员服务
	 public void deleteAdmin(String aid) throws Exception;
	
}