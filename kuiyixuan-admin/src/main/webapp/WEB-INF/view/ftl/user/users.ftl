<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
<#include "/common/css.ftl" />
    <title>Title</title>
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
       <div class="toolbar">
           <div class="btn btn-primary"><a href="/user/add">添加</a> </div>
           <div class="btn btn-primary"><a href="#">更新</a> </div>
           <div class="btn btn-primary"><a href="#">删除</a> </div>
           <div class="btn btn-primary"><a href="#">打印</a> </div>
       </div>
        <table class="table table-striped table-bordered table-hover">
            <thead>
            <tr>
                <td>
                    <div class="check-box-table-cell"></div>
                </td>
                <td></td>
                <td>用户名</td>
                <td>email</td>
                <td>电话号码</td>
                <td>创建时间</td>
                <td>用户状态</td>
                <td>是否删除</td>
                <td>管理员状态</td>
            </tr>
            </thead>
            <tbody>
            <#if pageInfo?exists>
                <#list pageInfo.list as p>
                <tr>
                    <td>
                        <div class="check-box-table-cell"></div>
                    </td>
                    <td></td>
                    <td>${p.userName}</td>
                    <td>${p.email}</td>
                    <td>${p.phone}</td>
                    <td>${p.createDate?string('yyyy-MM-dd HH:mm:ss')}</td>
                    <td>${p.status.info}</td>
                    <td>${p.deleted?string('是', '否')}</td>
                    <td>${p.admin?string('是', '否')}</td>
                </tr>
                </#list>
            </#if>

            </tbody>
        </table>
    </div>
    <div class="pageNav">
        <div><a <#if pageInfo.isFirstPage>class="disabled"</#if> href="/users?pageNum=${pageInfo.firstPage}">首页</a></div>
        <div><a <#if !pageInfo.hasPreviousPage>class="disabled"</#if> href="/users?pageNum=${pageInfo.prePage}">上一页</a></div>
        <div><a <#if (pageInfo.pages lt 1)>class="disabled"</#if> href="/users?pageNum=${pageInfo.firstPage}">1</a></div>
        <div><a <#if (pageInfo.pages lt 2)>class="disabled"</#if> href="/users?pageNum=${pageInfo.firstPage}">2</a></div>
        <div><a <#if (pageInfo.pages lt 3)>class="disabled"</#if> href="/users?pageNum=${pageInfo.firstPage}">3</a></div>
        <input type="text" placeholder="跳转"><span>/ ${pageInfo.pages} 页</span>
        <div><a <#if !pageInfo.hasNextPage>class="disabled"</#if> href="/users?pageNum=${pageInfo.nextPage}">下一页</a></div>
        <div><a <#if pageInfo.isLastPage>class="disabled"</#if> href="/users?pageNum=${pageInfo.lastPage}">尾页</a></div>
    </div>
</div>

<#include "/common/js.ftl"/>
</body>
</html>