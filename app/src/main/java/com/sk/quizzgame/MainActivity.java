package com.sk.quizzgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.cunoraz.gifview.library.GifView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class MainActivity extends AppCompatActivity implements RewardedVideoAdListener{
    manageData data;
    TextView scoreTextView;
    CountDownTimer countDownTimer;
    Button btn1;
    Button btn2;
    Button btn3;
    Button watchVideoBtn;
    ImageView img;
    ProgressBar prog;
    TextView textView;
    TextView heartsNum;
    private AlertDialog dialog1;
    int kk;
    Runnable r;
    long timeR =0;
    private int rewardPoints = 100;
    private int combo = 0;
    private AdView mAdView;
private RewardedVideoAd rewardedVideoAd;
    Handler mhanler = new Handler(Looper.getMainLooper());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this,
                "ca-app-pub-3940256099942544/6300978111");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        rewardedVideoAd.setRewardedVideoAdListener(this);
loadRewardVideoAd();
        data = (manageData) MainActivity.this.getApplication();
        heartsNum =(TextView)findViewById(R.id.textView3);
        textView = (TextView) findViewById(R.id.textView);
        prog = (ProgressBar) findViewById(R.id.progressBar);
        img = (ImageView) findViewById(R.id.imageView);
        scoreTextView = (TextView) findViewById(R.id.textView2);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        StartAlertBox();
heartsNum.setText( Integer.toString(data.getHearts()) + " " +heartsNum );






        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkAnswer(data.getKeyV(), data.getRoundV(), 0);
                if (data.getKeyV() == 4) {

                    data.setKeyV(0);
                    data.setRoundV(data.getRoundV() + 1);
                    EndGame(data.getRoundV());
                    countDownTimer.cancel();
                    StartAlertBox();

                } else {
                    data.setKeyV(data.getKeyV() + 1);
                }
                textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                    img.setVisibility(View.INVISIBLE);
                } else {
                    img.setVisibility(View.VISIBLE);
                    int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                    img.setImageResource(DrawableResourceId);
                }


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkAnswer(data.getKeyV(), data.getRoundV(), 1);
                if (data.getKeyV() == 4) {

                    data.setKeyV(0);
                    data.setRoundV(data.getRoundV() + 1);
                    EndGame(data.getRoundV());
                    countDownTimer.cancel();
                    StartAlertBox();

                } else {
                    data.setKeyV(data.getKeyV() + 1);
                }
                textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                    img.setVisibility(View.INVISIBLE);
                } else {
                    img.setVisibility(View.VISIBLE);
                    int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                    img.setImageResource(DrawableResourceId);
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                checkAnswer(data.getKeyV(), data.getRoundV(), 2);
                if (data.getKeyV() == 4) {

                    data.setKeyV(0);
                    data.setRoundV(data.getRoundV() + 1);
                    EndGame(data.getRoundV());
                    countDownTimer.cancel();
                    StartAlertBox();

                } else {
                    data.setKeyV(data.getKeyV() + 1);
                }
                textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                    img.setVisibility(View.INVISIBLE);
                } else {
                    img.setVisibility(View.VISIBLE);
                    int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                    img.setImageResource(DrawableResourceId);
                }

            }
        });



    }

    private void checkAnswer(int key, int round, int answer) {
        int correct = Integer.parseInt(data.AnswerQuestion(key, round).get(3).toString());
        if(combo == 4){
            data.setScore(data.getScore()+100);
            combo = 0;
        }
        if (answer == correct) {
            data.setScore(data.getScore() + rewardPoints);
            scoreTextView.setText(Integer.toString(data.getScore()));
            combo++;
        }else{
            data.setHearts(data.getHearts()-1);
            heartsNum.setText( Integer.toString(data.getHearts()) + " " +heartsNum );
            rewardPoints = rewardPoints - 1;
            if(data.getHearts() == 0){
               watchVideo();
               rewardPoints = (int) rewardPoints/2;
               combo = 0;
            }
        }
    }


    private void watchVideo(){
        countDownTimer.cancel();
        AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
       build.setMessage("You need more hearts to continue").setPositiveButton("Watch video for 2 hearts", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               if(rewardedVideoAd.isLoaded()){
                   rewardedVideoAd.show();
               }
           }
       }).setNegativeButton("End game", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               Intent v = new Intent(MainActivity.this,finishedActivity.class);
               startActivity(v);
               finish();
           }
       });
       dialog1 = build.create();
       dialog1.show();

    }


    private void StartCounting(){



    countDownTimer = new CountDownTimer(10000,50) {
        @Override
        public void onTick(long l) {
            Log.d("hearts",String.valueOf(data.getHearts()));
            int progress = (int) Math.floor((l * 100)/(10000));
            prog.setProgress(progress);
            if(progress <50){
          
            }
            timeR = l;
            checkHeartsStatus();
        }

        @Override
        public void onFinish() {
            data.setHearts(data.getHearts()-1);
            heartsNum.setText( Integer.toString(data.getHearts()) + " " +heartsNum );
           if(data.getHearts() <0){
               Intent v = new Intent(MainActivity.this,finishedActivity.class);
               startActivity(v);
               finish();
           }

        }
    }.start();

    }
private void checkHeartsStatus(){


    if(data.getHearts() == 0 && data.getKeyV() <4){
        watchVideo();
        countDownTimer.cancel();
    }
}
    private void loadRewardVideoAd(){
        rewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917",
                new AdRequest.Builder().build());
    }
    private void StartAlertBox(){

        switch (data.getRoundV()) {
            case 0: {
                AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.geography, null);
                build.setView(mView);
                final AlertDialog dialog = build.create();
                GifView gifView = (GifView)mView.findViewById(R.id.geographyGif);
                gifView.setVisibility(View.VISIBLE);
                gifView.setGifResource(R.drawable.geography);
                dialog.show();
                gifView.play();

                Button btnGeo = (Button)mView.findViewById(R.id.btnGeo);
                btnGeo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                        btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                        btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                        btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                        if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                            img.setVisibility(View.INVISIBLE);
                        } else {
                            img.setVisibility(View.VISIBLE);
                            int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                            img.setImageResource(DrawableResourceId);
                        }
                        StartCounting();
                        dialog.dismiss();
                    }
                });

                break;

            }
            case 1:{
                AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.history, null);
                build.setView(mView);
                final AlertDialog dialog = build.create();
                GifView gifView = (GifView)mView.findViewById(R.id.HistoryGif);
                gifView.setVisibility(View.VISIBLE);
                gifView.setGifResource(R.drawable.history);
                dialog.show();
                gifView.play();

                Button btnGeo = (Button)mView.findViewById(R.id.btnHist);
                btnGeo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                        btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                        btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                        btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                        if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                            img.setVisibility(View.INVISIBLE);
                        } else {
                            img.setVisibility(View.VISIBLE);
                            int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                            img.setImageResource(DrawableResourceId);
                        }
                        countDownTimer.cancel();
                        StartCounting();
                        dialog.dismiss();
                    }
                });
                break;

            }
            case 2:{
                AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.sport, null);
                build.setView(mView);
                final AlertDialog dialog = build.create();
                GifView gifView = (GifView)mView.findViewById(R.id.sportGif);
                gifView.setVisibility(View.VISIBLE);
                gifView.setGifResource(R.drawable.sport);
                dialog.show();
                gifView.play();

                Button btnGeo = (Button)mView.findViewById(R.id.btnSport);
                btnGeo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                        btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                        btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                        btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                        if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                            img.setVisibility(View.INVISIBLE);
                        } else {
                            img.setVisibility(View.VISIBLE);
                            int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                            img.setImageResource(DrawableResourceId);
                        }
                        countDownTimer.cancel();
                        StartCounting();
                        dialog.dismiss();
                    }
                });
                break;

            }

            case 3:{
                AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.science, null);
                build.setView(mView);
                final AlertDialog dialog = build.create();
                GifView gifView = (GifView)mView.findViewById(R.id.scienceGif);
                gifView.setVisibility(View.VISIBLE);
                gifView.setGifResource(R.drawable.science);
                dialog.show();
                gifView.play();

                Button btnGeo = (Button)mView.findViewById(R.id.btnScience);
                btnGeo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                        btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                        btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                        btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                        if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                            img.setVisibility(View.INVISIBLE);
                        } else {
                            img.setVisibility(View.VISIBLE);
                            int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                            img.setImageResource(DrawableResourceId);
                        }
                        countDownTimer.cancel();
                        StartCounting();
                        dialog.dismiss();
                    }
                });
                break;

            }
            case 4:{
                AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.math, null);
                build.setView(mView);
                final AlertDialog dialog = build.create();
                GifView gifView = (GifView)mView.findViewById(R.id.mathGif);
                gifView.setVisibility(View.VISIBLE);
                gifView.setGifResource(R.drawable.math);
                dialog.show();
                gifView.play();

                Button btnGeo = (Button)mView.findViewById(R.id.btnMath);
                btnGeo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                        btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                        btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                        btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                        if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                            img.setVisibility(View.INVISIBLE);
                        } else {
                            img.setVisibility(View.VISIBLE);
                            int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                            img.setImageResource(DrawableResourceId);
                        }
                        countDownTimer.cancel();
                        StartCounting();
                        dialog.dismiss();
                    }
                });
                break;
            }
            case 5:{
                AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.music, null);
                build.setView(mView);
                final AlertDialog dialog = build.create();
                GifView gifView = (GifView)mView.findViewById(R.id.musicGif);
                gifView.setVisibility(View.VISIBLE);
                gifView.setGifResource(R.drawable.music);
                dialog.show();
                gifView.play();

                Button btnGeo = (Button)mView.findViewById(R.id.btnMusic);
                btnGeo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                        btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                        btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                        btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                        if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                            img.setVisibility(View.INVISIBLE);
                        } else {
                            img.setVisibility(View.VISIBLE);
                            int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                            img.setImageResource(DrawableResourceId);
                        }
                        countDownTimer.cancel();
                        StartCounting();
                        dialog.dismiss();
                    }
                });
                break;
            }
            case 6:{
                AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.games, null);
                build.setView(mView);
                final AlertDialog dialog = build.create();
                GifView gifView = (GifView)mView.findViewById(R.id.gamesGif);
                gifView.setVisibility(View.VISIBLE);
                gifView.setGifResource(R.drawable.games);
                dialog.show();
                gifView.play();

                Button btnGeo = (Button)mView.findViewById(R.id.btnGames);
                btnGeo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                        btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                        btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                        btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                        if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                            img.setVisibility(View.INVISIBLE);
                        } else {
                            img.setVisibility(View.VISIBLE);
                            int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                            img.setImageResource(DrawableResourceId);
                        }
                        countDownTimer.cancel();
                        StartCounting();
                        dialog.dismiss();
                    }
                });
                break;
            }
            case 7:{
                AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.movies, null);
                build.setView(mView);
                final AlertDialog dialog = build.create();
                GifView gifView = (GifView)mView.findViewById(R.id.moviesGif);
                gifView.setVisibility(View.VISIBLE);
                gifView.setGifResource(R.drawable.movie);
                dialog.show();
                gifView.play();

                Button btnGeo = (Button)mView.findViewById(R.id.btnMovies);
                btnGeo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        textView.setText(data.QuestionsData(data.getKeyV(), data.getRoundV()));
                        btn1.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(0).toString());
                        btn2.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(1).toString());
                        btn3.setText(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(2).toString());
                        if (data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString().matches("none")) {
                            img.setVisibility(View.INVISIBLE);
                        } else {
                            img.setVisibility(View.VISIBLE);
                            int DrawableResourceId = MainActivity.this.getResources().getIdentifier(data.AnswerQuestion(data.getKeyV(), data.getRoundV()).get(4).toString(), "drawable", MainActivity.this.getPackageName());
                            img.setImageResource(DrawableResourceId);
                        }
                        countDownTimer.cancel();
                        StartCounting();
                        dialog.dismiss();
                    }
                });
                break;
            }
            case 8:{
EndGame(data.getRoundV());
            }


        }

    }
    private void EndGame(int round){
        if(round == 8) {
            finish();
            Intent v = new Intent(MainActivity.this, finishedActivity.class);
            startActivity(v);


        }

    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {
countDownTimer.cancel();

    }

    @Override
    public void onRewardedVideoAdClosed() {
        loadRewardVideoAd();
       if(data.getHearts() == 2){
           dialog1.dismiss();
       }else{
           Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_LONG).show();
       }
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {
        data.setHearts(data.getHearts()+2);
        StartCounting();

        dialog1.cancel();
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
}
