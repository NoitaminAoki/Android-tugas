package com.login.tugas;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText txtEmail, txtPassword;
    private Button btnSignin;
    private View[] view;

    ValidationActivity validation = new ValidationActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = findViewById(R.id.txt_email);
        txtPassword = findViewById(R.id.txt_password);
    }

    public void signIn(View v) {

        View[] view = new View[]{txtEmail, txtPassword};

        if(validation.isNullOrEmpty(view) || validation.isEmailValid(txtEmail)) {
            Toast.makeText(this, "There is error!",Toast.LENGTH_SHORT).show();
        }
        else{
            refresh();
            Intent i = new Intent(this, DashboardActivity.class);
            startActivity(i);
        }

    }

    public void signUp(View v) {
        refresh();
        Intent i = new Intent(this, SignUpActivity.class);
        startActivity(i);
    }

    public void refresh() {
        txtEmail.setText("");
        txtPassword.setText("");
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
