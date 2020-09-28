<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--scriptlet --%>
<%out.println("Welcome to JSP");%>

<%--declaration --%>
<%! String city="Pune";%>

<%out.println("Welcome to "+city); %>

<%double marks=90; %>

<%--expression --%>
<%=marks %>

</body>
</html>