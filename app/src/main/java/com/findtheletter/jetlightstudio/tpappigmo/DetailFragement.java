package com.findtheletter.jetlightstudio.tpappigmo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by desktop on 17/04/2018.
 */

public class DetailFragement extends android.app.Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setText(getActivity().getIntent().getExtras().getString("Value"));
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_layout_fragment,null);
        return view;
    }
    public void setText(String text)
    {
        TextView t = getView().findViewById(R.id.jobText);
        t.setText(text);
    }
}
