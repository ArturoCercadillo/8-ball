package com.example.moneda;

import java.util.Random;



import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	if (new Random().nextInt(2-0)+0==0)
            	toast.makeText(getApplicationContext(),"Cara", Toast.LENGTH_LONG).show();
            	else if (new Random().nextInt(2-0)+0==1)
            	toast.makeText(getApplicationContext(),"Cruz", Toast.LENGTH_LONG).show();
            	
             	

            }
        });
    }
}
