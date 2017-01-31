package com.akexorcist.googledirection.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Authentication extends AppCompatActivity {

    //Explicit
    private EditText userEditText, passEditText;
    private String userString, passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        //Bind Widget
        userEditText = (EditText) findViewById(R.id.editText);
        passEditText = (EditText) findViewById(R.id.editText2);

    }   // Main Method

    public void clickLogin(View view) {

        userString = userEditText.getText().toString().trim();
        passString = passEditText.getText().toString().trim();

        //Check Space
        if (userString.equals("") || passString.equals("")) {
            //Have Space
            MyAlert myAlert = new MyAlert(Authentication.this);
            myAlert.myDialog(R.drawable.doremon48,
                    "Have Space", "Please Fill All Every Blank");

        } else {
            //No Space

        }


    }   // clickLogin

}   // Main Class
