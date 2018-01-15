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
  <li><a href="##" id="a_leader_txt">管理员界面</a></li>
</ul>
<div class="admin">
  <form  name="usersForm" method="post" >
  <div class="panel-head">
				<strong class="icon-reorder"> 点击下面按钮提交</strong> 
			</div>
			<!-- <div class="field"> -->
<button id="submit_button"class="button bg-main icon-check-square-o"  onclick="update()"> 提交</button>
<!-- </div> -->
  <table class="table table-hover text-center">
      <tr>
          <th >账号</th>
          <th >类型</th>
          <th >姓名</th>
          <th >密码</th>
          <th> 操作</th>
      </tr>
      <volist name="list" id="vo">
<c:forEach items="${adminList}" var="admin"  varStatus="status">
      <tr>
          <td><input name="adminList[${ status.index}].aid" value="${admin.aid}" readonly="readonly"></td>
          <td><input name="adminList[${ status.index}].asex" value="${admin.asex}" readonly="readonly"></td>
          <td><input type="text" name="adminList[${ status.index}].aname" value="${admin.aname}" ></input></td>
          <td><input type="password"  name="adminList[${ status.index}].apwd" value="${admin.apwd}"></td> 
          <td><div class="button-group"> 
  <c:if test="${admin.mark==2}">
  <a class="button border-red" href="${pageContext.request.contextPath }/deleteAdmin.action?id=${admin.aid}">
<span class="icon-trash-o"></span> 删除</a> 
  </c:if>

</div>
</td>
</tr>
</c:forEach>

</form>
</div>
</body>
<script type="text/javascript">
function update(){
	    	document.usersForm.action="${pageContext.request.contextPath }/updateUserList.action";
	    	document.usersForm.method="post";
	    	document.usersForm.submit();
	    }
</script>
</html>