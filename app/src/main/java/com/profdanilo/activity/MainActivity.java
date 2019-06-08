package com.profdanilo.activity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.profdanilo.activity.R;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    private SoundPool mSoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);

        Button btnC = findViewById(R.id.c_key);

        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        // TODO: Load and get the IDs to identify the sounds
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE) ;
            }
        });

        Button btnD = findViewById(R.id.d_key);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE) ;
            }
        });

        Button btnE = findViewById(R.id.e_key);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE) ;
            }
        });
        Button btnF = findViewById(R.id.f_key);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE) ;
            }
        });
        Button btnG = findViewById(R.id.g_key);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);

        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE) ;
            }
        });
        Button btnA = findViewById(R.id.a_key);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE) ;
            }
        });
        Button btnB = findViewById(R.id.b_key);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE) ;
            }
        });



    }


}
