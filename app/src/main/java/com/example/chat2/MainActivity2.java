package com.example.chat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView recipeNameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recipeNameTextView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String suggestedRecipe = intent.getStringExtra("recipe");
        recipeNameTextView.setText(suggestedRecipe);
    }
}