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
		<li><a href="##" id="a_leader_txt">借用设备列表</a></li>
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
					1：查询租借科室
					<select name="select_department" class="input"	onchange="changesearch1()"
						style="width:240px; line-height:17px; display:inline-block">
							<option value="">选择借用科室</option>
							<c:forEach items="${departmentList}"  var="d" >
							<option value="${d}">${d}</option>
							</c:forEach>
							</select>
							<!-- <option value="呼吸科">呼吸科</option>
							<option value="妇产科">妇产科</option>
							<option value="肺功能室">肺功能室</option>
							<option value="肝胆ICU">肝胆ICU</option>
							<option value="感染性疾病科">感染性疾病科</option>
							<option value="呼吸内科RICU">呼吸内科RICU</option>
							<option value="急诊科">急诊科</option>
							<option value="介入手术室">介入手术室</option>
							<option value="临床医学">临床医学</option>
							<option value="麻醉科">麻醉科</option>
							<option value="神经内科">神经内科</option>
							<option value="神经外科ICU">神经外科ICU</option>
							<option value="肾移植科">肾移植科</option>
							<option value="心血管内科ICU">心血管内科ICU</option>
							<option value="新生儿科">新生儿科</option>
							<option value="胸外2科">胸外2科</option>
							<option value="重症医学科">重症医学科</option>
							<option value="肿瘤外科">肿瘤外科</option> -->
							
		
					</li> 
					 <li>
					2：根 据 id 查 询
					<input id="sssss" type="text" placeholder="请输入搜索的id号" name="insert_id"
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
			        <th>科室</th>
					<th>起始时间</th>
					<th>已出库时间</th>
					<th>操作</th>
				</tr>
				<volist name="list" id="vo"> <c:forEach
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
						<td>${item.rdepartment}</td>
					
						<td><fmt:formatDate value="${item.erenttime}"
								pattern="yyyy-MM-dd HH:mm:ss" /></td>
			            <td>${item.espaceforth}小时</td>
					
						<td><div class="button-group">
								<a class="button border-blue"
									href="${pageContext.request.contextPath }/itemsController/itemsBack.action?id=${item.eid}">
									<span class="icon-trash-o"></span> 结账
								</a>
							</div></td>
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