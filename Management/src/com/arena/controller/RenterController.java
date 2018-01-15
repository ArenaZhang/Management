package com.arena.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.arena.pojo.Orders;
import com.arena.service.ItemsService;
import com.arena.service.RenterService;

@Controller
@RequestMapping("/renterController")
public class RenterController {
	@Autowired
	private RenterService renterService;
	@Autowired
	private ItemsService itemsService;
	
	@RequestMapping("/queryOrders")
	public String queryOrders(Model model) throws Exception{
		List<Orders>orderList = renterService.findOrdersList();
		List<String> departmentList = itemsService.findDepartments();
		model.addAttribute("departmentList",departmentList);
        model.addAttribute("orderList",orderList);
		return "index5";
	}
	
		@RequestMapping("/queryOrders2")
		public String queryOrders2(Model model) throws Exception{
			List<Orders>orderList = renterService.findOrdersList();
	        model.addAttribute("orderList",orderList);
			return "index8";
		}
	
	@RequestMapping("/queryOrdersBetween")
	public String queryOrdersBetween(HttpSession session,Model model,Date starttime,Date endtime ,String select_department,String insert_id) throws Exception{
	    
		List<Orders>orderList = renterService.findOrdersListBetween(starttime, endtime,select_department,insert_id);
		
		List<String> departmentList = itemsService.findDepartments();
		
		model.addAttribute("departmentList",departmentList);
		
		model.addAttribute("orderList",orderList);
        
		session.setAttribute("excel", orderList);
        session.setAttribute("starttime",starttime);
        session.setAttribute("endtime",endtime);
		return "index5";
	}
	
	
	
	@RequestMapping("/deleteOrders")
	public String deleteOrders(Integer id) throws Exception{
		if(id!=null){
		renterService.deleteOrders(id);
	return "success1";}
		else{
			return "fail1";
		}
	}
	 	
/*	@RequestMapping("/queryOrdersBetween")
	public String queryOrdersBetween(HttpSession session,Model model,Date start_time,Date end_time,String select_department) throws Exception{
	
		List<Orders>orderList = renterService.findOrdersListBetween(start_time, end_time,select_department);
		List<String> departmentList = itemsService.findDepartments();
		model.addAttribute("departmentList",departmentList);
		model.addAttribute("orderList",orderList);
        session.setAttribute("excel", orderList);
		return "index5";
	}
	@RequestMapping("/deleteOrders")
	public String deleteOrders(Integer id) throws Exception{
		if(id!=null){
		renterService.deleteOrders(id);
	return "success1";}
		else{
			return "fail1";
		}
	}*/
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/outToExcel")
	public String outToExcel(HttpSession session,String fileName) throws Exception{
		 	if((session.getAttribute("excel")!=null)&&(fileName.equals("")!=true)&&(fileName!=null))
		   {
				List<Orders> orderList=	(List<Orders>) session.getAttribute("excel");
				session.removeAttribute("excel");
				renterService.excelOrders(orderList,fileName.trim());
	            return "success";
			}else{
				return "fail";
			}
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/outToAssembleExcel")
	public String outToAssembleExcel(HttpSession session,String fileName2) throws Exception{
		 	if((session.getAttribute("excel")!=null)&&(fileName2.equals("")!=true)&&(fileName2!=null))
		   {
				List<Orders> orderList=	(List<Orders>) session.getAttribute("excel");
				Date start_time = (Date)session.getAttribute("starttime");
				Date end_time = (Date)session.getAttribute("endtime");
				
				session.removeAttribute("excel");
				session.removeAttribute("starttime");
				session.removeAttribute("endtime");
				renterService.excelAsembleOrders(orderList,fileName2.trim(),start_time,end_time);
	            return "success";
			}else{
				return "fail";
			}
	}
	
	/*
	@RequestMapping("/queryOrdersByEid")
	public String queryOrdersByEid(Model model,String insert_id) throws Exception{
		List<Orders>orderList = renterService.findOrdersList();
        model.addAttribute("orderList",orderList);
		return "index5";
	}*/
	

}

