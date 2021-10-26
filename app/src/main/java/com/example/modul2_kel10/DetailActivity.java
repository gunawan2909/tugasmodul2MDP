package com.example.modul2_kel10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.modul2_kel10.R;

public class DetailActivity extends AppCompatActivity {
    private TextView tvFirstName, tvLastName, tvEmail;
    private ImageView tvAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvFirstName = findViewById(R.id.first_name);
        tvLastName = findViewById(R.id.last_name);
        tvEmail = findViewById(R.id.email);
        tvAvatar = findViewById(R.id.photo_user);

        if(getIntent().hasExtra("Firstname")){
            String Firstname = getIntent().getStringExtra("Firstname");
            tvFirstName.setText(Firstname);
        }

        if(getIntent().hasExtra("Lastname")){
            String Lastname = getIntent().getStringExtra("lastname");
            tvLastName.setText(Lastname);
        }

        if(getIntent().hasExtra("Email")){
            String Email = getIntent().getStringExtra("Email");
            tvEmail.setText(Email);
        }

        if(getIntent().hasExtra("Avatar")){
            String Avatar = getIntent().getStringExtra("Avatar");
            Glide.with(this).load(Avatar).into(tvAvatar);
        }
    }
}