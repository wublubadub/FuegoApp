package com.example.enw12.fuego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccount extends AppCompatActivity {

    EditText firstTxt;
    EditText lastTxt;
    EditText usernameTxt;
    EditText passwordCreateTxt;
    EditText passwordConfirmTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        // Create Account Button- when pressed creates a new User object
        Button createAccount = (Button) findViewById(R.id.createAccBtn);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets text from user input and adds converts to strings
                String firstName = firstTxt.getText().toString();
                String lastName = lastTxt.getText().toString();
                String username = usernameTxt.getText().toString();
                String passwordCreate = passwordCreateTxt.getText().toString();
                String passwordConfirm = passwordConfirmTxt.getText().toString();

                // NEED TO ADD MORE CHECKS
                if (passwordCreate.equals(passwordConfirm)) {
                    User createUser = new User(firstName, lastName, username, passwordConfirm);
                    // If User already exists, return an error message
                    if (createUser.checkExists() == true) {
                        // return an error message saying username already exists
                    } else {
                        // return a message saying creation was successful- bring to sign in page?
                    }
                } else {
                    // display an error message and have them retry
                }
            }
        });

        // Back button- when pressed takes back to home screen
        Button backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreateAccount.this, Start.class));
            }
        });

    }
}
