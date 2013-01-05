package com.homeserver.edn.deelioweather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class DisplayWeatherActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_weather);
		Intent intent=getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		String currentWeather = "The current weather is " + getWeatherForZipCode(message) + " degrees.";
		TextView currentWeatherText = (TextView) findViewById(R.id.textView1);
		currentWeatherText.setText(currentWeather);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_display_weather, menu);
		return true;
	}
	
	public String getWeatherForZipCode(String zipCode) {
		return "35";
	}

}
