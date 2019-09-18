package com.patrickfeltes.multiple_activities_tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String message = getIntent().getStringExtra("message_key");
        TextView messageView = findViewById(R.id.message);
        messageView.setText(message);
    }
}
