package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    Button btnScissors, btnRock, btnPaper, btnNext;
    TextView tvResult, tvPlayerWins, tvComputerWins;

    private int playerWins = 0;
    private int computerWins = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnScissors = findViewById(R.id.btnScissors);
        btnRock = findViewById(R.id.btnRock);
        btnPaper = findViewById(R.id.btnPaper);
        tvResult = findViewById(R.id.tvResult);
        tvPlayerWins = findViewById(R.id.tvPlayerWins);
        tvComputerWins = findViewById(R.id.tvComputerWins);
        btnNext = findViewById(R.id.btnNext1);

        btnScissors.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                playGame("剪刀");
            }
        });

        btnRock.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                playGame("石頭");
            }
        });

        btnPaper.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                playGame("布");
            }
        });
    }

    private void playGame(String playerChoice) {
        String[] choices = {"剪刀", "石頭", "布"};
        Random random = new Random();
        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];

        String result = determineWinner(playerChoice, computerChoice);

        String message = "你選擇了：" + playerChoice + "\n電腦選擇了：" + computerChoice + "\n" + result;

        tvResult.setText(message);

        if (result.equals("你贏了!")) {
            playerWins++;
        } else if (result.equals("你輸了!")) {
            computerWins++;
        }

        updateScore();
    }

    private void updateScore() {
        tvPlayerWins.setText("玩家獲勝次數: " + playerWins);
        tvComputerWins.setText("電腦獲勝次數: " + computerWins);
    }

    private String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "平局!";
        } else if (
                (playerChoice.equals("剪刀") && computerChoice.equals("布")) ||
                        (playerChoice.equals("石頭") && computerChoice.equals("剪刀")) ||
                        (playerChoice.equals("布") && computerChoice.equals("石頭"))
        ) {
            return "你贏了!";
        } else {
            return "你輸了!";
        }
    }

    public void button_click(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }




}