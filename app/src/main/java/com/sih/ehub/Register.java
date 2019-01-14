package com.sih.ehub;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Email=(EditText)findViewById(R.id.email);
        Password=(EditText)findViewById(R.id.password);
        Login=(Button) findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify(Email.getText().toString(),Password.getText().toString());
            }
        });
    }
    private void verify(String userEmail,String userPassword){
         if((userEmail.equals("admin"))&&(userPassword.equals("user"))){
            Intent intent=new Intent(Register.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
        else{
             Toast.makeText(Register.this,"Login Failed",Toast.LENGTH_SHORT).show();
         }

    }
}
