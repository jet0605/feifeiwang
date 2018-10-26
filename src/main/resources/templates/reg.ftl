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
    <div style="padding: 95px;">
        <form class="layui-form" action="">
            <div class="layui-form-item">
                <label class="layui-form-label">登录名:</label>
                <div class="layui-input-block">
                    <input type="text" name="title" required  lay-verify="required" placeholder="请输入登录名" autocomplete="off" class="layui-input">
                </div>

            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">密码框</label>
                <div class="layui-input-inline">
                    <input type="password" name="password" id="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-mid layui-word-aux">密码长度6-20位，由大小字符和数字组成</div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">姓名:</label>
                <div class="layui-input-block">
                    <input type="text" name="title" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">

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
                <label class="layui-form-label">单选框</label>
                <div class="layui-input-block">
                    <input type="radio" name="sex" value="男" title="男">
                    <input type="radio" name="sex" value="女" title="女" checked>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">通信地址：</label>
                <div class="layui-input-block">
                    <input type="text" name="title" required  lay-verify="required" placeholder="请输入通信地址" autocomplete="off" class="layui-input">
                </div>

            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">手机号码：</label>
                <div class="layui-input-block">
                    <input type="text" name="title" required  lay-verify="required" placeholder="请输入手机号码" autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">邮箱：</label>
                <div class="layui-input-block">
                    <input type="text" name="mail" id="mail" required  lay-verify="required" placeholder="请输入邮箱" autocomplete="off" class="layui-input">

                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">头像：</label>
                <div class="layui-input-inline">
                    <div class="layui-upload-list" style="margin:0">
                        <img src="../static/image/dog-logo.png" id="picture" class="layui-upload-img" width="50" height="50">
                    </div>
                </div>
                <div class="layui-input-inline layui-btn-container" style="width: auto;">
                    <button type="button" class="layui-btn" id="editimg">
                        <i class="layui-icon">&#xe67c;</i>上传图片
                    </button>
                </div>
                <div class="layui-form-mid layui-word-aux">头像的大小在50kb以内</div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit lay-filter="Regform">立即提交</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script src="../static/layui.js"></script>
<script>
    //JavaScript代码区域

    /*是否带有小数*/
    function isDecimal(strValue )  {
        var  objRegExp= /^\d+\.\d+$/;
        return  objRegExp.test(strValue);
    }
    /*校验是否中文名称组成 */
    function ischina(str) {
        var reg=/^[\u4E00-\u9FA5]{2,4}$/;   /*定义验证表达式*/
        return reg.test(str);     /*进行验证*/
    }

    /*校验是否全由8位数字组成 */
    function isStudentNo(str) {
        var reg=/^[0-9]{6}$/;   /*定义验证表达式*/
        return reg.test(str);     /*进行验证*/
    }

    /*校验电话码格式 */
    function isTelCode(str) {
        var reg= /^((0\d{2,3}-\d{7,8})|(1[3584]\d{9}))$/;
        return reg.test(str);
    }

    /*校验邮件地址是否合法 */
    function IsEmail(str) {
        var reg=/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/;
        return reg.test(str);
    }
    /*密码字母数字组合，不小于6位,必须包含数字加字母 不能包含特殊符号等*/
    function isPassword(pass){
        var str = pass;
        if(str==null || str.length<6){
            return false;
        }
        var reg1 = new RegExp(/^[0-9A-Za-z]+$/);
        if (!reg1.test(str)) {
            return false;
        }
        var reg = new RegExp(/[A-Za-z].*[0-9]|[0-9].*[A-Za-z]/);
        if (reg.test(str)) {
            return true;
        } else {
            return false;
        }
    }
    //判断输入格式
    layui.use('element', function(){
        var element = layui.element;

    });
    layui.use('form',function () {
        var form = layui.form;
        //form.on('submit(Regform)', judge());
    });
    layui.use('upload', function(){
        var upload = layui.upload;

        //执行实例
        var uploadInst = upload.render({
            elem: '#editimg' //绑定元素
            ,url: '/upload' //上传接口
            ,accept: 'image'
            ,size: 50
            ,done: function(res) {
                //上传完毕回调
                layui.use(['jquery',], function(args){
                            var $= layui.jquery;
                            $("#picture").attr('src',res.url);
                });
            }
            ,error: function(){
                layer.msg('网络异常');
            }
        });
    });
    function judge() {
         if (!isPassword(document.getElementById("password").value)) {
             layer.msg("密码必须为字母或者是数字，也可以是组合，6-20位");
             document.getElementById("pass").focus();
             return false;
         }
        if(!IsEmail(document.getElementById("mail").value)){
            layer.msg("无效的邮箱地址");
            document.getElementById("email").focus();
            return false;
        }
        return true;
    }

</script>
</body>