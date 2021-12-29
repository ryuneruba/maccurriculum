<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.ShohinBean" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <title>ワークショップEC</title>

</head>
<style>
    .container{
        width:50%;
        padding-top:100px;
    }

    .navbar{
        border-bottom: thin solid rgb(229,229,229);
        width: 100%;
        z-index: 10;
    }
    .nav-item img{
        width: 25px;
    }
    .category-title , .items.img{
        text-align: center;
    }
    .ja{
        font-size: medium;
    }
    .img img{
        width: 100%;
    }
    .navbar button{
        height: 70%;
    }
    .footer{
    border-top:2px black;
    }
    li{
    list-style:none;
    }
    #id-icon{
    width:20px;
    }
     #pass-icon{
    width:20px;
    }
#btnLogin{
position:relative;
right:-100%;
}
.footer{
width:100%;
position:absolute;
bottom:3%;
}
.footer p {
width:90%;
margin:0 auto;
border-top:1px black solid;
text-align:right;
}
</style>
<body>
<header>
<div class="navbar-brand ml-2"><h1>アカウント登録</h1></div>
    <nav class="navbar navbar-expand bg-white">
        <div ><h1>WorkShop</h1></div>
        <div class="row ml-2 my-auto">
            <ul class="navbar-nav mr-auto align-items-center">
                <li class="nav-item p-3 font-weight-bold">ITEMS</li>
                <li class="nav-item p-3 font-weight-bold">FEATURE</li>
                <li class="nav-item p-3 font-weight-bold">COORDINATE</li>
                <li class="nav-item p-3 font-weight-bold">SHOP</li>
                <li class="nav-item p-3 font-weight-bold">CONTENT</li>
                <li class="nav-item p-2 ml-3"><img src="img/icon/hart.png" alt=""></li>
                <li class="nav-item p-2"><img src="img/icon/man.png" alt=""></li>
                <li class="nav-item p-2"><img src="img/icon/cart.png" alt=""></li>
            </ul>
         <form class="form-inline my-2 my-lg-0 px-2">
                <input class="form-control mr-sm-2" type="search" placeholder="Search">
                <img src="img/icon/search.png" alt="" type="submit">
            </form>
        </div>
    </nav>
</header>
<div class="container">

</div>
 <div class="footer">
  <p>©︎Y&I Group.inc</p>
</div>
</body>
</html>