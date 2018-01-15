package com.arena.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.arena.mapper.DepartmentsMapper;
import com.arena.mapper.ItemsMapper;
import com.arena.mapper.MaintainMapper;
import com.arena.mapper.OrdersMapper;
import com.arena.pojo.Departments;
import com.arena.pojo.DepartmentsExample;
import com.arena.pojo.Items;
import com.arena.pojo.ItemsExample;
import com.arena.pojo.Maintain;
import com.arena.pojo.MaintainExample;
import com.arena.pojo.Orders;
import com.arena.service.ItemsService;

public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsMapper itemsMapper;
	@Autowired
    private OrdersMapper ordersMapper;  
	@Autowired
	private DepartmentsMapper departmentsMapper;
	@Autowired
	private MaintainMapper maintainMapper;
	
	SimpleDateFormat myFmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public List<Items> findItemsByIdArray (int[] items_id){
		List<Items> list = new ArrayList<Items>();
	/*	for(int i:items_id){
		Items item = itemsMapper.selectByPrimaryKey(i);
		list.add(item);
		}*/
		return list;
	}
	
	
	public boolean updateItemsInList(List<Items> list){
	    Date date1 =new Date();
		Orders orders = new Orders();
	    orders.setOname(list.get(0).getEname());
	    orders.setOdepartment(list.get(0).getRdepartment());
		orders.setObacktime( date1);
	    orders.setOrenttime(list.get(0).getErenttime());
		orders.setOnumber(list.size());
		String d1 = myFmt.format(date1);
	    String d2 =myFmt.format(list.get(0).getErenttime());
	    orders.setOprize((float)getdate(d1, d2)*20);
		ordersMapper.insertSelective(orders);
	
		for(Items i:list){
		Items item = new Items();
		item.setEid(i.getEid());
		item.setStatus("未借出");
		item.setRname("无");
		item.setRdepartment("无");
		item.setEbacktime(date1);
		itemsMapper.updateByPrimaryKeySelective(item);
		}
		return true;
	}
	
	public  long getdate2(String d1, String d2) {
		  long i = 1;
		   try {
		    SimpleDateFormat formatter = new SimpleDateFormat(
		      "yyyy-MM-dd HH:mm:ss");
		    Date dt1 = formatter.parse(d1);
		    Date dt2 = formatter.parse(d2);
		    long l = dt1.getTime() - dt2.getTime();
		   // i = l / (1000 * 60 * 60 * 24)+1;
		    i = l / (1000 * 60 * 60)+1;
		    System.out.println("Hello World!=" + i);
		   } catch (Exception e){
			   System.out.println(e);
		   }
		return i;
	}
	
	
	
	

		public static long getdate(String d1, String d2) {
		  long i = 1;
		   try {
		    SimpleDateFormat formatter = new SimpleDateFormat(
		      "yyyy-MM-dd HH:mm:ss");
		    Date dt1 = formatter.parse(d1);
		    Date dt2 = formatter.parse(d2);
		    long l = dt1.getTime() - dt2.getTime();
		   // i = l / (1000 * 60 * 60 * 24)+1;
		    i = l / (1000 * 60 * 60)+1;
		   // System.out.println("Hello World!=" + i);
		   } catch (Exception e){
			  // System.out.println(e);
		   }
		return i;
	}
	
	public List<Items> findItemsRentList(String rname,String rdepartment) {
		ItemsExample itemsExample = new ItemsExample();
		ItemsExample.Criteria criteria = itemsExample.createCriteria();
		criteria.andRnameEqualTo(rname);
		criteria.andRdepartmentEqualTo(rdepartment);
		List<Items> itemsRentList = itemsMapper.selectByExample(itemsExample);
		return itemsRentList;
	}


	@Override
	public float rentPay(Date date1,Date date2) throws Exception {
		// TODO Auto-generated method stub
		
		return 0;
	}


	@Override
	public List<Items> findItemsListByEname(String ename) throws Exception {
		// TODO Auto-generated method stub
		ItemsExample example = new ItemsExample();
		ItemsExample.Criteria criteria = example.createCriteria();
		criteria.andEnameEqualTo(ename);
		List<Items> itemsList = itemsMapper.selectByExample(example);
		return itemsList;
	}


	@Override
	public List<Items> findAllItems() throws Exception {
		// TODO Auto-generated method stub
		ItemsExample example = new ItemsExample();
	    List<Items> itemsAllList = itemsMapper.selectByExample(example);
		return itemsAllList;
	}


	@Override
	public List<Items> findDepartmentItems(String department) throws Exception {
		// TODO Auto-generated method stub
		ItemsExample example = new ItemsExample();
		ItemsExample.Criteria criteria = example.createCriteria();
		criteria.andRdepartmentEqualTo(department);
		criteria.andStatusEqualTo("借用");
		List<Items> list =itemsMapper.selectByExample(example);
		return list;
	}


	@Override
	public List<Items> findItemsStausItmes(Items item) throws Exception {
		// TODO Auto-generated method stub
		ItemsExample example = new ItemsExample();
		ItemsExample.Criteria criteria = example.createCriteria();
		String iname = item.getEname();
		criteria.andEnameEqualTo(iname);
		criteria.andStatusEqualTo("入库好");
		List<Items> list = itemsMapper.selectByExample(example);
		return list;
	}
	
	@Override
	public List<Items> findItemsStausItmes2(Items item) throws Exception {
		// TODO Auto-generated method stub
		ItemsExample example = new ItemsExample();
		ItemsExample.Criteria criteria = example.createCriteria();
		String iname = item.getEname();
		criteria.andEnameEqualTo(iname);
		criteria.andStatusEqualTo("备用");
		List<Items> list = itemsMapper.selectByExample(example);
		return list;
	}

	@Override
	public Items findItemsById(String id) throws Exception {
		// TODO Auto-generated method stub
		Items item = itemsMapper.selectByPrimaryKey(id);
		//System.out.println(item.getEid());
		return item;
	}


	@Override
	public List<Items> findItemsListByStatus(String status) throws Exception {
		// TODO Auto-generated method stub
		ItemsExample example = new ItemsExample();
		ItemsExample.Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(status);
		List<Items> list =itemsMapper.selectByExample(example);
		 SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String datex =f.format(new Date());
		 String datey = null;
		for(Items i:list){
			if(i.getErenttime()!=null){
				 datey =f.format(i.getErenttime());
			}else{
				 datey =datex;
			}
		  	i.setEspaceforth((int)getdate(datex,datey));
		}
		return list;
	}


	@Override
	public List<Items> findItemsStausItmes3(Items item) throws Exception {
		// TODO Auto-generated method stub
		ItemsExample example = new ItemsExample();
		ItemsExample.Criteria criteria = example.createCriteria();
		String iname = item.getEname();
		criteria.andEnameEqualTo(iname);
		criteria.andStatusEqualTo("入库坏");
		List<Items> list = itemsMapper.selectByExample(example);
		return list;
	}

	@Override
	public void updateItemsStatus(Items item) throws Exception {
		// TODO Auto-generated method stub
		ItemsExample example = new ItemsExample();
		ItemsExample.Criteria criteria = example.createCriteria();
		criteria.andEidEqualTo(item.getEid());
		itemsMapper.updateByExampleSelective(item, example);
	}


	@Override
	public boolean updateItem(Items item) throws Exception {
		// TODO Auto-generated method stub
		    Orders orders = new Orders();
			orders.setOeid(item.getEid());
		    orders.setOname(item.getEname());
		    orders.setOdepartment(item.getRdepartment());
		    orders.setOperprize(item.getEprice());
		    Date date1 =new Date();
			orders.setObacktime( date1);
		    orders.setOrenttime(item.getErenttime());
		    orders.setOorderstime(new Date());
		    //计算借与还的时间差
			String d1 = myFmt.format(date1);
		    String d2 =myFmt.format(item.getErenttime());
		    orders.setOnumber((int)getdate(d1, d2));
		    orders.setOprize((float)getdate(d1, d2)*orders.getOperprize());
		    ordersMapper.insertSelective(orders);
	    
		    Items i = new Items();
			i.setEid(item.getEid());
			i.setStatus(item.getStatus());
			if(item.getStatus().equals("入库好")){
			i.setRdepartment(item.getRdepartment()+"无问题");
			i.setEbacktime(null);
			i.setErenttime(null);
			}else if((item.getStatus().equals("入库坏"))){
			i.setRdepartment(item.getRdepartment()+"有问题");
			i.setEbacktime(date1);
			i.setErenttime(null);
			}
		  	itemsMapper.updateByPrimaryKeySelective(i);
			return true;
	}


	@Override
	public boolean updateItemByAdmin(Items item) throws Exception {
		// TODO Auto-generated method stub
		ItemsExample example = new ItemsExample();
		ItemsExample.Criteria criteria = example.createCriteria();
		criteria.andEidEqualTo(item.getEid());
		itemsMapper.updateByExampleSelective(item, example);
		return true;
	}


	@Override
	public boolean insertItem(Items item) throws Exception {
		// TODO Auto-generated method stub
		itemsMapper.insertSelective(item);
		return true;
	}


	@Override
	public boolean deleteItem(String id) throws Exception {
		// TODO Auto-generated method stub
		itemsMapper.deleteByPrimaryKey(id);
		return true;
	}


	@Override
	public List<String> findAlltypes() throws Exception {
		// TODO Auto-generated method stub
		List<String> list =itemsMapper.selectAllType();
		return list;
	}

	@Override
	public boolean insertDepartments(Departments department) throws Exception {
		// TODO Auto-generated method stub
		departmentsMapper.insert(department);
		return true;
	}
	
	@Override
	public List<String> findDepartments() throws Exception {
		// TODO Auto-generated method stub
		List<String> list =departmentsMapper.findDepartments();
		return list;
	}


	@Override
	public boolean deleteDepartment(	String dname) throws Exception {
		// TODO Auto-generated method stub
		DepartmentsExample example =new DepartmentsExample();
		DepartmentsExample.Criteria criteria = example.createCriteria();
		criteria.andDnameEqualTo(dname);
		departmentsMapper.deleteByExample(example);
		return true;
	}


	@Override
	public List<Maintain> findMaintainList() throws Exception {
		// TODO Auto-generated method stub
		MaintainExample example = new MaintainExample();
	    List<Maintain>	list = maintainMapper.selectByExample(example);
		return list;
	}


	@Override
	public boolean insertMaintain(Maintain maintain) throws Exception {
		// TODO Auto-generated method stub
		if(maintain!=null){
			maintainMapper.insert(maintain);
			return true;
		}
		return false;
	}


	@Override
	public boolean deleteMaintain(Integer id) throws Exception {
		// TODO Auto-generated method stub
		if(id!=null){
				maintainMapper.deleteByPrimaryKey(id);
			    return true;
		}
		return false;
	}
	
	

/*	public ItemsCustom findItemsById(int id) throws Exception {
		// TODO 自动生成的方法存根
		Items items = itemsMapper.selectByPrimaryKey(id);
		//最终返回的是拓展类
		ItemsCustom itemsCustom = new ItemsCustom();
		BeanUtils.copyProperties(items,itemsCustom );
		return itemsCustom;
	}*/
	
/*	public void updateItems(int id, Items itemsCustom) throws Exception {
		// TODO 自动生成的方法存根
		//添加一些业务的校验，如果为空，就抛出异常
		//使用它可以更新所有字段，包括大文本类型,要求必须传入id
		itemsCustom.setId(id);
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
		
	}*/
	
	
}
