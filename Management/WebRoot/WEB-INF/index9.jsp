<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>后台管理中心</title>  
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/pintuer.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/admin.css">
<script src="<%=request.getContextPath() %>/js/jquery.js"></script>
<script src="<%=request.getContextPath() %>/js/pintuer.js"></script>
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img class="radius-circle rotate-hover" height="50" alt="" />后台管理中心</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green"  target="_blank"><span class="icon-home"></span>  ${sessionScope.username}</a> 
  &nbsp;&nbsp;
  <a class="button button-little bg-red" href="${pageContext.request.contextPath }/logout.action"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
  <h2><span class="icon-user"></span>设备管理</h2>
	<ul style="display:block">	
			<li><a href="${pageContext.request.contextPath }/itemsController/SelectUpdater.action"
				target="right"><span class="icon-caret-right"></span>修改设备属性</a>
			</li>
			<li><a
				href="${pageContext.request.contextPath }/itemsController/insertItems.action"
				target="right"><span class="icon-caret-right"></span>增加设备</a>
			</li>
			<li><a
				href="${pageContext.request.contextPath }/renterController/queryOrders2.action"
				target="right"><span class="icon-caret-right"></span>历史订单清理</a>
			</li>
				<li><a
				href="${pageContext.request.contextPath }/toAddDepartment.action"
				target="right"><span class="icon-caret-right"></span>增加科室</a>
			</li>
			</li>
				<li><a
				href="${pageContext.request.contextPath }/itemsController/findAllDepartment.action"
				target="right"><span class="icon-caret-right"></span>删除科室</a>
			</li>
		</ul>
  <h2><span class="icon-pencil-square-o"></span>账号管理</h2>
  <ul>
   <!--  <li><a href="list.jsp" target="right"><span class="icon-caret-right"></span>设备信息</a></li> -->
    <li><a href="${pageContext.request.contextPath }/skipInsert.action" target="right"><span class="icon-caret-right"></span>添加账号</a></li>
    <li><a href="${pageContext.request.contextPath }/findUserList.action" target="right"><span class="icon-caret-right"></span>查看账号</a></li>       
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
  <li><a target="right" class="icon-home"> 首页</a></li>
  <li><a href="##" id="a_leader_txt">科室删除</a></li>
</ul>
<div class="admin">
		
			<div class="padding border-bottom">
				<ul class="search" style="padding-left:10px;">
				</ul>
			</div>
			<table class="table table-hover text-center">
			<tr>
				<th>科室名称</th>
				<th>操作</th>
			</tr>
			<form name="usersForm" method="post">
				<volist name="list" id="vo"> 
	        <c:forEach items="${list}" var="d">
            <tr>
            <td>${d}</td>
           <td><div class="button-group"> 
<!-- <a class="button border-main" href=""><span class="icon-edit"></span> 修改</a>  -->
<a href="${pageContext.request.contextPath }/itemsController/deleteDepartment.action?id=${d}" class="button border-red" ><span class="icon-trash-o"></span> 删除</a>  
</div>
</td>
</tr>
</c:forEach> 
				</volist>
			</table>
		</form>
</div>
</body>
<script type="text/javascript">
 function changesearch(){
	    	document.uForm.action="${pageContext.request.contextPath }/itemsController/findUpdateItems.action";
	    	document.uForm.method="post";
	    	document.uForm.submit();
	    }
 
 function changesearch1(){
 	document.usersForm.action="${pageContext.request.contextPath }/itemsController/updateItemsAdmin.action";
 	document.usersForm.method="post";
 	document.usersForm.submit();
 }
 
 function del(){
		if(confirm("您确定要删除吗?")){	
		 	document.deletexx.href="";
	
		}
	}
</script>
</html>