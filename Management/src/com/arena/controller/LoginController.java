package com.arena.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.arena.pojo.Admin;
import com.arena.pojo.AdminQuery;
import com.arena.service.AdminService;

@Controller
public class LoginController {
	@Autowired
	private AdminService adminService;

     @RequestMapping("/login")
	public String login(HttpSession session,HttpServletRequest request,String username,String password) throws Exception
	{    //调用session保存用户身份信息
    	 session.setAttribute("username", username);
		//调用service进行身份验证
		Admin admin = new Admin();
		admin.setApwd(password);
	    admin.setAid(username);
		if(adminService.login(admin)==1){
			return "redirect:/itemsController/SelectUpdater.action";
		}else if(adminService.login(admin)==2){
			return "redirect:/itemsController/queryItemsInRes.action?id=1";
		}else{
			session.invalidate();
		    return "redirect:/login.jsp";
		}
	}
     //跳转
     @RequestMapping("/skipInsert")
     public String skipInsert(){
    	 return "addUsers";
     }
     
     //管理员添加账号
     @RequestMapping("/addAccount")
     public String addAccount(String aname,String apwd,String aid) throws Exception{
    	if(aname!=null&&aname!=""&&apwd!=null&&apwd!=""&&aid!=null&&aid!=""){
    	 Admin admin =new Admin();
    	 admin.setAid(aid);
    	 admin.setAname(aname);
    	 admin.setApwd(apwd);
    	 admin.setMark(2);
    	 admin.setAsex("管理员");
    	 if(admin.getAid()!=null&&admin.getApwd()!=null)
    	 adminService.insertAdmin(admin);
    	 return "redirect:findUserList.action";
    	 }else{
    		 return "addUsers";
    	 }
     }
     
     @RequestMapping("/findUserList")
      public String findUserList(Model model) throws Exception{
    	 List<Admin> adminList = adminService.selectAdminList();
    	 model.addAttribute("adminList", adminList);
    	 return "index";
     }
     
     @RequestMapping("/updateUserList")
     public String updateUserList( AdminQuery adminQuery) throws Exception{
   	 adminService.updateAdminInfo(adminQuery.getAdminList());
   	 return "redirect:findUserList.action";
    }
    @RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{	
		session.invalidate();
		return "redirect:/login.jsp";	
	}
    @RequestMapping("/deleteAdmin")
    public String deleteAdmin(HttpServletRequest request,String id) throws Exception{
    	adminService.deleteAdmin(id);
  	 return "redirect:findUserList.action";
   }
    @RequestMapping("/intoUpdate")
    public String intoUpdate() throws Exception{
  
  	 return "redirect:/itemsController/SelectUpdater.action";
   }
 
    @RequestMapping("/ toAddDepartment")
    public String  toAddDepartment() throws Exception{
  
  	 return "addDepartments";
   }
    
    @RequestMapping("/toDeleteDepartment")
    public String  toDeleteDepartment() throws Exception{
  
  	 return "redirect:/itemsController/findDepartmentList.action";
   }
    
    
    
}
