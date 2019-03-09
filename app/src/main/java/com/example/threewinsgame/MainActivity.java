package com.example.threewinsgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.threewinsgame.ViewModel.ViewModel;
import com.example.threewinsgame.ViewModel.ThreeWinsVM;

public class MainActivity extends AppCompatActivity {

    TextView a1, a2, a3, b1, b2, b3, c1, c2, c3;
    ThreeWinsVM gameVM = new ThreeWinsVM();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        a1 = (TextView)findViewById(R.id.a1);
        a2 = (TextView)findViewById(R.id.a2);
        a3 = (TextView)findViewById(R.id.a3);

        b1 = (TextView)findViewById(R.id.b1);
        b2 = (TextView)findViewById(R.id.b2);
        b3 = (TextView)findViewById(R.id.b3);

        c1 = (TextView)findViewById(R.id.c1);
        c2 = (TextView)findViewById(R.id.c2);
        c3 = (TextView)findViewById(R.id.c3);

        final Button btA1 = (Button) findViewById(R.id.a1);

        btA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameVM.setMove(1,3);
                //gameConnector.setMove(1,1);
            }
        });
        final Button btA2 = (Button) findViewById(R.id.a2);

        btA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameVM.setMove(2,3);
                //gameConnector.setMove(1,1);
            }
        });
        final Button btA3 = (Button) findViewById(R.id.a3);

        btA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameVM.setMove(3,3);
                //gameConnector.setMove(1,1);
            }
        });
        final Button btB1 = (Button) findViewById(R.id.b1);

        btB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameVM.setMove(1,2);
                //gameConnector.setMove(1,1);
            }
        });
        final Button btB2 = (Button) findViewById(R.id.b2);

        btB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameVM.setMove(2,2);
                //gameConnector.setMove(1,1);
            }
        });
        final Button btB3 = (Button) findViewById(R.id.b3);

        btB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameVM.setMove(3, 2);
                //gameConnector.setMove(1,1);
            }
        });
        final Button btC1 = (Button) findViewById(R.id.c1);

        btC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameVM.setMove(1,1);
                //gameConnector.setMove(1,1);
            }
        });
        final Button btC2 = (Button) findViewById(R.id.c2);

        btC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameVM.setMove(2,1);
                //gameConnector.setMove(1,1);
            }
        });
        final Button btC3 = (Button) findViewById(R.id.c3);

        btC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameVM.setMove(3,1);
                //gameConnector.setMove(1,1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
