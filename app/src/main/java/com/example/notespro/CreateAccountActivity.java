package com.example.notespro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CreateAccountActivity extends AppCompatActivity {

    EditText emailEdittext,passwordEditText,confirmPasswordEdittext;
    Button createAccountBtn;
    ProgressBar progressBar;
    TextView loginBtnTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account2);

        emailEdittext = findViewById(R.id.email_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        confirmPasswordEdittext = findViewById(R.id.confirm_password_edit_text);
        createAccountBtn = findViewById(R.id.create_account_btn);
        progressBar = findViewById(R.id.progress_bar);
        loginBtnTextView = findViewById(R.id.login_text_view_btn);

        createAccountBtn.setOnClickListener(view -> createAccount());
        loginBtnTextView.setOnClickListener(view -> finish());
    }

    void createAccount(){
        String email = emailEdittext.getText().toString();
        String password = passwordEditText.getText().toString();
        String confirmPassword = confirmPasswordEdittext.getText().toString();

        boolean isValidated= validateData(email,password,confirmPassword);
        if(!isValidated){
            return;
        }

        createAccountIntFirebase(email,password);


    }
    void createAccountIntFirebase(String email,String password){
        changeInProgress(true);

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(CreateAccountActivity.this,
                new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        changeInProgress(false);
                        if(task.isSuccessful()){
                            Utility.showToast(CreateAccountActivity.this,"Successfully create account ,Check email to verify");
                            firebaseAuth.getCurrentUser().sendEmailVerification();
                            firebaseAuth.signOut();
                            finish();
                        }else{
                            Utility.showToast(CreateAccountActivity.this, task.getException().getLocalizedMessage());

                        }
                    }
                });

    }

    void changeInProgress(boolean inProgress){
        if (inProgress){
            progressBar.setVisibility(View.GONE);
            createAccountBtn.setVisibility(View.VISIBLE);
        }
    }

    boolean validateData(String email,String password,String confirmPassword){

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailEdittext.setError("Email is invalid");
            return false;
            
        }
        if(password.length()<6){
            passwordEditText.setError("Password length is invalid");
        }
        if(!password.equals(confirmPassword)){
            confirmPasswordEdittext.setError("Password not matched");
        }
        return true ;
    }
}