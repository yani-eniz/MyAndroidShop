package com.example.androidshop;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {
    private BottomNavigationView bnv;


    private  String[] citys = {"Los Angeles","New-York"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,citys);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        Spinner spinner = (Spinner)findViewById(R.id.spCity);

        spinner.setAdapter(arrayAdapter);

        bnv = (BottomNavigationView)findViewById(R.id.bottomNavigationView3);
        bnv.setOnNavigationItemSelectedListener(getBottomNavigationListener());


    }

    /*private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_user:
                        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.action_search:
                        Intent intent1 = new Intent(Main2Activity.this, Discounts.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_notification:
                        Intent intent2 = new Intent(Main2Activity.this, Notification.class);
                        startActivity(intent2);
                        break;
                    case R.id.action_coupons:
                        Intent intent3 = new Intent(Main2Activity.this, Search.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        };


    }*/

    private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        return true;
                    case R.id.action_search:
                        startActivity(new Intent(getApplicationContext(),Discounts.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.action_notification:
                        startActivity(new Intent(getApplicationContext(),Notification.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.action_coupons:
                        startActivity(new Intent(getApplicationContext(),Search.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.action_user:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return true;
            }
        };


    }


}
