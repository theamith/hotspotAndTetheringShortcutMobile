package com.itsamiths.tetheringtoggler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent tetherSettings = new Intent();
		tetherSettings.setClassName("com.android.settings",
				"com.android.settings.TetherSettings");
		tetherSettings.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(tetherSettings);
		finish();
	}
}