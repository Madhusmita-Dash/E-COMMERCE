package com.ecommerce.model;

public class RegModel {
    private String firstname;
    private String lastname;
    private String email;
    private String mobileno;
    private String password;
    private String confirmpassword;

    // Constructor
    public RegModel(String firstname, String lastname, String email, String mobileno, String password, String confirmPassword) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobileno = mobileno;
        this.password = password;
        this.confirmpassword = confirmPassword;
    }

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setPhone(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	@Override
	public String toString() {
		return "RegModel [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", mobileno=" + mobileno
				+ ", password=" + password + ", confirmpassword=" + confirmpassword + "]";
	}
}

   