package com.mimaraslan.message.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginForm {
    //@NotBlank
    @Size(min=3, max = 60)
    private String username;

    //@NotBlank
    @Size(max = 128)
    @Email
    private String email;
    
    @NotBlank
    @Size(min = 3, max = 32)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}