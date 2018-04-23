package com.findtheletter.jetlightstudio.tpappigmo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Tp5Exo2ListViewActivity extends AppCompatActivity {

    ListView listView;
    String[] names = {"ouss", "amine", "smahi", "moh", "baknadir"};
    String[] jobs = {"Avocat", "Medecin", "programmer", "designetr", "gamer"};
    CustomArrayAdapterTp5Exo2 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp5_exo2_list_view);
        listView = (ListView) findViewById(R.id.items);
        //listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names));
        adapter = new CustomArrayAdapterTp5Exo2();
        listView.setAdapter(adapter);
    }

    public class CustomArrayAdapterTp5Exo2 extends BaseAdapter {

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            final ImageButton haut, down;
            view = getLayoutInflater().inflate(R.layout.custom_list_adapter, null);
            haut = view.findViewById(R.id.img1);
            haut.setTag(i);
            haut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int i = Integer.valueOf(haut.getTag().toString());
                    if (i > 0) {
                        String temp = names[i - 1];
                        names[i - 1] = names[i];
                        names[i] = temp;
                        String temp2 = jobs[i - 1];
                        jobs[i - 1] = jobs[i];
                        jobs[i] = temp2;
                        adapter.notifyDataSetChanged();
                        listView.setAdapter(adapter);
                        Toast.makeText(getApplicationContext(), " Element " + haut.getTag() + " went up!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            down = view.findViewById(R.id.img2);
            down.setTag(i);
            down.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int i = Integer.valueOf(haut.getTag().toString());
                    if (i < names.length - 1) {
                        String temp = names[i + 1];
                        names[i + 1] = names[i];
                        names[i] = temp;
                        String temp2 = jobs[i + 1];
                        jobs[i + 1] = jobs[i];
                        jobs[i] = temp2;
                        adapter.notifyDataSetChanged();
                        listView.setAdapter(adapter);
                        Toast.makeText(getApplicationContext(), " Element" + down.getTag() + " went down!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            TextView name = view.findViewById(R.id.text1);
            name.setText(names[i]);
            TextView job = view.findViewById(R.id.text2);
            job.setText(jobs[i]);
            return view;
        }
    }
}

