<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC 添加用户</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>SpringMVC 添加用户</h1>
    <hr/>
    <form:form action="/admin/abroadfundaccounts/addAcc" method="post" commandName="account" role="form">
        <div class="form-group">
            <label for="sAccountId">sAccountId:</label>
            <input type="text" class="form-control" id="sAccountId" name="sAccountId" placeholder="Enter sAccountId:"/>
        </div>
        <div class="form-group">
            <label for="sAccountName">sAccountName:</label>
            <input type="text" class="form-control" id="sAccountName" name="sAccountName" placeholder="Enter sAccountName:"/>
        </div>
        <div class="form-group">
            <label for="iAccountType">iAccountType:</label>
            <input type="text" class="form-control" id="iAccountType" name="iAccountType" placeholder="Enter iAccountType:"/>
        </div>
        <div class="form-group">
            <label for="sBankName">sBankName:</label>
            <input type="text" class="form-control" id="sBankName" name="sBankName" placeholder="Enter sBankName:"/>
        </div>

        <div class="form-group">
            <label for="sBankAccNum">sBankAccNum:</label>
            <input type="text" class="form-control" id="sBankAccNum" name="sBankAccNum" placeholder="Enter sBankAccNum:"/>
        </div>
        <div class="form-group">
            <label for="sCountry">sCountry:</label>
            <input type="text" class="form-control" id="sCountry" name="sCountry" placeholder="Enter sCountry:"/>
        </div>
        <div class="form-group">
            <label for="sCurrency">sCurrency:</label>
            <input type="text" class="form-control" id="sCurrency" name="sCurrency" placeholder="Enter sCurrency:"/>
        </div>
        <div class="form-group">
            <label for="iUserId">iUserId:</label>
            <input type="text" class="form-control" id="iUserId" name="iUserId" placeholder="Enter iUserId:"/>
        </div>
        <div class="form-group">
            <label for="iAction">iAction:</label>
            <input type="text" class="form-control" id="iAction" name="iAction" placeholder="Enter iAction:"/>
        </div>
        <div class="form-group">
            <label for="dAddTime">dAddTime:</label>
            <input type="text" class="form-control" id="dAddTime" name="dAddTime" placeholder="Enter dAddTime:"/>
        </div>
        <div class="form-group">
            <label for="iOwnerType">iOwnerType:</label>
            <input type="text" class="form-control" id="iOwnerType" name="iOwnerType" placeholder="Enter iOwnerType:"/>
        </div>

        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>