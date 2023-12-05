package com.example.batuhanozkanmobilprogramlamavize23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SmsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_screen);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 1);

        EditText phoneEditText = (EditText) findViewById(R.id.phoneEditText);
        EditText messageEditText = (EditText) findViewById(R.id.messageEditText);
        Button sendBtn = (Button) findViewById(R.id.sendButton);

        String userPhone = phoneEditText.getText().toString();
        String userMessage = messageEditText.getText().toString();


        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmsManager smsManager = SmsManager.getDefault();
                if (!userPhone.isEmpty()) {
                    smsManager.sendTextMessage(userPhone, null, userMessage, null, null);
                }
            }
        });
    }
}