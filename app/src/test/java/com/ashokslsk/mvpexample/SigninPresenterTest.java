package com.ashokslsk.mvpexample;

import com.ashokslsk.mvpexample.model.SigninPresenterImpl;
import com.ashokslsk.mvpexample.view.SigninView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by ashok on 17/01/18.
 */

@RunWith(MockitoJUnitRunner.class)
public class SigninPresenterTest {

    @Mock
    SigninView view;

    @Mock
    SigninPresenterImpl presenterimpl;

    @Before
    public void setUp() throws Exception {
        presenterimpl = new SigninPresenterImpl(view);
    }

    @Test
    public void shouldFailToSignInIfNoUserName() throws Exception{
        presenterimpl.signIn("","");
        presenterimpl.signIn("","");
        verify(view, times(2)).showValidationError();
    }

    @Test
    public void shouldSigninWhenWePassAlltheData()throws Exception{
        presenterimpl.signIn("ashok","groovy");
        verify(view).signInSuccess();
    }

}
