package com.example.logica_app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

private String answer1,
                    answer2,
                        answer3,
                            answer4;

private Button mSubmit;
private boolean answerCheck;

private EditText answerQuestion1,
                    answerQuestion2,
                        answerQuestion3,
                            answerQuestion4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSubmit = findViewById(R.id.buttonSubmit);
        answerQuestion1 = findViewById(R.id.textUserInput1);
        answerQuestion2 = findViewById(R.id.textUserInput2);
        answerQuestion3 = findViewById(R.id.textUserInput3);
        answerQuestion4 = findViewById(R.id.textUserInput4);


        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswers();
            }
        });
    }


    private void checkAnswers() {
        answer1 = answerQuestion1.getText().toString();
        answer2 = answerQuestion2.getText().toString();
        answer3 = answerQuestion3.getText().toString();
        answer4 = answerQuestion4.getText().toString();

        if ((answer1.equals("F")) || answer2.equals("T") || answer3.equals("T") || answer4.equals("F")) {
            Toast.makeText(this, "One or more answers have been answered wrong", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Congratulations, all answers are right.", Toast.LENGTH_SHORT).show();
        }
    }
}
