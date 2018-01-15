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
    document.usersForm.action="${pageContext.request.contextPath }/itemsController/findItemsStausItmes.action";
  	document.usersForm.method="post";
  	document.usersForm.submit(); 
}

function changesearch2(){
	/* document.usersForm.action="${pageContext.request.contextPath }/updateUserList.action";
	document.usersForm.method="post";
	document.usersForm.submit(); */
	alert("ok!");
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
		<div class="head-l">
			<a class="button button-little bg-green"  target="_blank"><span
				class="icon-home"></span> admin</a> &nbsp;&nbsp;<a
				class="button button-little bg-red" href="login.html"><span
				class="icon-power-off"></span> 退出登录</a>
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
			<li><a href="${pageContext.request.contextPath }/list.jsp"
				target="right"><span class="icon-caret-right"></span>未租借设备信息</a></li>
			<li><a
				href="${pageContext.request.contextPath }/renterController/queryRenters.action"
				target="right"><span class="icon-caret-right"></span>已租列表</a></li>
			<li><a href="pass.jsp" target="right"><span
					class="icon-caret-right"></span>添加设备</a></li>
		</ul>
		<h2>
			<span class="icon-pencil-square-o"></span>个人信息
		</h2>
		<ul>
			<!--  <li><a href="list.jsp" target="right"><span class="icon-caret-right"></span>设备信息</a></li> -->
			<li><a href="${pageContext.request.contextPath }/itemsController/queryItems.action" target="right"><span class="icon-caret-right"></span>功能</a></li>
			<li><a href="add.jsp" target="right"><span class="icon-caret-right"></span>已租设备查询</a></li>
			<li><a href="cate.jsp" target="right"><span class="icon-caret-right"></span>分类管理</a></li>
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
		<li><a href="{:U('Index/info')}" target="right" class="icon-home">
				首页</a></li>
		<li><a href="##" id="a_leader_txt">网站信息</a></li>
	</ul>
<div class="admin">
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 单页信息</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="">      
      <div class="form-group">
        <div class="label">
          <label>更改状态</label>
        </div>
        <div class="field">
        <select name="select_state" class="input" style="width:120px; line-height:17px;display:inline-block">
							<option value="">器材状态</option>
							<option value="入库正常">入库正常</option>
							<option value="入库损坏">入库损坏</option>
							<option value="借用">借用</option>
							<option value="备用">备用</option>
		</select>
        </div>
      </div>
     
          <div class="form-group">
        <div class="label">
          <label>更改科室</label>
        </div>
        <div class="field">
        <select name="select_department" class="input"	onchange="changesearch1()"
						style="width:240px; line-height:17px; display:inline-block">
							<option value="">选择租借科室</option>
							<option value="呼吸科">呼吸科</option>
							<option value="妇产科">妇产科</option>
							<option value="儿科">儿科</option>
		</select>
        </div>
      </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit">确认借出</button>
        </div>
      </div>
   </form>
  </div>
</div>
</div>
</body>
</html>