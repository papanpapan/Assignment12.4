package com.example.amit.customdialogproject124;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Amit on 6/21/2017.
 */

public class Madapter extends BaseAdapter {
    private Context mcontext;
     private List<Details> list;

    public Madapter(Context applicationContext, List<Details>list) {
        this.list=list;
        mcontext=applicationContext;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v=View.inflate(mcontext,R.layout.customlistview,null);
        TextView namee=v.findViewById(R.id.nam);
        TextView phniii=v.findViewById(R.id.phn);
        TextView dateofbirth=v.findViewById(R.id.dateob);
        namee.setText(list.get(position).getName());
        phniii.setText(list.get(position).getPhone_number());
        dateofbirth.setText(list.get(position).getDOB());
        return v;
    }

}
