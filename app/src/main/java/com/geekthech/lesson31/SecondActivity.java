package com.geekthech.lesson31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geekthech.lesson31.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.tvOne.setText(getIntent().getStringExtra("name"));
        binding.tvSecond.setText(getIntent().getStringExtra("name2"));
        binding.tvThird.setText(getIntent().getStringExtra("name3"));
    }
}