<%--
  Created by IntelliJ IDEA.
  User: huwenkai
  Date: 2017/10/15
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一个小demo</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/holle2.action" method="post">
    用户名：<input type="text" name="name" /><br/>
    密码：<input type="password" name="age" /><br/>

    <input type="submit" value="注册" />
</form>
</body>
</html>
