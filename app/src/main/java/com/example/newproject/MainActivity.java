package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText t1;
    Spinner sp;
    String data[]={"fruits"};
    ArrayList list = new ArrayList(Arrays.asList(data));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        t1=(EditText)findViewById(R.id.editText);
        sp=(Spinner) findViewById(R.id.spinner);
        final ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,list);
        sp.setAdapter(adapter);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=t1.getText().toString();
                list.add(s);
                adapter.notifyDataSetChanged();
                sp.setAdapter(adapter);
                Toast.makeText(MainActivity.this, "Item added to Spinner", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=t1.getText().toString();
                list.remove(s);
                adapter.notifyDataSetChanged();
                sp.setAdapter(adapter);
                Toast.makeText(MainActivity.this, "Item removed from Spinner", Toast.LENGTH_SHORT).show();
            }
        });
       }}

