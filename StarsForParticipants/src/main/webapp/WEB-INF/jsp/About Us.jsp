<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  margin: 8px;
}

.about-section {
  padding: 50px;
  text-align: center;
  background-color: #474e5d;
  color: white;
  font-family: Georgia, serif;
  
}

.container {
  padding: 0 16px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
}

.button:hover {
  background-color: #555;
}

@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}
</style>
</head>
<body>

<div class="about-section">
  <h1>About Us</h1>
  <h2>Who said learning is not fun?We will show you what learning is!Sit back and have fun while you learn!!</h2>
  <h2>Take the best courses online with Experienced Trainers Worldwide at just one click</h2>
  <h2>Your potential is our passion!Don't just watch,LEARN!</h2>
</div>

<h2 style="text-align:center">Our Team</h2>
<div class="row">
  <div class="column">
    <div class="card">
      <div class="container">
        <h2>Nivetha M S</h2>
        <p class="title">Designer</p>
        <p>Hello, This is Nivetha M S designer of DASANI INSTITUTE!Hope you like our Platform!Have a Great Learning!!</p>
        <p>nivetha.ms99@gmail.com</p>
        <p>Contact:7708665181</p>
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <div class="container">
        <h2>Saraswathy AR</h2>
        <p class="title">Designer</p>
        <p>Hello, This is Saraswathy AR designer of DASANI INSTITUTE. We wish your learning will be as smooth as our platform!!</p>
        <p>arsaraswathy25@gmail.com</p>
        <p>Contact:7708360965</p>
      </div>
    </div>
  </div>
  
  <div class="column">
    <div class="card">
      <div class="container">
        <h2>Dhanush Ramesh</h2>
        <p class="title">Designer</p>
        <p>Hello, This is Dhanush Ramesh designer of DASANI INSTITUTE. Feel free to contact our team in case of any technical issues!</p>
        <p>rjdhanush22@gmail.com</p>
        <p>Contact:7358278893</p>
      </div>
    </div>
  </div>
</div>

</body>
</html>
