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

<%-- 	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>easyui/demo/demo.css">
	<script type="text/javascript" src="<%=request.getContextPath() %>/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/easyui/jquery.easyui.min.js"></script> --%>




<script type="text/javascript">
function update(){
	          document.usersForm.action="${pageContext.request.contextPath }/renterController/queryOrdersBetween.action";
	    	  document.usersForm.method="post";
	    	  document.usersForm.submit();
	         }
	    
function changesearch(){
	   document.usersForm.action="${pageContext.request.contextPath }/renterController/outToExcel.action";
	  document.usersForm.method="post";
	  document.usersForm.submit();
	
}

function changesearch2(){
	   document.usersForm.action="${pageContext.request.contextPath }/renterController/outToAssembleExcel.action";
	  document.usersForm.method="post";
	  document.usersForm.submit();
	
}
function changesearch1(){
	   document.usersForm.action="${pageContext.request.contextPath }/renterController/queryOrdersByEid.action";
	  document.usersForm.method="post";
	  document.usersForm.submit();
	
}
</script>
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
		</ul>
		
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
  <li><a target="right" class="icon-home"> 首页</a></li>
  <li><a href="##" id="a_leader_txt">账单列表</a></li>
</ul>


<div class="admin">
  <form  name="usersForm" method="post" >
  <div class="panel-head">
				<strong class="icon-reorder"> 查询栏<font color="#FF0000"> （查询前请确定日期格式是否按格式填写）</font></strong> 
			</div>
			<div class="padding border-bottom">
				<ul class="search" style="padding-left:10px;">
					<li>
					起始
					<input id="start_time" type="text" name="starttime"  value="<fmt:formatDate value="${orderList[orderList.size()-1].obacktime}"  pattern="yyyy-MM-dd HH:mm:ss"/>"/>
					</li>
					<li>
					终止
					<input id="end_time" type="text" name="endtime"  value="<fmt:formatDate value="${orderList[0].obacktime}" pattern="yyyy-MM-dd HH:mm:ss"/>" />
					</li>
				   <li>
				   <select name="select_department" class="input border-main" 	style="width:100px; line-height:17px; display:inline-block">
							<option value="">借用科室</option>
							<c:forEach items="${departmentList}"  var="d" >
							<option value="${d}">${d}</option>
							</c:forEach>
				 </select>
				   </li>
				      <li>
					<input id="sssss" type="text" placeholder="请输入搜索的id号" name="insert_id"
						class="input"   style="width:250px; line-height:17px;display:inline-block" />
<!-- 		            <button class="button border-green icon-search"  onclick="changesearch1()"> 搜索</button>
 -->				</li>
				 
				 
				   <li>
				   <div class="field">
                   <button id="submit_button"class="button border-main icon-search"  onclick="update()"> 搜索</button>
                   </div>
                   </li>
        
   <!--      
        <li>
			<input class="easyui-filebox" name="fileName" data-options="prompt:'Choose a file...'" style="width:100%">
            <button class="button border-main icon-search"  onclick="changesearch()"> 导出excel</button>
          </li>    -->   
             
              
				</ul>
			</div>
			   <div class="panel-head">
				<strong class="icon-reorder">导出栏<font color="#FF0000"> （导出前请确定   1:已有文件夹    2:已点击搜索   3:文件同名会覆盖已有文件）</font></strong> 
			</div>
			<div class="padding border-bottom">
                 <li>
					<input type="text" value="D:/excel/文件名.xls" name="fileName" class="input"   style="width:250px; line-height:17px;display:inline-block" /> 
		            <button class="button border-red icon-search"  onclick="changesearch()"> 导出明细</button>
				   
				   <input type="text" value="D:/excel/科室表.xls" name="fileName2" class="input"   style="width:250px; line-height:17px;display:inline-block" /> 
		            <button class="button border-red icon-search"  onclick="changesearch2()">导出总额</button>
				   </li>
				   
			
				   </div>
  <table class="table table-hover text-center">
      <tr>
          <th>账单号码</th>
          <th>设备名称</th>
          <th>设备编号</th>
          <th>租借科室</th>
          <th>借出时间</th>
          <th>结账时间</th>
          <th>单       价</th>
          <th>小  时  数</th>
          <th>应付金额</th>
      </tr>
      <volist name="list" id="vo">
    <c:forEach items="${orderList}" var="order">
      <tr>
          <td>${order.oid}</td>
        <%--   <td><fmt:formatDate value="${order.oorderstime}"  pattern="yyyy-MM-dd HH:mm:ss" /></td> --%>
         
          <td>${order.oname}</td>
          <td>${order.oeid}</td>
          <td>${order.odepartment}</td>
          <td><fmt:formatDate value="${order.orenttime}"  pattern="yyyy-MM-dd HH:mm:ss" /></td>
          <td><fmt:formatDate value="${order.obacktime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
         <td>${order.operprize}</td>
         <td>${order.onumber}</td>
          <td>${order.oprize}</td> 
          <!-- <td><div class="button-group"> 
<a class="button border-main" href=""><span class="icon-edit"></span> 修改</a> -->
<!-- <a class="button border-red" href="javascript:void(0)" onclick="return del(1,1,1)">
<span class="icon-trash-o"></span> 删除</a>  -->
<!-- </div>
</td> -->
</tr>
</c:forEach> 
</form>
</div>
</body>

<script type="text/javascript">
document.getElementById("sssss").focus();
</script>
</html>