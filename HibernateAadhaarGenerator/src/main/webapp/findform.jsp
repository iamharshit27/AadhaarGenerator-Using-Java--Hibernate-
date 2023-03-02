<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Find Aadhaar</title>

    <style>
        .form-container {
  max-width: 500px;
  margin: 100px auto;
}

form {
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: #fff;
  padding: 30px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}

h2 {
  text-align: center;
  margin-bottom: 30px;
}

label {
  font-size: 16px;
  font-weight: 700;
  margin-bottom: 10px;
}

input[type="text"] {
  width: 100%;
  padding: 12px 15px;
  border-radius: 4px;
  border: 1px solid #ccc;
  font-size: 16px;
  margin-bottom: 20px;
}

input[type="submit"] {
  background-color: #4caf50;
  color: #fff;
  border: none;
  border-radius: 4px;
  padding: 12px 15px;
  font-size: 16px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
  background-color: #3e8e41;
}

    </style>
</head>
<body>
    <div class="form-container">
        <h2>View Aadhaar By Aadhaar Number</h2>
        <form action="FindUser">
          <label for="aadhaarnumber">Aadhaar NO:</label>
          <input type="text" id="aadhaarnumber" name="aadhaarnumber" required>
          <input type="submit" value="View">
        </form>
      </div>
</body>
</html>