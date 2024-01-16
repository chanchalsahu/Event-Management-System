<%-- 
    Document   : request
    Created on : Jan 15, 2024, 4:19:37 PM
    Author     : ganesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>.container {
        background-color: grey;
        width: 400px;
        margin: 0 auto;
        padding: 20px;
      }
      
      .top-row {
        display: flex;
        justify-content: space-between;
      }
      
      .bottom-row {
        display: flex;
        justify-content: space-between;
        margin-top: 20px;
      }
      
      .top-button {
        background-color: rgb(231, 231, 241);
        color: white;
        border: none;
        border-radius: 10px;
        box-shadow: 2px 2px 5px black;
        padding: 10px 30px;
      }
      
      .bottom-button {
        background-color: darkblue;
        color: white;
        border: none;
        border-radius: 10px;
        box-shadow: 2px 2px 5px black;
        padding: 30px;
      }
      </style>
</head>
<body>
    <div class="container">
          <%  String myname=(String) session.getAttribute("name_key"); %>
            <h1>WELCOME:<%= myname %></h1>
        <div class="top-row">
          <button class="top-button"> <a href="index.html">Home</a></button>
          <button class="top-button"><a href="request.html">Request Item</a></button>
          <button class="top-button"> <a href="index.html"> LogOut </a> </button>
        </div>
        <div class="bottom-row">
          <button class="bottom-button">Item 1</button>
          <button class="bottom-button">Item 2</button>
          <button class="bottom-button">Item 3</button>
          <button class="bottom-button">Item 4</button>
        </div>
      </div>
      
</body>
</html>