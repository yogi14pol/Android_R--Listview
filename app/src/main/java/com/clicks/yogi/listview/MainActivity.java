package com.clicks.yogi.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView mylist;
    String[] ipl = {"CSK","KKR","RCB","DC","MI","RR","KXI-PUNJAB","SH","DD"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mylist = findViewById(R.id.list);

    arrayAdapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,ipl);
    mylist.setAdapter(arrayAdapter);

    mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

/*
            // Type 1: By this code you can retrieve the selected position item name from the listview...
            Toast.makeText(MainActivity.this,"Position:  "+ parent.getItemAtPosition(position),Toast.LENGTH_LONG).show();
*/
            // Type 2:
            switch (position){

                case 0:
                    Toast.makeText(MainActivity.this, "Hey CSK", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Toast.makeText(MainActivity.this, "Hey KKR", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Toast.makeText(MainActivity.this, "Hey RCB", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    Toast.makeText(MainActivity.this, "Hey DC", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Toast.makeText(MainActivity.this, "Hey MI", Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    Toast.makeText(MainActivity.this, "Hey RR", Toast.LENGTH_SHORT).show();
                    break;
                case 6:
                    Toast.makeText(MainActivity.this, "Hey KXI-PUNJAB", Toast.LENGTH_SHORT).show();
                    break;
                case 7:
                    Toast.makeText(MainActivity.this, "Hey SH", Toast.LENGTH_SHORT).show();
                    break;
                case 8:
                    Toast.makeText(MainActivity.this, "Hey DD", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    Toast.makeText(MainActivity.this, "Something went wrong...", Toast.LENGTH_SHORT).show();
            }

        }
    });


    }
}