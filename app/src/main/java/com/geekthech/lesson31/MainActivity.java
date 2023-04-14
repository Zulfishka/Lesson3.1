package com.geekthech.lesson31;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.geekthech.lesson31.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setClicks();
    }

    private void setClicks() {
        binding.btn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("name", binding.editTextOne.getText().toString());
            intent.putExtra("name2", binding.editTextSecond.getText().toString());
            intent.putExtra("name3", binding.editTextThird.getText().toString());
            startActivity(intent);
        });
    }
}