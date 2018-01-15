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

	<%-- <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>easyui/demo/demo.css">
	<script type="text/javascript" src="<%=request.getContextPath() %>/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/easyui/locale/easyui-lang-zh_CN.js"></script> --%>

<script type="text/javascript">
 function changesearch(){
	        document.usersForm.action="${pageContext.request.contextPath }/itemsController/queryItemById.action?id=1";
	    	document.usersForm.method="post";
	    	document.usersForm.submit(); 
	    }
	    
function changesearch2(){
	    document.usersForm.action="${pageContext.request.contextPath }/itemsController/findItemsStausItmes.action";
	  	document.usersForm.method="post";
	  	document.usersForm.submit(); 
	/* alert("ok!"); */
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
				target="right"><span class="icon-caret-right"></span>维修设备列表</a>
			</li>
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
		<li><a target="right" class="icon-home">
				首页</a></li>
		<li><a href="##" id="a_leader_txt">设备管理列表</a></li>
	</ul>

	<div class="admin"> 
		
		<form name="usersForm" method="post">
			<div class="panel-head">
				<strong class="icon-reorder"> 查询栏</strong> <a href=""
					style="float:right; display:none;">添加字段</a>
			</div>
			<div class="padding border-bottom">
				<ul class="search" style="padding-left:10px;">
					<li>
					1：分类查询设备
					<select name="select_item" class="input" onchange="changesearch2()" style="width:240px; line-height:17px;display:inline-block">
							<option value="">选择机器类型</option>
							<c:forEach items="${typeList}"  var="d" >
							<option value="${d}">${d}</option>
							</c:forEach>
							<!-- <option value="有创呼吸机">有创呼吸机</option>
							<option value="无创呼吸机">无创呼吸机</option>
							<option value="小动物呼吸机">小动物呼吸机</option>
			        		<option value="转运呼吸机">转运呼吸机</option> -->
					</select>
					</li>
					&nbsp;&nbsp; 
				   <li>
					2：根 据 id 查 询
					<input id="sssss"type="text" placeholder="请输入搜索的id号" name="insert_id"
						class="input"   style="width:250px; line-height:17px;display:inline-block" />
		            <button class="button border-main icon-search"  onclick="changesearch()"> 搜索</button>
						</li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th>编号</th>
					<th>类型</th>
					<th>型号</th>
					<th>厂家</th>
					<th>系列号</th>
					<th>购入时间</th>
				    <th>上次维修</th>
				    <th>状态</th>
					<th>单价</th>
					<th>操作</th>
				</tr>
				<volist name="list" id="vo">
				<c:if test="${ itemx.eid!=null}">
						<tr>
						<td>${itemx.eid}</td>
						<td>${itemx.ename}</td>
						<td>${itemx.etype}</td>
						<td>${itemx.efactory}</td>
						<td>${itemx.eseries}</td>
<%-- 						<td> <input class="easyui-datetimebox"     value="${itemx.ebuytime}" name="ebuytime"  style="width:200px">  </td>
 --%>						 <td><fmt:formatDate value="${itemx.ebuytime}" pattern="yyyy-MM-dd HH:mm:ss" /></td> 
<%-- 						<td> <input class="easyui-datetimebox"     value="${itemx.emaintaintime}" name="ebuytime"  style="width:200px">  </td>
 --%>						
						<td><fmt:formatDate value="${itemx.emaintaintime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
 					<td>${itemx.status}</td>
						<td> ${itemx.eprice} </td>			
				<c:if  test="${ itemx.status=='入库好'}">
				<td><div class="button-group">
								<a class="button border-blue"
									href="${pageContext.request.contextPath }/itemsController/updateItemsState.action?id=${item.eid}">
									<span class="icon-trash-o"></span> 借用
								</a>
							</div>
			    </td>
				</c:if>
				<c:if  test="${ itemx.status=='入库坏'}">
				<td><div class="button-group">
								 <a class="button border-blue"
									href="${pageContext.request.contextPath }/itemsController/itemsGood.action?id=${item.eid}">
									<span class="icon-trash-o"></span> 更改状态
								 </a>
							</div>
				</td>
				</c:if>
				<c:if  test="${ itemx.status=='借用'}">
				<td><div class="button-group">
								<a class="button border-blue"
									href="${pageContext.request.contextPath }/itemsController/itemsBack.action?id=${item.eid}">
									<span class="icon-trash-o"></span> 结账
								</a>
							</div>
				</td>
				</c:if>
					<c:if  test="${ itemx.status=='备用'}">
				<td><div class="button-group">
								 <a class="button border-blue"
									href="${pageContext.request.contextPath }/itemsController/itemsUse.action?id=${item.eid}">
									<span class="icon-trash-o"></span> 更改状态
								 </a>
							     </div>
				</td>
				</c:if>
					</tr>
				</c:if>
			  
			    <c:if test= "${itemAllList!=null }">
				<c:forEach
					items="${itemAllList}" var="item">
					<tr>
						<td>${item.eid}</td>
						<td>${item.ename}</td>
						<td>${item.etype}</td>
						<td>${item.efactory}</td>
						<td>${item.eseries}</td>
						<td><fmt:formatDate value="${item.ebuytime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td><fmt:formatDate value="${item.emaintaintime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td>${item.status}</td>
						<td> ${item.eprice} </td>
						<td><div class="button-group">
								<a class="button border-blue"
									href="${pageContext.request.contextPath }/itemsController/updateItemsState.action?id=${item.eid}">
									<span class="icon-trash-o"></span> 借用
								</a>
							</div></td>
					</tr>
				</c:forEach> 
				</c:if>
			</table>
			</volist>
		</form>
	</div>
</body>
<script type="text/javascript">
document.getElementById("sssss").focus();
</script>
</html>