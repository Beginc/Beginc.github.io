<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/28
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        div.form{
            height: 200px;
            border-bottom: 1px solid black;
        }
    </style>
</head>
<body>

<%--GET方法参数绑定--%>
<%--    <div class="form">--%>
<%--        <form action="bind/int" method="get">--%>
<%--            <input type="text" name="var" placeholder="int"> <br/>--%>
<%--            <input type="submit" name="提交">--%>
<%--        </form>--%>
<%--    </div>--%>

<%--    <div class="form">--%>
<%--        <form action="bind/string" method="get">--%>
<%--            <input type="text" name="var" placeholder="String"> <br/>--%>
<%--            <input type="submit" name="提交">--%>
<%--        </form>--%>
<%--    </div>--%>

<%--    <div class="form">--%>
<%--        <form action="bind/array" method="get">--%>
<%--            <input type="text" name="var" placeholder="array"> <br/>--%>
<%--            <input type="text" name="var" placeholder="array"> <br/>--%>
<%--            <input type="text" name="var" placeholder="array"> <br/>--%>
<%--            <input type="submit" name="提交">--%>
<%--        </form>--%>
<%--    </div>--%>

<%--    <div class="form">--%>
<%--        <form action="bind/list" method="get">--%>
<%--            <input type="text" name="var" placeholder="list"> <br/>--%>
<%--            <input type="text" name="var" placeholder="list"> <br/>--%>
<%--            <input type="text" name="var" placeholder="list"> <br/>--%>
<%--            <input type="submit" name="提交">--%>
<%--        </form>--%>
<%--    </div>--%>

<%--    <div class="form">--%>
<%--        <form action="bind/set" method="get">--%>
<%--            <input type="text" name="var" placeholder="set"> <br/>--%>
<%--            <input type="text" name="var" placeholder="set"> <br/>--%>
<%--            <input type="text" name="var" placeholder="set"> <br/>--%>
<%--            <input type="submit" name="提交">--%>
<%--        </form>--%>
<%--    </div>--%>

<%--    <div class="form">--%>
<%--        <form action="bind/object" method="get">--%>
<%--            <input type="text" name="name" placeholder="name"> <br/>--%>
<%--            <input type="text" name="age" placeholder="age"> <br/>--%>
<%--            <input type="text" name="accounts[0].money" placeholder="account.money"> <br/>--%>
<%--            <input type="text" name="accounts[1].money" placeholder="account.money"> <br/>--%>
<%--            <input type="text" name="phoneMap['android'].name" placeholder="phone.name"> <br/>--%>
<%--            <input type="text" name="phoneMap['android'].price" placeholder="phone.price"> <br/>--%>
<%--            <input type="text" name="phoneMap['iphone'].name" placeholder="phone.name"> <br/>--%>
<%--            <input type="text" name="phoneMap['iphone'].price" placeholder="phone.price"> <br/>--%>
<%--            <input type="submit" name="提交">--%>
<%--        </form>--%>
<%--    </div>--%>

<%--POST方法参数绑定--%>
<div class="form">
    <form action="bind/int" method="post">
        <input type="text" name="var" placeholder="int"> <br/>
        <input type="submit" name="提交">
    </form>
</div>

<div class="form">
    <form action="bind/string" method="post">
        <input type="text" name="var" placeholder="String"> <br/>
        <input type="submit" name="提交">
    </form>
</div>

<div class="form">
    <form action="bind/array" method="post">
        <input type="text" name="var" placeholder="array"> <br/>
        <input type="text" name="var" placeholder="array"> <br/>
        <input type="text" name="var" placeholder="array"> <br/>
        <input type="submit" name="提交">
    </form>
</div>

<div class="form">
    <form action="bind/list" method="post">
        <input type="text" name="var" placeholder="list"> <br/>
        <input type="text" name="var" placeholder="list"> <br/>
        <input type="text" name="var" placeholder="list"> <br/>
        <input type="submit" name="提交">
    </form>
</div>

<div class="form">
    <form action="bind/set" method="post">
        <input type="text" name="var" placeholder="set"> <br/>
        <input type="text" name="var" placeholder="set"> <br/>
        <input type="text" name="var" placeholder="set"> <br/>
        <input type="submit" name="提交">
    </form>
</div>

<div class="form">
    <form action="bind/object" method="post">
        <input type="text" name="name" placeholder="name"> <br/>
        <input type="text" name="age" placeholder="age"> <br/>
        <input type="text" name="accounts[0].money" placeholder="account.money"> <br/>
        <input type="text" name="accounts[1].money" placeholder="account.money"> <br/>
        <input type="text" name="phoneMap['android'].name" placeholder="phone.name"> <br/>
        <input type="text" name="phoneMap['android'].price" placeholder="phone.price"> <br/>
        <input type="text" name="phoneMap['iphone'].name" placeholder="phone.name"> <br/>
        <input type="text" name="phoneMap['iphone'].price" placeholder="phone.price"> <br/>
        <input type="submit" name="提交">
    </form>
</div>

<div class="form">
    <form action="bind/conversion" method="post">
        <input type="text" name="date" placeholder="2018/8/8">
        <input type="submit" name="提交">
    </form>
</div>
</body>
</html>
