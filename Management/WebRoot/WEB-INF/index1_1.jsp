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
function update(){
	 document.userForm.action="${pageContext.request.contextPath }/itemsController/updateItemsAfter.action";
	 document.userForm.method="post";
	 document.userForm.submit();
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
         <a class="button button-little bg-red" href="${pageContext.request.contextPath }/logout.action"><span class="icon-power-off"></span> 退出登录</a> </div>
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
		<li><a href="##" id="a_leader_txt">设备出库操作</a></li>
	</ul>

	<div class="admin">
		<form class="form-x" name="userForm" action="${pageContext.request.contextPath }/itemsController/updateItemsAfter.action" method="post">
        <div class="form-group">
        <div class="label">
        </div>
        <div  class="label">
        <input class="input"  name="updateid"  value=" ${item.eid}" type="hidden"/> 
        </div>
        </div>
        <div class="form-group" 	>
        <div class="label">
        <!-- <label >设备名称：</label>   -->
        </div>
        <div  class="label">
        <input  class="input" name="updatename" value="${item.ename}" type="hidden"/>
        </div>
        </div>
        <div class="form-group"  >
        <div class="label"  >
        <label>借用科室：</label>
        </div>
         
        <select name="select_department" class="input"	 style="width:240px; line-height:17px; display:inline-block">
							<option value="">选择借用科室</option>
						    <c:forEach items="${departmentList}"  var="d" >
							<option value="${d}">${d}</option>
							</c:forEach>
							
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
							
		</select>
        </div>
      
       <div class="form-group">
        <div class="label">
          <label>设备状态修改：</label>
        </div>
        <select name="select_status" class="input"	style="width:240px; line-height:17px; display:inline-block">
							<option value="">选择状态</option>
							<option value="借用">借用</option>
							<option value="备用">备用</option>
		</select> 
        </div>
          <div class="form-group">
        <div class="field">
      <button class="button bg-main icon-check-square-o"   onclick="update()"> 提交</button>
          <!-- <input type="submit"  value="提交"> -->
        </div>
        </div>
      </form>
	</div>
</body>
</html>