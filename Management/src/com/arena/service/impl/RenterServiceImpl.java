package com.arena.service.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.springframework.beans.factory.annotation.Autowired;

import com.arena.mapper.OrdersMapper;
import com.arena.pojo.Orders;
import com.arena.pojo.OrdersExample;
import com.arena.service.RenterService;

public class RenterServiceImpl implements RenterService {

	@Autowired
	private  OrdersMapper ordersMapper ;

	@Override
	public List<Orders> findOrdersList() throws Exception {
		// TODO Auto-generated method stub
		OrdersExample example = new OrdersExample();
	    List<Orders> list = ordersMapper.selectByExample(example);
	    int length =list.size();
	    if(length>0){
	    List<Orders> listnew = new ArrayList<Orders>();
	    for(int i = 0;i<length;i++){
			listnew.add(list.get(length-1-i));
		}
	    return listnew;
	    }
		return list;
	}

	@Override
//	public List<Orders> findOrdersListBetween(Date date1, Date date2,String department,String eid)throws Exception {
		public List<Orders> findOrdersListBetween(Date date1, Date date2,String department,String eid)throws Exception {

		// TODO Auto-generated method stub
		/*SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	if(date1!=null&&date2!=null){
		String d1 =sf.format(date1);
		String d2 =sf.format(date2);
	}*/
		OrdersExample example = new OrdersExample();
		OrdersExample.Criteria criteria = example.createCriteria();
		//if((date1!=null&&date2!=null)&&(department==null||department.equals(""))&&(eid==null||eid.equals(""))){
		if((date1!=null&&date2!=null)&&(department==null||department.equals(""))&&(eid==null||eid.equals(""))){
			criteria.andObacktimeBetween(date1,date2);
		/*criteria.andOdepartmentEqualTo(department);*/
		}else if((date1==null||date2==null)&&(department!=null&&department!="")&&(eid==null||eid.equals(""))){
			criteria.andOdepartmentEqualTo(department);
		}else if((date1==null||date2==null)&&(department==null||department=="")&&(eid!=null&&(eid.equals("")==false))){
			criteria.andOeidEqualTo(eid);
		}else if((date1!=null&&date2!=null)&&(department==null||department=="")&&(eid==null||eid.equals(""))){
			criteria.andOeidEqualTo(eid);
		    criteria.andObacktimeBetween(date1,date2);
		}
		else if((date1==null||date2==null)&&(department!=null||department!="")&&(eid!=null&&(eid.equals("")==false))){
			criteria.andOeidEqualTo(eid);
			criteria.andOdepartmentEqualTo(department);
		}
		else if((date1!=null&&date2!=null)&&(department!=null||department!="")&&(eid==null||eid.equals(""))){
			criteria.andObacktimeBetween(date1,date2);
			criteria.andOdepartmentEqualTo(department);
		}
		else{
		  criteria.andOeidEqualTo(eid);
		  criteria.andOdepartmentEqualTo(department);
		  criteria.andObacktimeBetween(date1,date2);
		}
		
		List<Orders> list = ordersMapper.selectByExample(example);
		int length =list.size();
		if(length>0){
		List<Orders> listnew = new ArrayList<Orders>();
	    for(int i = 0;i<length;i++){
				listnew.add(list.get(length-1-i));
			}
		    return listnew;
		    }
		//List<Orders> list = ordersMapper.selectByExample(example);
			return list;
	}

	@Override
	public boolean excelOrders(List<Orders> list,String fileName) throws Exception {
		// TODO Auto-generated method stub	
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		WritableWorkbook book = Workbook.createWorkbook(new File(fileName));
		WritableSheet sheet = book.createSheet("第一页", 0);
		Label labela = new Label(0,0,"编号");
		sheet.addCell(labela);
		Label labelb = new Label(1,0,"设备名称");
		sheet.addCell(labelb);
		Label labelc = new Label(2,0,"设备编号");
		sheet.addCell(labelc);
		Label labeld = new Label(3,0,"借出时间");
		sheet.addCell(labeld);
		Label labele = new Label(4,0,"归还时间");
		sheet.addCell(labele);
		Label labelf  = new Label(5,0,"科室");
		sheet.addCell(labelf);
		Label labelg  = new Label(6,0,"单价");
		sheet.addCell(labelg);
		Label labeli  = new Label(7,0,"小时数");
		sheet.addCell(labeli);
		Label labelh  = new Label(8,0,"总价");
		sheet.addCell(labelh);
		
		
		for(int i =1,j=0;j<list.size();i++,j++){
		Label label = new Label(0,i,String.valueOf(list.get(j).getOid()));
		sheet.addCell(label);
		
		Label label2 = new Label(1,i,String.valueOf(list.get(j).getOname()));
		sheet.addCell(label2);	
		
		Label label4 = new Label(2,i,String.valueOf(list.get(j).getOeid()));
		sheet.addCell(label4);	
		
		Label label3= new Label(3,i,sf.format(list.get(j).getOrenttime()));
		sheet.addCell(label3);
		
		Label label5 = new Label(4,i,sf.format(list.get(j).getObacktime()));
		sheet.addCell(label5);	
		
		Label label6 = new Label(5,i,String.valueOf(list.get(j).getOdepartment()));
		sheet.addCell(label6);
		
		Label label7 = new Label(6,i,String.valueOf(list.get(j).getOperprize()));
		sheet.addCell(label7);
		
		Label label9 = new Label(7,i,String.valueOf(list.get(j).getOnumber()));
		sheet.addCell(label9);
		
		Label label8 = new Label(8,i,String.valueOf(list.get(j).getOprize()));
		sheet.addCell(label8);
		}
		book.write();
		book.close();
		return true;
	}

	@Override
	public boolean deleteOrders(Integer id) throws Exception {
		// TODO Auto-generated method stub
		if(id!=null){
	   ordersMapper.deleteByPrimaryKey(id);
		return true;
		}else{
		return false;
		}
	}

	@Override
	public boolean excelAsembleOrders(List<Orders> list, String fileName,Date starttime,Date endtime) throws Exception {
		// TODO Auto-generated method stub
	    int numbers = list.size();
		int hours = 0;
		float money =0;
		String department = list.get(0).getOdepartment();
		for(int i =0;i<list.size();i++){
			hours+=list.get(i).getOnumber();
			money +=list.get(i).getOprize();
		}
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		WritableWorkbook book = Workbook.createWorkbook(new File(fileName));
		WritableSheet sheet = book.createSheet("第一页", 0);
		Label labela = new Label(0,0,"科室名称");
		sheet.addCell(labela);
		Label labelb = new Label(1,0,"开始时间");
		sheet.addCell(labelb); 
		Label labelc = new Label(2,0,"结束时间");
		sheet.addCell(labelc);
		Label labeld = new Label(3,0,"租借总时间");
		sheet.addCell(labeld);
		Label labele = new Label(4,0,"租借总次数");
		sheet.addCell(labele);
		Label labelf = new Label(5,0,"租借总金额");
		sheet.addCell(labelf);
	
		Label label = new Label(0,1,department);
		sheet.addCell(label);
		
		Label label2 = new Label(1,1,sf.format(starttime));
		sheet.addCell(label2);	
	
		Label label3= new Label(2,1,sf.format(endtime));
		sheet.addCell(label3);
		
		Label label4 = new Label(3,1,String.valueOf(hours)+"小时");
		sheet.addCell(label4);	
		
		Label label5 = new Label(4,1,String.valueOf(numbers)+"次");
		sheet.addCell(label5);	
		
		Label label6= new Label(5,1,String.valueOf(money)+"元");
		sheet.addCell(label6);
		
		book.write();
		book.close();
		return true;
	}
	
}
