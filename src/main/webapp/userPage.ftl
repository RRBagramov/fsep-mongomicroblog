<!DOCTYPE html>
<html >
<head>
<meta charset="UTF-8">
<title>Blog</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>

<link rel="stylesheet" href="css/style.css">


</head>

<body>

<div class="navbar navbar-default navbar-static-top">
<div class="container">
    <div class="navbar-collapse navbar-collapse-1 collapse" aria-expanded="true">
        <ul class="nav navbar-nav">
            <li class="active">
                <a href="#fake"><span class="glyphicon glyphicon-home"></span> Home</a>
            </li>
        </ul>
    </div>
</div>
</div>

<div class="container">
<div class="row">
    <div class="col-sm-3">
        <div class="panel panel-default">
            <div class="panel-body">
                <div><img class="ava" class="img-responsive" alt="" src="${model.user.photoLink}"></div>
                <a href="#"><span class="fio">${model.user.firstName} ${model.user.lastName}</span></a>
                <br/>
                <a href="#"><span class="mail">${model.user.nickname}</span></a>
                <div class="row">
                    <div class="col-xs-3">
                        <h5>
                            <small>TWEETS</small>
                            <a href="#">${model.userInfo.postsCount}</a>
                        </h5>
                    </div>
                    <div class="col-xs-4">
                        <h5>
                            <small>FOLLOWING</small>
                            <a href="#">${model.userInfo.followingCount}</a>
                        </h5>
                    </div>
                    <div class="col-xs-5">
                        <h5>
                            <small>FOLLOWERS</small>
                            <a href="#">${model.userInfo.followersCount}</a>
                        </h5>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-sm-6">
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="media">
                    <a class="media-left" href="#fake">
                        <img alt="" class="media-object img-rounded">
                    </a>
                    <div class="media-body">
                        <div class="form-group has-feedback">
                            <label class="control-label sr-only" for="inputSuccess5">Hidden label</label>
                            <input type="text" class="form-control" id="search2" aria-describedby="search">
                        </div>
                    </div>
                </div>
            </div>
            <div class="panel-body">

                <#list model.posts as post>
                <hr/>
                <div class="media">
                    <a class="media-left" href="#fake">
                        <img alt="" class="media-object img-rounded">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">Media heading</h4>
                        <p>${post.text}</p>
                    </div>
                </div>
                </#list>

            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>
