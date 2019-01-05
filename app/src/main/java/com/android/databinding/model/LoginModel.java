package com.android.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

import com.android.databinding.BR;

public class LoginModel extends BaseObservable {

    private String email;
    private String password;
    private String loginMessage;

    private String emailError;
    private String passwordError;

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Bindable
    public String getLoginMessage() {
        return loginMessage;
    }

    public void setLoginMessage(String loginMessage) {
        this.loginMessage = loginMessage;
    }

    @Bindable
    public String getEmailError() {
        return emailError;
    }

    public void setEmailError(String emailError) {
        this.emailError = emailError;
    }

    @Bindable
    public String getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }

    public void login(LoginModel loginModel) {
        if (TextUtils.isEmpty(loginModel.getEmail())) {
            updateEmailError("Email field cannot be empty");
            return;
        }
        if (TextUtils.isEmpty(loginModel.getPassword())) {
            updatePasswordError("Password field cannot be empty");
            return;
        }
        loginMessage = "Login Success!!!!";
        updateEmailError(null);
        updatePasswordError(null);
        notifyPropertyChanged(BR.loginMessage);
    }

    public void reset() {
        email = null;
        password = null;
        emailError = null;
        passwordError = null;
        notifyPropertyChanged(BR.email);
        notifyPropertyChanged(BR.password);
    }

    private void updateEmailError(String emailError) {
        this.emailError = emailError;
        notifyPropertyChanged(BR.emailError);
    }

    private void updatePasswordError(String passwordError) {
        this.passwordError = passwordError;
        notifyPropertyChanged(BR.passwordError);
    }
}
