package com.login.tugas;

import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationActivity {

    public static Boolean isNullOrEmpty(View[] v) {
        Boolean result = false;

        for (View view : v) {

            if(view instanceof EditText) {
                if (((EditText) view).getText().toString().isEmpty()) {
                    result = true;
                    ((EditText) view).setError("Cannot be empty!");
                }
            }

        }

        return result;
    }

    public static Boolean isEmailValid(View v){
        Boolean result = false;
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        Matcher matcher = pattern.matcher(((EditText) v).getText());
        if (matcher.matches() == false) {
            ((EditText) v).setError("Must be a valid email!");
            result = true;
        }
        return result;
    }

    public static Boolean isMatchPassword(View v1, View v2) {
        Boolean result = false;
        if (!((EditText) v2).getText().toString().equals(((EditText) v1).getText().toString())) {
            ((EditText) v2).setError("Confirm password did not match!");
            result = true;
        }
        return result;
    }

}
