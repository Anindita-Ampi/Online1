package com.example.windows.roll_201514076;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class Page2 extends AppCompatActivity implements View.OnClickListener {
    TextView tx2;
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);



        tx2 = (TextView) findViewById(R.id.textView);

        Intent j = getIntent();
        String val = j.getStringExtra("nameID1");
        tx2.setText(val);


    }


    @Override
    public void onClick(View view) {
        if (view == btn2){
            startActivity(new Intent(Page2.this, MainActivity.class));
        }

    }
}



