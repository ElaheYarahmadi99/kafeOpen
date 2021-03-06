<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!--
Created by IntelliJ IDEA.
User: ehsan
Date: 8/2/2020
Time: 9:48 AM
To change this template use File | Settings | File Templates.
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kafe | Home</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body,h1 {font-family: "Raleway", Arial, sans-serif}
        h1 {letter-spacing: 6px}
        .w3-row-padding img {margin-bottom: 12px}
    </style>
</head>
<body>
<%
    List<String> imgList = new ArrayList<>();
    imgList.add("img1");
    imgList.add("img2");
    imgList.add("img3");
    imgList.add("img4");
    out.print(imgList);
%>
<!-- !PAGE CONTENT! -->
<div class="w3-content" style="max-width:1500px">

    <!-- Header -->
    <header class="w3-panel w3-center w3-opacity" style="padding:128px 16px">
        <h1 class="w3-xlarge">make your day</h1>
        <h1>KAFE</h1>

        <div class="w3-padding-32">
            <div class="w3-bar">
                <a href="#" class="w3-bar-item w3-button">Home</a>
                <a href="#" class="w3-bar-item w3-button w3-light-grey">Invoice</a>
                <a href="#" class="w3-bar-item w3-button">Contact</a>
                <a href="#" class="w3-bar-item w3-button w3-hide-small">Location</a>
            </div>
        </div>
    </header>

    <!-- Photo Grid -->

    <div class="w3-row-padding w3-grayscale" style="margin-bottom:128px">
      <div class="w3-half">
          <form action="${pageContext.request.contextPath}/serv.do">
              <input type="submit">
          </form>
      </div>
        <div class="w3-half">

        </div>

    </div>

    <!-- End Page Content -->
</div>

<!-- Footer -->
<footer class="w3-container w3-padding-64 w3-light-grey w3-center w3-large">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
    <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank" class="w3-hover-text-green">w3.css</a></p>
</footer>


</body></html>

