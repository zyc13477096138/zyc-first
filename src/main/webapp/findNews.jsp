
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path=request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href="<%=basePath%>">
<title>Insert title here</title>
</head>
<body> 
 <form action="newsController/findAllNews.do" method="post">
 标题：  <input type="text" name="title" value="${nw.title}"/><br/><br/>
  内容：<input type="text" name="newContext" value="${nw.newContext}"><br/><br/>
  出版社：<input type="text" name="publish" value="${nw.publish}"><br/><br/>
 出版日期 ：<input type="text" name="newDate" value="<fmt:formatDate value='${nw.newDate}' pattern='yyyy-MM-dd'/>"> <br/><br/>
<input type="submit" name="" value="提交"> 
<input type="hidden" name="st" value="findAllNewsByLimit"> 
</form>
</body>
</html>