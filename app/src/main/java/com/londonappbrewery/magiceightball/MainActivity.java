package com.londonappbrewery.magiceightball;

import android.icu.text.CollationKey;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView eightB= findViewById(R.id.bBall);
        final Button butt= findViewById(R.id.button4);

        final int[] ball={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rNum=new Random();
                int num=rNum.nextInt(5);
                eightB.setImageResource(ball[num]);
            }
        });

    }
}
