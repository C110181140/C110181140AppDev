package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Button startBtn,inBtn,btnNext;
    EditText inTxt;
    TextView resultTxt;
    int start,stop,answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn = findViewById(R.id.startBtn);
        inBtn = findViewById(R.id.inBtn);
        inTxt = findViewById(R.id.inTxt);
        resultTxt = findViewById(R.id.resultTxt);
        btnNext = findViewById(R.id.btnNext2);

        start=1;
        stop=100;
        answer=(int)(Math.random()*100)+1;

        startBtn.setOnClickListener(startListener);
        inBtn.setOnClickListener(inListener);

    }

    static Scanner kb = new Scanner(System.in);
    public static void main(String args[])
    {
        int answer=(int)(Math.random()*100+1);
        int start=1,stop=100;
        int guess;

        do
        {
            System.out.print("請輸入1~100: ");
            guess = kb.nextInt();

            if(guess==answer)
            {
                System.out.println("恭喜答對! 答案為:"+answer);
            }
            else
            {
                if(guess<answer)
                {
                    start = guess;
                }
                else
                {
                    stop = guess;
                }
                System.out.println("目前區間為"+start+"到"+stop);
            }
        }while(guess!=answer);
    }

    View.OnClickListener startListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer=(int)(Math.random()*100)+1;
            start=1;
            stop=100;
            inTxt.setText("");
            resultTxt.setText("結果");
        }
    };

    View.OnClickListener inListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int guess = Integer.parseInt(inTxt.getText().toString());

            if(guess==answer)
            {
                resultTxt.setText("恭喜答對! 答案為:"+answer);
            }
            else
            {
                if(guess<answer)
                {
                    start = guess;
                }
                else
                {
                    stop = guess;
                }
                if(answer==1||answer==100)
                {
                    resultTxt.setText("目前不在區間內，請猜1或100");
                }
                else
                {
                    resultTxt.setText("目前區間為" + start + "到" + stop);
                }
            }
        }
    };

    public void button_click(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

}