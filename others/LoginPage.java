/**
package com.example.alan.lahacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginPage extends AppCompatActivity {

//    private TextView mEmailPromptTextView;
//    private TextView mPasswordPromptTextView;
    private EditText mEmailField;
    private EditText mPasswordField;
    private Button createAccountButton;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
//        mEmailPromptTextView = (TextView)findViewById(R.id.emailPrompt);
//        mPasswordPromptTextView = (TextView)findViewById(R.id.passwordPrompt);
        mEmailField = (EditText)findViewById(R.id.emailTextBox);
        mPasswordField = (EditText)findViewById(R.id.passwordTextBox);
        createAccountButton = (Button)findViewById(R.id.createAccButton);
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // When the create acc button is clicked
                Log.d("ONCLICK", "onClick() is being executed!");
                createAccount(mEmailField.toString(), mPasswordField.toString());
            }
        });

        mAuth = FirebaseAuth.getInstance();

    }



    @Override
    public void onStart() {
        super.onStart();
        Log.d("ONSTART", "onStart() is being executed!");
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    public void createAccount (String email, String password) {
        // set up validation here
        if (email.contains("@") && email.length() >= 5) {
            // Email does contain @ symbol & has all necessary chars
            if (email.charAt(email.length() - 4) == ('.')
                    && email.charAt(email.length() - 3) == ('c') &&
                    email.charAt(email.length() - 2) == ('o') &&
                    email.charAt(email.length() - 1) == ('m')) {
                // If email is valid format
                if (password.length() >= 6) {
                    // If password is valid length
                    mAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Log.d("CREATION", "createAccount() is being executed!");
                                // Sign in success, update UI with the signed-in user's information
                                //Log.d(TAG, "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                updateUI(user);
                            } else {
                                Log.d("FAILEDCREATION", "createAccount() failed!");
                                // If sign in fails, display a message to the user.
                                // Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                //Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
                                //        Toast.LENGTH_SHORT).show();
                                updateUI(null);
                            }
                        }
                    });
                }
            }
        }
        else {
            updateUI(null);
        }
    }
    //public void signIn(String email, String password) {
    //    mAuth.
    //}

    public void toButtonMenu(View view) {
        Intent startNewActivity = new Intent(this, ButtonMenu.class);
        startActivity(startNewActivity);
    }
    private void updateUI(FirebaseUser user) {
        //hideProgressDialog();
        if (user != null) {
            // Success
            Log.d("SUCCESS", "YAS BITCH!");
        }
    }
}
*/