package com.example.hieu_phong_vu_comp304_sec003_lab02_ex2a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextMessage=(EditText)findViewById(R.id.editTextMessage);
        Button btnSend = (Button)findViewById(R.id.buttonSend);
        RelativeLayout relativeLayout1=(RelativeLayout)findViewById(R.id.relativeLayout1);
        relativeLayout1.setBackgroundColor(Color.rgb(224,249,250));
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("Message",editTextMessage.getText().toString());
                startActivity(intent);
            }
        });
    }
}
