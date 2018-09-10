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
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;

public class RegisterUser extends AppCompatActivity {

    private EditText mName;
    private EditText mEmail;
    private EditText mPassword;
    private EditText mRPassword;
    private Button mRegister;
    private ProgressDialog mRegPD;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        mName = (EditText)findViewById(R.id.register_user_name);
        mEmail = (EditText)findViewById(R.id.register_user_email);
        mPassword = (EditText)findViewById(R.id.register_user_password);
        mRPassword = (EditText)findViewById(R.id.register_user_password_verify);
        mRegister = (Button)findViewById(R.id.register_user_button);
        mAuth = FirebaseAuth.getInstance();
        mRegPD = new ProgressDialog(this);

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_mName = mName.getText().toString();
                String str_mEmail = mEmail.getText().toString();
                String str_mPassword = mPassword.getText().toString();
                String str_mRPassword = mRPassword.getText().toString();
                mRegPD.setTitle("Registering User");
                mRegPD.setMessage("Please wait while we register you.");
                mRegPD.setCanceledOnTouchOutside(false);
                mRegPD.show();
                registerUser(str_mName,str_mEmail,str_mPassword);

            }
        });


    }
    public void registerUser(final String n,final String e,final String p){
        mAuth.createUserWithEmailAndPassword(e, p)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            mRegPD.dismiss();
                            verifyEmail();
//                            if(verifyEmail()) {
//                                mAuth.signOut();
//                                Toast.makeText(RegisterUser.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
//                                Intent mIntent = new Intent(RegisterUser.this, SignIn.class);
//                                mIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
//                                startActivity(mIntent);
//                                finish();
//                            }
                        } else {
                            // If sign in fails, display a message to the user.
                            mRegPD.hide();
                            String s="Registration Failed";
                            try {
                                throw task.getException();
                            } catch(FirebaseAuthWeakPasswordException e) {
                                mPassword.setError("Weak Password!");
                                mPassword.requestFocus();
                                Toast.makeText(RegisterUser.this, "Weak Password!.",
                                        Toast.LENGTH_SHORT).show();
                                mRPassword.setText(mRPassword.getHint().toString());
                            } catch(FirebaseAuthInvalidCredentialsException e) {
                                mEmail.setError("Error : Invalid EMail!");
                                Toast.makeText(RegisterUser.this, "Invalid EMail.",
                                        Toast.LENGTH_SHORT).show();
                                mEmail.requestFocus();
                            } catch(FirebaseAuthUserCollisionException e) {
                                mEmail.setError("Error : User Already Exists!");
                                Toast.makeText(RegisterUser.this, "User Already Exists. Please Login",
                                        Toast.LENGTH_SHORT).show();
                                mEmail.requestFocus();
                            } catch(Exception e) {
                                s = "Registration Failed ! \n" + e;
                            }
                            Toast.makeText(RegisterUser.this, s,Toast.LENGTH_LONG).show();
                            Log.e("FERROR ***********",s);
                        }

                        // ...
                    }
                });
    }

    void verifyEmail(){

        final FirebaseUser user = mAuth.getCurrentUser();
        final ProgressDialog mpd = new ProgressDialog(this);
        mpd.setTitle("Email Verification");
        mpd.setMessage("A verification link has been sent to your Email ID.Click it and Sign In the App.");
        mpd.show();
        user.sendEmailVerification()
                .addOnCompleteListener(this, new OnCompleteListener() {
                    @Override
                    public void onComplete(@NonNull Task task) {
                       if (task.isSuccessful()) {
                            Toast.makeText(RegisterUser.this,
                                    "Verification email sent to " + user.getEmail(),
                                    Toast.LENGTH_SHORT).show();
                            mpd.dismiss();

                           mAuth.signOut();
                           //Toast.makeText(RegisterUser.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                           Intent mIntent = new Intent(RegisterUser.this, SignIn.class);
                           mIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                           startActivity(mIntent);
                           finish();

                        } else {
                            Log.e("FERROR*****", "sendEmailVerification", task.getException());
                            Toast.makeText(RegisterUser.this,
                                    "Failed to send verification email.",
                                    Toast.LENGTH_SHORT).show();
                            mpd.hide();
                        }

                    }
                });
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }
}
