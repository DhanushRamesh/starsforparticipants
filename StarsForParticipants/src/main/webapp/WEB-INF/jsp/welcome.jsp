<!DOCTYPE html>

<html lang="en" dir="ltr">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>

  <meta charset="utf-8">



  <title></title>

  <style media="screen">
    @import url(https://fonts.googleapis.com/css?family=Open+Sans:400,700);

    html {

      height: 100%;

    }

    h1 {

      font-family: serif;

      text-align: center;

      font-weight: 700;

      font-size: 2.5rem;

      line-height: 1.25;

      letter-spacing: -.05rem;
      padding-bottom: 30px;




    }

    body {

      /* background:

        -webkit-linear-gradient(rgba(5, 610, 255, 0.4), rgba(135, 60, 255, 0.0) 80%),

        -webkit-linear-gradient(-45deg, rgba(120, 155, 255, 0.9) 25%, rgba(255, 160, 65, 0.9) 76%); */

    }

    .cf:before,
    .cf:after {

      content: " ";

      display: table;

    }

    .cf:after {

      clear: both;

    }

    .cf {

      *zoom: 1;

    }

    .menu {

      list-style: none;

      margin: 50px auto;

      width: 800px;

      width: -moz-fit-content;

      width: -webkit-fit-content;

      width: fit-content;

    }

    .menu>li {

      background: #34495e;

      float: left;

      position: relative;

      -webkit-transform: skewX(25deg);

    }

    .menu a {

      display: block;

      color: #fff;

      text-transform: uppercase;

      text-decoration: none;

      font-family: Arial, Helvetica;

      font-size: 14px;

    }

    .menu li:hover {

      background: #e74c3c;

    }

    .menu>li>a {

      -webkit-transform: skewX(-25deg);

      padding: 1em 2em;

    }

    /* Dropdown */

    .submenu {

      position: absolute;

      width: 200px;

      left: 50%;

      margin-left: -100px;

      -webkit-transform: skewX(-25deg);

      -webkit-transform-origin: left top;

    }

    .submenu li {

      background-color: #34495e;

      position: relative;

      overflow: hidden;

    }

    .submenu>li>a {

      padding: 1em 2em;

    }

    .submenu>li::after {

      content: '';

      position: absolute;

      top: -125%;

      height: 100%;

      width: 100%;

      box-shadow: 0 0 50px rgba(0, 0, 0, .9);

    }

    /* Odd stuff */

    .submenu>li:nth-child(odd) {

      -webkit-transform: skewX(-25deg) translateX(0);

    }

    .submenu>li:nth-child(odd)>a {

      -webkit-transform: skewX(25deg);

    }

    .submenu>li:nth-child(odd)::after {

      right: -50%;

      -webkit-transform: skewX(-25deg) rotate(3deg);

    }

    /* Even stuff */

    .submenu>li:nth-child(even) {

      -webkit-transform: skewX(25deg) translateX(0);

    }

    .submenu>li:nth-child(even)>a {

      -webkit-transform: skewX(-25deg);

    }

    .submenu>li:nth-child(even)::after {

      left: -50%;

      -webkit-transform: skewX(25deg) rotate(3deg);

    }

    /* Show dropdown */

    .submenu,
    .submenu li {

      opacity: 0;

      visibility: hidden;

    }

    .submenu li {

      transition: .2s ease -webkit-transform;

    }

    .menu>li:hover .submenu,
    .menu>li:hover .submenu li {

      opacity: 1;

      visibility: visible;

    }

    .menu>li:hover .submenu li:nth-child(even) {

      -webkit-transform: skewX(25deg) translateX(15px);

    }

    .menu>li:hover .submenu li:nth-child(odd) {

      -webkit-transform: skewX(-25deg) translateX(-15px);

    }

    :root {
      --background-dark: #2d3548;
      --text-light: rgba(255, 255, 255, 0.6);
      --text-lighter: rgba(255, 255, 255, 0.9);
      --spacing-s: 8px;
      --spacing-m: 16px;
      --spacing-l: 24px;
      --spacing-xl: 32px;
      --spacing-xxl: 64px;
      --width-container: 1200px;
    }

    * {
      border: 0;
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }

    html {
      height: 100%;
      font-family: 'Montserrat', sans-serif;
      font-size: 14px;
      background: -webkit-linear-gradient(rgba(5, 610, 255, 0.4), rgba(135, 60, 255, 0.0) 80%),

        -webkit-linear-gradient(-45deg, rgba(120, 155, 255, 0.9) 25%, rgba(255, 160, 65, 0.9) 76%);
    }

    body {
      height: 100%;
    }

    .hero-section {
      align-items: flex-start;
      /* background: -webkit-linear-gradient(rgba(5, 610, 255, 0.4), rgba(135, 60, 255, 0.0) 80%),

        -webkit-linear-gradient(-45deg, rgba(120, 155, 255, 0.9) 25%, rgba(255, 160, 65, 0.9) 76%); */
      display: flex;
      min-height: 10%;
      justify-content: center;
      padding: 30px 30px 30px 30px;

    }

    .card-grid {
      display: grid;
      grid-template-columns: repeat(1, 1fr);
      grid-column-gap: var(--spacing-l);
      grid-row-gap: var(--spacing-l);
      max-width: var(--width-container);
      width: 100%;
    }

    @media(min-width: 540px) {
      .card-grid {
        grid-template-columns: repeat(2, 1fr);
      }
    }

    @media(min-width: 960px) {
      .card-grid {
        grid-template-columns: repeat(4, 1fr);
      }
    }

    .card {
      list-style: none;
      position: relative;
    }

    .card:before {
      content: '';
      display: block;
      padding-bottom: 150%;
      width: 100%;
    }

    .card__background {
      background-size: cover;
      background-position: center;
      border-radius: var(--spacing-l);
      bottom: 0;
      filter: brightness(0.75) saturate(1.2) contrast(0.85);
      left: 0;
      position: absolute;
      right: 0;
      top: 0;
      transform-origin: center;
      trsnsform: scale(1) translateZ(0);
      transition:
        filter 200ms linear,
        transform 200ms linear;
    }

    .card:hover .card__background {
      transform: scale(1.05) translateZ(0);
    }

    .card-grid:hover>.card:not(:hover) .card__background {
      filter: brightness(0.5) saturate(0) contrast(1.2) blur(20px);
    }

    .card__content {
      left: 0;
      padding: var(--spacing-l);
      position: absolute;
      top: 0;
    }

    .card__category {
      color: var(--text-light);
      font-size: 0.9rem;
      margin-bottom: var(--spacing-s);
      text-transform: uppercase;
    }

    .card__heading {
      color: var(--text-lighter);
      font-size: 1.9rem;
      text-shadow: 2px 2px 20px rgba(0, 0, 0, 0.2);
      line-height: 1.4;
      word-spacing: 100vw;
    }
  </style>

</head>

<body>
<c:set var="context" value="${pageContext.request.contextPath}"></c:set>
  <ul class="menu cf">

    <li><a href="#">Home</a></li>

    <li>

      <a href="${context}/showlogin">Login</a>

      <ul class="submenu">

        <li><a href="${context}/showlogin">Trainer Login</a></li>

        <li><a href="${context}/showlogin">Trainee Login</a></li>

        <li><a href="${context}/showlogin">AdminLogin</a></a></li>

      </ul>

    </li>

    <li>

      <a href="${context}/register">Register</a>

      <ul class="submenu">

        <li><a href="${context}/register">Teach with us </a></li>

        <li><a href="${context}/register">Learn with us</a></li>

      </ul>

    </li>



    <li><a href="${context}/aboutUs"> About Us </a>
</li>

  </ul>

  <h1>Learn anything with us, According to your schedule</h1>
</body>

<section class="hero-section">
  <div class="card-grid">
    <a class="card" href="${context}/showlogin">
      <div class="card__background" style="background-image: url(https://images.unsplash.com/photo-1515879218367-8466d910aaa4?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80)"></div>
      <div class="card__content">
        <p class="card__category">Education</p>
        <h3 class="card__heading">Learn to code</h3>
      </div>
    </a>
    <a class="card" href="${context}/showlogin">
      <div class="card__background" style="background-image: url(https://images.unsplash.com/photo-1460925895917-afdab827c52f?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=702&q=80)"></div>
      <div class="card__content">
        <p class="card__category">Education</p>
        <h3 class="card__heading">Learn Data Science</h3>
      </div>
    </a>
    <a class="card" href="${context}/showlogin">
      <div class="card__background"
        style="background-image: url(https://images.unsplash.com/photo-1616161560417-66d4db5892ec?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDF8fGFydGlmaWNpYWwlMjBpbnRlbGxpZ2VuY2V8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60)"></div>
      <div class="card__content">
        <p class="card__category">Education</p>
        <h3 class="card__heading">Learn AI</h3>
      </div>
      </li>
      <a class="card" href="${context}/register">
        <div class="card__background" style="background-image: url(https://images.unsplash.com/photo-1554415707-6e8cfc93fe23?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80)"></div>
        <div class="card__content">
          <p class="card__category">Teach</p>
          <h3 class="card__heading">Teach with us</h3>
        </div>
      </a>
      <div>
</section>

</html>
