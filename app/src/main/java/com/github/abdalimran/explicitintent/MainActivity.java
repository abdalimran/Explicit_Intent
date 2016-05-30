package com.github.abdalimran.explicitintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Explicit intents explicitly define the component
    which should be called by the Android system, by using the Java class as identifier.*/

    public void BringActivity(View view) {
        Intent explicit_intent=new Intent(getApplicationContext(),AnotherActivity.class);
        startActivity(explicit_intent);
    }
}
