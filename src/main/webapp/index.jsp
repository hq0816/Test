<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link href="<c:url value="/styles/main.css" />" type="text/css" rel="stylesheet" />
<title>号码归属地查询</title>
</head>
<body>
    <div class="main">
        <h2 class="title"><span>输入号码</span></h2>
        <form method="get" action="getByNum" >
        <fieldset>
            <legend>号码</legend>
            <p>
                <label for="number">号码：</label>
                <input name="number" type="text" size="50"/>
               
            </p>
           
            <p>
              <input type="submit" value="查询" class="btn out">
            </p>
        </fieldset>
        </form>
      
        
    </div>
</body>
</html>