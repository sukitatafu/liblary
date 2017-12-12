package com.splash.billy.liblary;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private user user;
    private Button bt_login;
    private EditText et_emaila , et_passa;
    private String id = "id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_emaila = (EditText)findViewById(R.id.et_email);
        et_passa = (EditText) findViewById(R.id.et_pass);
        bt_login = (Button) findViewById(R.id.bt_login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailkey = et_emaila.getText().toString();
                String passkey = et_passa.getText().toString();

                user = new user(emailkey);
                if (emailkey.equals(user.getEmail()) && passkey.equals(user.getPassword())){
                    Toast.makeText(getApplicationContext(), "Login berhasil", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra(id,user.getEmail());
                    startActivity(intent);
                }
                else if ((emailkey.matches("")|| passkey.matches("")))
                /* atau jika input text 1 dan text 2 kosong*/
                {
                    Toast.makeText(getApplicationContext(),"isi user dan password",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"user / pass salah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

  /*  @Override
    public void onClick(View v) {
        if (v.getId()== R.id.bt_login){
            String email = et_email.getText().toString();
            String pass = et_pass.getText().toString();
            user = new user (email);
                if (email.equals(user.getEmail())&& pass.equals(user.getPassword())){
                    Toast.makeText(getApplicationContext(),"LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent (MainActivity.this, Main2Activity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Email atau Password anda salah").create().show();
                }
        }

    }
}*/
