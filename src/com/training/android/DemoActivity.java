package com.training.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DemoActivity extends Activity {
	/** Called when the activity is first created. */

	EditText inputName;
	EditText inputEmail;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Intent i = new Intent(getApplicationContext(), SecondActivity.class);
		// startActivity(i);

		inputName = (EditText) findViewById(R.id.name);
		inputEmail = (EditText) findViewById(R.id.email);
		Button btnNextScreen = (Button) findViewById(R.id.nextBtn);

		// Listening to button event
		btnNextScreen.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				// Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), SecondActivity.class);
				// Sending data to another Activity
				nextScreen.putExtra("name", inputName.getText().toString());
				nextScreen.putExtra("email", inputEmail.getText().toString());			

				startActivity(nextScreen);

			}
		});

	}
}