package com.example.dell.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void red(View view){


        TextView redb = (TextView) findViewById(R.id.redimage);
        TextView blueb = (TextView) findViewById(R.id.blueimage);
        TextView greenb = (TextView) findViewById(R.id.greenimage);
        TextView yellowb = (TextView) findViewById(R.id.yellowimage);
        TextView cielb = (TextView) findViewById(R.id.cielimage);
        TextView white = (TextView) findViewById(R.id.whiteimage);
        TextView velvet = (TextView) findViewById(R.id.velvetimage);


        redb.setVisibility(View.VISIBLE);
        blueb.setVisibility(View.INVISIBLE);
        greenb.setVisibility(View.INVISIBLE);
        yellowb.setVisibility(View.INVISIBLE);
        cielb.setVisibility(View.INVISIBLE);
        white.setVisibility(View.INVISIBLE);
        velvet.setVisibility(View.INVISIBLE);

    }

    public void green(View view){

        TextView redb = (TextView) findViewById(R.id.redimage);
        TextView blueb = (TextView) findViewById(R.id.blueimage);
        TextView greenb = (TextView) findViewById(R.id.greenimage);
        TextView yellowb = (TextView) findViewById(R.id.yellowimage);
        TextView cielb = (TextView) findViewById(R.id.cielimage);
        TextView white = (TextView) findViewById(R.id.whiteimage);
        TextView velvet = (TextView) findViewById(R.id.velvetimage);


        redb.setVisibility(View.INVISIBLE);
        blueb.setVisibility(View.INVISIBLE);
        greenb.setVisibility(View.VISIBLE);
        yellowb.setVisibility(View.INVISIBLE);
        cielb.setVisibility(View.INVISIBLE);
        white.setVisibility(View.INVISIBLE);
        velvet.setVisibility(View.INVISIBLE);

    }

    public void blue(View view){

        TextView redb = (TextView) findViewById(R.id.redimage);
        TextView blueb = (TextView) findViewById(R.id.blueimage);
        TextView greenb = (TextView) findViewById(R.id.greenimage);
        TextView yellowb = (TextView) findViewById(R.id.yellowimage);
        TextView cielb = (TextView) findViewById(R.id.cielimage);
        TextView white = (TextView) findViewById(R.id.whiteimage);
        TextView velvet = (TextView) findViewById(R.id.velvetimage);


        redb.setVisibility(View.INVISIBLE);
        blueb.setVisibility(View.VISIBLE);
        greenb.setVisibility(View.INVISIBLE);
        yellowb.setVisibility(View.INVISIBLE);
        cielb.setVisibility(View.INVISIBLE);
        white.setVisibility(View.INVISIBLE);
        velvet.setVisibility(View.INVISIBLE);

    }

    public void yellow(View view){

        TextView redb = (TextView) findViewById(R.id.redimage);
        TextView blueb = (TextView) findViewById(R.id.blueimage);
        TextView greenb = (TextView) findViewById(R.id.greenimage);
        TextView yellowb = (TextView) findViewById(R.id.yellowimage);
        TextView cielb = (TextView) findViewById(R.id.cielimage);
        TextView white = (TextView) findViewById(R.id.whiteimage);
        TextView velvet = (TextView) findViewById(R.id.velvetimage);


        redb.setVisibility(View.INVISIBLE);
        blueb.setVisibility(View.INVISIBLE);
        greenb.setVisibility(View.INVISIBLE);
        yellowb.setVisibility(View.VISIBLE);
        cielb.setVisibility(View.INVISIBLE);
        white.setVisibility(View.INVISIBLE);
        velvet.setVisibility(View.INVISIBLE);

    }

    public void ciel(View view){

        TextView redb = (TextView) findViewById(R.id.redimage);
        TextView blueb = (TextView) findViewById(R.id.blueimage);
        TextView greenb = (TextView) findViewById(R.id.greenimage);
        TextView yellowb = (TextView) findViewById(R.id.yellowimage);
        TextView cielb = (TextView) findViewById(R.id.cielimage);
        TextView white = (TextView) findViewById(R.id.whiteimage);
        TextView velvet = (TextView) findViewById(R.id.velvetimage);


        redb.setVisibility(View.INVISIBLE);
        blueb.setVisibility(View.INVISIBLE);
        greenb.setVisibility(View.INVISIBLE);
        yellowb.setVisibility(View.INVISIBLE);
        cielb.setVisibility(View.VISIBLE);
        white.setVisibility(View.INVISIBLE);
        velvet.setVisibility(View.INVISIBLE);

    }

    public void white(View view){

        TextView redb = (TextView) findViewById(R.id.redimage);
        TextView blueb = (TextView) findViewById(R.id.blueimage);
        TextView greenb = (TextView) findViewById(R.id.greenimage);
        TextView yellowb = (TextView) findViewById(R.id.yellowimage);
        TextView cielb = (TextView) findViewById(R.id.cielimage);
        TextView white = (TextView) findViewById(R.id.whiteimage);
        TextView velvet = (TextView) findViewById(R.id.velvetimage);


        redb.setVisibility(View.INVISIBLE);
        blueb.setVisibility(View.INVISIBLE);
        greenb.setVisibility(View.INVISIBLE);
        yellowb.setVisibility(View.INVISIBLE);
        cielb.setVisibility(View.INVISIBLE);
        white.setVisibility(View.VISIBLE);
        velvet.setVisibility(View.INVISIBLE);

    }

    public void velvet(View view){

        TextView redb = (TextView) findViewById(R.id.redimage);
        TextView blueb = (TextView) findViewById(R.id.blueimage);
        TextView greenb = (TextView) findViewById(R.id.greenimage);
        TextView yellowb = (TextView) findViewById(R.id.yellowimage);
        TextView cielb = (TextView) findViewById(R.id.cielimage);
        TextView white = (TextView) findViewById(R.id.whiteimage);
        TextView velvet = (TextView) findViewById(R.id.velvetimage);


        redb.setVisibility(View.INVISIBLE);
        blueb.setVisibility(View.INVISIBLE);
        greenb.setVisibility(View.INVISIBLE);
        yellowb.setVisibility(View.INVISIBLE);
        cielb.setVisibility(View.INVISIBLE);
        white.setVisibility(View.INVISIBLE);
        velvet.setVisibility(View.VISIBLE);

    }


}
