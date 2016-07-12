<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String sid = request.getParameter("sid");
	out.write("{\"sid\" : \"" + sid + "\", \"sname\" : \"yakov\", \"age\":18}");
%>
