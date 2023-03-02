<%@page import="java.util.Base64"%>
<%@page import="com.harshit.model.AadhaarDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
  <head>
    <title>Aadhaar Card</title>
    <link rel="stylesheet" type="text/css" href="stylesheet/Style.css">
  </head>
  <body>

    <div class="card">
      <div class="header">
        <img src="image/lion.png" alt="Photo">
        <img src="image/gov.png" alt="Photo">
        <img src="image/adhar.png" alt="Photo">
      </div>

<%
        AadhaarDetails aadhaar = new AadhaarDetails();
        aadhaar = (AadhaarDetails)session.getAttribute("aadhaar");
        
        String base64Data = Base64.getEncoder().encodeToString(aadhaar.getPhoto());
        String srcAttribute = "data:image/png;base64," + base64Data;
        %>
      <div class="personal-details">
        <div class="photo">
          <img src="<%=srcAttribute %>" alt="Photo">
        </div>
        
        <div class="info">
          <p class="name"><%=aadhaar.getName() %></p>
          <p class="dob"><%=aadhaar.getDob() %></p>
          <p class="gender"><%=aadhaar.getGender() %></p>
          <p class="address"><%=aadhaar.getAddress() %></p>
        </div>
        <div class="qr">
          <img src="image/qr.png" alt="Photo">
        </div>
      </div class="number">
      <h2 class="aadhaar-no"><%=aadhaar.getAadhaarNo() %></h2>
      <hr style="border-top: 2px solid red;">
      <div>
        <h2> मेरा <b style="color: red; font-family: 'Noto Sans', sans-serif;">आधार</b>, मेरी पहचान </h2>
      </div>
      
      </div>
      </div>
   <div class="footer">
    <h1 class="footer-text">Design And Develop By Harshit Kumar</h1>
   </div>
   
  </body>
</html>
