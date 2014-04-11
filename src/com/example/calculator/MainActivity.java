package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button add = (Button) findViewById(R.id.add);
		final Button substract = (Button) findViewById(R.id.substract);
		final Button divide = (Button) findViewById(R.id.divide);
		final Button multiply = (Button) findViewById(R.id.multiply);
		final EditText numOne = (EditText) findViewById(R.id.number1);
		final EditText numTwo = (EditText) findViewById(R.id.number2);
		final TextView result = (TextView) findViewById(R.id.result);
		
		
		add.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (numOne.getText().toString().isEmpty()
						|| numTwo.getText().toString().isEmpty()) {
					Toast msg = Toast
							.makeText(
									getBaseContext(),
									"Calculator is for Number DumDum! Not Empty String!",
									Toast.LENGTH_LONG);
					msg.show();
				} else {
					double x = Double.parseDouble(numOne.getText().toString());
					double y = Double.parseDouble(numTwo.getText().toString());


					result.setText(String.valueOf(x + y));

				}
			}

		});

		substract.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (numOne.getText().toString().isEmpty()
						|| numTwo.getText().toString().isEmpty()) {
					Toast msg = Toast
							.makeText(
									getBaseContext(),
									"Calculator is for Number DumDum! Not Empty String!",
									Toast.LENGTH_LONG);
					msg.show();
				} else {
					double x = Double.parseDouble(numOne.getText().toString());
					double y = Double.parseDouble(numTwo.getText().toString());

					result.setText(String.valueOf(x - y));

				}
			}

		});

		multiply.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (numOne.getText().toString().isEmpty()
						|| numTwo.getText().toString().isEmpty()) {
					Toast msg = Toast
							.makeText(
									getBaseContext(),
									"Calculator is for Number DumDum! Not Empty String!",
									Toast.LENGTH_LONG);
					msg.show();
				} else {
					double x = Double.parseDouble(numOne.getText().toString());
					double y = Double.parseDouble(numTwo.getText().toString());

					result.setText(String.valueOf(x * y));

				}
			}

		});

		divide.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (numOne.getText().toString().isEmpty()
						|| numTwo.getText().toString().isEmpty()) {
					Toast msg = Toast
							.makeText(
									getBaseContext(),
									"Calculator is for Number DumDum! Not Empty String!",
									Toast.LENGTH_LONG);
					msg.show();
				} else {
					double x = Double.parseDouble(numOne.getText().toString());
					double y = Double.parseDouble(numTwo.getText().toString());

					if (y == 0.0) {
						Toast msg2 = Toast.makeText(getBaseContext(),
								"Have You Even Try to Divide by Zero?? DumDum",
								Toast.LENGTH_LONG);
						msg2.show();
					} else {
						result.setText(String.valueOf(x / y));
					}
				}
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
