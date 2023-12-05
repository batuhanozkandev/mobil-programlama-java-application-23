package com.example.batuhanozkanmobilprogramlamavize23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defines
        TextView schoolNo = (TextView) findViewById(R.id.schoolNo);
        TextView name = (TextView) findViewById(R.id.name);

        Button convertorButton = (Button) findViewById(R.id.convertorButton);
        Button randomButton = (Button) findViewById(R.id.randomButton);
        Button smsButton = (Button) findViewById(R.id.smsButton);

        convertorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ConvertorScreen.class));
            }
        });

        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RandomScreen.class));
            }
        });

        smsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SmsScreen.class));
            }
        });

    }
}