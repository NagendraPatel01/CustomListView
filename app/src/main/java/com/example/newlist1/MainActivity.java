package com.example.newlist1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] data={"ankit","bhup"};
Integer[] image={R.drawable.abb,R.drawable.ann};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.list);

        Adapter a=new Adapter(this,data,image);
list.setAdapter(a);

list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        switch (position){


            case 0:
                Intent a=new Intent(MainActivity.this,AnkitActivity.class);
                startActivity(a);
                break;


            case 1:
                Intent b=new Intent(MainActivity.this,AnkitActivity.class);
                startActivity(b);
                break;
        }

    }
});
    }

}
