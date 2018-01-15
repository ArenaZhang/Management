package com.arena.service;

import java.util.Date;
import java.util.List;

import com.arena.pojo.Orders;
public interface RenterService {
	//查询所有账单
	public List<Orders> findOrdersList() throws Exception;
	//按时间段查询账单
	public List<Orders> findOrdersListBetween(Date date1,Date date2,String department,String eid) throws Exception;
	//打印账单
	public boolean excelOrders(List<Orders> list,String fileName) throws Exception;
	//删除账单
	public boolean deleteOrders(Integer id) throws Exception;
	//打印聚集函数账单
	public boolean excelAsembleOrders(List<Orders> list,String fileName,Date start_time,Date end_time) throws Exception;
}
