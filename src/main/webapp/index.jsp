<html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/user/findById2" method="post">
    用户名：<input type="text" name="userName"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
