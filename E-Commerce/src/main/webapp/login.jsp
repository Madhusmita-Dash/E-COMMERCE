<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Login Form with JavaScript Validation</title>
  <link rel="stylesheet" href="CSS/login.css" type="text/css">
</head>
<body>

<div class="container">
  <!-- Image Section -->
  <div class="image-section">
    <img src="img/ecom.png" alt="Ecom Image">
  </div>

  <!-- Form Section -->
  <div class="form-section">
    <div class="logo text-center mb-4">
      <h1>Login</h1> <!-- Updated title to Login -->
    </div>
    <div class="inner-wrapper text-center"> <!-- Corrected typo in the class name -->
      <h2 class="title">Welcome back! Please log in to your account.</h2> <!-- Updated subtitle -->
      <form action="Registration" method="get" id="formvalidate">
        <div class="input-group">
          <label class="placeholder" for="email">Email</label>
          <input class="form-control" name="email" id="email" type="email" placeholder="Enter your email" required /> <!-- Added placeholder -->
        </div>
        <div class="input-group">
          <label class="placeholder" for="userPassword">Password</label>
          <input class="form-control" name="password" id="userPassword" type="password" placeholder="Enter your password" required /> <!-- Added placeholder -->
        </div>
        <button type="submit" id="login">Login</button>
        <div class="supporter">
          <div class="remember-me">
            <input id="rememberMe" type="checkbox">
            <label for="rememberMe">Remember Me</label>
          </div>
          <a class="forgot" href="#">Forgot Password?</a>
        </div>
      </form>
    </div>
    <div class="signup-wrapper text-center">
      <a href="Signup.jsp">Don't have an account? <span class="text-primary">Create One</span></a>
    </div>
  </div>
</div>

<!-- JavaScript Files -->
<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.15.0/jquery.validate.min.js'></script>
<script src="js/login.js"></script>

</body>
</html>
