package com.example.week2022_04_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences pref= PreferenceManager.getDefaultSharedPreferences(this);
        boolean first= pref.getBoolean("first",false);
        boolean second= pref.getBoolean("second",false);
        boolean swch= pref.getBoolean("switch",false);

        Toast.makeText(this, ""+ first +second + swch,Toast.LENGTH_LONG ).show();

    }
public void git(View v){
        Intent myint= new Intent(MainActivity.this, Preference.class);
        startActivity(myint);


}

}