package com.a6studios.aid4college;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginStart extends AppCompatActivity {
    private Intent mIntent;
    private TextView mTextEmail;
    private TextView mTextSocial;
    private LinearLayout mLayout;
    private Button signin;
    private Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_start);
        mTextEmail = (TextView)findViewById(R.id.login_start_email);
        mTextSocial = (TextView)findViewById(R.id.social);
        mLayout = (LinearLayout)findViewById(R.id.login_start_3p);
        signin = (Button)findViewById(R.id.login_start_SignIn);
        signup = (Button)findViewById(R.id.login_start_SignUp);
    }

    public void ClickListner(View v)
    {
        int viewId = v.getId();
        switch(viewId){
            case R.id.login_start_SignIn :
                mIntent = new Intent(LoginStart.this,SignIn.class);
                startActivity(mIntent);
                break;
            case R.id.login_start_SignUp :
                mIntent = new Intent(LoginStart.this,RegisterUser.class);
                startActivity(mIntent);
                break;
            case R.id.login_start_email :
                mLayout.setVisibility(View.INVISIBLE);
                mTextEmail.setVisibility(View.INVISIBLE);
                signin.setVisibility(View.VISIBLE);
                signup.setVisibility(View.VISIBLE);
                mTextSocial.setVisibility(View.VISIBLE);
                break;
            case R.id.social :
                mLayout.setVisibility(View.VISIBLE);
                mTextEmail.setVisibility(View.VISIBLE);
                signin.setVisibility(View.INVISIBLE);
                signup.setVisibility(View.INVISIBLE);
                mTextSocial.setVisibility(View.INVISIBLE);
                break;


        }
    }
}
