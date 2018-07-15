package com.sk.quizzgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class finishedActivity extends AppCompatActivity {
manageData Data1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished);
        Data1 =(manageData) finishedActivity.this.getApplication();
        TextView score = (TextView)findViewById(R.id.textView7);
        score.setText(score.getText().toString()+" "+String.valueOf(Data1.getScore()));
    }
}
