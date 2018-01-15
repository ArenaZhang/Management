<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理中心</title>
<link rel="stylesheet"
	href="<%=request.getContextPath() %>/css/pintuer.css">
<link rel="stylesheet"
	href="<%=request.getContextPath() %>/css/admin.css">
<script src="<%=request.getContextPath() %>/js/jquery.js"></script>
<script src="<%=request.getContextPath() %>/js/pintuer.js"></script>
<script type="text/javascript">
function changesearch1(){
 	/* var i=document.getElementsByname("select_department").value;  
    var select=document.getElementsByName("select_department");  
    var arr=select.getElementsByTagName("option");   
    arr[i].selected=true;  
	var i = select.selectedIndex;
	        arr[i].selected=true;  */
	        document.usersForm.action="${pageContext.request.contextPath }/itemsController/selectDepartmentList.action";
	    	document.usersForm.method="post";
	    	document.usersForm.submit();
	    }
	    
function changesearch3(){
    /* document.usersForm.action="${pageContext.request.contextPath }/itemsController/findItemsStausItmes3.action";
  	document.usersForm.method="post";
  	document.usersForm.submit();  */
}

function changesearch2(){
    document.usersForm.action="${pageContext.request.contextPath }/itemsController/findItemsStausItmes3.action";
  	document.usersForm.method="post";
  	document.usersForm.submit(); 
}
function changesearch(){
    document.usersForm.action="${pageContext.request.contextPath }/itemsController/queryItemById.action?id=1";
	document.usersForm.method="post";
	document.usersForm.submit(); 
}
</script>
</head>
<body style="background-color:#f2f9fd;">
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1>
				<img class="radius-circle rotate-hover" height="50" alt="" />后台管理中心
			</h1>
		</div>
		<div class="head-l"><a class="button button-little bg-green"  target="_blank"><span class="icon-home"></span>  ${sessionScope.username}</a> 
  &nbsp;&nbsp;
  <a class="button button-little bg-red" href="${pageContext.request.contextPath }/logout.action"><span class="icon-power-off"></span> 退出登录</a>
   </div>
	</div>
	<div class="leftnav">
		<div class="leftnav-title">
			<strong><span class="icon-list"></span>菜单列表</strong>
		</div>
		<h2>
			<span class="icon-user"></span>设备管理
		</h2>
		<ul style="display:block">
			<li><a 
			    href="${pageContext.request.contextPath }/itemsController/queryItemsInRes.action?id=1"
				target="right"><span class="icon-caret-right"></span>设备管理列表</a></li>
			<li><a
				href="${pageContext.request.contextPath }/itemsController/queryItemsInRes.action?id=2"
				target="right"><span class="icon-caret-right"></span>借用设备列表</a></li>
			<li><a
				href="${pageContext.request.contextPath }/itemsController/queryItemsInRes.action?id=3"
				target="right"><span class="icon-caret-right"></span>备用设备列表</a></li>
		    <li><a
				href="${pageContext.request.contextPath }/itemsController/queryItemsInRes.action?id=4"
				target="right"><span class="icon-caret-right"></span>维修设备列表</a></li>
          	<li><a
				href="${pageContext.request.contextPath }/itemsController/queryBeforeMaintainItems.action"
				target="right"><span class="icon-caret-right"></span>维修记录表</a>
			</li>
				
		<h2>
			<span class="icon-pencil-square-o"></span>账单管理
		</h2>
		<ul>
			<!--  <li><a href="list.jsp" target="right"><span class="icon-caret-right"></span>设备信息</a></li> -->
			<li><a href="${pageContext.request.contextPath }/renterController/queryOrders.action" target="right"><span class="icon-caret-right"></span>查询账单</a></li>
		</ul>
	</div>
	<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
	<ul class="bread">
		<li><a target="right" class="icon-home">
				首页</a></li>
		<li><a href="##" id="a_leader_txt">维修设备记录</a></li>
	</ul>

	<div class="admin">
    <form name="maintainform" method="post" class="form-x" action="${pageContext.request.contextPath }/itemsController/addMaintainItem.action">  
      <div class="form-group">
        <div class="label">
          <label>设备编号</label>
        </div>
        <div class="field">
        <input type="text" class="input" name="weid" value="" />
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>设备名称</label>
        </div>
        <div class="field">
        <input type="text" class="input" name="wname" value="" />
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>维修时间</label>
        </div>
        <div class="field">
    <input type="text" class="input" name="wmaintaintime" value="yyyy-MM-dd HH:mm:ss"/>
     </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>维修原因</label>
        </div>
        <div class="field">
       <input type="text" class="input" name="wreason" value=""/> 
      
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>维修零件</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="wcomponent" />
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>维修结果</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="wresult" />
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
    
      </div>
    </form>
  </div>
</div>
</div>

</body>
</html>