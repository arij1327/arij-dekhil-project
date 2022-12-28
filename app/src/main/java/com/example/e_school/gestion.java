package com.example.e_school;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class gestion extends AppCompatActivity {
    EditText tv1,tv2,tv3,tv4;
    Button b1,b2;
    ArrayList<String>a;
    ListView List;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);
        tv1=findViewById(R.id.tv2);
        tv2=findViewById(R.id.tv3);
        tv3=findViewById(R.id.tv4);
        List=findViewById(R.id.list);
        a=new ArrayList<>();
        ArrayAdapter A=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,a);
        List.setAdapter(A);
        a.add(tv1.getText().toString());
        tv4=findViewById(R.id.tv5);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        registerForContextMenu(b1);
        Intent l=getIntent();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(gestion.this,"pleaze make a long click",Toast.LENGTH_LONG).show();
            }
        });

      List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              switch (position) {
                  default: {Intent c = new Intent(gestion.this, contact.class);
                      startActivity(c);}
              }
          }
      });



    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.cont,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.a1:
                Toast.makeText(this, "Elève ajouté avec succés", Toast.LENGTH_SHORT).show();


                break;

        }  return true;



    }
}