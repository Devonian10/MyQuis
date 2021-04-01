package com.example.myquis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void Back(View view) {
        Intent b = new Intent(ProfileActivity.this, MainActivity.class );
        b.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(b);
    }

    public void ClickLogout(View view) {
        MainActivity.logout(this);

    }
}


