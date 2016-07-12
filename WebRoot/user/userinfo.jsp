<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="UTF-8">
	<title>用户详情信息</title>
	<link href="../assets/css/bs3/dpl.css" rel="stylesheet" type="text/css" />
	<link href="../assets/css/bs3/bui.css" rel="stylesheet" type="text/css" />
	<link href="../assets/css/page-min.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<div class="detail-page">
			<h2>用户信息</h2>
			<div class="detail-section">
				<h3>基本信息</h3>
				<div class="row detail-row">
					<div class="span8">
						<label>编号：</label><span class="detail-text">${user.uid}</span>
					</div>
					<div class="span8">
						<label>用户名：</label><span class="detail-text">${user.uname}</span>
					</div>
					<div class="span8">
						<label>姓名：</label><span class="detail-text">${user.pname}</span>
					</div>
				</div>
				<div class="row detail-row">
					<div class="span8">
						<label>性别：</label>
						<span class="detail-text">
							<c:choose>
								<c:when test="${user.sex == 0}">女</c:when>
								<c:when test="${user.sex == 1}">男</c:when>
							</c:choose>
						</span>
					</div>
					<div class="span8">
						<label>年龄：</label><span class="detail-text">${user.age}</span>
					</div>
					<div class="span8">
						<label>生日：</label><span class="detail-text">${fn:split(user.birthday, " ")[0]}</span>
					</div>
				</div>
				<div class="row detail-row">
					<div class="span8">
						<label>账户余额：</label><span class="detail-text">${user.account}</span>
					</div>
					<div class="span8">
						<label>联系电话：</label><span class="detail-text">${user.phone}</span>
					</div>
					<div class="span8">
						<label>联系地址：</label><span class="detail-text">${user.address}</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="../assets/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="../assets/js/bui-min.js"></script>
	<script type="text/javascript" src="../assets/js/config-min.js"></script>
	<script type="text/javascript">
		BUI.use('common/page');
	</script>
<body>
</html>
