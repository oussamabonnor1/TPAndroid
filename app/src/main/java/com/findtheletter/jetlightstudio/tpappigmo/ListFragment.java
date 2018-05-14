package com.findtheletter.jetlightstudio.tpappigmo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by desktop on 17/04/2018.
 */

public class ListFragment extends android.app.ListFragment{

    String[] names = {"ouss", "amine", "smahi", "moh", "baknadir"};
    String[] jobs = {"Avocat", "Medecin", "programmer", "designetr", "gamer"};
    //ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // listView = getView().findViewById(R.id.listView);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,names);
        setListAdapter(arrayAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        DetailFragement fragment = (DetailFragement) getFragmentManager().findFragmentById(R.id.detailFragment);
        if(fragment != null && fragment.isInLayout()){
            fragment.setText(jobs[position]);
        }else{
            Intent i = new Intent(getActivity().getApplicationContext(),DetailPortraitActivity.class);
            i.putExtra("Value",jobs[position]);
            startActivity(i);
        }
    }
}
