package com.example.activivad1mca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class UpdateRegsitro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_regsitro);

    }

    public void goMain(View view) {
        TextView cancelar = findViewById(R.id.cancelar);
        Intent intent = new Intent(UpdateRegsitro.this, MainActivity.class);
        startActivity(intent);
    }
}