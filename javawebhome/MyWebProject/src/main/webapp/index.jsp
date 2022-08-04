<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="/MyWebProject/MySecondServlet" method="post">
         <input name="user" type="text" value="111">
        <input type="submit" value="提交http请求">
    </form>
    <form action="/MyWebProject/LoginServlet" method="get">
         <br/>
         请输入用户名：<input name="username" type="text"/>
         <br/>
         请输入密码：<input name="password" type="password"/>
         <br/>
         爱好：<input name="aihao" type="checkbox" value="lq"/>篮球
         <input name="aihao" type="checkbox"  value="tw"/>跳舞
         <br/>
         <input type="submit" value="提交">
    </form>
</body>
</html>