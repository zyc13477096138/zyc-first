
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
 <form action="newsController/updateNews.do" method="post">
ID：  <input type="text" name="id" value="${nw.id}"/><br/><br/>
 编号：  <input type="text" name="newsId" value="${nw.newsId}"/><br/><br/>
 标题：  <input type="text" name="title" value="${nw.title}"/><br/><br/>
  内容：<input type="text" name="newContext" value="${nw.newContext}"><br/><br/>
  出版社：<input type="text" name="publish" value="${nw.publish}"><br/><br/>
 出版日期 ：<input type="text" name="newDate" value="<fmt:formatDate value='${nw.newDate}' pattern='yyyy-MM-dd'/>"> <br/><br/>
<input type="submit" name="" value="修改更新"> 
<input type="hidden" name="st" value="updateNews"> 
</form>
</body>
</html>