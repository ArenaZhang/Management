package com.arena.service;

import java.util.Date;
import java.util.List;

import com.arena.pojo.Departments;
import com.arena.pojo.Items;
import com.arena.pojo.Maintain;
public interface ItemsService {
	//根据设备类型和状态查询设备
	public List<Items> findItemsStausItmes(Items item) throws Exception;
	//查找被科室借出去的设备
	public List<Items> findDepartmentItems(String department) throws Exception;
	//查找所有的items
	public List<Items> findAllItems() throws Exception;
	//查找一个items
	public Items findItemsById(String id) throws Exception;
	//通过状态查询一个列表
	public List<Items> findItemsListByStatus(String status) throws Exception;
	//设备类型和状态为备用
	public List<Items> findItemsStausItmes2(Items item) throws Exception;
	//设备类型为状态和损坏
	public List<Items> findItemsStausItmes3(Items item) throws Exception;
	//更新设备信息
	public void updateItemsStatus(Items item) throws Exception;
	
	public List<Items> findItemsByIdArray (int[] items_id) throws Exception;
	
	public List<Items> findItemsListByEname (String ename) throws Exception;
	//列表集体还设备
	public boolean updateItemsInList(List<Items> list) throws Exception;
	//单设备归还
	public boolean updateItem(Items item) throws Exception;
	//更新设备信息
	public boolean updateItemByAdmin(Items item) throws Exception;
	//添加设备
	public boolean insertItem(Items item)throws Exception;
	//删除设备
	public boolean deleteItem(String id) throws Exception;
	
	public List<Items> findItemsRentList(String rname,String rdepartment) throws Exception;
	
	public float rentPay(Date date1,Date date2) throws Exception;
	//找到所有的设备类型
	public List<String> findAlltypes() throws Exception;
	//插入部门
	public boolean insertDepartments(Departments department) throws Exception;
	//寻找所有部门
	public List<String>findDepartments() throws Exception;
	//删除部门
	public boolean deleteDepartment(String dname) throws Exception;
     
	public long getdate2(String date1,String date2) throws Exception;
	//查询维修列表信息
	public List<Maintain>  findMaintainList() throws Exception;
	//增加维修列表信息
	public boolean insertMaintain(Maintain maintain) throws Exception;
	//删除维修列表信息
	public boolean deleteMaintain(Integer id) throws Exception;
	
}
