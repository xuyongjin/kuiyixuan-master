<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
<#include "/common/css.ftl" />
    <link rel="stylesheet" href="/static-resources/css/user/user.css">
    <title>添加用户</title>
</head>
<body>
<#include "/common/header.ftl"/>
<#include  "/common/sidebar.ftl"/>
<div class="center-main">
    <div class="divider"></div>
    <div class="info">
        <ol class="breadcrumb">
            <li><a href="#">Home</a></li>
            <li><a href="#">Library</a></li>
            <li class="active">Data</li>
        </ol>
        <div class="content">
            <form class="form-horizontal">
                <div class="form-group">
                    <label for="userName"  class="col-sm-offset-2 col-sm-2 control-label">用户名:</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="userName" name="userName" placeholder="请输入用户名">
                    </div>
                </div>
                <div class="form-group">
                    <label for="email"  class="col-sm-offset-2 col-sm-2 control-label">邮箱:</label>
                    <div class="col-sm-3">
                        <input type="email" class="form-control" id="email" name="email" placeholder="请输入邮箱">
                    </div>
                </div>
                <div class="form-group">
                    <label for="phone"  class="col-sm-offset-2 col-sm-2 control-label">手机号码:</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入手机号码">
                    </div>
                </div>
                <div class="form-group">
                    <label for="isAdmin" class="col-sm-offset-2 col-sm-2 control-label">用户类型:</label>
                    <div class="col-sm-3">
                        <select class="form-control" id="isAdmin" name="isAdmin" placeholder="请选择用户类型">
                            <option value="true">管理员</option>
                            <option value="false">普通用户</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-4 col-sm-3">
                        <button type="button" class="btn btn-primary" style="width: 120px" onclick="adduser()">添加</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<#include "/common/js.ftl"/>
<script type="text/javascript" src="/static-resources/js/kuiyixuan.js"></script>
</body>
</html>