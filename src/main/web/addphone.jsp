<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 5/11/2021
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Phone</title>
</head>
<body>
<form method="post" action="product">
    Phone Name : <input type="text" placeholder="Name Product" name="name"><br/>
    Price : <input type="number" placeholder="Price" name="price"><br/>
    Description : <input type="text" placeholder="Description" name="description"><br/>
    <label for="cars">Choose a car:</label>
    <select id="cars" name="brand">
        <option value="apple">Apple</option>
        <option value="samsung">SamSung</option>
        <option value="others">Others</option>
    </select><br/>
    <input class="btn btn-primary" type="submit" value="Submit">
</form>
</body>
</html>
