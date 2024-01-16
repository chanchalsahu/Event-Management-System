<%-- 
    Document   : productstatus
    Created on : Jan 15, 2024, 4:18:37 PM
    Author     : ganesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<style>
* {
  box-sizing: border-box;
  font-family: Arial, sans-serif;
}

/* Create a blue and grey color scheme for the body */
body {
  background: #F0F0F0;
  margin: 0;
  padding: 0;
}

/* Create a container for the layout */
.container {
  width: 80%;
  margin: 0 auto;
  padding: 20px;
}

/* Style the header */
.header {
  display: block;
  width: 100%;
  height: 60px;
  line-height: 60px;
  text-align: center;
  color: white;
  border-radius: 10px;
  background: #1E90FF;
  margin-bottom: 10px;
}

/* Style the buttons */
.button {
  display: inline-block;
  width: 48%;
  height: 40px;
  line-height: 40px;
  text-align: center;
  color: #1E90FF;
  border-radius: 10px;
  background: #87CEFA;
  margin: 5px;
  cursor: pointer;
}

/* Style the input fields */
.input {
  display: inline-block;
  width: 48%;
  height: 40px;
  border-radius: 10px;
  border: 1px solid #1E90FF;
  margin: 5px;
  padding: 10px;
}
</style>
</head>
<body>
<div class="container">
    
      <%  String myname=(String) session.getAttribute("name_key"); %>
            <h1>WELCOME:<%= myname %></h1>
  <div class="header">Product Status</div>
  <div class="button "  href="index.html">Home</div>
  <div class="button"  href="Userlogin">Logout</div>
  <input type="text" class="input" placeholder="Name">
  <input type="email" class="input" placeholder="E-Mail">
  <input type="text" class="input" placeholder="Address">
  <input type="text" class="input" placeholder="Status">
  <div class="button">Update</div>
  <div class="button">Delete</div>
</div>
</body>
</html>
```