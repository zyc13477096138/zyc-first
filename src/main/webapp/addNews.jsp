
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<form action="newsController/addNews.do" method="post" enctype="multipart/form-data">
 编号：<input type="text" name="newsId"><br/><br/>
  标题：<input type="text" name="title"><br/><br/>
  类型编号：  <select name="newsType.id">
         <option value="0">--请选择--</option>
         <c:forEach items="${newsType}" var="newsType">
           <option value="${newsType.id}">${newsType.newtype}</option>
         </c:forEach>
      </select><br/><br/>
  出版社：<input type="text" name="publish"><br/><br/>
 内容 ：<input type="text" name="newContext"> <br/><br/>
 图片：<input  type="file" name="fimg"/><p>
<input type="submit" value="提交">
</form>
</body>
</html>