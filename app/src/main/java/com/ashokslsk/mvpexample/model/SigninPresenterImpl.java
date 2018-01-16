package com.ashokslsk.mvpexample.model;


import com.ashokslsk.mvpexample.presenter.SigninPresenter;
import com.ashokslsk.mvpexample.view.SigninView;

/**
 * Created by ashok.kumar on 22/07/17.
 */

public class SigninPresenterImpl implements SigninPresenter{

    private SigninView signinView;

    public SigninPresenterImpl(SigninView signinView) {
        this.signinView = signinView;
    }

    @Override
    public void signIn(String userName, String passWord) {

        if (userName.isEmpty() && passWord.isEmpty()){
            signinView.showValidationError();
        }else{
            if(userName.equalsIgnoreCase("ashok") && passWord.equalsIgnoreCase("groovy")){
                signinView.signInSuccess();
            }else{
                signinView.signInError();
            }
        }
    }
}
