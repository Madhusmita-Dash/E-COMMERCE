$(document).ready(function() {
  // Form validation
  $("#formvalidate").validate({
    rules: {
      fname: {
        required: true,
      },
      lname: {
        required: true,
      },
      email: {
        required: true,
        email: true
      },
      phone: {
        required: true,
        minlength: 10,
        maxlength: 15,
        digits: true
      },
      password: {
        required: true,
        minlength: 6
      },
      confirmpassword: {
        required: true,
        minlength: 6,
        equalTo: "#userPassword"
      }
    },
    messages: {
      fname: {
        required: "Please enter your first name",
      },
      lname: {
        required: "Please enter your last name",
      },
      email: {
        required: "Please enter your email",
        email: "Please enter a valid email address"
      },
      phone: {
        required: "Please enter your phone number",
        minlength: "Phone number must be at least 10 digits",
        maxlength: "Phone number must be no more than 15 digits",
        digits: "Please enter a valid phone number"
      },
      password: {
        required: "Please provide a password",
        minlength: "Your password must be at least 6 characters long"
      },
      confirmpassword: {
        required: "Please confirm your password",
        minlength: "Your password confirmation must be at least 6 characters long",
        equalTo: "Passwords do not match"
      }
    },
    submitHandler: function(form) {
      // Log form data before submission
      console.log($(form).serialize());
      alert("Form submitted successfully!");
      form.submit();
    }
  });
});
