package com.itsamiths.tetheringtoggler;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent tetherSettings = new Intent();
        tetherSettings.setClassName("com.android.settings", "com.android.settings.TetherSettings");
        tetherSettings.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(tetherSettings);
        finish();
       }
}
