package com.example.eightBall;

import java.util.*;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
 


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button1);
        final TextView texto = (TextView) findViewById(R.id.textView1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cadena=null;
                String [] array = getResources().getStringArray(R.array.respuestas);
                RelativeLayout vista = (RelativeLayout) findViewById(R.id.vista1);
                int x = Math.abs(new Random().nextInt(array.length-0)+0);
                texto.setTextColor(Color.BLACK);
                cadena=array[x];
                
                if (x<5)
                {
                	vista.setBackgroundColor(Color.GREEN);
                	
                }else if(x>8){
                	vista.setBackgroundColor(Color.RED);
                }else if(x==8){
                	vista.setBackgroundResource(R.drawable.yoda);
                	texto.setTextColor(Color.WHITE);
                }else{
                	vista.setBackgroundColor(Color.YELLOW);}
                texto.setText(cadena);
            }
        });
    }


   
    
}
