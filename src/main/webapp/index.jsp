<%--
  Created by IntelliJ IDEA.
  User: Changheng
  Date: 2018-8-19
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>


    <form action="/springmvc/testMethod" method="post">
        <input type="submit" value="Test Post Method">
    </form>

    <a href="/springmvc/testRequsetMapping">Test RequestMapping</a>

<br><br>

    <a href="helloWorld"><h4>Test </h4></a>

    <br><br>

    <a href="/springmvc/testParamsAndHeaders?username=jack&age=23">Test ParamsAndHeaders</a>

<br>

    <a href="/springmvc/tsetPathVariable/1">Test Variable</a>
    <br><br>

    HiddenHttpMethodFilter

    <br><br>
    Get
    <a href="springmvc/testRest/1">Test REST Get</a>

    <br><br>
    Post
    <form action="springmvc/testRest" method="post">
        <input type="submit" value="Test for POST">
    </form>

    <br><br>

    Delete
    <form action="springmvc/testRest/1" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="Test for Delete">
    </form>

    <br><br>

    Put
    <form action="springmvc/testRest/1" method="post">
        <input type="hidden" name="_method" value="PUT">

        <input type="submit" value="Test for Put">
    </form>

    <br><br>


    <a href="/springmvc/testRequestParam?username=Jack&age=">Test RequestParam</a>



    <a href="/springmvc/testRequestHeader">Test RequestHeader</a>

    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>

</body>
</html>
