package com.example.newlist1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adapter extends ArrayAdapter<String> {

    Context contex;
    String[] data;
    Integer[] image;

    public Adapter( Context ankit, String[] bhup ,Integer[] img) {
   super(ankit,R.layout.item,bhup);
        contex = ankit;
        data = bhup;
        image=img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater=LayoutInflater.from(contex);
View view=inflater.inflate(R.layout.item,null,true);

        TextView text;
        ImageView img;
        text=view.findViewById(R.id.text);
        img=view.findViewById(R.id.img);

        text.setText(data[position]);


        img.setImageResource(image[position]);

        return  view;

    }
}
