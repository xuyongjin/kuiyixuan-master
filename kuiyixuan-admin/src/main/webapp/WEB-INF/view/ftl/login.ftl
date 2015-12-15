<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>登录</title>
    <link rel="stylesheet" href="/static-resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static-resources/css/login.css">
</head>
<body>
<div class="container">
    <div class="box">
        <div class="content">
            <form class="form-horizontal" action="/login" method="post">
                <div class="form-group">

                    <div class="col-md-12">
                        <input type="text" class="form-control" id="username" name="username" placeholder="用户名">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputEmail3" class="col-sm-2 control-label sr-only">Email</label>

                    <div class="col-md-12">
                        <input type="password" class="form-control" id="password" name="password" placeholder="密码">
                    </div>
                </div>
                <div class="pull-right">
                    <a href="#">忘记密码?</a>
                </div>
                <div class="form-group">
                    <div class="col-md-12">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" name="rememberMe"> 记住密码
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-12 text-center">
                        <button type="submit" class="btn btn-info">登录</button>
                    </div>
                </div>

            </form>
        </div>
    </div>
</div>

<script src="/static-resources/js/jquery.v1.11.2.min.js"></script>
<script src="/static-resources/js/bootstrap.min.js"></script>
</body>
</html>