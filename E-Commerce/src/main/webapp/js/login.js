// Wait for the DOM to load
$(document).ready(function() {

  // Form validation
  $("#formvalidate").validate({
    rules: {
      email: {
        required: true,
        email: true
      },
      password: {
        required: true,
        minlength: 6
      }
    },
    messages: {
      email: {
        required: "Please enter your email",
        email: "Please enter a valid email address"
      },
      password: {
        required: "Please provide a password",
        minlength: "Your password must be at least 6 characters long"
      }
    },
    submitHandler: function(form) {
      // Simulate a successful login (You would typically handle authentication here)
      alert("Login successful!");

      // Redirect to the home page
      window.location.href = "index.jsp"; // Change this to your actual home page URL
    }
  });
});
