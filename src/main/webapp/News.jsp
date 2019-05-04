<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<% String path=request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  %>
<!DOCTYPE html>
<html>
<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js"></script>
<head>
<meta charset="UTF-8">
<base href="<%=basePath%>">
<title>新闻</title>
 <style type="text/css">
  table{
   border:solid 1px black;
   border-collapse:collapse;
   }
  td{
    border:solid 1px black;
    width:100px;
    text-align:center
  }
  </style>
  <script type="text/javascript" src="/News/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
  $(function(){
	  $("input[value='增加新闻']").click(function(){
		      location.href="newsController/findNewsType.do";
	  });
  });
  function updateNews(id){
	location.href="newsController/findNewsById.do?id="+id;
  }
  function findNews(id){
	  location.href="newsController/findNews.do?id="+id;
  }
  function delNews(id){
	   var flag= confirm('是否确定删除?');
	   if(flag){
		   location.href="newsController/delNews.do?ids="+id;
	   }else{
		   return flag;
	   }	
}
  $(function(){
	  $("#delid").click(function(){
		  $("input[name='ids']").prop("checked",this.checked);
	  });
	  //根据id的选择通过判断checked属性来进行全选框的显示情况
	  $("input[name='ids']").each(function(){
		  $(this).click(function(){
			  //选择框的条数与页面总框数的判断
			  if($("input[name='ids']").length==$("input[name='ids']:checked").length){
				  $("#delid").prop("checked",true);
			  }else{
				  $("#delid").prop("checked",false);
			  }
		  });
	  }); 
  });
  
</script>
</head>
<body>
   <form action="newsController/findAllNews.do" method="post">
    标题：  <input  type="text" name="qTitle" id="d1" value="${pb.query.qTitle}"/>  
    类型：  <select name="qNewsTypeId">
         <option value="0">--请选择--</option>
         <c:forEach items="${newsType}" var="nt">
           <option value="${nt.id}" <c:if test="${pb.query.qNewsTypeId==nt.id}">selected="selected"</c:if>>${nt.newtype} </option>
         </c:forEach>
      </select>
   开始日期:<input  type="text" name="startTime" class="Wdate" id="d3" onclick="WdatePicker()" readonly="readonly" value=" <fmt:formatDate value='${pb.query.startTime}' pattern='yyyy-MM-dd'/>"/> 
   结束日期:<input  type="text" name="endTime" class="Wdate" id="d4" onclick="WdatePicker()" readonly="readonly" value=" <fmt:formatDate value='${pb.query.endTime}' pattern='yyyy-MM-dd'/>"/>
       <input  type="submit" value="搜索"/><p>
  </form>
   <form method="post" action="newsController/delNews.do" onsubmit="return confirm('是否全部删除?')">
  <table>
    <tr>
     <td><input id="delid" type="checkbox" name="allDelete" />全选</td>
    <td>编号</td>
    <td style="width:130px">标题</td>
    <td>类型</td>
    <td>出版日期</td>
    <td>作者</td>
     <td>发布栏目</td>
     <td>图片上传</td>
    <td style="width:180px">操作</td>
    </tr> 
    <c:forEach  items="${news}" var="n">
       <tr>
    <td><input  type="checkbox" name="ids" value="${n.id}" /></td>
    <td>${n.newsId}</td>
    <td>${n.title}</td>
    <td>${n.newsType.newtype}</td>
        <td><fmt:formatDate value="${n.newDate}" pattern="yyyy-MM-dd"/></td>
    <td>${n.user.userName}</td>
    <td>${n.publish}</td>
    <td><img src="${n.img }"></td>
    <td style="width:130px"><input type="button" value="删除"  onclick="delNews('${n.id}')" >
	        <input type="button" value="修改"  onclick="updateNews('${n.id}')"><input type="button" value="查看"  onclick="findNews('${n.id}')"></td>
	       
    </c:forEach>   
</table><p>
  	<input type="submit" value="全部删除">
</form>	
 <c:url var="NewsUrl" value="/newsController/findAllNews.do">
			   <c:param name="qTitle" value="${pb.query.qTitle}"></c:param>
			   <c:param name="qNewsTypeId" value="${pb.query.qNewsTypeId}"></c:param>
			   <c:param name="startTime">
			      <fmt:formatDate value="${pb.query.startTime}" pattern="yyyy-MM-dd"/>
			   </c:param>
			   <c:param name="endTime">
			      <fmt:formatDate value="${pb.query.endTime}" pattern="yyyy-MM-dd"/>
			   </c:param>
			 </c:url> 
			<p><a href="${NewsUrl}&page=1">首页</a>
				   <c:choose>
					      <c:when test="${pb.currentPage==1}">
					                    上一页
					      </c:when>
					     <c:otherwise>
							<a href="${NewsUrl}&page=${pb.currentPage-1}">上一页</a>
						 </c:otherwise>
				   </c:choose>
				   <c:choose>
					      <c:when test="${pb.currentPage>=pb.totalPage}">
					                 下一页
					       </c:when>
					     <c:otherwise>
							<a href="${NewsUrl}&page=${pb.currentPage+1}">下一页</a>
						</c:otherwise>
				   </c:choose>
			   <a href="${NewsUrl}&page=${pb.totalPage}">尾页</a>
			   共&nbsp;${pb.totalPage}&nbsp;页&nbsp;&nbsp;当前第&nbsp;${pb.currentPage}&nbsp;页
			</p> 	 
		 <input type="button" value="增加新闻" style="margin-left:180px"/>
</body>
</html>