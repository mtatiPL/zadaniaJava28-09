package com.example.testui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText editText=findViewById(R.id.editTextTextPersonName);
        Button button=findViewById(R.id.button);
        ListView listView=findViewById(R.id.listView);
        ArrayList<String> zakupy=new ArrayList<String>();
        ArrayAdapter adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,zakupy);
       zakupy.add("chleb");
       zakupy.add("banany");
       zakupy.add("mleko");
       listView.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produkt=editText.getText().toString();
                editText.setText("");
                zakupy.add(produkt);
                adapter.notifyDataSetChanged();

            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String wybranyElement=parent.getItemAtPosition(position).toString();
            zakupy.remove(wybranyElement);
                adapter.notifyDataSetChanged();
            }
        });

    }
}