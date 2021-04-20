<%@ page language ="java"  pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
        <head>
			<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
			<script type="text/javascript" src="<c:url value='/resources/js/login.js' />" id="initJs"></script>
        </head>
        <body>
                id : <input type="text" id="id" length=16/>
                pwd : <input type="password" id="pwd" length=16/>
                <button id="login_btn">login</button>
		        <input type="text" id="result" length=16 readonly="true"/>
        </body>
</html>
