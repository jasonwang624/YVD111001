package com.example.user.yvd111001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        Button btn = new Button(MainActivity.this);
        btn.setText("Click me!");
        setContentView(btn);
    }
}
