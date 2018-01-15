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
	    
function changesearch4(){
    document.usersForm.action="${pageContext.request.contextPath }/itemsController/findItemsStausItmes3.action";
  	document.usersForm.method="post";
  	document.usersForm.submit();  
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
		<form name="usersForm" method="post">
		<div class="panel-head">
		<a class="button border-main icon-plus-square-o" href="${pageContext.request.contextPath }/itemsController/addMaintainItemBefore.action"> 添加记录</a>
		</div>		
			<table class="table table-hover text-center">
				<tr>
					<th>设备编号</th>
					<th>设备名称</th>
					<th>维修时间</th>
					<th>维修原因</th>
					<th>维修零件</th>
					<th>维修结果</th>
					<th>操       作</th>
				</tr>
				<volist name="list" id="vo"> <c:forEach
					items="${maintainlist}" var="item">
					<tr>
					    <td ><input   name="weid" value="${item.weid}" readonly="readonly"></td>
						<td><input  name="wname" value="${item.wname}" readonly="readonly">
						</td>
						<td><fmt:formatDate value="${item.wmaintaintime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						
						<td>
						<div class="field" >	
					  	<textarea    type="text" class="input" name="wname"  height="120px" readonly="readonly">${item.wcomponent}</textarea>		
						</div>
						</td>
						<td>
						<textarea type="text" class="input" name="wreason"  height="120px" readonly="readonly">${item.wreason}</textarea>	
						</td>
						<td>
						<textarea type="text" class="input" name="wresult"   height="120px"   readonly="readonly">${item.wresult}</textarea>			
						</td>
						<td>
						<div class="button-group">				
                      <%--   <a class="button border-main" href="${pageContext.request.contextPath }/itemsController/maintainItemUpdate.action?id=${item.weid}"><span class="icon-edit"></span> 修改</a> --%>
                  <a class="button border-red" href="${pageContext.request.contextPath }/itemsController/deleteMaintainItem.action?id=${item.wid}" ><span class="icon-trash-o"></span> 删除</a> 
							</div>
							</td>
					</tr>
				</c:forEach> </volist>
			</table>
		</form>
	</div>
</body>
<script type="text/javascript">
document.getElementById("sssss").focus();
</script>
</html>