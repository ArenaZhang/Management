package com.arena.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.arena.pojo.Departments;
import com.arena.pojo.Items;
import com.arena.pojo.Maintain;
import com.arena.service.ItemsService;

@Controller
@RequestMapping("/itemsController")
public class ItemsController{
@Autowired
private ItemsService itemsService;
@RequestMapping(value ="/queryItems",consumes = "application/json")
public @ResponseBody List<Items> queryItems(@RequestBody Items item) throws Exception
{
	//public @ResponseBody List<Items> queryItems(String ename) throws Exception{
		List<Items>itemsList1 = itemsService.findItemsListByEname(item.getEname());
		return itemsList1;
	}	
	
	@RequestMapping("/queryRentItemsByRenter")
	public ModelAndView queryRentItemsByRenter(HttpServletRequest request) throws Exception{
		String rname1 =new String(request.getParameter("id").getBytes("iso-8859-1"),"utf-8");
		String rdepartment1 =new String(request.getParameter("id2").getBytes("iso-8859-1"),"utf-8");
		ModelAndView mv = new ModelAndView();
		List<Items> itemsRentList =itemsService.findItemsRentList(rname1,rdepartment1);
		mv.addObject("itemsRentList", itemsRentList);
		mv.setViewName("renterItemsList");
		return mv;
	}	
	
	
	//@RequestMapping("/updateRentItemsBefore")
	//商品修改页面显示
/*	public String updateRentItemsBefore(HttpSession session,int[] rentitems_id) throws Exception{
		//调用service查询商品信息
		System.out.println(rentitems_id);
		List<Items> rentList= itemsService.findItemsByIdArray(rentitems_id);
		session.setAttribute("rentList", rentList);
		return "info";
	}*/
	
	
/*	@RequestMapping("/updateRentItemsAfter")
	public String updateRentItemsAfter(HttpSession session) throws Exception{
		@SuppressWarnings("unchecked")
		List<Items> list=(ArrayList<Items>) session.getAttribute("rentList");
		System.out.println("list"+list);
		itemsService.updateItemsInList(list);
		return "";
	}*/
	
		@RequestMapping("/updateItemsBefore")
		//商品修改页面显示
		public String updateItemsBefore(HttpSession session,int[] items_id) throws Exception{
			//调用service查询商品信息
			List<Items> list= itemsService.findItemsByIdArray(items_id);
			session.setAttribute("list", list);
			return "info";
		}
		@RequestMapping("/updateItemsAfter")
		    public String updateItemsAfter(String updateid,String updatename,String select_department,String select_status) throws Exception{
		/*	@SuppressWarnings("unchecked")
			List<Items> list=(ArrayList<Items>) session.getAttribute("list");
			itemsService.updateItemsInList(price, list);*/
			if((updatename!=""&&select_department!=""&&select_status!="")&&(updatename!=null&&select_department!=null&&select_status!=null))
			{
			Items item =new Items();
			item.setEid(updateid);
			item.setEname(updatename);
			item.setErenttime(new Date());
			item.setRdepartment(select_department);
			item.setStatus(select_status);
			itemsService.updateItemsStatus(item);
			return "success";
			}
			return "fail";
		    }
		
		
		@RequestMapping("/itemsUse")
		public String itemsUse(Model model,String id) throws Exception{
			//调用service查询商品信息
			Items item =itemsService.findItemsById(id);
			model.addAttribute("item", item);
			return "index4_1";
		}
		@RequestMapping("/updateItemsAfter2")
	    public String updateItemsAfter2(String updateid,String updatename,String select_department,String select_status) throws Exception{
		if((updatename!=""&&select_department!=""&&select_status!="")&&(updatename!=null&&select_department!=null&&select_status!=null))
		{
		Items item =new Items();
		item.setEid(updateid);
		item.setEname(updatename);
		if(select_status.equals("入库好")||select_status.equals("入库坏")){
			item.setEbacktime(new Date());
			item.setStatus(select_status);
		}else if(select_status.equals("借用")){
		item.setErenttime(new Date());
		item.setRdepartment(select_department);
		item.setStatus(select_status);
		}
		itemsService.updateItemsStatus(item);
		return "success";
		}
		return "fail";
	    }
	
		@RequestMapping("/itemsGood")
		public String itemsGood(Model model,String id) throws Exception{
			//调用service查询商品信息
			Items item =itemsService.findItemsById(id);
			model.addAttribute("item", item);
			return "index3_1";
		}
		
		@RequestMapping("/updateItemsAfter3")
	    public String updateItemsAfter3(String updateid,String select_status) throws Exception{
		if(select_status!=""&&select_status!=null)
		{
		Items item =new Items();
		item.setEid(updateid);
		item.setStatus(select_status);
		itemsService.updateItemsStatus(item);
		return "success";
		}
		return "fail";
	    }
		
		@RequestMapping("/itemsBack")
		public String itemsBack(Model model,String id) throws Exception{
			//调用service查询商品信息
			Items item =itemsService.findItemsById(id);
			model.addAttribute("item", item);
			return "index2_1";
		}
		
		    @RequestMapping("/updateItemsBack")
		    public String 	updateItemsBack(Model model,String eid,String estatus) throws Exception{
			//调用service查询商品信息
		    	System.out.println(eid);
			if(estatus!=""&&estatus!=null&&eid!=null&&eid!=""){
			Items i =itemsService.findItemsById(eid.trim());
			 i.setStatus(estatus);
			 itemsService.updateItem(i);
			return "success";
			}
			return "fail";
			}
		
			

		@RequestMapping("/findResponItemsList")
		    public String findResponItemsList(Model model) throws Exception{
			//调用service查询商品信息
			List<Items> itemAllList = itemsService.findAllItems();
			List<String> typeList =itemsService.findAlltypes();
			model.addAttribute("typeList", typeList);
			model.addAttribute("itemAllList", itemAllList);
			System.out.println(typeList.get(0)+"123123");
			return "index1";
            }
	       
		@RequestMapping("/selectDepartmentList")
	    public String selectDepartmentList(Model model,String select_department) throws Exception{
		//调用service查询商品信息
		List<Items> itemAllList = itemsService.findDepartmentItems(select_department);
		model.addAttribute("itemAllList", itemAllList);
		List<String> typeList =itemsService.findAlltypes();
		model.addAttribute("typeList", typeList);
		List<String> departmentList = itemsService.findDepartments();
		model.addAttribute("departmentList", departmentList);
		return "index2";
        }
	
		@RequestMapping("/findItemsStausItmes4")
	    public String findItemsStausItmes(Model model,String select_item,String select_state) throws Exception{
		//调用service查询商品信息
			Items item =new Items();
			item.setStatus(select_state);
			item.setEname(select_item);
		List<Items> itemAllList = itemsService.findItemsStausItmes2(item);
		model.addAttribute("itemAllList", itemAllList);
		List<String> typeList =itemsService.findAlltypes();
		model.addAttribute("typeList", typeList);
		return "index4";
        }
		
		@RequestMapping("/findItemsStausItmes")
	    public String findItemsStausItmes2(Model model,String select_item,String select_state) throws Exception{
		//调用service查询商品信息
			Items item =new Items();
			item.setStatus(select_state);
			item.setEname(select_item);
		List<Items> itemAllList = itemsService.findItemsStausItmes(item);
		model.addAttribute("itemAllList", itemAllList);
		List<String> typeList =itemsService.findAlltypes();
		model.addAttribute("typeList", typeList);
		return "index1";
        }
		
		@RequestMapping("/findItemsStausItmes3")
	    public String findItemsStausItmes3(Model model,String select_item,String select_state) throws Exception{
		//调用service查询商品信息
			Items item =new Items();
			item.setStatus(select_state);
			item.setEname(select_item);
		List<Items> itemAllList = itemsService.findItemsStausItmes3(item);
		model.addAttribute("itemAllList", itemAllList);
		List<String> typeList =itemsService.findAlltypes();
		model.addAttribute("typeList", typeList);
		return "index3";
        }
		
		
		
	    @RequestMapping("/updateItemsState")
		public String updateItemsState(Model model,String id) throws Exception{
			//调用service查询商品信息
			Items item = itemsService.findItemsById(id);
			model.addAttribute("item", item);
		    List<String> departmentList = 	itemsService.findDepartments();
		    model.addAttribute("departmentList", departmentList);
			return "index1_1";
	        }
	    
	    @RequestMapping("/updateItemsState3")
	  		public String updateItemsState3(Model model,String id) throws Exception{
	  			//调用service查询商品信息
	  			Items item = itemsService.findItemsById(id);
	  			model.addAttribute("item", item);
	  			return "index1_1";
	  	        }
	    
	    
	    //这里需要补充代码
	    @RequestMapping("/queryItemById")
	       public String queryItemById(Model model,Integer id,String insert_id) throws Exception{
  			//调用service查询商品信息
	    	if(id==1){
  			Items item = itemsService.findItemsById(insert_id);
  			model.addAttribute("itemx", item);
  			return "index7";
  			}
	    	return "index7";
  	        }
	    
	    
	       @RequestMapping("/queryItemsInRes")
	        public String  queryItemsInRes(Model model,int id) throws Exception{
			//调用service查询商品信息
	        if(id==1)
	    	{ String status="入库好";
			List<Items> itemAllList = itemsService.findItemsListByStatus(status);
			model.addAttribute("itemAllList", itemAllList);
			List<String> typeList =itemsService.findAlltypes();
			model.addAttribute("typeList", typeList);
			return "index1";
			}else if(id==2){
		    String status="借用";
			List<Items> itemAllList = itemsService.findItemsListByStatus(status);
			model.addAttribute("itemAllList", itemAllList);
			List<String> typeList =itemsService.findAlltypes();
			model.addAttribute("typeList", typeList);
			List<String> departmentList = itemsService.findDepartments();
			model.addAttribute("departmentList", departmentList);
			return "index2";
			}else if(id==3){
		    String status="备用";
			List<Items> itemAllList = itemsService.findItemsListByStatus(status);
			model.addAttribute("itemAllList", itemAllList);
			List<String> typeList =itemsService.findAlltypes();
			model.addAttribute("typeList", typeList);
			return "index4";
			}else if(id==4){
			String status="入库坏";
			List<Items> itemAllList = itemsService.findItemsListByStatus(status);
			model.addAttribute("itemAllList", itemAllList);
			List<String> typeList =itemsService.findAlltypes();
			model.addAttribute("typeList", typeList);
			return "index3";
			}
			return "index";
	        }
	       
	       @RequestMapping("/insertItems")
	       public String insertItems() throws Exception{
	       return "addItems";
	      }
	       
	       @RequestMapping("/SelectUpdater")
	       public String SelectUpdater() throws Exception{
	       return "index6";
	      }
	       
	       @RequestMapping("/findUpdateItems")
	       public String findUpdateItems(Model model,String insert_key) throws Exception{
	           if(insert_key!=null){
	    	   Items item =  itemsService.findItemsById(insert_key);
	     	 model.addAttribute("itemx", item);
	     	return "index6";
	           }
	        return "index6";
	      }
	       
	       @RequestMapping("/updateItemsAdmin")
	       public String updateItemsAdmin(Items item) throws Exception{
	           if(item.getEid()==null){
	        	   return "index6";
	           }else{
	    	   itemsService.updateItemByAdmin(item);
	     	 return "success1";
	           }
	      }
	       
	       @RequestMapping("/deleteItems")
	       public String deleteItems(HttpServletRequest request,String id) throws Exception{
	           if(id==null){
	        	   return "index6";
	           }
	    	 if(  itemsService.deleteItem(id)){
	     	 return "success1";}
	    	 else{
	    		 return "fail1";
	    	 }
	      }
	       
	       @RequestMapping("/insertaddItems")
	       public String insertItems(Items item) throws Exception{
	    	  if(item.getEid()!=null){
	    	   if(itemsService.insertItem(item)){
	    		   return "success1";
	    	   }else{
	     	 return "fail1";
	    	   }
	    	   }else{
	    		   return "addItems";
	    	   }
	      }
	       
	       @RequestMapping("/addDepartment")
	       public String addDepartment(Departments department) throws Exception{
	           if(department!=null){
	    	   itemsService.insertDepartments(department);
	    	   return "redirect:/itemsController/findAllDepartment.action";
	           }
	     	   return "fail1";
	      }
	       
	       @RequestMapping("/findAllDepartment")
	       public String findAllDepartment(Model model) throws Exception{
	          
	    	  List<String>list = itemsService.findDepartments();
	    	  model.addAttribute("list", list);
	    	   return "index9";  
	      }
	       
	       @RequestMapping("/deleteDepartment")
	       public String deleteDepartment(String id) throws Exception{
	           if(id!=null){
	            String did =new String(id.getBytes("iso-8859-1"),"utf-8");
	    	   itemsService.deleteDepartment(did);
	    	   return "redirect:/itemsController/findAllDepartment.action";
	           }
	     	   return "fail1";
	      }
	       
	       @RequestMapping("/queryBeforeMaintainItems")
	       public String queryBeforeMaintainItems(Model model) throws Exception{
	    	   List<Maintain>list = itemsService.findMaintainList();
	    	   model.addAttribute("maintainlist", list);
	    	   return "index10";  
	      }
	       @RequestMapping("/queryMaintainItemsInRes")
	       public String queryMaintainItemsInRes(Model model,String insert_id) throws Exception{
	    	  List<Maintain>list = itemsService.findMaintainList();
	    	 // model.addAttribute("maintainlist", list);
	    	   return "index10";  
	      }
	       /*@RequestMapping("/maintainItemUpdate")
	       public String maintainItemUpdate(Model model,Maintain maintain) throws Exception{
	    	  if( itemsService.updateMaintain(maintain)==true){
	    		  return "redirect:/itemsController/queryMaintainItemsInRes.action";  
	    	  }
	    	  // model.addAttribute("maintainlist", list);
	    	   return "fail";  
	      }*/
	       
	       @RequestMapping("/addMaintainItemBefore")
	       public String addMaintainItemBefore() throws Exception{
	    	return "addMaintainDetail";
	      }
	       
	       
	       @RequestMapping("/deleteMaintainItem")
	       public String deleteMaintainItem(Model model,Integer id) throws Exception{
	    	if(itemsService.deleteMaintain(id)==true)
	        return "success";  
	    	return "fail";
	      }
	       
	       
	       @RequestMapping("/addMaintainItem")
	       public String addMaintainItem(Model model,Maintain maintain) throws Exception{
	    	   if(maintain!=null){   
	           if(itemsService.insertMaintain(maintain)==true){
	    	   return "success";  
	    	   }
	           }
	    	   return "fail";
	      }
	       
}
