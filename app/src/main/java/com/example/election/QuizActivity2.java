package com.example.election;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity2 extends AppCompatActivity {
    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private Button buttonConfirmNext;
    private WebView webView;  // for displaying web contents
    private TextView txtCount;
    private String url;
    private TextView qnno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        rbGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_button1);
        rb2 = findViewById(R.id.radio_button2);
        rb3 = findViewById(R.id.radio_button3);
        rb4 = findViewById(R.id.radio_button4);
        buttonConfirmNext = findViewById(R.id.button_confirm_next);

        buttonConfirmNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) { openActivity2();}
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(QuizActivity2.this, QuizActivity3.class);
        startActivity(intent);
    }

    public void btnAHandler (View view){
        qnno = findViewById(R.id.qnno);
        String userqn = qnno.getText().toString();
        Intent intent = new Intent(QuizActivity2.this, Selecta.class);
        intent.putExtra("count", userqn);
        startActivity(intent);
    }

    public void btnBHandler(View view){
        qnno = findViewById(R.id.qnno);
        String userqn = qnno.getText().toString();
        Intent intent = new Intent(QuizActivity2.this, Selectb.class);
        intent.putExtra("count", userqn);
        startActivity(intent);
    }

    public void btnCHandler(View view){
        qnno = findViewById(R.id.qnno);
        String userqn = qnno.getText().toString();
        Intent intent = new Intent(QuizActivity2.this, Selectc.class);
        intent.putExtra("count", userqn);
        startActivity(intent);
    }

    public void btnDHandler(View view){
        qnno = findViewById(R.id.qnno);
        String userqn = qnno.getText().toString();
        Intent intent = new Intent(QuizActivity2.this, Selectd.class);
        intent.putExtra("count", userqn);
        startActivity(intent);
    }
}
