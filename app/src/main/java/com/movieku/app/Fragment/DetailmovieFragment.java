package com.movieku.app.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.movieku.app.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailmovieFragment extends Fragment {

    View rootView;

    public DetailmovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_detailmovie, container, false);







        return rootView;
    }

}
