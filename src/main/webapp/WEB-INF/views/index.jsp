<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.info.entity.UserInfo" %>
<%@ page import="java.util.List" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
    List<UserInfo> userList = (List<UserInfo>)request.getAttribute("userList");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base href=" <%=basePath%>"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>index</title>
	</head>
	<body>
		<div>
			 <p>欢迎<%=userList.get(0).getuName() %>!</p>
		</div>
		<div align="center" style="width:200;height:200">
		<h1>1111111111</h1>
		</div>
	</body>
</html>