package com.cub.cse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.SignInButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    EditText email,pass;

    ImageView login,loginMobile,register,reset;
    FirebaseAuth firebaseAuth;
    ProgressDialog progressDialog;

    private  static int RC_SIGN_IN =1000;
    private static final String EMAIL = "email";
    private static final String TAG = "hello";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.editTextTextEmailAddress);
        pass=findViewById(R.id.editTextTextPassword);
        login=findViewById(R.id.imageView3);

        firebaseAuth = FirebaseAuth.getInstance();

        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if(firebaseUser!=null){
            Intent intent =new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        }




        progressDialog = new ProgressDialog(LoginActivity.this);
        reset = findViewById(R.id.imageView5);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((email.getText().toString().length()<5)){
                    Toast.makeText(LoginActivity.this, "Please enter Correct Email: ",Toast.LENGTH_LONG).show();
                    return;
                }
                if((pass.getText().toString().isEmpty())){
                    Toast.makeText(LoginActivity.this, "Please enter Password: ",Toast.LENGTH_LONG).show();
                    return;
                }

                String email2=email.getText().toString();
                String password = pass.getText().toString();

                firebaseAuth.signInWithEmailAndPassword(email2,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                            Intent intent =new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);
                            finish();


                        }
                        else{
                            if(task.getException().toString().equals("com.google.firebase.FirebaseNetworkException: A network error (such as timeout, interrupted connection or unreachable host) has occurred.")){

                                Toast.makeText(LoginActivity.this, task.getException().toString(),Toast.LENGTH_LONG).show();


                            }


                        }


                    }
                });

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText resetMail = new EditText(v.getContext());
                final AlertDialog.Builder passwordResetDialog = new AlertDialog.Builder(v.getContext());
                passwordResetDialog.setTitle("Reset Password ?");
                passwordResetDialog.setMessage("Enter Your Email To Received Reset Link.");
                passwordResetDialog.setView(resetMail);

                passwordResetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // extract the email and send reset link
                        String mail = resetMail.getText().toString();
                        firebaseAuth.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(LoginActivity.this, "Reset Link Sent To Your Email.", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(LoginActivity.this, "Error ! Reset Link is Not Sent" + e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });

                    }
                });

                passwordResetDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // close the dialog
                    }
                });

                passwordResetDialog.create().show();
            }
        });

    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();

    }
}