package com.example.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> al;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.lv);
        al = new ArrayList<Contact>();
        Contact c1 = new Contact("Mary", 65, 1234567, 'F');
        Contact c2 = new Contact("Ken", 65, 7654321, 'M');
        al.add(c1);
        al.add(c2);

        ca = new CustomAdapter(MainActivity.this, R.layout.row, al);
        lvContact.setAdapter(ca);
    }
}