package com.a6studios.aid4college;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseUser;

public class SignIn extends AppCompatActivity {
    private EditText mEmail;
    private EditText mPassword;
    private Button mSignin;
    private ProgressDialog mSigninPD;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mEmail = (EditText) findViewById(R.id.sign_in_email);
        mPassword = (EditText) findViewById(R.id.sign_in_password);
        mSignin = (Button) findViewById(R.id.sign_in_button);

        mAuth = FirebaseAuth.getInstance();

        mSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_mEmail = mEmail.getText().toString().trim();
                String str_mPassword = mPassword.getText().toString().trim();
                signIn(str_mEmail,str_mPassword);
            }
        });
    }
    public void signIn(final String e,final String p){
        mAuth.signInWithEmailAndPassword(e, p)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            if(mAuth.getCurrentUser().isEmailVerified()) {
                                Intent mIntent = new Intent(SignIn.this, MainActivity.class);
                                mIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(mIntent);
                                finish();
                            }
                            else {
                                mAuth.signOut();
                                Toast.makeText(SignIn.this,"A verification link has been sent to your Email ID.Click it and Sign In the App.",Toast.LENGTH_LONG).show();
                            }
                        } else {
                            // If sign in fails, display a message to the user.
                            try{
                                throw task.getException();
                            }
                            catch (FirebaseAuthInvalidUserException e){
                                Toast.makeText(SignIn.this,"User with this EMail id doesn't exist! You might want to Register via Sign Up",Toast.LENGTH_LONG);
                                mEmail.setError("Email ID not Registered!");
                                mEmail.requestFocus();
                                mPassword.getText().clear();
                            }
                            catch(FirebaseAuthInvalidCredentialsException e){
                                mPassword.setError("Wrong Password!");
                                mPassword.requestFocus();
                            }
                            catch(Exception e){
                                Toast.makeText(SignIn.this,"Sign in failed.",Toast.LENGTH_LONG);

                            }


                        }

                        // ...
                    }
                });
    }
}
