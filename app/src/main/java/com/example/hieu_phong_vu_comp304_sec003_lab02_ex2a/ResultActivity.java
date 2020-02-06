package com.example.hieu_phong_vu_comp304_sec003_lab02_ex2a;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_message);
        RelativeLayout relativeLayout2=(RelativeLayout)findViewById(R.id.relativeLayout2);
        relativeLayout2.setBackgroundColor(Color.rgb(224,249,250));
        final TextView textViewResult = (TextView) findViewById(R.id.textViewResult);
        TextView btnBack=(Button) findViewById(R.id.buttonBack);
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        textViewResult.setText(extras.getString("Message"));
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
