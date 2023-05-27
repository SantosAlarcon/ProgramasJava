<%--
    Document   : index
    Created on : 03-mar-2011, 22:16:25
    Author     : FutuzorMekkla
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%!    Connection con;
    Statement consulta;
    ResultSet rs;
    ResultSetMetaData md;
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/prueba");
                consulta = con.createStatement();
                rs = consulta.executeQuery("select * from prueba");
                md = rs.getMetaData();
            }
            catch (Exception e) {
                %><h1>Error al conectarse la B.D. de MySQL</h1><%
            }
        %>
    </body>
</html>
