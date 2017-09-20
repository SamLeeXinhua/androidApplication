package com.samlee.ec8072.myapplication1st;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView myView = (TextView) findViewById(R.id.myView);
        final String original = (String) myView.getText();

        final Button button1 = (Button) findViewById(R.id.updateButton);
        final Button button2 = (Button) findViewById(R.id.restoreButton);
        final Button button3 = (Button) findViewById(R.id.clearButton);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myView.setText("click");
                Toast toast = Toast.makeText(getApplicationContext(), "update", Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myView.setText(original);
                Toast toast = Toast.makeText(getApplicationContext(),"restore", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myView.setText("");

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }
        });

    }

}
