package com.training.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
 
        TextView txtName = (TextView) findViewById(R.id.textView2);
        TextView txtEmail = (TextView) findViewById(R.id.textView3);
        Button btnClose = (Button) findViewById(R.id.btnClose);
 
        Intent i = getIntent();
        // Receiving the Data
        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");    
 
        // Displaying Received data
        txtName.setText(name);
        txtEmail.setText(email);
 
        // Binding Click event to Button
        btnClose.setOnClickListener(new View.OnClickListener() { 
            public void onClick(View arg0) {
                //Closing SecondScreen Activity
                finish();
            }
        });
 
    }
}
