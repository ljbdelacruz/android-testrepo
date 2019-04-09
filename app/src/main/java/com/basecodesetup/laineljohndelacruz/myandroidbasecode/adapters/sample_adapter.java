package com.basecodesetup.laineljohndelacruz.myandroidbasecode.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.basecodesetup.laineljohndelacruz.myandroidbasecode.R;
import com.basecodesetup.laineljohndelacruz.myandroidbasecode.model.PersonTransaction;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class sample_adapter extends ArrayAdapter<PersonTransaction> {

    private static final String TAG = "sample_adapter";
    private Context mContext;
    private int mResource;
    private int lastPosition = -1;
    private static class ViewHolder {
        ImageView profilePic;
        TextView name;
        TextView subDesc;
    }
    public sample_adapter(Context context, int resource, ArrayList<PersonTransaction> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PersonTransaction person = new PersonTransaction(getItem(position).name, getItem(position).subDescription, getItem(position).profileImage);
        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.profilePic = (ImageView) convertView.findViewById(R.id.sample_image);
            holder.name = (TextView) convertView.findViewById(R.id.sample_tv1);
            holder.subDesc = (TextView) convertView.findViewById(R.id.sample_tv2);
            result = convertView;
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        lastPosition = position;
        Picasso.with(getContext().getApplicationContext()).load(person.profileImage).into(holder.profilePic);
        holder.name.setText(person.name);
        holder.subDesc.setText(person.subDescription);
        return convertView;
    }

}
