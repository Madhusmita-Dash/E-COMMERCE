<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Signup</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
  <link rel="stylesheet" href="CSS/signup.css" type="text/css">
</head>
<body>
<div class="container mt-5 p-5">
  <!-- Image Section -->
  <div class="col-md-6 p-5">
    <img alt="" src="img/ecom.png" width="100%" height="400px">
  </div>

  <!-- Form Section -->
  <div class="col-md-6 p-5">
    <div class="logo text-center mb-4">
      <h1>Sign-Up</h1>
    </div>

    <div class="wrapper">
      <div class="inner-warpper text-center">
        <h2 class="title">Sign-up to be a new member at Men'skart</h2>

        <!-- Signup Form -->
        <form action="Registration" method="get" id="formvalidate">
          <div class="container">
            <div class="input-group">
              <label class="palceholder" for="userLirstName">First name</label>
              <input class="form-control" name="firstname" id="firstname" type="text" placeholder="" required />
              <span class="lighting"></span>
            </div>

            <div class="input-group">
              <label class="palceholder" for="userLastName">Last name</label>
              <input class="form-control" name="lastname" id="userlastname" type="text" placeholder="" required />
              <span class="lighting"></span>
            </div>

            <div class="input-group">
              <label class="placeholder" for="userEmail">E-mail</label>
              <div class="input-wrapper">
                <input class="form-control" name="email" id="userEmail" type="email" placeholder="" required />
              </div>
              <span class="lighting"></span>
            </div>

            <div class="input-group">
              <label class="palceholder" for="userMobileno">Mobile No</label>
              <input class="form-control" name="mobileno" id="userMobile" type="tel" placeholder="" required pattern="\+?[0-9\s\-]{10,15}" />
              <span class="lighting"></span>
            </div>

            <div class="input-group">
              <label class="palceholder" for="userPassword">Password</label>
              <input class="form-control" name="password" id="userPassword" type="password" placeholder="" required minlength="6" />
              <span class="lighting"></span>
            </div>

            <div class="input-group">
              <label class="palceholder" for="userconfirmPassword">Confirm Password</label>
              <input class="form-control" name="confirmpassword" id="userconfirmPassword" type="password" placeholder="" required minlength="6" equalTo="#userPassword" />
              <span class="lighting"></span>
            </div>

            <!-- Signup Button inside the form -->
            <button type="submit" id="Signup">Signup</button>
          </div>
        </form>
      </div>

      <!-- Link to Login Page -->
      <div class="signup-wrapper text-center">
        <a href="login.jsp">Already have an account? <span class="text-primary">Log in</span></a>
      </div>
    </div>
  </div>

  <!-- Scripts -->
  <script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.15.0/jquery.validate.min.js'></script>
  <script src="js/signup.js"></script>
</div>
</body>
</html>
