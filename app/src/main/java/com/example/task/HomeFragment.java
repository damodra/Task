package com.example.task;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    TextView tv1,tv2;
    public HomeFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_home, container, false);
        tv1=v.findViewById(R.id.textfrag1);
        tv2=v.findViewById(R.id.textfrag2);
//        Bundle b3=getArguments();
//        String id=b3.getString("id");
//        String name=b3.getString("name");
//        tv1.setText(id);
//        tv1.setText(name);
        if(getArguments() != null)
        {
           String id=getArguments().getString("id");
            String name=getArguments().getString("name");
            tv1.setText(id);
           tv2.setText(name);
        }
        return v;
    }

}
