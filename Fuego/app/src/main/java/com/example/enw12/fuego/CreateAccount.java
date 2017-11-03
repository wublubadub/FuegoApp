package com.example.enw12.fuego;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class CreateAccount extends AppCompatActivity {

    EditText firstTxt;
    EditText lastTxt;
    EditText usernameTxt;
    EditText passwordCreateTxt;
    EditText passwordConfirmTxt;
    EditText emailTxt;
    EditText phoneNumTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }
}
