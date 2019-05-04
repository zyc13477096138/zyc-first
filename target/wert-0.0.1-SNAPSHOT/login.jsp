<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">
    $(function(){
    	 $("#bt").click(function(){
			$.ajax({
				url:"userController/login.do",
				dataType:"json",
				type:"post",
				data:{"userName":$("#name").val(),"pwd":$("#pwd").val()},
				success:function(mess){
					if(mess.data){
						location.href="newsController/findAllNews.do";
					  }else{
						$("#error").html("用户名或者密码错误....");
				 }
			   }
			});   
	      });
    });
</script>
<head>
<style type="text/css">
       #d1{
			border: 1px solid;
			margin: 0px auto;
			width:400px ;	
			padding-top:50px ;
			padding-bottom:50px ;
			margin-top:180px ;
			 text-align: center;
			background-color:blue;		
		 }
	 body{
	   background-color:cyan
	 }
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div id="d1">
     <font color="red" size="1" id="error"></font><p>
       用户名:<input type="text" name="userName" id="name"   placeholder="用户名"/><br><br>
     密&nbsp;&nbsp;码:<input   type="password" name="pwd" id="pwd"  placeholder="密码"/><br><br>
        <input type="button" value="登陆" id="bt"/>
   </div>
</body>
</html>