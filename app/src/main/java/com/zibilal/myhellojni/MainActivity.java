package com.zibilal.myhellojni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.zibilal.myhellojni.gl2jni.GL2JNIActivity;
import com.zibilal.myhellojni.nativelib.NativeLib;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = "Message: " + NativeLib.stringFromJNI() + "\n" +
                "CPU Count: " + NativeLib.getCpuCount() + "\n" +
                "CPU Family: " + NativeLib.getCpuFamily();
        Log.d("MainActivity", "The text : " + text);

        ((TextView)findViewById(R.id.text_view)).setText(text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onShow(View view) {
        Intent intent = new Intent(this, GL2JNIActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
