package com.example.fzy.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_java2c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result = new Java2CJni().java2c();
                Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
