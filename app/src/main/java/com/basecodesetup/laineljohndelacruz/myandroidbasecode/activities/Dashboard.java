package com.basecodesetup.laineljohndelacruz.myandroidbasecode.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.basecodesetup.laineljohndelacruz.myandroidbasecode.R;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();


    }


    public void BackOnClick(View view){
        finish();
    }
}
