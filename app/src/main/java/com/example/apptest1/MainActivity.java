package com.example.apptest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //aa


        AppCenter.start(getApplication(), "2b2fb485-d46e-4d96-8dca-6d12fb7226ef",
                Analytics.class, Crashes.class);
    }
}
