package com.login.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private static final String TAG = "SignUpActivity";

    private EditText txtEmail, txtPassword, txtRePassword, txtFullname, txtBirth, txtPhone;
    private Button btnSubmit;
    private View[] view;

    ValidationActivity validation = new ValidationActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txtEmail = findViewById(R.id.txt_email);
        txtPassword = findViewById(R.id.txt_password);
        txtRePassword = findViewById(R.id.txt_repassword);
        txtFullname = findViewById(R.id.txt_fullname);
        txtBirth = findViewById(R.id.txt_birth);
        txtPhone = findViewById(R.id.txt_phone);

        btnSubmit = findViewById(R.id.btn_signup);
    }

    public void submitSignUp(View v) {
        view = new View[]{txtEmail, txtPassword, txtRePassword, txtFullname, txtBirth, txtPhone};

        if(validation.isNullOrEmpty(view) || validation.isEmailValid(txtEmail) || validation.isMatchPassword(txtPassword, txtRePassword)) {
            Toast.makeText(this, "There is Error!", Toast.LENGTH_SHORT).show();
        }
        else {
            refresh();
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }

    private void refresh() {
        txtEmail.setText("");
        txtPassword.setText("");
        txtRePassword.setText("");
        txtFullname.setText("");
        txtBirth.setText("");
        txtPhone.setText("");
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
