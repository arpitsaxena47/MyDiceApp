package com.arpit.mydiceapp;
import java.util.Random;


import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView diceImage1 = findViewById(R.id.img1);
        final ImageView diceImage2 = findViewById(R.id.img2);

        final int [] diceImages ={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.dicesound);

        Button btnRoll= findViewById(R.id.btnRollTheDice);
        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.i("MyDiceApp","btnRoll is tapped now");

                Random rndObject= new Random();
                int myRandomNumber = rndObject.nextInt(6);//0...5
                diceImage1.setImageResource(diceImages[myRandomNumber]);

                myRandomNumber=rndObject.nextInt(6);
                diceImage2.setImageResource(diceImages[myRandomNumber]);


               mp.start();
            }
        });

    }
}
