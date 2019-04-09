package com.basecodesetup.laineljohndelacruz.myandroidbasecode.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class PersonTransaction {
    public String profileImage="";
    public String name="";
    public String subDescription="";
    public PersonTransaction(){
    }
    public PersonTransaction(String name, String sDesc, String profileImage){
        this.name=name;
        this.subDescription=sDesc;
        this.profileImage=profileImage;
    }
    public String getProfileImage(){
        return this.profileImage;
    }
    public String getName(){
        return this.name;
    }
    public String getSubDesc(){
        return this.subDescription;
    }
    public static Bitmap getImageBitmap(String path){
        try{
            URL url = new URL(path);
            Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            return bmp;
        }catch (IOException e){
            Log.e("ERROR", "LOADING Image bitmap");
        }
        return null;
    }
    public static ArrayList<PersonTransaction> sampleList(){
        ArrayList<PersonTransaction> list=new ArrayList<PersonTransaction>();
        list.add(new PersonTransaction("Lainel John", "5 Mutual Friends", "https://www.gstatic.com/webp/gallery3/1_webp_ll.sm.png"));
        list.add(new PersonTransaction("Kashiew Wandagon", "3 Mutual Friends", "https://www.gstatic.com/webp/gallery3/1_webp_ll.sm.png"));
        return list;
    }



}
