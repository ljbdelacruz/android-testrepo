package com.basecodesetup.laineljohndelacruz.myandroidbasecode.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.basecodesetup.laineljohndelacruz.myandroidbasecode.R;
import com.basecodesetup.laineljohndelacruz.myandroidbasecode.adapters.sample_adapter;
import com.basecodesetup.laineljohndelacruz.myandroidbasecode.model.PersonTransaction;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();


        ListView mListView=(ListView) findViewById(R.id.sampleLV);
        ArrayList<PersonTransaction> list=PersonTransaction.sampleList();
        sample_adapter myadapter = new sample_adapter(this, R.layout.adapter_sample_layout, list);
        mListView.setAdapter(myadapter);
    }


    public void BackOnClick(View view){
        finish();
    }
}
