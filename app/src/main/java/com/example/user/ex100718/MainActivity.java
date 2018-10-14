package com.example.user.ex100718;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg=(LinearLayout)findViewById(R.id.llbg);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if (id==R.id.menuyellow){
            bg.setBackgroundColor(Color.YELLOW);
        }
        if (id==R.id.menured){
            bg.setBackgroundColor(Color.RED);
        }
        if (id==R.id.menublue){
            bg.setBackgroundColor(Color.BLUE);
        }
        return super.onOptionsItemSelected(item);
    }

    public void go2(View view) {
        Intent t= new Intent(this, SecActivity.class);
        startActivity(t);
    }
}
