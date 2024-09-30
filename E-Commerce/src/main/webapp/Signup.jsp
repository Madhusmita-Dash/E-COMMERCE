<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Signup</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
  
    <link rel="stylesheet" href="CSS/signup.css" type="text/css">

</head>
<body>
<!-- partial:index.partial.html -->
<div class="logo text-center">
  <h1>Sign-Up</h1>
</div>
<div class="wrapper">
  <div class="inner-warpper text-center">
    <h2 class="title">Sign-up to be a new member at Men'skart</h2>
    <form action="Registration" method="get" id="formvalidate">
<div class="container">

<div class="input-group">
        <label class="palceholder" for="userName">First name</label>
        <input class="form-control" name="fname" id="userName" type="text" placeholder="" />
        <span class="lighting"></span>
      </div>
      
      <div class="input-group">
        <label class="palceholder" for="userName">Last name</label>
        <input class="form-control" name="lname" id="userName" type="text" placeholder="" />
        <span class="lighting"></span>
      </div>
      
    <div class="input-group">
    <label class="placeholder" for="userEmail">e-mail</label>
    <div class="input-wrapper">
        <input class="form-control" name="email" id="userEmail" type="text" placeholder="" />
    </div>
    <span class="lighting"></span>
</div>

      <div class="input-group">
        <label class="palceholder" for="userName">User Name</label>
        <input class="form-control" name="username" id="userName" type="text" placeholder="" />
        <span class="lighting"></span>
      </div>
      <div class="input-group">
        <label class="palceholder" for="userPassword">Password</label>
        <input class="form-control" name="password" id="userPassword" type="password" placeholder="" />
        <span class="lighting"></span>
      </div>
   
</div>              

      <button type="submit" id="login">Signup</button>
      
    </form>
  </div>
 
</div>

<!-- you don't need that :)  -->
<div class="direction">
  Welcome! to Men'skart.
</div>
<!-- partial -->
  <script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.15.0/jquery.validate.min.js'>

<script src="js/signup.js"></script>

</body>
</html>
