package com.basecodesetup.laineljohndelacruz.myandroidbasecode.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Debug;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.basecodesetup.laineljohndelacruz.myandroidbasecode.MyCustomTF;
import com.basecodesetup.laineljohndelacruz.myandroidbasecode.R;

import java.io.Console;

public class MainActivity extends AppCompatActivity implements MyCustomTF.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is the way to access the ui setup for fragment
        MyCustomTF mctf = (MyCustomTF) getSupportFragmentManager().findFragmentById(R.id.mctf_fragment_username);
        mctf.setLabel("Username");
        mctf.setTF("Username", InputType.TYPE_TEXT_VARIATION_NORMAL);
        MyCustomTF mctf_password = (MyCustomTF) getSupportFragmentManager().findFragmentById(R.id.mctf_fragment_password);
        mctf_password.setLabel("Password");
        mctf_password.setTF("Password", InputType.TYPE_TEXT_VARIATION_PASSWORD);

//        MyCustomTF fragment=MyCustomTF.newInstance();
//        fragment.setLabel("WTH");
//        this.transactFragments(fragment, "MyCustomTF");
    }

    //this is the dynamic way and how to add fragments to view in code
    private void transactFragments(Fragment frag, String tag){
//        final FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.add(R.id.fragment_flayout, frag, tag);
//        ft.commit();
//        for (Fragment fragment1 : getSupportFragmentManager().getFragments()) {
////            Log.d("DEFLOG", fragment1.getTag());
//////            switch(fragment1.getTag()){
//////                case "MyCustomTF":
//////                    MyCustomTF mcfrag=(MyCustomTF) fragment1;
//////                    Log.d("DEFLOG", mcfrag.toString());
//////                    mcfrag.setLabel("TEST");
//////            }
////        }
    }
    public void loginOnClick(View view){
        startActivity(new Intent(this, Dashboard.class));
    }



    //MARK: handler interface for the fragments
    @Override
    public void onFragmentInteraction(Uri uri) {

    }



}


