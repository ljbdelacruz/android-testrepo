package com.basecodesetup.laineljohndelacruz.myandroidbasecode.fragments.textfields;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.basecodesetup.laineljohndelacruz.myandroidbasecode.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MyCustomTF.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MyCustomTF#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyCustomTF extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_Label = "Default";

    // TODO: Rename and change types of parameters
    private String sLabel;

    public OnFragmentInteractionListener mListener;

    public MyCustomTF() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    private TextView mytf;
    public static MyCustomTF newInstance(String sLabel) {
        MyCustomTF fragment = new MyCustomTF();
        Bundle args = new Bundle();
        args.putString(ARG_Label, sLabel);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            sLabel = getArguments().getString(ARG_Label);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        try{
            TextView mtview=(TextView) getView().findViewById(R.id.MCTF_label);
            mtview.setText("WAL WAL!");
        }catch(Exception e){
        }

        return inflater.inflate(R.layout.fragment_my_custom_t, container, false);
    }
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
    public void setLabel(String data){
        try{
            if(getActivity() != null){
                TextView mc=(TextView) getView().findViewById(R.id.MCTF_label);
                Log.d("DEFLOG FRAG", mc.toString());
                mc.setText(data);
            }
        }catch(Exception e){

        }
    }
    public void setTF(String placeHolder, Integer inputType){
        EditText mctf_tf=(EditText) getView().findViewById(R.id.MCTF_TF);
        mctf_tf.setHint(placeHolder);
        mctf_tf.setInputType(inputType);
    }
    public String getTextValue(){
        EditText dt=(EditText) getView().findViewById(R.id.MCTF_TF);
        return dt.getText().toString();
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        //put callbacks here to receive input from this fragment going to the activity
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public static MyCustomTF newInstance(){
        return new MyCustomTF();
    }


}
