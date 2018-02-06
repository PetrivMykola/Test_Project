<%--
  Created by IntelliJ IDEA.
  User: mykola
  Date: 05.02.2018
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 align="center">Beer Recomendation JSP</h1>
<%
    String c = request.getParameter("color");

    PrintWriter messageWriter = response.getWriter();

    messageWriter.write("<h2>" + c + "from jsp" + "<h2>");

%>

</body>
</html>
