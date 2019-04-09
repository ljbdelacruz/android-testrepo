package com.basecodesetup.laineljohndelacruz.myandroidbasecode.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;

import com.basecodesetup.laineljohndelacruz.myandroidbasecode.fragments.textfields.MyCustomTF;
import com.basecodesetup.laineljohndelacruz.myandroidbasecode.R;

public class MainActivity extends AppCompatActivity implements MyCustomTF.OnFragmentInteractionListener {

    MyCustomTF usernameTF;
    MyCustomTF passwordTF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is the way to access the ui setup for fragment
        this.setupTextFieldsUI();
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
        Log.d("SAM", this.usernameTF.getTextValue()+" "+this.passwordTF.getTextValue());
        startActivity(new Intent(this, Dashboard.class));

    }

    //MARK: handler interface for the fragments
    @Override
    public void onFragmentInteraction(Uri uri) {

    }




    public void setupCodeBaseFragments(){
//        MyCustomTF fragment=MyCustomTF.newInstance();
//        fragment.setLabel("WTH");
//        this.transactFragments(fragment, "MyCustomTF");
    }
    public void setupTextFieldsUI(){
        this.usernameTF = (MyCustomTF) getSupportFragmentManager().findFragmentById(R.id.mctf_fragment_username);
        usernameTF.setLabel("Username");
        usernameTF.setTF("Username", InputType.TYPE_TEXT_VARIATION_NORMAL);
        //
        this.passwordTF = (MyCustomTF) getSupportFragmentManager().findFragmentById(R.id.mctf_fragment_password);
        passwordTF.setLabel("Password");
        passwordTF.setTF("Password", InputType.TYPE_TEXT_VARIATION_PASSWORD);
    }



}


