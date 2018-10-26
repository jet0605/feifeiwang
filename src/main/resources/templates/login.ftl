<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>注册</title>
    <link rel="stylesheet" href="../static/css/layui.css">
    <script src="../static/layui.js"></script>
</head>
<body>
<div class="layui-header layui-bg-black">
    <div class="layui-logo">
        <img src="../static/image/dog-logo.png" width="50" height="50"/>肥肥网</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-right">
        <li class="layui-nav-item"><a href="">首页</a></li>
        <li class="layui-nav-item">
            <a href="javascript:;">直播</a>
            <dl class="layui-nav-child">
                <dd><a href="">直播大厅</a></dd>
                <dd><a href="">我的直播</a></dd>
                <dd><a href="">好友直播</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">讨论区</a></li>
        <li class="layui-nav-item">
            <a href="javascript:;">课程</a>
            <dl class="layui-nav-child">
                <dd><a href="">全部课程</a></dd>
                <dd><a href="">我的课程</a></dd>
                <dd><a href="">开设课程</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">意见反馈</a></li>
    </ul>
</div>
<div class="layui-body">
    <!-- 内容主体区域 -->
</div>
<div style="padding: 125px; padding-left: 460px">
    <form class="layui-form" action="">
        <div class="layui-form-item">
            <label class="layui-form-label">登录名:</label>
            <div class="layui-input-block">
                <input type="text" name="title" required  lay-verify="required" placeholder="请输入登录名" autocomplete="off" class="layui-input" style="width: 160px">
            </div>

        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">密码框</label>
            <div class="layui-input-inline">
                <input type="password" name="password" id="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input" style="width: 160px">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">类型：</label>
            <div class="layui-input-block">
                <input type="radio" name="type" value="个人" title="个人">
                <input type="radio" name="type" value="企业" title="企业" checked>
            </div>
        </div>
        <div class="layui-form-item">
            <div style="padding-left: 54px">
                <button class="layui-btn" lay-submit lay-filter="Regform">登录</button>
                <button class="layui-btn layui-btn-normal">忘记密码</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
    <script src="../static/layui.js"></script>
    <script>
        layui.use('element', function(){
            var element = layui.element;

        });
        layui.use('form',function () {
            var form = layui.form;
        });
    </script>
</body>