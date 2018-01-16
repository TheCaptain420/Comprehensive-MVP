package com.ashokslsk.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ashokslsk.mvpexample.model.SigninPresenterImpl;
import com.ashokslsk.mvpexample.presenter.SigninPresenter;
import com.ashokslsk.mvpexample.view.SigninView;

public class MainActivity extends AppCompatActivity implements SigninView {

    private SigninPresenter signinPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signinPresenter = new SigninPresenterImpl(MainActivity.this);
        signinPresenter.signIn("ashok","groovy");

    }

    @Override
    public void showValidationError() {
        Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_LONG).show();
    }

    @Override
    public void signInSuccess() {
        Toast.makeText(MainActivity.this, "Signin success", Toast.LENGTH_LONG).show();

    }

    @Override
    public void signInError() {
        Toast.makeText(MainActivity.this, "Signin failed--- Invalid credentials", Toast.LENGTH_LONG).show();

    }
}
