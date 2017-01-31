package com.example.perezzz.hiphopnews;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity {

    boolean firstTimePortrait = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (!firstTimePortrait && savedInstanceState != null) {
                return;
            }
            firstTimePortrait = false;

            // Create a new Fragment to be placed in the activity layout
            AlbumFragment firstFragment = new AlbumFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            firstFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, firstFragment).commit();
        }
    }


    public void beat_OnClick(View view) {
        Intent intent = new Intent(MainActivity.this, BeatMarker.class);
        startActivity(intent);
    }
}


