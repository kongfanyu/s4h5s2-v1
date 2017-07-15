<%@page import="com.shop.service.ProductService"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//1. 获取spring容器
ApplicationContext ctx  =(ApplicationContext)application.getAttribute("ctx");
//2.获取对象
//ProductService ps = ctx.getBean(ProductService.class);
ProductService ps = (ProductService)ctx.getBean("productService");
String msg  = ps.saveProduct();
out.println(msg);
%>


</body>
</html>