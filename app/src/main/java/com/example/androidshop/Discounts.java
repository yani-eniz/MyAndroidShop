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

public class Discounts extends AppCompatActivity {
    private BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discounts);

        bnv = (BottomNavigationView)findViewById(R.id.bottomNavigationView3);
        bnv.setOnNavigationItemSelectedListener(getBottomNavigationListener());
        bnv.setSelectedItemId(R.id.action_search);
    }

        private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
            return new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.action_home:
                            startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                            overridePendingTransition(0,0);
                            return true;
                        case R.id.action_search:

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


