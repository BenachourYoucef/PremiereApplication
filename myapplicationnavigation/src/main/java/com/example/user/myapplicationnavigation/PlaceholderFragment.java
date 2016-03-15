package com.example.user.myapplicationnavigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 15/03/2016.
 */
public class PlaceholderFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v=inflater.inflate(R.layout.fragment_main,container,false);
        TextView textView=(TextView) v.findViewById(R.id.section_label);
        int i=getArguments().getInt("pos");
        if(i==0)
        {
            textView.setText("Fragment 0");
        }else
        {
            if (i==1)
            {
                textView.setText("Fragment 1");
            }
        }
        return  v ;
    }
}