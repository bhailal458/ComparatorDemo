package com.example.sparken02.comparatordemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sparken02 on 13/6/17.
 */

public class CustomAdapter extends BaseAdapter {

    Context mContext;
    List<Student> studentobj;

    public CustomAdapter(Context mContext, List<Student> studentobj) {
        this.mContext = mContext;
        this.studentobj = studentobj;
    }

    @Override
    public int getCount() {
        return studentobj.size();
    }

    @Override
    public Object getItem(int position) {
        return studentobj.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.each_list_item,parent,false);

        TextView rollno = (TextView)convertView.findViewById(R.id.rollno);
        TextView name = (TextView)convertView.findViewById(R.id.name);
        TextView age = (TextView)convertView.findViewById(R.id.age);

        Student item = (Student)getItem(position);

        rollno.setText(String.valueOf(item.getRollno()));
        name.setText(item.getName());
        age.setText(String.valueOf(item.getAge()));



        return convertView;
    }
}
