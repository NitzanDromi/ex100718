package com.example.user.ex100718;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class SecActivity extends AppCompatActivity {
    LinearLayout bg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        bg2=(LinearLayout)findViewById(R.id.llbg2);
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400, "black");
        return super.onCreateOptionsMenu (menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        String st=item.getTitle().toString();
        if (id==R.id.menuyellow){
            bg2.setBackgroundColor(Color.YELLOW);
        }
        if (id==R.id.menured){
            bg2.setBackgroundColor(Color.RED);
        }
        if (id==R.id.menublue){
            bg2.setBackgroundColor(Color.BLUE);
        }
        if (st=="black"){
            bg2.setBackgroundColor(Color.BLACK);
        }
        return super.onOptionsItemSelected(item);
    }

    public void go1(View view) {
        Intent t= new Intent(this, MainActivity.class);
        startActivity(t);
    }
}
