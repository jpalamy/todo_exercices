package com.example.todo_exercices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //date source
        final String name[] = {"Alamy", "kohlberg", "Jean", "Dad", "Son", "Haiti", "ILC"};

        //Adapter
        ArrayAdapter<String> nameAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, name);

        ListView lvname = findViewById(R.id.lvName);
        lvname.setAdapter(nameAdapter);

        //click lister
        lvname.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, name[2], Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,name [4], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
