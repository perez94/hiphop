package com.example.perezzz.hiphopnews;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class BeatMarker extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beat_marker);


    }


    public void clap_onClick(View view) {
        Button clapBTN = (Button)this.findViewById(R.id.Clap);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.clap);
        clapBTN.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
    }


    public void kick_onClick(View view) {
        Button kickBTN = (Button)this.findViewById(R.id.Kick);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.kick);
        kickBTN.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
    }

    public void snare_onClick(View view) {
        Button snareBTN = (Button)this.findViewById(R.id.Snare);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.snare);
        snareBTN.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
    }

    public void hat_onClick(View view) {
        Button hatBTN = (Button)this.findViewById(R.id.Hat);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.hat);
       hatBTN.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
