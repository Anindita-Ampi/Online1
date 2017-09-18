package com.example.windows.roll_201514076;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.x;
import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText a,b;
    Spinner c,d;
    String Aa,Ab,Ac,Ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText) findViewById(R.id.editText);
        b = (EditText) findViewById(R.id.editText2);
        c = (Spinner) findViewById(R.id.spinner);
        d = (Spinner) findViewById(R.id.spinner2);


        //name=(TextView)findViewById(R.id.name);
        // btn = (Button) findViewById(R.id.button) ;



        btn = (Button) findViewById(R.id.button) ;
        final Intent in = new Intent(this , Page2.class);





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aa=a.getText().toString();
                Ab=b.getText().toString();
               // Ac=c.getText().toString();
                String Ac = c.getSelectedItem().toString();
                String Ad = d.getSelectedItem().toString();
               // Ad=c.getText().toString();
                if (TextUtils.isEmpty(Aa)){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter Name!" , LENGTH_SHORT);
                    toast.show();

                    return;
                }
                if (TextUtils.isEmpty(Ab)){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter Roll!" , LENGTH_SHORT);
                    toast.show();

                    return;
                }



                    in.putExtra("nameID1", "WELCOME "+Aa+"!\n\n\n You have Succesfully Enrolled on the Subject "+ Ad+" of " +Ac+" departmental Course.From now on ward you will have to attend the class regularly. Thank You :)");

                startActivity(in);



            }
        });
    }


}
