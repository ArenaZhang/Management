package com.arena.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.arena.mapper.AdminMapper;
import com.arena.pojo.Admin;
import com.arena.pojo.AdminExample;
import com.arena.pojo.AdminExample.Criteria;
import com.arena.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Autowired
	private  AdminMapper  adminMapper;

	public int login(Admin admin) throws Exception {
		// TODO 自动生成的方法存
		Admin ad =adminMapper.selectByPrimaryKey(admin.getAid());
		if(ad==null){	
			return 0;
		}if((admin.getAid()).equals(ad.getAid())&&(ad.getMark())==1&&(admin.getApwd()).equals(ad.getApwd())){
			return 1;
		}else if((admin.getAid()).equals(ad.getAid())&&(ad.getMark())==2&&(admin.getApwd()).equals(ad.getApwd())){
			return 2;			
	     }
		return 0;
	}
	
	@Override
	public Admin selectByPrimaryKey(String aid) throws Exception {
		// TODO 自动生成的方法存根
		Admin admin =	adminMapper.selectByPrimaryKey(aid);
		return admin;
	}

	@Override
	public boolean updateSelfInfo(Admin admin) throws Exception {
		// TODO 自动生成的方法存根
		adminMapper.updateByPrimaryKeySelective(admin);
		return true;
	}

	@Override
	public List<Admin> selectAdminList() throws Exception {
		// TODO Auto-generated method stub
		List<Admin> adminList =adminMapper.selectByExample(null);
		return adminList;
	}

	@Override
	public void insertAdmin(Admin admin) throws Exception {
		// TODO Auto-generated method stub
		adminMapper.insertSelective(admin);
	}

	@Override
	public void updateAdminInfo(List<Admin> adminList) throws Exception {
		// TODO Auto-generated method stub
		for(Admin admin:adminList){
			AdminExample example = new AdminExample();
			Criteria criteria = example.createCriteria();
			criteria.andAidEqualTo(admin.getAid());
		    adminMapper.updateByExampleSelective(admin, example);
		}
	}

	@Override
	public void deleteAdmin(String aid) throws Exception {
		// TODO Auto-generated method stub
		adminMapper.deleteByPrimaryKey(aid);
	}

	

	


}
