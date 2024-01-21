package com.example.abo2application;


import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.example.abo2application.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {

            SpannableString s = new SpannableString("CertaIN U");
            s.setSpan(new StyleSpan(Typeface.BOLD), 0, s.length(), SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
            actionBar.setTitle(s);
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
          @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        // 'Home' 버튼 클릭 시 수행할 동작
                        break;
                    case R.id.dashboard:
                        // 'Dashboard' 버튼 클릭 시 수행할 동작
                        break;
                    case R.id.notifications:
                        // 'Notifications' 버튼 클릭 시 수행할 동작
                        break;
                    case R.id.profile:
                        // 'Profile' 버튼 클릭 시 수행할 동작
                        break;
                }
                return true;
            }
        });
    }

}

