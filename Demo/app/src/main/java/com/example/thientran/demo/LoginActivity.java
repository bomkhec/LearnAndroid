package com.example.thientran.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    public static final String EXTRA_USERNAME = "com.example.thientran.demo.EXTRA_USERNAME";
    public static final String EXTRA_PASSWORD = "com.example.thientran.demo.EXTRA_PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHomeActivity();
            }
        });
    }

    public void goToHomeActivity() {
        EditText userNameEditText = (EditText) findViewById(R.id.username);
        String userName = userNameEditText.getText().toString();

        EditText passwordEditText = (EditText) findViewById(R.id.password);
        String password = passwordEditText.getText().toString();

        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra(EXTRA_USERNAME, userName);
        intent.putExtra(EXTRA_PASSWORD, password);

        startActivity(intent);
    }
}
