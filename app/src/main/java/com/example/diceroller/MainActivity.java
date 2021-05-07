package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView firstImageView ;
    private ImageView secondImageView ;
    private Random firstImageRandomNum = new Random();
    private Random secondImageRandomNum = new Random();
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.diceRollButton);
        button.setOnClickListener((View view)->{
            rollDice();
        });
    }

    private void rollDice(){
        firstImageView = findViewById(R.id.imageView1);
        secondImageView = findViewById(R.id.imageView2);
        int firstImageNum = firstImageRandomNum.nextInt(6)+1;
        int secondImageNum = secondImageRandomNum.nextInt(6)+1;
        int caseChecker = firstImageNum;
        for(int i=0;i<2;i++){
            switch(caseChecker){
                case 1:
                    if(i==0)
                        firstImageView.setImageResource(R.drawable.dice1);
                    else
                        secondImageView.setImageResource(R.drawable.dice1);
                    break;
                case 2:
                    if(i==0)
                        firstImageView.setImageResource(R.drawable.dice2);
                    else
                        secondImageView.setImageResource(R.drawable.dice2);
                    break;
                case 3:
                    if(i==0)
                        firstImageView.setImageResource(R.drawable.dice3);
                    else
                        secondImageView.setImageResource(R.drawable.dice3);
                    break;
                case 4:
                    if(i==0)
                        firstImageView.setImageResource(R.drawable.dice4);
                    else
                        secondImageView.setImageResource(R.drawable.dice4);
                    break;
                case 5:
                    if(i==0)
                        firstImageView.setImageResource(R.drawable.dice5);
                    else
                        secondImageView.setImageResource(R.drawable.dice5);
                    break;
                case 6:
                    if(i==0)
                        firstImageView.setImageResource(R.drawable.dice6);

                    else
                        secondImageView.setImageResource(R.drawable.dice6);
                    break;
            }
            caseChecker = secondImageNum;
        }
    }


}