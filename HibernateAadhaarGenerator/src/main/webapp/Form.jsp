<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="stylesheet/Style.css" />
    <title>Document</title>
  </head>
  <body>
    <div class="form" >
      <div class="header-text"><h3>Enter Your Aadhaar Details</h3></div>
      <div class="mainform">
        <form action="AadSave" enctype='multipart/form-data' method="post">
          <label for="text">Enter Your 12 Digit Aadhaar Number</label>
          <input type="number" id="number" name="number" />

          <label for="name">Name</label>
          <input type="text" id="name" name="name" />

          <label for="dob">DOB</label>
          <input type="date" id="dob" name="dob" />

          <label for="address">Address</label>
          <input type="text" id="address" name="address" />
            
            
           <label for="gender">Choose your Gender:</label>

           <select name="gender" id="gender">
             <option value="Male">Male</option>
             <option value="Female">Female</option>
             <option value="Other">Other</option>
           </select>
           
          <label for="photo">Choose Photo</label>
          <input type="file" id="photo" name="photo" />
          
          <div class="button">
          <input type="submit" value="Submit">
        </div>
        </form>
      </div>
    </div>
  </body>
</html>
